package com.proteus.cgen.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;

import com.proteus.cgen.ANTLRv4.gen.ANTLRv4Lexer;
import com.proteus.cgen.ANTLRv4.gen.ANTLRv4Parser;
import com.proteus.cgen.ANTLRv4.gen.ANTLRv4Parser.AlternativeContext;
import com.proteus.cgen.ANTLRv4.gen.ANTLRv4Parser.ElementContext;
import com.proteus.cgen.ANTLRv4.gen.ANTLRv4Parser.LabeledAltContext;
import com.proteus.cgen.ANTLRv4.gen.ANTLRv4Parser.RuleSpecContext;
import com.proteus.cgen.ANTLRv4.gen.ANTLRv4ParserBaseVisitor;

public class AddExtendedContextToGrammar extends ANTLRv4ParserBaseVisitor<String>{

	/*
	 * parserRuleSpec
		:	DOC_COMMENT?
	        ruleModifiers? RULE_REF ARG_ACTION?
	        ruleReturns? throwsSpec? localsSpec?
			rulePrequel*
			COLON
	            ruleBlock
			SEMI
			exceptionGroup
		;
	 */
	
	//private List<String> literals;
	private StringBuilder temp;
	
//	public StringLiteralsToLexers(){
//		literals = new ArrayList<String>();
//	}

	

	@Override public String visitParserRuleSpec(@NotNull ANTLRv4Parser.ParserRuleSpecContext ctx) { 
		temp = new StringBuilder();
		String name = ctx.RULE_REF().getText();
		temp.append(name);temp.append("\n");
		String camelCase = name.substring(0, 1).toUpperCase() + name.substring(1);
		temp.append("locals [ ");temp.append(camelCase);temp.append("ContextExt extendedContext ]\n");
		temp.append(":");
		visitRuleBlock(ctx.ruleBlock());
		temp.append(";");
		System.out.println(temp);
		System.out.println();
		return null;
	}


	/*
	 * ruleBlock
		:	ruleAltList
		;	
	 */
	@Override public String visitRuleBlock(@NotNull ANTLRv4Parser.RuleBlockContext ctx) { 
		return visitRuleAltList(ctx.ruleAltList());
	}


	/*
	 * ruleAltList
		:	labeledAlt (OR labeledAlt)*
		;	
	 */
	@Override public String visitRuleAltList(@NotNull ANTLRv4Parser.RuleAltListContext ctx) {
		List<LabeledAltContext> labledAltList = ctx.labeledAlt();
		visitLabeledAlt(labledAltList.get(0));
		for(int i=1;i<labledAltList.size();i++){
			temp.append("\n");
			temp.append("| ");
			visitLabeledAlt(labledAltList.get(i));
		}
		return null;
	}


	/*
	 * labeledAlt
		:	alternative (POUND id)?
		;	
	 */
	@Override public String visitLabeledAlt(@NotNull ANTLRv4Parser.LabeledAltContext ctx) { 
		//	temp.append(" pre_pragma? ");
		visitAlternative(ctx.alternative());
		//		temp.append(" post_pragma? ");
		if(ctx.id() != null){
			temp.append(ctx.POUND().getText());
			temp.append(ctx.id().getText());
		}

		return null;
	}


	/*
	 * alternative
		:	elementOptions? element*
		;	
	 */
	@Override public String visitAlternative(@NotNull ANTLRv4Parser.AlternativeContext ctx) { 
		List<ElementContext> elementList = ctx.element();
		for(ElementContext elementContext :elementList ){
			visitElement(elementContext);
		}
		return null;
	}


	/*
	 * element
		:	labeledElement
			(	ebnfSuffix
			|
			)
		|	atom
			(	ebnfSuffix
			|
			)
		|	ebnf
		|	ACTION QUESTION? // SEMPRED is ACTION followed by QUESTION
		;	
	 */
	@Override public String visitElement(@NotNull ANTLRv4Parser.ElementContext ctx) { 
		if(ctx.atom() != null){
			visitAtom(ctx.atom());
			if(ctx.ebnfSuffix() != null){
				temp.append(ctx.ebnfSuffix().getText()+" ");
			} else {
				temp.append(" ");
			}
		} else if(ctx.ebnf() != null){
			visitEbnf(ctx.ebnf());
		}
		return null;
	}


	/*
	 * ebnf:	block blockSuffix?
		;	
	 */
	@Override public String visitEbnf(@NotNull ANTLRv4Parser.EbnfContext ctx) { 
		visitBlock(ctx.block());
		if(ctx.blockSuffix() != null){
			temp.append(ctx.blockSuffix().getText()+ " ");
		}
		return null;
	}


	/*
	 *  * atom
		:	range // Range x..y - only valid in lexers
		|	terminal
		|	ruleref
		|	notSet
		|	DOT elementOptions?
		;	
	 */
	@Override public String visitAtom(@NotNull ANTLRv4Parser.AtomContext ctx) { 
		if(ctx.terminal() != null){
			visitTerminal(ctx.terminal());
		} else{
			temp.append(" "+ctx.getText());
		}
		return null;
	}
	
	/*
	 * terminal
   		: TOKEN_REF elementOptions?
   		| STRING_LITERAL elementOptions?
   		;
	 * 
	 */
	
	@Override public String visitTerminal(@NotNull ANTLRv4Parser.TerminalContext ctx){
		temp.append(" "+ctx.getText());
		return null;
	}


	/*
	 * block
		:	LPAREN
			( optionsSpec? ruleAction* COLON )?
			altList
			RPAREN
		;	
	 */
	@Override public String visitBlock(@NotNull ANTLRv4Parser.BlockContext ctx) { 
		temp.append("( ");
		visitAltList(ctx.altList());
		temp.append(" )");
		return null;
	}


	/*
	 * altList
		:	alternative (OR alternative)*
		;	
	 */
	@Override public String visitAltList(@NotNull ANTLRv4Parser.AltListContext ctx) {
		List<AlternativeContext> alternativeList = ctx.alternative();
		visitAlternative(alternativeList.get(0));
		for(int i=1;i<alternativeList.size();i++){
			temp.append("\n");
			temp.append("|");
			visitAlternative(alternativeList.get(i));
		}
		return null;
	}

	List<RuleSpecContext> getRuleSpecList() throws IOException{
		File verilogFile = new File("./grammar/p416.g4");
		InputStream inputStream =new FileInputStream(verilogFile);
		ANTLRv4Lexer lexer = new ANTLRv4Lexer(new ANTLRInputStream(inputStream));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ANTLRv4Parser parser = new ANTLRv4Parser(tokens);
		ANTLRv4Parser.GrammarSpecContext tree = parser.grammarSpec();
		return tree.rules().ruleSpec();
	}

	public static void main(String args[]) throws IOException{
		AddExtendedContextToGrammar addExtendedContextToGrammar = new AddExtendedContextToGrammar();
		List<RuleSpecContext> ruleSpecContextList = addExtendedContextToGrammar.getRuleSpecList();
		for(RuleSpecContext ruleSpecContext : ruleSpecContextList){
			if(ruleSpecContext.parserRuleSpec() != null){
				addExtendedContextToGrammar.visitParserRuleSpec(ruleSpecContext.parserRuleSpec());
			}
		}
	}
}



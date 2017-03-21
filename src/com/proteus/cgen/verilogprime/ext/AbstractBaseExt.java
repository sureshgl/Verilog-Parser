package com.proteus.cgen.verilogprime.ext;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.Variable;
import com.proteus.cgen.verilogprime.ExpressionOperand;
import com.proteus.cgen.verilogprime.ExtendedContextVisitor;
import com.proteus.cgen.verilogprime.GetFormattedText;
import com.proteus.cgen.verilogprime.IProcessPragma;
import com.proteus.cgen.verilogprime.SetExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.TerminalUtility;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeLexer;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Non_port_module_itemContext;
import com.proteus.common.util.Utils.Pair;

@Data
public abstract class AbstractBaseExt implements GetFormattedText,IProcessPragma,ExpressionOperand{
	private static final Logger L = LoggerFactory.getLogger(AbstractBaseExt.class);
	//variables
	private ExtendedContextVisitor extendedContextVisitor;
	private Evaluatable evaluatedStatus = Evaluatable.NOT_EVALUATED;
	private Transformation transformation = Transformation.DEFAULT;

	public enum Evaluatable{
		PARTIALLY_EVALUATED,
		COMPLETELY_EVALUATED,
		NOT_EVALUATED
	}

	@Setter(AccessLevel.NONE)
	private List<ParserRuleContext> contexts;

	//abstract methods
	abstract public ParserRuleContext getContext();
	abstract public ParserRuleContext getContext(String str);
	abstract public void setContext(ParserRuleContext ctx);

	//constructor
	public AbstractBaseExt(){
		extendedContextVisitor = new ExtendedContextVisitor();
		contexts = new ArrayList<ParserRuleContext>();
	}

	public enum Transformation {
		DEFAULT;
	}

	public AbstractBaseExt getExtendedContext(ParseTree context){
		if(context != null){
			return extendedContextVisitor.visit(context);
		} else{
			return null;
		}
	}

	//This method is not exposed outside.
	protected VerilogPrimeParser getPrimeParser(String str){
		VerilogPrimeLexer lexer = new VerilogPrimeLexer(new ANTLRInputStream(str));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new VerilogPrimeParser(tokens);
	}

	protected void addToContexts(ParserRuleContext context)
	{
		if(context != null){
			new SetExtendedContextVisitor(this).visit(context);
			contexts.add(context);
		} else {
			contexts.add(null);
			setContext(null);
		}
	}


	public void eval(SymbolTable symbolTable){
		ParserRuleContext ctx =  getContext();
		Evaluatable	evaluatedStatus = Evaluatable.COMPLETELY_EVALUATED;
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(childCtx instanceof TerminalNode){
					if(TerminalUtility.getEvaluatedStatus(childCtx) == Evaluatable.PARTIALLY_EVALUATED){
						evaluatedStatus = Evaluatable.PARTIALLY_EVALUATED;
					}
				} else if(childCtx.getText().length() >0){
					getExtendedContext(childCtx).eval(symbolTable);
					if(getExtendedContext(childCtx).getEvaluatedStatus() == Evaluatable.PARTIALLY_EVALUATED){
						evaluatedStatus = Evaluatable.PARTIALLY_EVALUATED;
					}
				}
			}
			setEvaluatedStatus(evaluatedStatus);
		} else {
			setEvaluatedStatus(Evaluatable.COMPLETELY_EVALUATED);
		}

	}

	@Override
	public ExpressionOperand getOperand() {
		if (getContext() != null){
			if( getContext().getChild(0) instanceof TerminalNode){
				return this;
			} else {
				return ((ExpressionOperand) getContext().getChild(0)).getOperand();
			}
		}
		else{
			return null;
		}
	}

	@Override
	public ExpressionOperand STARSTAR(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand STAR(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand DIV(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand MODULO(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand PLUS(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand MINUS(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand LSHIFT(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand RSHIFT(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand ALSHIFT(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand ARSHIFT(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand LT(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand GT(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand LE(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand GE(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand EQUALS(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand NOT_EQUALS(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand CASE_EQUALITY(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand CASE_INEQUALITY(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand CASE_Q(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand NOT_CASE_Q(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand AND(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand XOR(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand XNOR(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand XORN(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand OR(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand LOG_AND(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand LOG_OR(ExpressionOperand that){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand PLUS(){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand MINUS(){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand NOT(){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand COMPLIMENT(){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand OR(){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand NOR(){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand NAND(){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand XOR(){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand XORN(){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Override
	public ExpressionOperand XNOR(){
		throw new UnsupportedOperationException("Operation not Supported");
	}

	@Data
	protected class Params{
		public Params( ParserRuleContext ctx, StringBuilder sb)
		{
			this.context = ctx;
			beginingOfAlignemtText = 0;
			input = ctx.start.getInputStream();
			this.stringBuilder = sb;
		}
		private ParserRuleContext context;
		private CharStream input;
		private StringBuilder stringBuilder;
		//private int endOfAlignmentText;
		private int beginingOfAlignemtText;

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("Context = " + context.getClass().getSimpleName() +"\n"+ context.getText()); sb.append("\n");
			sb.append("Text = "+ stringBuilder.toString()); sb.append("\n");
			sb.append("start ="+beginingOfAlignemtText); sb.append("\n");
			//sb.append("end = "+endOfAlignmentText);sb.append("\n");
			return sb.toString();
		}

	}

	//getFormattedText() app
	@Override
	public String getFormattedText(){
		StringBuilder sb = new StringBuilder();
		Params params = new Params(getContext(), sb);
		params.setBeginingOfAlignemtText(getContext().start.getStartIndex());
		getFormattedText(params);
		L.debug("output =\n" + sb.toString());
		return sb.toString().trim();

	}

	public String getCString(CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		StringBuilder sb = new StringBuilder();
		Params params = new Params(getContext(), sb);
		params.setBeginingOfAlignemtText(getContext().start.getStartIndex());
		getCString(params, classObj, moduleToParameters, functionalityName);
		L.debug("output =\n" + sb.toString());
		return sb.toString().trim();

	}

	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters, String functionalityName){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(childCtx instanceof TerminalNode){
					printTerminalNode((TerminalNode)childCtx,params);
				}
				else if(childCtx.getText().length() >0){
					params.setContext((ParserRuleContext)childCtx);
					Params thisCtxParams = getExtendedContext(childCtx).getUpdatedParams(params);
					getExtendedContext(childCtx).getCString(thisCtxParams, classObj, moduleToParameters, functionalityName);
				}
			}
		}
	}

	protected void getFormattedText(Params params){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(childCtx instanceof TerminalNode){
					printTerminalNode((TerminalNode)childCtx,params);
				}
				else if(childCtx.getText().length() >0){
					params.setContext((ParserRuleContext)childCtx);
					Params thisCtxParams = getExtendedContext(childCtx).getUpdatedParams(params);
					getExtendedContext(childCtx).getFormattedText(thisCtxParams);
				}
			}
		}
	}

	/*
	 * check if they are pointing to the same char stream, else it resets the 
	 * params with the new char stream params.
	 */
	protected Params getUpdatedParams(Params params) {

		if ( getContext() == null)
		{
			//The item is removed during the transformation, hence skip its contents.
			String alignmentText = params.getInput().getText(new Interval(params.beginingOfAlignemtText, params.getContext().start.getStartIndex()-1));
			params.getStringBuilder().append(alignmentText);
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex() + 1); 
			return null;
		}
		if (getContext().start.getInputStream() != params.getContext().start.getInputStream())
		{
			/*
			 * advance the  begining of  alignment text, as we are going to consider 'mostRecentContext' in its place.
			 */
			if ( params.beginingOfAlignemtText  <  params.getContext().start.getStartIndex())
			{
				String alignmentText = params.getInput().getText(new Interval(params.beginingOfAlignemtText, params.getContext().start.getStartIndex()-1));
				params.getStringBuilder().append(alignmentText);
			}
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex() + 1); 
			return new Params(getContext(),params.getStringBuilder());
		}
		else
		{
			params.setContext(getContext());
			return params;
		}
	}

	protected void printTerminalNode(TerminalNode node,Params params){
		CharStream input = params.getContext().start.getInputStream();
		if(node.getText().equals("<EOF>")){
			String end = input.getText(new Interval(params.getBeginingOfAlignemtText(),input.size()));
			params.getStringBuilder().append(end);
		} else {
			if(params.getBeginingOfAlignemtText() < node.getSymbol().getStartIndex()){
				Interval alignmentTextInterval = new Interval(params.getBeginingOfAlignemtText(),node.getSymbol().getStartIndex()-1);
				String alignmentText = input.getText(alignmentTextInterval);
				params.getStringBuilder().append(alignmentText);
			}
			params.getStringBuilder().append(node.getText());
			params.setBeginingOfAlignemtText(node.getSymbol().getStopIndex()+1);
		}
	}

	public List<Non_port_module_itemContext> getNonPortModuleItems(){
		List<Non_port_module_itemContext> module_itemContexts = new ArrayList<Non_port_module_itemContext>();
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					List<Non_port_module_itemContext> module_itemContextsTemp = getExtendedContext(childCtx).getNonPortModuleItems();
					if(module_itemContextsTemp != null){
						module_itemContexts.addAll(module_itemContextsTemp);
					}
				}
			}
		}
		if(module_itemContexts.size() == 0){
			return null;
		} else {
			return module_itemContexts;
		}
	}

	public List<String> getHierarchicalIdentifier(){
		ParserRuleContext ctx = getContext();
		List<String> hierarchical_identifier = new ArrayList<String>();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					List<String> hierarchical_identifierTemp = getExtendedContext(childCtx).getHierarchicalIdentifier();
					if(hierarchical_identifierTemp != null && hierarchical_identifierTemp.size() >0){
						hierarchical_identifier.addAll(hierarchical_identifierTemp);
					}
				}
			}
		}
		if(hierarchical_identifier.size() >0)
			return hierarchical_identifier;
		else
			return null;
	}

	public List<String> getSelectIdentifier(){
		ParserRuleContext ctx = getContext();
		List<String> identifiers = new ArrayList<String>();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					List<String> identifiersTemp = getExtendedContext(childCtx).getSelectIdentifier();
					if(identifiersTemp != null && identifiersTemp.size()>0){
						identifiers.addAll(identifiersTemp);
					}
				}
			}
		}
		if(identifiers.size() >0)
			return identifiers;
		else
			return null;
	}
	protected Boolean returnModuleItem(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					Boolean moduleText = getExtendedContext(childCtx).returnModuleItem();
					if(moduleText != null){
						return moduleText;
					}
				}
			}
		}
		return null;
	}

	public void evaluateConditionalExpression(SymbolTable st,String functionalityName){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					getExtendedContext(childCtx).evaluateConditionalExpression(st, functionalityName);
				}
			}
		}
	}


	public void paint(SymbolTable symbolTable, String functionalityName){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					getExtendedContext(childCtx).paint(symbolTable,functionalityName);
				}
			}
		}
	}

	public Pair<String,String> getLeftRightOfConstantSelect(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					Pair<String,String> temp = getExtendedContext(childCtx).getLeftRightOfConstantSelect();
					if(temp != null){
						return temp;
					}
				}
			}
		}
		return null;
	}

	protected void undoEvaluatedStrings(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					getExtendedContext(childCtx).undoEvaluatedStrings();;
				}
			}
		}
	}

	@Override
	public void processPragma(String pragmaId){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					getExtendedContext(childCtx).processPragma(pragmaId);
				}
			}
		}
	}

	// splits ModuleInstantiation based on the pragma written in that module
	public void splitModuleInstantiations(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					getExtendedContext(childCtx).splitModuleInstantiations();
				}
			}
		}
	}

	public void Blocks_to_null(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					getExtendedContext(childCtx).Blocks_to_null();
				}
			}
		}
	}

	public void Statements_to_null(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					getExtendedContext(childCtx).Statements_to_null();
				}
			}
		}
	}

	public static void writeToFile(File file, boolean append, String content){
		try{
			if (!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, append));
			try{
				bw.write(content);
			} finally {
				bw.close();
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}

	// Used for statements reordering
	public List<IStatement> PopulateStatements(String functionalityName){
		List<IStatement> iStatements = new ArrayList<IStatement>();
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					List<IStatement> iStatementsTemp = getExtendedContext(childCtx).PopulateStatements(functionalityName);
					if(iStatementsTemp != null){
						iStatements.addAll(iStatementsTemp);
					}
				}
			}
		}
		if(iStatements.size()>0){
			return iStatements;
		} else {
			return null;
		}
	}

	public String BailoutRule(String ruleName, String ruleContext){
		throw new RuntimeException("rule not implemented for ruleName :"+ruleName+" for context "+ruleContext);
	}

	// to get list of identifiers in a rule
	public List<String> Identifiers(){
		ParserRuleContext ctx = getContext();
		List<String> identifiersList = new ArrayList<String>();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					identifiersList.addAll(getExtendedContext(childCtx).Identifiers());
				}
			}
		}
		return identifiersList;
	}

	// to gets assigns strings from non port module items
	public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					String temp = getExtendedContext(childCtx).getAssignString(classObj, moduleToParameters,functionalityName);
					if(temp != null){
						return temp;
					}
				}
			}
		}
		return null;
	}

	// to collects class level variables into class objects
	public void getClassInfo(CClass classobj, Map<String, List<Parameter>> moduleToParameters){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					getExtendedContext(childCtx).getClassInfo(classobj, moduleToParameters);
				}
			}
		}
	}

	// check for ConstinuousAssign rule
	public Boolean isConstinuousAssign(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					Boolean res = getExtendedContext(childCtx).isConstinuousAssign();
					if(res != false){
						return res;
					}
				}
			}
		}
		return false;
	}

	public Boolean isBitSelect(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					Boolean res = getExtendedContext(childCtx).isBitSelect();
					if(res != false){
						return res;
					}
				}
			}
		}
		return false;
	}
	
	public Boolean isSelect(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					Boolean res = getExtendedContext(childCtx).isSelect();
					if(res != false){
						return res;
					}
				}
			}
		}
		return false;
	}

	public Boolean isMinTypeMax(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					Boolean res = getExtendedContext(childCtx).isMinTypeMax();
					if(res != false){
						return res;
					}
				}
			}
		}
		return false;
	}
	
	public Boolean isConstantSelect(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					Boolean res = getExtendedContext(childCtx).isConstantSelect();
					if(res != false){
						return res;
					}
				}
			}
		}
		return false;
	}

	// To prepare a c string for the rule before CString()
	public void prepForC(List<String> referenceVariables){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					getExtendedContext(childCtx).prepForC(referenceVariables);
				}
			}
		}
	}


	public void genvarAccess(List<Variable> list,String obj,String var){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					getExtendedContext(childCtx).genvarAccess(list,obj,var);
				}
			}
		}
	}

	// Could be removed
	public void undoGenvarAccess(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					getExtendedContext(childCtx).undoGenvarAccess();
				}
			}
		}
	}

	// to avoid duplicates we are renaming genavar blocks
	public void renameGenvarBlocks(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					getExtendedContext(childCtx).renameGenvarBlocks();
				}
			}
		}
	}

	/*
	 * {a,b,c} we get a,b,c in a list
	 */
	public List<String> getConcatenatedVariables(CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					List<String> res = getExtendedContext(childCtx).getConcatenatedVariables(classObj,moduleToParameters,functionalityName);
					if(res != null){
						return res;
					}
				}
			}
		}
		return null;
	}

	public List<String> getConcatenatedVariables(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					List<String> res = getExtendedContext(childCtx).getConcatenatedVariables();
					if(res != null){
						return res;
					}
				}
			}
		}
		return null;
	}


	// Check whether the rule is concatenation or not
	public Boolean isConcatenation(){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					Boolean res = getExtendedContext(childCtx).isConcatenation();
					if(res != null){
						return res;
					}
				}
			}
		}
		return null;
	}

}

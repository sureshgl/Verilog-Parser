package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.proteus.cgen.pragma.IGenvarLoopLength;
import com.proteus.cgen.pragma.PragmaRegister;
import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.Range;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.structures.Variable;

import lombok.Getter;

import com.proteus.cgen.verilogprime.ExtendedContextVisitor;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_compContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Generate_blockContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Generate_block_part1Context;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Loop_generate_constructContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pragma_defContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pragma_textContext;

public class Loop_generate_constructContextExt extends AbstractBaseExt{

	@Getter private Loop_generate_constructContext ctx;
	private String length;
	private List<Loop_generate_constructContext> loop_generate_constructContexts;

	public Loop_generate_constructContextExt(Loop_generate_constructContext ctx) {
		this.ctx = ctx;
		this.loop_generate_constructContexts = new ArrayList<Loop_generate_constructContext>();
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).loop_generate_construct());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Loop_generate_constructContext){
				this.ctx = (Loop_generate_constructContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Loop_generate_constructContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		if(ctx != null){
			List<IStatement> iStatements = new ArrayList<IStatement>();
			if(loop_generate_constructContexts != null && loop_generate_constructContexts.size()>1){
				for(Loop_generate_constructContext loop_generate_constructContext : loop_generate_constructContexts){
					iStatements.addAll(loop_generate_constructContext.extendedContext.PopulateStatements(functionalityName));
				}
			} else {
				Set<SortVariable> rVariables = new HashSet<SortVariable>();
				Set<SortVariable> lVariables = new HashSet<SortVariable>();
				List<IStatement> childStatements = super.PopulateStatements(functionalityName);
				String genString = null;
				if(ctx.genvar_initialization()!= null){
					genString =ctx.genvar_initialization().genvar_identifier().getText();
				}
				for(IStatement childStatement : childStatements) {
					lVariables.addAll(childStatement.getLeftVariables());
					rVariables.addAll(childStatement.getRightVariables());
				}
				for (Iterator<SortVariable> iterator = lVariables.iterator(); iterator.hasNext();) {
					SortVariable variable = iterator.next();
					if(variable.isDeclaration()){
						iterator.remove();
					}
					if(variable.getParentName().equals(genString)){
						iterator.remove();
					}
				}
				for (Iterator<SortVariable> iterator = rVariables.iterator(); iterator.hasNext();) {
					SortVariable variable = iterator.next();
					if(variable.isDeclaration()){
						iterator.remove();
					}
				}
				if(ctx.genvar_expression() != null && ctx.genvar_expression().constant_expression() != null){
					if(ctx.genvar_expression().constant_expression() instanceof Const_expr_compContext){
						Const_expr_compContext cntCtx = (Const_expr_compContext) ctx.genvar_expression().constant_expression();
						Range range = new Range();
						String init = ctx.genvar_initialization().constant_expression().getText();
						String upperlimit = cntCtx.constant_expression(1).getText();
						String iterator = null;
						if(ctx.genvar_iteration() != null && ctx.genvar_iteration().genvar_expression() != null){
							String tempiterator =ctx.genvar_iteration().genvar_expression().getText();
							if(tempiterator.contains(init)){
								tempiterator.replace(init, "");
								if(tempiterator.contains("+")){
									tempiterator.replace("+", "");
									iterator = "+"+tempiterator;
								} else if(tempiterator.contains("-")){
									tempiterator.replace("-", "");
									iterator = "-"+tempiterator;
								} else {
									BailoutRule("Loop generate construct", "Not yet handled");
								}
							}
						} else if(ctx.genvar_iteration().inc_or_dec_operator() != null){
							if(ctx.genvar_iteration().inc_or_dec_operator().increment() != null){
								iterator ="+1";
							} else if(ctx.genvar_iteration().inc_or_dec_operator().decrement() != null){
								iterator="-1";
							}
						}
						range.setInit(init);
						range.setUpper(upperlimit);
						range.setIterator(iterator);
						for(SortVariable variable : lVariables){
							if(variable.getCompleteVar()!=null){
								variable.setIndexRange(range);
							}
						}
						for(SortVariable variable : rVariables){
							if(variable.getCompleteVar()!=null){
								variable.setIndexRange(range);
							}
						}
					}
				}
				Statement statement = new Statement(lVariables, rVariables, ctx);
				iStatements.add(statement);
			}
			return iStatements;
		}
		return null;
	}


	private Pragma_textContext getPragmaTextContext(ParseTree ctx){
		if(ctx instanceof Pragma_defContext){
			if(((Pragma_defContext)ctx).PRAGMA_ID().getText().equals("loop_size")){
				return ((Pragma_defContext)ctx).pragma_text();
			}
		}  else {
			if(ctx != null && (ctx.getChildCount()>0)){
				for(int i=0;i<ctx.getChildCount();i++){
					if(!(ctx.getChild(i) instanceof TerminalNode) && ctx.getChild(i).getText().length() >0){
						Pragma_textContext pragma_textContext = getPragmaTextContext(ctx.getChild(i));
						if(pragma_textContext != null){
							return pragma_textContext;
						}
					}
				}
			}
		}
		return null;
	}

	@Override
	public void processPragma(String pragmaId){
		if(pragmaId.equals("loop_size")){
			Pragma_textContext pragma_textContext = getPragmaTextContext(ctx);
			if(pragma_textContext == null){
				try {
					throw new Exception("Please provide pragma for the generate loops");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			IGenvarLoopLength iModuleInstantiationProcessing= (IGenvarLoopLength)PragmaRegister.get("loop_size");
			if(pragma_textContext != null){
				length = iModuleInstantiationProcessing.getLoopLength(pragma_textContext);
			} else {
				super.processPragma(pragmaId);
			}
		}
		super.processPragma(pragmaId);
	}

	@Override
	public void getClassInfo(CClass classobj, Map<String, List<Parameter>> moduleToParameters){
		processPragma("loop_size");
		String name = null;

		if(((Generate_block_part1Context)((Generate_blockContext)ctx.generate_block().extendedContext.getContext())
				.generate_block_part1().extendedContext.getContext()).generate_block_identifier() == null){
			Random rn = new Random();
			name = "genLoop"+ rn.nextInt();
		} else {
			name = ((Generate_block_part1Context)((Generate_blockContext)ctx.generate_block().extendedContext.getContext())
					.generate_block_part1().extendedContext.getContext()).generate_block_identifier().extendedContext.getFormattedText().split(" ")[0];
		}
		classobj.addToGenvarHeader("#include \""+name+"_class.h\"");
		name = name.replace("-", "_");
		String declaration = name+"_class** "+name+"_class_obj;";
		CClass genvarClassObj = new CClass(name,classobj.getOutDir(),classobj.getRegHeaders());
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		List<Parameter> parameters = classobj.getParameters();
		if(parameters != null && parameters.size()>0){
			sb.append(parameters.get(0).getName());
			genvarClassObj.addToParameters(parameters.get(0));
			for(int i=1;i<parameters.size();i++){
				genvarClassObj.addToParameters(parameters.get(i));
				sb.append(","+parameters.get(i).getName());
			}
			sb.append(");");
		}
		for(Parameter parameter : classobj.getLocalParameters()){
			genvarClassObj.addToLocalParamVariables(parameter);
		}
		genvarClassObj.getClassInfo((Generate_blockContext)ctx.generate_block().extendedContext.getContext(), moduleToParameters);
		genvarClassObj.writeClassToFile();
		processPragma("module_instantiation_pragma");
		String loopVar = ctx.genvar_initialization().genvar_identifier().extendedContext.getFormattedText();
		String initialization = name+"_class_obj = new "+name+"_class*["+length+"];\n";
		initialization = initialization + "for( int i=0; i<"+length+"; i++){\n"+ name+"_class_obj[i] = new "+name+"_class"+sb.toString()+"\n}\n";
		Variable variable = new Variable( name+"_obj",declaration,initialization,true);
		classobj.addToInputVariables(variable);
		populateLoopGenerateConstructContexts();
		for(int i=0;i<loop_generate_constructContexts.size();i++){
			loop_generate_constructContexts.get(i).extendedContext.genvarAccess(genvarClassObj.getInputVariables(), name+"_class_obj", loopVar);
		}
	}

	private void populateLoopGenerateConstructContexts(){
		List<ParserRuleContext> generate_itemContexts = ((Loop_generate_constructContext)getContext()).generate_block().extendedContext.getGenerateItems();
		StringBuilder header = new StringBuilder();
		header.append(ctx.forstr().extendedContext.getFormattedText());
		header.append("( ");
		header.append(ctx.genvar_initialization().extendedContext.getFormattedText());
		header.append("; ");
		header.append(ctx.genvar_expression().extendedContext.getFormattedText());
		header.append("; ");
		header.append(ctx.genvar_iteration().extendedContext.getFormattedText());
		header.append(")");
		header.append("begin \n");
		String footer ="end "+ ctx.pragma_def().extendedContext.getFormattedText()+" \n";
		ExtendedContextVisitor extendedContextVisitor = new ExtendedContextVisitor();
		for(ParserRuleContext parserRuleContext : generate_itemContexts) {
			StringBuilder each = new StringBuilder();
			each.append(header.toString());
			each.append(extendedContextVisitor.visit(parserRuleContext).getFormattedText()+"\n");
			each.append(footer);
			Loop_generate_constructContext contextToAdd = (Loop_generate_constructContext)getContext(each.toString());
			contextToAdd.extendedContext.length = length;
			loop_generate_constructContexts.add(contextToAdd);
		}
	}

	@Override
	public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		StringBuilder sb = new StringBuilder();
		String temp = ctx.generate_block().extendedContext.getAssignString(classObj, moduleToParameters,functionalityName);
		if(temp != null){
			sb.append("for("+ctx.genvar_initialization().extendedContext.getCString(classObj, moduleToParameters,functionalityName).replace("integer", "int")+";"+
					ctx.genvar_expression().extendedContext.getCString(classObj, moduleToParameters,functionalityName)+";"+
					ctx.genvar_iteration().extendedContext.getCString(classObj, moduleToParameters,functionalityName)+"){\n");
			sb.append(ctx.generate_block().extendedContext.getAssignString(classObj, moduleToParameters,functionalityName));
			sb.append("\n}\n");
			return sb.toString();
		} else{
			return null;
		}
	}
}

package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Continuous_assignContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ExpressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_net_assignmentsContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Net_assignmentContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Net_lvalueContext;
import com.proteus.common.util.Utils.Pair;

public class Continuous_assignContextExt extends AbstractBaseExt{

	@Getter private Continuous_assignContext ctx;
	@Getter List<String> pragma_fn_statement_skip;

	public Continuous_assignContextExt(Continuous_assignContext ctx) {
		this.ctx = ctx;
		pragma_fn_statement_skip = new ArrayList<String>();
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).continuous_assign());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Continuous_assignContext){
				this.ctx = (Continuous_assignContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Continuous_assignContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void paint(SymbolTable st,String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			if(ctx.list_of_net_assignments() != null){
				Net_assignmentContext net_assignmentContext = ((List_of_net_assignmentsContext)ctx.list_of_net_assignments().extendedContext.getContext()).net_assignment(0);
				String before = net_assignmentContext.extendedContext.getFormattedText();
				net_assignmentContext.extendedContext.eval(st);
				String after = net_assignmentContext.extendedContext.getFormattedText();
				Net_lvalueContext net_lvalueContext = ((Net_lvalueContext)((Net_assignmentContext)net_assignmentContext.extendedContext.getContext()).net_lvalue().extendedContext.getContext());
				Boolean forward = null;
				if(net_lvalueContext.ps_or_hierarchical_net_identifier() == null) {
					forward = false;
				} else if(st.containsKey(net_lvalueContext.ps_or_hierarchical_net_identifier().getText())){
					forward = true;
				} else {
					forward = false;
				}
				if((!before.equals(after)) || forward){
					String expression = ((Net_assignmentContext)net_assignmentContext.extendedContext.getContext()).expression().extendedContext.getFormattedText();
					String net_lvalueId = null;
					if(net_lvalueContext.ps_or_hierarchical_net_identifier() == null){
						net_lvalueId = net_lvalueContext.extendedContext.getFormattedText();
					} else {
						net_lvalueId = net_lvalueContext.ps_or_hierarchical_net_identifier().getText();
					}
					expression = st.containsKey(expression) ? st.get(expression) : expression;
					net_lvalueId = st.containsKey(net_lvalueId) ? st.get(net_lvalueId) : net_lvalueId;
					try{
						Float.parseFloat(expression);
						try{
							Float.parseFloat(net_lvalueId);
						}catch(NumberFormatException exception){
							if(net_lvalueContext.constant_select() == null || net_lvalueContext.constant_select().getText().equals("") )
								st.put(net_lvalueId,"0");
						}
						if(!pragma_fn_statement_skip.contains(functionalityName))
							pragma_fn_statement_skip.add(functionalityName);
					}catch(NumberFormatException exception){
						try{
							Float.parseFloat(net_lvalueId);
							if(!pragma_fn_statement_skip.contains(functionalityName))
								pragma_fn_statement_skip.add(functionalityName);
						}catch(NumberFormatException exception1){

						}
					}
				}
				undoEvaluatedStrings();
			} 
		}
	}

	@Override
	public void Statements_to_null(){
		if(ctx != null) {
			writeToFile(new File("CtxData/"+ctx.getClass().getSimpleName()), true,ctx.extendedContext.getFormattedText()+"\n_____\n");
			super.Statements_to_null();
			addToContexts(null);
		}
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			List<IStatement> iStatements = new ArrayList<IStatement>();
			if(ctx != null){
				Set<SortVariable> rVariables = new HashSet<SortVariable>();
				Set<SortVariable> lVariables = new HashSet<SortVariable>();
				if(ctx.list_of_net_assignments() != null){
					List<IStatement> childStatements = super.PopulateStatements(functionalityName);
					for(IStatement childStatement : childStatements) {
						lVariables.addAll(childStatement.getLeftVariables());
						rVariables.addAll(childStatement.getRightVariables());
					}
				} else {
					BailoutRule(ctx.getClass().getName(), ctx.extendedContext.getFormattedText());
				}
				Statement statement = new Statement(lVariables, rVariables, ctx);
				iStatements.add(statement);
			}
			if(iStatements.size()>0){
				return iStatements;
			} else {
				return null;
			}
		} else{
			return null;
		}
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			if(ctx != null && ctx.list_of_net_assignments() != null ){
				String rightVariable = null;
				Pair<String,String> range = null;
				List<Net_assignmentContext> net_assignmentContexts = ctx.list_of_net_assignments().net_assignment();
				if(net_assignmentContexts != null && net_assignmentContexts.size() > 0){
					if(net_assignmentContexts.get(0).net_lvalue() != null) {
						range = net_assignmentContexts.get(0).net_lvalue().extendedContext.getLeftRightOfConstantSelect();
						if(range != null){
							rightVariable = net_assignmentContexts.get(0).expression().extendedContext.getCString(classObj,moduleToParameters,functionalityName);
							String variable = net_assignmentContexts.get(0).net_lvalue().ps_or_hierarchical_net_identifier().extendedContext.getFormattedText();
							params.getStringBuilder().append(variable+".set("+range.second()+","+range.first()+","+rightVariable+");");
							params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
						} else {
							super.getCString(params, classObj, moduleToParameters,functionalityName);
						}
					} else {
						super.getCString(params, classObj, moduleToParameters,functionalityName);
					}
				}
			} else {
				super.getCString(params, classObj, moduleToParameters,functionalityName);
			}
		} else {
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		}
	}

	@Override
	protected Boolean returnModuleItem(){
		return true;
	}
	@Override
	public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		return getCString(classObj, moduleToParameters, functionalityName);
	}

	@Override
	public Boolean isConstinuousAssign(){
		return true;
	}
}



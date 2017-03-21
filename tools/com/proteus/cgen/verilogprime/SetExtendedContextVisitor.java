package com.proteus.cgen.verilogprime;

import org.antlr.v4.runtime.ParserRuleContext;

import com.proteus.cgen.verilogprime.gen.VerilogPrimeParserBaseVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.*;
import com.proteus.cgen.verilogprime.ext.*;

public class SetExtendedContextVisitor extends VerilogPrimeParserBaseVisitor<ParserRuleContext> {
	private AbstractBaseExt extendedContext;
	public SetExtendedContextVisitor( AbstractBaseExt extendedCtx){
		this.extendedContext = extendedCtx;
	}
	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSource_text(Source_textContext ctx){
		if ( extendedContext != null && extendedContext instanceof Source_textContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Source_textContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDescription(DescriptionContext ctx){
		if ( extendedContext != null && extendedContext instanceof DescriptionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DescriptionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_declaration(Module_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_nonansi_header(Module_nonansi_headerContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_nonansi_headerContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_nonansi_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_ansi_header(Module_ansi_headerContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_ansi_headerContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_ansi_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_keyword(Module_keywordContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_keywordContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_keywordContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInterface_declaration(Interface_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Interface_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInterface_nonansi_header(Interface_nonansi_headerContext ctx){
		if ( extendedContext != null && extendedContext instanceof Interface_nonansi_headerContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_nonansi_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInterface_ansi_header(Interface_ansi_headerContext ctx){
		if ( extendedContext != null && extendedContext instanceof Interface_ansi_headerContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_ansi_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProgram_declaration(Program_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Program_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProgram_nonansi_header(Program_nonansi_headerContext ctx){
		if ( extendedContext != null && extendedContext instanceof Program_nonansi_headerContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_nonansi_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProgram_ansi_header(Program_ansi_headerContext ctx){
		if ( extendedContext != null && extendedContext instanceof Program_ansi_headerContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_ansi_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitChecker_declaration(Checker_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Checker_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_declaration(Class_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPackage_declaration(Package_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Package_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPackage_declaration_part1(Package_declaration_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Package_declaration_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_declaration_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTimeunits_declaration(Timeunits_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Timeunits_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timeunits_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitParameter_port_list(Parameter_port_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Parameter_port_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parameter_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_parameter_port_declaration(List_of_parameter_port_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_parameter_port_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_parameter_port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitParameter_port_declaration(Parameter_port_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Parameter_port_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parameter_port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_ports(List_of_portsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_portsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_portsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_declarations(List_of_port_declarationsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_port_declarationsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_port_declarationsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_declarations_part1(List_of_port_declarations_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_port_declarations_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_port_declarations_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPort_declaration(Port_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Port_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPort(PortContext ctx){
		if ( extendedContext != null && extendedContext instanceof PortContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PortContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPort_expression(Port_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Port_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Port_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPort_reference(Port_referenceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Port_referenceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Port_referenceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPort_direction(Port_directionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Port_directionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Port_directionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNet_port_header(Net_port_headerContext ctx){
		if ( extendedContext != null && extendedContext instanceof Net_port_headerContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_port_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVariable_port_header(Variable_port_headerContext ctx){
		if ( extendedContext != null && extendedContext instanceof Variable_port_headerContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_port_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInterface_port_header(Interface_port_headerContext ctx){
		if ( extendedContext != null && extendedContext instanceof Interface_port_headerContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_port_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAnsi_port_declaration(Ansi_port_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ansi_port_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ansi_port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitElaboration_system_task(Elaboration_system_taskContext ctx){
		if ( extendedContext != null && extendedContext instanceof Elaboration_system_taskContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Elaboration_system_taskContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFinish_number(Finish_numberContext ctx){
		if ( extendedContext != null && extendedContext instanceof Finish_numberContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Finish_numberContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_common_item(Module_common_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_common_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_common_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_item(Module_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_or_generate_item(Module_or_generate_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_or_generate_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_or_generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNon_port_module_item(Non_port_module_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Non_port_module_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Non_port_module_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitParameter_override(Parameter_overrideContext ctx){
		if ( extendedContext != null && extendedContext instanceof Parameter_overrideContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parameter_overrideContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBind_directive(Bind_directiveContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bind_directiveContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bind_directiveContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBind_target_scope(Bind_target_scopeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bind_target_scopeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bind_target_scopeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBind_target_instance(Bind_target_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bind_target_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bind_target_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBind_target_instance_list(Bind_target_instance_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bind_target_instance_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bind_target_instance_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBind_instantiation(Bind_instantiationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bind_instantiationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bind_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConfig_declaration(Config_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Config_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Config_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDesign_statement(Design_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Design_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Design_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDesign_statement_part1(Design_statement_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Design_statement_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Design_statement_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConfig_rule_statement(Config_rule_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Config_rule_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Config_rule_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDefault_clause(Default_clauseContext ctx){
		if ( extendedContext != null && extendedContext instanceof Default_clauseContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Default_clauseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInst_clause(Inst_clauseContext ctx){
		if ( extendedContext != null && extendedContext instanceof Inst_clauseContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inst_clauseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInst_name(Inst_nameContext ctx){
		if ( extendedContext != null && extendedContext instanceof Inst_nameContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inst_nameContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCell_clause(Cell_clauseContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cell_clauseContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cell_clauseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLiblist_clause(Liblist_clauseContext ctx){
		if ( extendedContext != null && extendedContext instanceof Liblist_clauseContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Liblist_clauseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUse_clause(Use_clauseContext ctx){
		if ( extendedContext != null && extendedContext instanceof Use_clauseContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Use_clauseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_or_generate_item_declaration(Module_or_generate_item_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_or_generate_item_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_or_generate_item_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInterface_or_generate_item(Interface_or_generate_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Interface_or_generate_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_or_generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExtern_tf_declaration(Extern_tf_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Extern_tf_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Extern_tf_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInterface_item(Interface_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Interface_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNon_port_interface_item(Non_port_interface_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Non_port_interface_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Non_port_interface_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProgram_item(Program_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Program_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNon_port_program_item(Non_port_program_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Non_port_program_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Non_port_program_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProgram_generate_item(Program_generate_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Program_generate_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitChecker_port_list(Checker_port_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Checker_port_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitChecker_port_item(Checker_port_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Checker_port_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_port_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitChecker_or_generate_item(Checker_or_generate_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Checker_or_generate_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_or_generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitChecker_or_generate_item_declaration(Checker_or_generate_item_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Checker_or_generate_item_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_or_generate_item_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitChecker_generate_item(Checker_generate_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Checker_generate_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitChecker_always_construct(Checker_always_constructContext ctx){
		if ( extendedContext != null && extendedContext instanceof Checker_always_constructContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_always_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_item(Class_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_property(Class_propertyContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_propertyContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_propertyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_method(Class_methodContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_methodContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_methodContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_constructor_prototype(Class_constructor_prototypeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_constructor_prototypeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_constructor_prototypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_constraint(Class_constraintContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_constraintContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_constraintContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_item_qualifier(Class_item_qualifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_item_qualifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_item_qualifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_qualifier(Property_qualifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_qualifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_qualifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRandom_qualifier(Random_qualifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Random_qualifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Random_qualifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMethod_qualifier(Method_qualifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Method_qualifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Method_qualifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMethod_prototype(Method_prototypeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Method_prototypeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Method_prototypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_constructor_declaration(Class_constructor_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_constructor_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_constructor_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstraint_declaration(Constraint_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constraint_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstraint_block(Constraint_blockContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constraint_blockContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstraint_block_item(Constraint_block_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constraint_block_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_block_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSolve_before_list(Solve_before_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Solve_before_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Solve_before_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSolve_before_primary(Solve_before_primaryContext ctx){
		if ( extendedContext != null && extendedContext instanceof Solve_before_primaryContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Solve_before_primaryContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstraint_expression(Constraint_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constraint_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstraint_set(Constraint_setContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constraint_setContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_setContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDist_list(Dist_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Dist_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dist_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDist_item(Dist_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Dist_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dist_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDist_weight(Dist_weightContext ctx){
		if ( extendedContext != null && extendedContext instanceof Dist_weightContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dist_weightContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstraint_prototype(Constraint_prototypeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constraint_prototypeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_prototypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExtern_constraint_declaration(Extern_constraint_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Extern_constraint_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Extern_constraint_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIdentifier_list(Identifier_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Identifier_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Identifier_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPackage_item(Package_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Package_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPackage_or_generate_item_declaration(Package_or_generate_item_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Package_or_generate_item_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_or_generate_item_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAnonymous_program(Anonymous_programContext ctx){
		if ( extendedContext != null && extendedContext instanceof Anonymous_programContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Anonymous_programContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAnonymous_program_item(Anonymous_program_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Anonymous_program_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Anonymous_program_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLocal_parameter_declaration(Local_parameter_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Local_parameter_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Local_parameter_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitParameter_declaration(Parameter_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Parameter_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parameter_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSpecparam_declaration(Specparam_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Specparam_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specparam_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInout_declaration(Inout_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Inout_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inout_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInput_declaration(Input_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Input_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Input_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOutput_declaration(Output_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Output_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Output_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInterface_port_declaration(Interface_port_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Interface_port_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRef_declaration(Ref_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ref_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ref_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitData_declaration(Data_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Data_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Data_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPackage_import_declaration(Package_import_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Package_import_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_import_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPackage_import_item(Package_import_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Package_import_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_import_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPackage_export_declaration(Package_export_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Package_export_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_export_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGenvar_declaration(Genvar_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Genvar_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Genvar_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNet_declaration(Net_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Net_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitType_declaration(Type_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Type_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Type_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLifetime(LifetimeContext ctx){
		if ( extendedContext != null && extendedContext instanceof LifetimeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LifetimeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCasting_type(Casting_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Casting_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Casting_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitData_type(Data_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Data_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Data_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitData_type_or_implicit(Data_type_or_implicitContext ctx){
		if ( extendedContext != null && extendedContext instanceof Data_type_or_implicitContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Data_type_or_implicitContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitImplicit_data_type(Implicit_data_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Implicit_data_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Implicit_data_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEnum_base_type(Enum_base_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Enum_base_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enum_base_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEnum_name_declaration(Enum_name_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Enum_name_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enum_name_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEnum_name_declaration_part1(Enum_name_declaration_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Enum_name_declaration_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enum_name_declaration_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_scope(Class_scopeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_scopeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_scopeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_type(Class_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_type_part1(Class_type_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Class_type_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_type_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInteger_type(Integer_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Integer_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Integer_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInteger_atom_type(Integer_atom_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Integer_atom_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Integer_atom_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInteger_vector_type(Integer_vector_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Integer_vector_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Integer_vector_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNon_integer_type(Non_integer_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Non_integer_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Non_integer_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNet_type(Net_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Net_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNet_port_type(Net_port_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Net_port_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_port_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVariable_port_type(Variable_port_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Variable_port_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_port_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVar_data_type(Var_data_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Var_data_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Var_data_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSigning(SigningContext ctx){
		if ( extendedContext != null && extendedContext instanceof SigningContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SigningContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSimple_type(Simple_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Simple_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStruct_union_member(Struct_union_memberContext ctx){
		if ( extendedContext != null && extendedContext instanceof Struct_union_memberContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Struct_union_memberContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitData_type_or_void(Data_type_or_voidContext ctx){
		if ( extendedContext != null && extendedContext instanceof Data_type_or_voidContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Data_type_or_voidContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStruct_union(Struct_unionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Struct_unionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Struct_unionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitType_reference(Type_referenceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Type_referenceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Type_referenceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDrive_strength(Drive_strengthContext ctx){
		if ( extendedContext != null && extendedContext instanceof Drive_strengthContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Drive_strengthContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStrength0(Strength0Context ctx){
		if ( extendedContext != null && extendedContext instanceof Strength0ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Strength0ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStrength1(Strength1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Strength1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Strength1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCharge_strength(Charge_strengthContext ctx){
		if ( extendedContext != null && extendedContext instanceof Charge_strengthContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Charge_strengthContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDelay3(Delay3Context ctx){
		if ( extendedContext != null && extendedContext instanceof Delay3ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delay3ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDelay2(Delay2Context ctx){
		if ( extendedContext != null && extendedContext instanceof Delay2ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delay2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDelay_value(Delay_valueContext ctx){
		if ( extendedContext != null && extendedContext instanceof Delay_valueContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delay_valueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_defparam_assignments(List_of_defparam_assignmentsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_defparam_assignmentsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_defparam_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_genvar_identifiers(List_of_genvar_identifiersContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_genvar_identifiersContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_genvar_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_interface_identifiers(List_of_interface_identifiersContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_interface_identifiersContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_interface_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_interface_identifiers_part1(List_of_interface_identifiers_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_interface_identifiers_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_interface_identifiers_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_param_assignments(List_of_param_assignmentsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_param_assignmentsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_param_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_identifiers(List_of_port_identifiersContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_port_identifiersContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_port_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_identifiers_part1(List_of_port_identifiers_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_port_identifiers_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_port_identifiers_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_udp_port_identifiers(List_of_udp_port_identifiersContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_udp_port_identifiersContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_udp_port_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_specparam_assignments(List_of_specparam_assignmentsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_specparam_assignmentsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_specparam_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_tf_variable_identifiers(List_of_tf_variable_identifiersContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_tf_variable_identifiersContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_tf_variable_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_tf_variable_identifiers_part1(List_of_tf_variable_identifiers_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_tf_variable_identifiers_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_tf_variable_identifiers_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_type_assignments(List_of_type_assignmentsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_type_assignmentsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_type_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_variable_decl_assignments(List_of_variable_decl_assignmentsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_variable_decl_assignmentsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_variable_decl_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_variable_identifiers(List_of_variable_identifiersContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_variable_identifiersContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_variable_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_variable_identifiers_part1(List_of_variable_identifiers_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_variable_identifiers_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_variable_identifiers_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_variable_port_identifiers(List_of_variable_port_identifiersContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_variable_port_identifiersContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_variable_port_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_variable_port_identifiers_part1(List_of_variable_port_identifiers_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_variable_port_identifiers_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_variable_port_identifiers_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_virtual_interface_decl(List_of_virtual_interface_declContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_virtual_interface_declContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_virtual_interface_declContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_virtual_interface_decl_part1(List_of_virtual_interface_decl_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_virtual_interface_decl_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_virtual_interface_decl_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDefparam_assignment(Defparam_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Defparam_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Defparam_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_net_decl_assignments(List_of_net_decl_assignmentsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_net_decl_assignmentsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_net_decl_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNet_decl_assignment(Net_decl_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Net_decl_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_decl_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitParam_assignment(Param_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Param_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Param_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSpecparam_assignment(Specparam_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Specparam_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specparam_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitType_assignment(Type_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Type_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Type_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPulse_control_specparam(Pulse_control_specparamContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pulse_control_specparamContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pulse_control_specparamContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitError_limit_value(Error_limit_valueContext ctx){
		if ( extendedContext != null && extendedContext instanceof Error_limit_valueContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Error_limit_valueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitReject_limit_value(Reject_limit_valueContext ctx){
		if ( extendedContext != null && extendedContext instanceof Reject_limit_valueContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Reject_limit_valueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLimit_value(Limit_valueContext ctx){
		if ( extendedContext != null && extendedContext instanceof Limit_valueContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Limit_valueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVariable_decl_assignment(Variable_decl_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Variable_decl_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_decl_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_new(Class_newContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_newContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_newContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDynamic_array_new(Dynamic_array_newContext ctx){
		if ( extendedContext != null && extendedContext instanceof Dynamic_array_newContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dynamic_array_newContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUnpacked_dimension(Unpacked_dimensionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Unpacked_dimensionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unpacked_dimensionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPacked_dimension(Packed_dimensionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Packed_dimensionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Packed_dimensionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssociative_dimension(Associative_dimensionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Associative_dimensionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Associative_dimensionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVariable_dimension(Variable_dimensionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Variable_dimensionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_dimensionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitQueue_dimension(Queue_dimensionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Queue_dimensionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Queue_dimensionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUnsized_dimension(Unsized_dimensionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Unsized_dimensionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unsized_dimensionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFunction_data_type_or_implicit(Function_data_type_or_implicitContext ctx){
		if ( extendedContext != null && extendedContext instanceof Function_data_type_or_implicitContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_data_type_or_implicitContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFunction_declaration(Function_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Function_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFunction_body_declaration(Function_body_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Function_body_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_body_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFunction_prototype(Function_prototypeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Function_prototypeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_prototypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDpi_import_export(Dpi_import_exportContext ctx){
		if ( extendedContext != null && extendedContext instanceof Dpi_import_exportContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_import_exportContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDpi_spec_string(Dpi_spec_stringContext ctx){
		if ( extendedContext != null && extendedContext instanceof Dpi_spec_stringContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_spec_stringContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDpi_function_import_property(Dpi_function_import_propertyContext ctx){
		if ( extendedContext != null && extendedContext instanceof Dpi_function_import_propertyContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_function_import_propertyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDpi_task_import_property(Dpi_task_import_propertyContext ctx){
		if ( extendedContext != null && extendedContext instanceof Dpi_task_import_propertyContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_task_import_propertyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDpi_function_proto(Dpi_function_protoContext ctx){
		if ( extendedContext != null && extendedContext instanceof Dpi_function_protoContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_function_protoContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDpi_task_proto(Dpi_task_protoContext ctx){
		if ( extendedContext != null && extendedContext instanceof Dpi_task_protoContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_task_protoContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTask_declaration(Task_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Task_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Task_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTask_body_declaration(Task_body_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Task_body_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Task_body_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTf_item_declaration(Tf_item_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tf_item_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_item_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTf_port_list(Tf_port_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tf_port_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTf_port_item(Tf_port_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tf_port_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_port_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTf_port_direction(Tf_port_directionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tf_port_directionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_port_directionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTf_port_declaration(Tf_port_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tf_port_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTask_prototype(Task_prototypeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Task_prototypeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Task_prototypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBlock_item_declaration(Block_item_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Block_item_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Block_item_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOverload_declaration(Overload_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Overload_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Overload_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOverload_operator(Overload_operatorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Overload_operatorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Overload_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOverload_proto_formals(Overload_proto_formalsContext ctx){
		if ( extendedContext != null && extendedContext instanceof Overload_proto_formalsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Overload_proto_formalsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVirtual_interface_declaration(Virtual_interface_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Virtual_interface_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Virtual_interface_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModport_declaration(Modport_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Modport_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModport_item(Modport_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Modport_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModport_ports_declaration(Modport_ports_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Modport_ports_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_ports_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModport_clocking_declaration(Modport_clocking_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Modport_clocking_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_clocking_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModport_simple_ports_declaration(Modport_simple_ports_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Modport_simple_ports_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_simple_ports_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModport_simple_port(Modport_simple_portContext ctx){
		if ( extendedContext != null && extendedContext instanceof Modport_simple_portContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_simple_portContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModport_tf_ports_declaration(Modport_tf_ports_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Modport_tf_ports_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_tf_ports_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModport_tf_port(Modport_tf_portContext ctx){
		if ( extendedContext != null && extendedContext instanceof Modport_tf_portContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_tf_portContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitImport_export(Import_exportContext ctx){
		if ( extendedContext != null && extendedContext instanceof Import_exportContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Import_exportContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConcurrent_assertion_item(Concurrent_assertion_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Concurrent_assertion_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Concurrent_assertion_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConcurrent_assertion_statement(Concurrent_assertion_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Concurrent_assertion_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Concurrent_assertion_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssert_property_statement(Assert_property_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Assert_property_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assert_property_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssume_property_statement(Assume_property_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Assume_property_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assume_property_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCover_property_statement(Cover_property_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cover_property_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cover_property_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpect_property_statement(Expect_property_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Expect_property_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Expect_property_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCover_sequence_statement(Cover_sequence_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cover_sequence_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cover_sequence_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRestrict_property_statement(Restrict_property_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Restrict_property_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Restrict_property_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_instance(Property_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_list_of_arguments(Property_list_of_argumentsContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_list_of_argumentsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_list_of_argumentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_list_of_arguments_part1(Property_list_of_arguments_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Property_list_of_arguments_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_list_of_arguments_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_list_of_arguments_part2(Property_list_of_arguments_part2Context ctx){
		if ( extendedContext != null && extendedContext instanceof Property_list_of_arguments_part2ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_list_of_arguments_part2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_actual_arg(Property_actual_argContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_actual_argContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_actual_argContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssertion_item_declaration(Assertion_item_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Assertion_item_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assertion_item_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_declaration(Property_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_port_list(Property_port_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_port_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_port_item(Property_port_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_port_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_port_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_lvar_port_direction(Property_lvar_port_directionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_lvar_port_directionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_lvar_port_directionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_formal_type(Property_formal_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_formal_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_formal_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_spec(Property_specContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_specContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_specContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_statement_spec(Property_statement_specContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_statement_specContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_statement_specContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_statement(Property_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_case_item(Property_case_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_case_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_case_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_expr(Property_exprContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_exprContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_exprContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_declaration(Sequence_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_port_list(Sequence_port_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_port_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_port_item(Sequence_port_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_port_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_port_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_lvar_port_direction(Sequence_lvar_port_directionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_lvar_port_directionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_lvar_port_directionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_formal_type(Sequence_formal_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_formal_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_formal_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_expr(Sequence_exprContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_exprContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_exprContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCycle_delay_range(Cycle_delay_rangeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cycle_delay_rangeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cycle_delay_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_method_call(Sequence_method_callContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_method_callContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_method_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_match_item(Sequence_match_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_match_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_match_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_instance(Sequence_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_list_of_arguments(Sequence_list_of_argumentsContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_list_of_argumentsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_list_of_argumentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_list_of_arguments_part1(Sequence_list_of_arguments_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_list_of_arguments_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_list_of_arguments_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_list_of_arguments_part2(Sequence_list_of_arguments_part2Context ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_list_of_arguments_part2ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_list_of_arguments_part2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_actual_arg(Sequence_actual_argContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_actual_argContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_actual_argContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBoolean_abbrev(Boolean_abbrevContext ctx){
		if ( extendedContext != null && extendedContext instanceof Boolean_abbrevContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Boolean_abbrevContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_abbrev(Sequence_abbrevContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_abbrevContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_abbrevContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConsecutive_repetition(Consecutive_repetitionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Consecutive_repetitionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Consecutive_repetitionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNon_consecutive_repetition(Non_consecutive_repetitionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Non_consecutive_repetitionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Non_consecutive_repetitionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGoto_repetition(Goto_repetitionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Goto_repetitionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Goto_repetitionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_or_range_expression(Const_or_range_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Const_or_range_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Const_or_range_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCycle_delay_const_range_expression(Cycle_delay_const_range_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cycle_delay_const_range_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cycle_delay_const_range_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_or_dist(Expression_or_distContext ctx){
		if ( extendedContext != null && extendedContext instanceof Expression_or_distContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Expression_or_distContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssertion_variable_declaration(Assertion_variable_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Assertion_variable_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assertion_variable_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLet_declaration(Let_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Let_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLet_identifier(Let_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Let_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLet_port_list(Let_port_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Let_port_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLet_port_item(Let_port_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Let_port_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_port_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLet_formal_type(Let_formal_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Let_formal_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_formal_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLet_expression(Let_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Let_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLet_list_of_arguments(Let_list_of_argumentsContext ctx){
		if ( extendedContext != null && extendedContext instanceof Let_list_of_argumentsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_list_of_argumentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLet_list_of_arguments_part1(Let_list_of_arguments_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Let_list_of_arguments_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_list_of_arguments_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLet_list_of_arguments_part2(Let_list_of_arguments_part2Context ctx){
		if ( extendedContext != null && extendedContext instanceof Let_list_of_arguments_part2ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_list_of_arguments_part2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLet_actual_arg(Let_actual_argContext ctx){
		if ( extendedContext != null && extendedContext instanceof Let_actual_argContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_actual_argContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCovergroup_declaration(Covergroup_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Covergroup_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Covergroup_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCoverage_spec_or_option(Coverage_spec_or_optionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Coverage_spec_or_optionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Coverage_spec_or_optionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCoverage_option(Coverage_optionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Coverage_optionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Coverage_optionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCoverage_spec(Coverage_specContext ctx){
		if ( extendedContext != null && extendedContext instanceof Coverage_specContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Coverage_specContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCoverage_event(Coverage_eventContext ctx){
		if ( extendedContext != null && extendedContext instanceof Coverage_eventContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Coverage_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBlock_event_expression(Block_event_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Block_event_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Block_event_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_btf_identifier(Hierarchical_btf_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hierarchical_btf_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_btf_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCover_point(Cover_pointContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cover_pointContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cover_pointContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBins_or_empty(Bins_or_emptyContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bins_or_emptyContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_or_emptyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBins_or_options(Bins_or_optionsContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bins_or_optionsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_or_optionsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBins_or_options_part1(Bins_or_options_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Bins_or_options_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_or_options_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBins_keyword(Bins_keywordContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bins_keywordContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_keywordContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRange_list(Range_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Range_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Range_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTrans_list(Trans_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Trans_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Trans_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTrans_set(Trans_setContext ctx){
		if ( extendedContext != null && extendedContext instanceof Trans_setContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Trans_setContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTrans_range_list(Trans_range_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Trans_range_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Trans_range_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTrans_item(Trans_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Trans_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Trans_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRepeat_range(Repeat_rangeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Repeat_rangeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Repeat_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCover_cross(Cover_crossContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cover_crossContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cover_crossContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_coverpoints(List_of_coverpointsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_coverpointsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_coverpointsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCross_item(Cross_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cross_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cross_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSelect_bins_or_empty(Select_bins_or_emptyContext ctx){
		if ( extendedContext != null && extendedContext instanceof Select_bins_or_emptyContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Select_bins_or_emptyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBins_selection_or_option(Bins_selection_or_optionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bins_selection_or_optionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_selection_or_optionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBins_selection(Bins_selectionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bins_selectionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_selectionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSelect_expression(Select_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Select_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Select_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSelect_expression_part1(Select_expression_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Select_expression_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Select_expression_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSelect_condition(Select_conditionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Select_conditionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Select_conditionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBins_expression(Bins_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bins_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOpen_range_list(Open_range_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Open_range_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Open_range_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOpen_value_range(Open_value_rangeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Open_value_rangeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Open_value_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGate_instantiation(Gate_instantiationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Gate_instantiationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Gate_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCmos_switch_instance(Cmos_switch_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cmos_switch_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cmos_switch_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEnable_gate_instance(Enable_gate_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Enable_gate_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enable_gate_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMos_switch_instance(Mos_switch_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Mos_switch_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Mos_switch_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitN_input_gate_instance(N_input_gate_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof N_input_gate_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((N_input_gate_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitN_output_gate_instance(N_output_gate_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof N_output_gate_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((N_output_gate_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPass_switch_instance(Pass_switch_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pass_switch_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pass_switch_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPass_enable_switch_instance(Pass_enable_switch_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pass_enable_switch_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pass_enable_switch_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPull_gate_instance(Pull_gate_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pull_gate_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pull_gate_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPulldown_strength(Pulldown_strengthContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pulldown_strengthContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pulldown_strengthContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPullup_strength(Pullup_strengthContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pullup_strengthContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pullup_strengthContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEnable_terminal(Enable_terminalContext ctx){
		if ( extendedContext != null && extendedContext instanceof Enable_terminalContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enable_terminalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInout_terminal(Inout_terminalContext ctx){
		if ( extendedContext != null && extendedContext instanceof Inout_terminalContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inout_terminalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInput_terminal(Input_terminalContext ctx){
		if ( extendedContext != null && extendedContext instanceof Input_terminalContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Input_terminalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNcontrol_terminal(Ncontrol_terminalContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ncontrol_terminalContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ncontrol_terminalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOutput_terminal(Output_terminalContext ctx){
		if ( extendedContext != null && extendedContext instanceof Output_terminalContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Output_terminalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPcontrol_terminal(Pcontrol_terminalContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pcontrol_terminalContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pcontrol_terminalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCmos_switchtype(Cmos_switchtypeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cmos_switchtypeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cmos_switchtypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEnable_gatetype(Enable_gatetypeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Enable_gatetypeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enable_gatetypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMos_switchtype(Mos_switchtypeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Mos_switchtypeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Mos_switchtypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitN_input_gatetype(N_input_gatetypeContext ctx){
		if ( extendedContext != null && extendedContext instanceof N_input_gatetypeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((N_input_gatetypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitN_output_gatetype(N_output_gatetypeContext ctx){
		if ( extendedContext != null && extendedContext instanceof N_output_gatetypeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((N_output_gatetypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPass_en_switchtype(Pass_en_switchtypeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pass_en_switchtypeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pass_en_switchtypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPass_switchtype(Pass_switchtypeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pass_switchtypeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pass_switchtypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_instantiation(Module_instantiationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_instantiationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitParameter_value_assignment(Parameter_value_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Parameter_value_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parameter_value_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_parameter_assignments(List_of_parameter_assignmentsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_parameter_assignmentsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_parameter_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOrdered_parameter_assignment(Ordered_parameter_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ordered_parameter_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ordered_parameter_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNamed_parameter_assignment(Named_parameter_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Named_parameter_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Named_parameter_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_instance(Hierarchical_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hierarchical_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitName_of_instance(Name_of_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Name_of_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Name_of_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_connections(List_of_port_connectionsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_port_connectionsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_port_connectionsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOrdered_port_connection(Ordered_port_connectionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ordered_port_connectionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ordered_port_connectionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNamed_port_connection(Named_port_connectionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Named_port_connectionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Named_port_connectionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInterface_instantiation(Interface_instantiationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Interface_instantiationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProgram_instantiation(Program_instantiationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Program_instantiationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitChecker_instantiation(Checker_instantiationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Checker_instantiationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_checker_port_connections(List_of_checker_port_connectionsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_checker_port_connectionsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_checker_port_connectionsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOrdered_checker_port_connection(Ordered_checker_port_connectionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ordered_checker_port_connectionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ordered_checker_port_connectionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNamed_checker_port_connection(Named_checker_port_connectionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Named_checker_port_connectionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Named_checker_port_connectionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGenerate_region(Generate_regionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Generate_regionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_regionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLoop_generate_construct(Loop_generate_constructContext ctx){
		if ( extendedContext != null && extendedContext instanceof Loop_generate_constructContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Loop_generate_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGenvar_initialization(Genvar_initializationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Genvar_initializationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Genvar_initializationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConditional_generate_construct(Conditional_generate_constructContext ctx){
		if ( extendedContext != null && extendedContext instanceof Conditional_generate_constructContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Conditional_generate_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIf_generate_construct(If_generate_constructContext ctx){
		if ( extendedContext != null && extendedContext instanceof If_generate_constructContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((If_generate_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCase_generate_construct(Case_generate_constructContext ctx){
		if ( extendedContext != null && extendedContext instanceof Case_generate_constructContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_generate_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCase_generate_item(Case_generate_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Case_generate_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGenerate_block(Generate_blockContext ctx){
		if ( extendedContext != null && extendedContext instanceof Generate_blockContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGenerate_block_part1(Generate_block_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Generate_block_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_block_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGenerate_block_part2(Generate_block_part2Context ctx){
		if ( extendedContext != null && extendedContext instanceof Generate_block_part2ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_block_part2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGenerate_block_part3(Generate_block_part3Context ctx){
		if ( extendedContext != null && extendedContext instanceof Generate_block_part3ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_block_part3ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGenerate_item(Generate_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Generate_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_nonansi_declaration(Udp_nonansi_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_nonansi_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_nonansi_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGenvar_iteration(Genvar_iterationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Genvar_iterationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Genvar_iterationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_ansi_declaration(Udp_ansi_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_ansi_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_ansi_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_declaration(Udp_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_port_list(Udp_port_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_port_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_declaration_port_list(Udp_declaration_port_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_declaration_port_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_declaration_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_port_declaration(Udp_port_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_port_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_output_declaration(Udp_output_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_output_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_output_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_input_declaration(Udp_input_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_input_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_input_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_reg_declaration(Udp_reg_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_reg_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_reg_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_body(Udp_bodyContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_bodyContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_bodyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCombinational_body(Combinational_bodyContext ctx){
		if ( extendedContext != null && extendedContext instanceof Combinational_bodyContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Combinational_bodyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCombinational_entry(Combinational_entryContext ctx){
		if ( extendedContext != null && extendedContext instanceof Combinational_entryContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Combinational_entryContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequential_body(Sequential_bodyContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequential_bodyContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequential_bodyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_initial_statement(Udp_initial_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_initial_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_initial_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInit_val(Init_valContext ctx){
		if ( extendedContext != null && extendedContext instanceof Init_valContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Init_valContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequential_entry(Sequential_entryContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequential_entryContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequential_entryContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSeq_input_list(Seq_input_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Seq_input_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Seq_input_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLevel_input_list(Level_input_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Level_input_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Level_input_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEdge_input_list(Edge_input_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Edge_input_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_input_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEdge_input_list_part1(Edge_input_list_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Edge_input_list_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_input_list_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEdge_indicator(Edge_indicatorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Edge_indicatorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_indicatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCurrent_state(Current_stateContext ctx){
		if ( extendedContext != null && extendedContext instanceof Current_stateContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Current_stateContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNext_state(Next_stateContext ctx){
		if ( extendedContext != null && extendedContext instanceof Next_stateContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Next_stateContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOutput_symbol(Output_symbolContext ctx){
		if ( extendedContext != null && extendedContext instanceof Output_symbolContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Output_symbolContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLevel_symbol(Level_symbolContext ctx){
		if ( extendedContext != null && extendedContext instanceof Level_symbolContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Level_symbolContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEdge_symbol(Edge_symbolContext ctx){
		if ( extendedContext != null && extendedContext instanceof Edge_symbolContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_symbolContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_instantiation(Udp_instantiationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_instantiationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_instance(Udp_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitContinuous_assign(Continuous_assignContext ctx){
		if ( extendedContext != null && extendedContext instanceof Continuous_assignContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Continuous_assignContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_net_assignments(List_of_net_assignmentsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_net_assignmentsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_net_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_variable_assignments(List_of_variable_assignmentsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_variable_assignmentsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_variable_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNet_alias(Net_aliasContext ctx){
		if ( extendedContext != null && extendedContext instanceof Net_aliasContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_aliasContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNet_assignment(Net_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Net_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInitial_construct(Initial_constructContext ctx){
		if ( extendedContext != null && extendedContext instanceof Initial_constructContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Initial_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAlways_construct(Always_constructContext ctx){
		if ( extendedContext != null && extendedContext instanceof Always_constructContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Always_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAlways_keyword(Always_keywordContext ctx){
		if ( extendedContext != null && extendedContext instanceof Always_keywordContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Always_keywordContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFinal_construct(Final_constructContext ctx){
		if ( extendedContext != null && extendedContext instanceof Final_constructContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Final_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBlocking_assignment(Blocking_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Blocking_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Blocking_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOperator_assignment(Operator_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Operator_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Operator_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssignment_operator(Assignment_operatorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Assignment_operatorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNonblocking_assignment(Nonblocking_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Nonblocking_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Nonblocking_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProcedural_continuous_assignment(Procedural_continuous_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Procedural_continuous_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Procedural_continuous_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAction_block(Action_blockContext ctx){
		if ( extendedContext != null && extendedContext instanceof Action_blockContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Action_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSeq_block(Seq_blockContext ctx){
		if ( extendedContext != null && extendedContext instanceof Seq_blockContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Seq_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSeq_block_part1(Seq_block_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Seq_block_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Seq_block_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPar_block(Par_blockContext ctx){
		if ( extendedContext != null && extendedContext instanceof Par_blockContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Par_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPar_block_part1(Par_block_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Par_block_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Par_block_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitJoin_keyword(Join_keywordContext ctx){
		if ( extendedContext != null && extendedContext instanceof Join_keywordContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Join_keywordContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStatement_or_null(Statement_or_nullContext ctx){
		if ( extendedContext != null && extendedContext instanceof Statement_or_nullContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Statement_or_nullContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStatement(StatementContext ctx){
		if ( extendedContext != null && extendedContext instanceof StatementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StatementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStatement_item(Statement_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Statement_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Statement_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFunction_statement(Function_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Function_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFunction_statement_or_null(Function_statement_or_nullContext ctx){
		if ( extendedContext != null && extendedContext instanceof Function_statement_or_nullContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_statement_or_nullContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVariable_identifier_list(Variable_identifier_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Variable_identifier_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_identifier_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProcedural_timing_control_statement(Procedural_timing_control_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Procedural_timing_control_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Procedural_timing_control_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDelay_or_event_control(Delay_or_event_controlContext ctx){
		if ( extendedContext != null && extendedContext instanceof Delay_or_event_controlContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delay_or_event_controlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDelay_control(Delay_controlContext ctx){
		if ( extendedContext != null && extendedContext instanceof Delay_controlContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delay_controlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEvent_control(Event_controlContext ctx){
		if ( extendedContext != null && extendedContext instanceof Event_controlContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Event_controlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEvent_expression(Event_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Event_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Event_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProcedural_timing_control(Procedural_timing_controlContext ctx){
		if ( extendedContext != null && extendedContext instanceof Procedural_timing_controlContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Procedural_timing_controlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitJump_statement(Jump_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Jump_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Jump_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWait_statement(Wait_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Wait_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Wait_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEvent_trigger(Event_triggerContext ctx){
		if ( extendedContext != null && extendedContext instanceof Event_triggerContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Event_triggerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDisable_statement(Disable_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Disable_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Disable_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConditional_statement(Conditional_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Conditional_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Conditional_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUnique_priority(Unique_priorityContext ctx){
		if ( extendedContext != null && extendedContext instanceof Unique_priorityContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unique_priorityContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCase_statement(Case_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Case_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCase_keyword(Case_keywordContext ctx){
		if ( extendedContext != null && extendedContext instanceof Case_keywordContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_keywordContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCase_expression(Case_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Case_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCase_item(Case_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Case_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCase_pattern_item(Case_pattern_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Case_pattern_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_pattern_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCase_inside_item(Case_inside_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Case_inside_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_inside_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCase_item_expression(Case_item_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Case_item_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_item_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRandcase_statement(Randcase_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Randcase_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Randcase_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRandcase_item(Randcase_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Randcase_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Randcase_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPattern(PatternContext ctx){
		if ( extendedContext != null && extendedContext instanceof PatternContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PatternContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssignment_pattern(Assignment_patternContext ctx){
		if ( extendedContext != null && extendedContext instanceof Assignment_patternContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_patternContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStructure_pattern_key(Structure_pattern_keyContext ctx){
		if ( extendedContext != null && extendedContext instanceof Structure_pattern_keyContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Structure_pattern_keyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitArray_pattern_key(Array_pattern_keyContext ctx){
		if ( extendedContext != null && extendedContext instanceof Array_pattern_keyContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Array_pattern_keyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssignment_pattern_key(Assignment_pattern_keyContext ctx){
		if ( extendedContext != null && extendedContext instanceof Assignment_pattern_keyContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_pattern_keyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVariable_assignment(Variable_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof Variable_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssignment_pattern_expression(Assignment_pattern_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Assignment_pattern_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_pattern_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssignment_pattern_expression_type(Assignment_pattern_expression_typeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Assignment_pattern_expression_typeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_pattern_expression_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_assignment_pattern_expression(Constant_assignment_pattern_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_assignment_pattern_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_assignment_pattern_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssignment_pattern_net_lvalue(Assignment_pattern_net_lvalueContext ctx){
		if ( extendedContext != null && extendedContext instanceof Assignment_pattern_net_lvalueContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_pattern_net_lvalueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssignment_pattern_variable_lvalue(Assignment_pattern_variable_lvalueContext ctx){
		if ( extendedContext != null && extendedContext instanceof Assignment_pattern_variable_lvalueContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_pattern_variable_lvalueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLoop_statement(Loop_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Loop_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Loop_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFor_initialization(For_initializationContext ctx){
		if ( extendedContext != null && extendedContext instanceof For_initializationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((For_initializationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFor_variable_declaration(For_variable_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof For_variable_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((For_variable_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFor_step(For_stepContext ctx){
		if ( extendedContext != null && extendedContext instanceof For_stepContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((For_stepContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFor_step_assignment(For_step_assignmentContext ctx){
		if ( extendedContext != null && extendedContext instanceof For_step_assignmentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((For_step_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLoop_variables(Loop_variablesContext ctx){
		if ( extendedContext != null && extendedContext instanceof Loop_variablesContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Loop_variablesContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLoop_variables_part1(Loop_variables_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Loop_variables_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Loop_variables_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSubroutine_call_statement(Subroutine_call_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Subroutine_call_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Subroutine_call_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssertion_item(Assertion_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Assertion_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assertion_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDeferred_immediate_assertion_item(Deferred_immediate_assertion_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Deferred_immediate_assertion_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Deferred_immediate_assertion_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProcedural_assertion_statement(Procedural_assertion_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Procedural_assertion_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Procedural_assertion_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitImmediate_assertion_statement(Immediate_assertion_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Immediate_assertion_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Immediate_assertion_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSimple_immediate_assertion_statement(Simple_immediate_assertion_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Simple_immediate_assertion_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_immediate_assertion_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSimple_immediate_assert_statement(Simple_immediate_assert_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Simple_immediate_assert_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_immediate_assert_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSimple_immediate_assume_statement(Simple_immediate_assume_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Simple_immediate_assume_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_immediate_assume_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSimple_immediate_cover_statement(Simple_immediate_cover_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Simple_immediate_cover_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_immediate_cover_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDeferred_immediate_assertion_statement(Deferred_immediate_assertion_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Deferred_immediate_assertion_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Deferred_immediate_assertion_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDeferred_immediate_assert_statement(Deferred_immediate_assert_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Deferred_immediate_assert_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Deferred_immediate_assert_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDeferred_immediate_assume_statement(Deferred_immediate_assume_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Deferred_immediate_assume_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Deferred_immediate_assume_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDeferred_immediate_cover_statement(Deferred_immediate_cover_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Deferred_immediate_cover_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Deferred_immediate_cover_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClocking_declaration(Clocking_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Clocking_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClocking_declaration_part1(Clocking_declaration_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Clocking_declaration_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_declaration_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClocking_event(Clocking_eventContext ctx){
		if ( extendedContext != null && extendedContext instanceof Clocking_eventContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClocking_item(Clocking_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Clocking_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDefault_skew(Default_skewContext ctx){
		if ( extendedContext != null && extendedContext instanceof Default_skewContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Default_skewContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClocking_direction(Clocking_directionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Clocking_directionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_directionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClocking_direction_part1(Clocking_direction_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Clocking_direction_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_direction_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_clocking_decl_assign(List_of_clocking_decl_assignContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_clocking_decl_assignContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_clocking_decl_assignContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClocking_decl_assign(Clocking_decl_assignContext ctx){
		if ( extendedContext != null && extendedContext instanceof Clocking_decl_assignContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_decl_assignContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClocking_skew(Clocking_skewContext ctx){
		if ( extendedContext != null && extendedContext instanceof Clocking_skewContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_skewContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClocking_drive(Clocking_driveContext ctx){
		if ( extendedContext != null && extendedContext instanceof Clocking_driveContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_driveContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCycle_delay(Cycle_delayContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cycle_delayContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cycle_delayContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClockvar(ClockvarContext ctx){
		if ( extendedContext != null && extendedContext instanceof ClockvarContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ClockvarContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClockvar_expression(Clockvar_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Clockvar_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clockvar_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOutputstr(OutputstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof OutputstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((OutputstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInputstr(InputstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof InputstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((InputstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInoutstr(InoutstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof InoutstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((InoutstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRefstr(RefstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RefstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RefstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssign(AssignContext ctx){
		if ( extendedContext != null && extendedContext instanceof AssignContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AssignContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarfatalstr(DollarfatalstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarfatalstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarfatalstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarerrorstr(DollarerrorstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarerrorstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarerrorstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarwarningstr(DollarwarningstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarwarningstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarwarningstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarinfostr(DollarinfostrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarinfostrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarinfostrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDefparamstr(DefparamstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DefparamstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DefparamstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBindstr(BindstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof BindstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((BindstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConfigstr(ConfigstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ConfigstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ConfigstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndconfigstr(EndconfigstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndconfigstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndconfigstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDesignstr(DesignstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DesignstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DesignstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDefaultstr(DefaultstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DefaultstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DefaultstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInstancestr(InstancestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof InstancestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((InstancestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCellstr(CellstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof CellstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((CellstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLibliststr(LibliststrContext ctx){
		if ( extendedContext != null && extendedContext instanceof LibliststrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LibliststrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUsestr(UsestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof UsestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((UsestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClockingstr(ClockingstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ClockingstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ClockingstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDisablestr(DisablestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DisablestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DisablestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIffstr(IffstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof IffstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((IffstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitForkjoinstr(ForkjoinstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ForkjoinstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ForkjoinstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAlwaysstr(AlwaysstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof AlwaysstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AlwaysstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConststr(ConststrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ConststrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ConststrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFunctionstr(FunctionstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof FunctionstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((FunctionstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNewstr(NewstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof NewstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NewstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStaticstr(StaticstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof StaticstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StaticstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProtectedstr(ProtectedstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ProtectedstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ProtectedstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLocalstr(LocalstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof LocalstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LocalstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRandstr(RandstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RandstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RandstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRandcstr(RandcstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RandcstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RandcstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPurestr(PurestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof PurestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PurestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSuperstr(SuperstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof SuperstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SuperstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndfunctionstr(EndfunctionstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndfunctionstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndfunctionstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstraintstr(ConstraintstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ConstraintstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ConstraintstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSolvestr(SolvestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof SolvestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SolvestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBeforestr(BeforestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof BeforestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((BeforestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDerive(DeriveContext ctx){
		if ( extendedContext != null && extendedContext instanceof DeriveContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DeriveContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIfstr(IfstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof IfstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((IfstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitElsestr(ElsestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ElsestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ElsestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitForeachstr(ForeachstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ForeachstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ForeachstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLbrack(LbrackContext ctx){
		if ( extendedContext != null && extendedContext instanceof LbrackContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LbrackContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRbrack(RbrackContext ctx){
		if ( extendedContext != null && extendedContext instanceof RbrackContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RbrackContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitColonequals(ColonequalsContext ctx){
		if ( extendedContext != null && extendedContext instanceof ColonequalsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ColonequalsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitColonslash(ColonslashContext ctx){
		if ( extendedContext != null && extendedContext instanceof ColonslashContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ColonslashContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLocalparamstr(LocalparamstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof LocalparamstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LocalparamstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitParameterstr(ParameterstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ParameterstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ParameterstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSpecparamstr(SpecparamstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof SpecparamstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SpecparamstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVarstr(VarstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof VarstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((VarstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitImportstr(ImportstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ImportstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ImportstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitColoncolon(ColoncolonContext ctx){
		if ( extendedContext != null && extendedContext instanceof ColoncolonContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ColoncolonContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStar(StarContext ctx){
		if ( extendedContext != null && extendedContext instanceof StarContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StarContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExport(ExportContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExportContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExportContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStartcoloncolonstar(StartcoloncolonstarContext ctx){
		if ( extendedContext != null && extendedContext instanceof StartcoloncolonstarContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StartcoloncolonstarContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGenvarstr(GenvarstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof GenvarstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((GenvarstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVectoredstr(VectoredstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof VectoredstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((VectoredstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitScalaredstr(ScalaredstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ScalaredstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ScalaredstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTypedefstr(TypedefstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof TypedefstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TypedefstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEnumstr(EnumstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EnumstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EnumstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStructstr(StructstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof StructstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StructstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUnionstr(UnionstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof UnionstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((UnionstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAutomaticstr(AutomaticstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof AutomaticstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AutomaticstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStringstr(StringstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof StringstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StringstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPackedstr(PackedstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof PackedstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PackedstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitChandlestr(ChandlestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ChandlestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ChandlestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEventstr(EventstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EventstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EventstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitZero_or_one(Zero_or_oneContext ctx){
		if ( extendedContext != null && extendedContext instanceof Zero_or_oneContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Zero_or_oneContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEdge_spec(Edge_specContext ctx){
		if ( extendedContext != null && extendedContext instanceof Edge_specContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_specContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDecimal_number(Decimal_numberContext ctx){
		if ( extendedContext != null && extendedContext instanceof Decimal_numberContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Decimal_numberContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBytestr(BytestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof BytestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((BytestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitShortintstr(ShortintstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ShortintstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ShortintstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIntstr(IntstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof IntstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((IntstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLongintstr(LongintstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof LongintstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LongintstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIntegerstr(IntegerstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof IntegerstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((IntegerstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTimestr(TimestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof TimestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TimestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBitstr(BitstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof BitstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((BitstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLogicstr(LogicstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof LogicstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LogicstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRegstr(RegstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RegstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RegstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitShortreal(ShortrealContext ctx){
		if ( extendedContext != null && extendedContext instanceof ShortrealContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ShortrealContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRealstr(RealstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RealstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RealstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRealtimestr(RealtimestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RealtimestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RealtimestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSupply0str(Supply0strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Supply0strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Supply0strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSupply1str(Supply1strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Supply1strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Supply1strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTristr(TristrContext ctx){
		if ( extendedContext != null && extendedContext instanceof TristrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TristrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTriandstr(TriandstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof TriandstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TriandstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTriorstr(TriorstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof TriorstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TriorstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTriregstr(TriregstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof TriregstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TriregstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTri0str(Tri0strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tri0strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tri0strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTri1str(Tri1strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tri1strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tri1strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUwirestr(UwirestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof UwirestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((UwirestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWirestr(WirestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof WirestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((WirestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWandstr(WandstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof WandstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((WandstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWorstr(WorstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof WorstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((WorstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSignedstr(SignedstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof SignedstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SignedstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUnsignedstr(UnsignedstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof UnsignedstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((UnsignedstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVoidstr(VoidstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof VoidstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((VoidstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTaggedstr(TaggedstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof TaggedstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TaggedstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHighz1str(Highz1strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Highz1strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Highz1strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHighz0str(Highz0strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Highz0strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Highz0strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStrong0(Strong0Context ctx){
		if ( extendedContext != null && extendedContext instanceof Strong0ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Strong0ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPull0str(Pull0strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pull0strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pull0strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWeak0str(Weak0strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Weak0strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Weak0strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStrong1(Strong1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Strong1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Strong1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPull1str(Pull1strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pull1strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pull1strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWeak1str(Weak1strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Weak1strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Weak1strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSmallstr(SmallstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof SmallstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SmallstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMediumstr(MediumstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof MediumstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((MediumstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLargestr(LargestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof LargestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LargestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitReal_number(Real_numberContext ctx){
		if ( extendedContext != null && extendedContext instanceof Real_numberContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Real_numberContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOnestepstr(OnestepstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof OnestepstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((OnestepstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPathpulsedollar(PathpulsedollarContext ctx){
		if ( extendedContext != null && extendedContext instanceof PathpulsedollarContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PathpulsedollarContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollar(DollarContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTaskstr(TaskstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof TaskstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TaskstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDpi_spec_ing2str(Dpi_spec_ing2strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Dpi_spec_ing2strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_spec_ing2strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDpi_spec_ing1str(Dpi_spec_ing1strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Dpi_spec_ing1strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_spec_ing1strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitContextstr(ContextstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ContextstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ContextstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndtaskstr(EndtaskstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndtaskstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndtaskstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPlus(PlusContext ctx){
		if ( extendedContext != null && extendedContext instanceof PlusContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PlusContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMinus(MinusContext ctx){
		if ( extendedContext != null && extendedContext instanceof MinusContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((MinusContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStarstar(StarstarContext ctx){
		if ( extendedContext != null && extendedContext instanceof StarstarContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StarstarContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModulo(ModuloContext ctx){
		if ( extendedContext != null && extendedContext instanceof ModuloContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ModuloContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEquals(EqualsContext ctx){
		if ( extendedContext != null && extendedContext instanceof EqualsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EqualsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNot_equals(Not_equalsContext ctx){
		if ( extendedContext != null && extendedContext instanceof Not_equalsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Not_equalsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLt(LtContext ctx){
		if ( extendedContext != null && extendedContext instanceof LtContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LtContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLe(LeContext ctx){
		if ( extendedContext != null && extendedContext instanceof LeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGt(GtContext ctx){
		if ( extendedContext != null && extendedContext instanceof GtContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((GtContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGe(GeContext ctx){
		if ( extendedContext != null && extendedContext instanceof GeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((GeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModportstr(ModportstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ModportstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ModportstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssertstr(AssertstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof AssertstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AssertstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPropertystr(PropertystrContext ctx){
		if ( extendedContext != null && extendedContext instanceof PropertystrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PropertystrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssumestr(AssumestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof AssumestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AssumestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCoverstr(CoverstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof CoverstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((CoverstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpectstr(ExpectstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpectstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpectstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequencestr(SequencestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof SequencestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SequencestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRestrictstr(RestrictstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RestrictstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RestrictstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndpropertystr(EndpropertystrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndpropertystrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndpropertystrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCasestr(CasestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof CasestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((CasestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndcasestr(EndcasestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndcasestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndcasestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNotstr(NotstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof NotstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NotstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOrstr(OrstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof OrstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((OrstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAndstr(AndstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof AndstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AndstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOrderive(OrderiveContext ctx){
		if ( extendedContext != null && extendedContext instanceof OrderiveContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((OrderiveContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOrimplies(OrimpliesContext ctx){
		if ( extendedContext != null && extendedContext instanceof OrimpliesContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((OrimpliesContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndsequencestr(EndsequencestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndsequencestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndsequencestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUntypedstr(UntypedstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof UntypedstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((UntypedstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIntersectstr(IntersectstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof IntersectstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((IntersectstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFirst_matchstr(First_matchstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof First_matchstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((First_matchstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitThroughoutstr(ThroughoutstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ThroughoutstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ThroughoutstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWithinstr(WithinstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof WithinstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((WithinstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDouble_hash(Double_hashContext ctx){
		if ( extendedContext != null && extendedContext instanceof Double_hashContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Double_hashContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDiststr(DiststrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DiststrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DiststrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLetstr(LetstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof LetstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LetstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCovergroupstr(CovergroupstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof CovergroupstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((CovergroupstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndgroupstr(EndgroupstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndgroupstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndgroupstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOptiondot(OptiondotContext ctx){
		if ( extendedContext != null && extendedContext instanceof OptiondotContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((OptiondotContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitType_optiondot(Type_optiondotContext ctx){
		if ( extendedContext != null && extendedContext instanceof Type_optiondotContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Type_optiondotContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWithstr(WithstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof WithstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((WithstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSamplestr(SamplestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof SamplestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SamplestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAttheratelparen(AttheratelparenContext ctx){
		if ( extendedContext != null && extendedContext instanceof AttheratelparenContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AttheratelparenContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBeginstr(BeginstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof BeginstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((BeginstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndstr(EndstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCoverpointstr(CoverpointstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof CoverpointstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((CoverpointstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWildcardstr(WildcardstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof WildcardstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((WildcardstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBinsstr(BinsstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof BinsstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((BinsstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIllegal_binsstr(Illegal_binsstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof Illegal_binsstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Illegal_binsstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIgnore_binsstr(Ignore_binsstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ignore_binsstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ignore_binsstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitImplies(ImpliesContext ctx){
		if ( extendedContext != null && extendedContext instanceof ImpliesContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ImpliesContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCrossstr(CrossstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof CrossstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((CrossstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNot(NotContext ctx){
		if ( extendedContext != null && extendedContext instanceof NotContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NotContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLog_and(Log_andContext ctx){
		if ( extendedContext != null && extendedContext instanceof Log_andContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Log_andContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLog_or(Log_orContext ctx){
		if ( extendedContext != null && extendedContext instanceof Log_orContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Log_orContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBinsofstr(BinsofstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof BinsofstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((BinsofstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPulldownstr(PulldownstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof PulldownstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PulldownstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPullupstr(PullupstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof PullupstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PullupstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCmosstr(CmosstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof CmosstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((CmosstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRcmosstr(RcmosstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RcmosstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RcmosstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBufif0str(Bufif0strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bufif0strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bufif0strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBufif1str(Bufif1strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bufif1strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bufif1strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNotif0str(Notif0strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Notif0strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Notif0strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNotif1str(Notif1strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Notif1strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Notif1strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNmosstr(NmosstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof NmosstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NmosstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPmos(PmosContext ctx){
		if ( extendedContext != null && extendedContext instanceof PmosContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PmosContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRnmosstr(RnmosstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RnmosstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RnmosstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRpmosstr(RpmosstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RpmosstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RpmosstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNandstr(NandstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof NandstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NandstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNorstr(NorstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof NorstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NorstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitXorstrstr(XorstrstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof XorstrstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((XorstrstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitXnorstr(XnorstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof XnorstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((XnorstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBufstr(BufstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof BufstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((BufstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTranif0str(Tranif0strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tranif0strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tranif0strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTranif1str(Tranif1strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tranif1strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tranif1strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRtranif1str(Rtranif1strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Rtranif1strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rtranif1strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRtranif0str(Rtranif0strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Rtranif0strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rtranif0strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTranstr(TranstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof TranstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TranstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRtranstr(RtranstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RtranstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RtranstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGeneratestr(GeneratestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof GeneratestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((GeneratestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndgeneratestr(EndgeneratestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndgeneratestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndgeneratestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitForstr(ForstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ForstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ForstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPrimitivestr(PrimitivestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof PrimitivestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PrimitivestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndprimitivestr(EndprimitivestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndprimitivestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndprimitivestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTablestr(TablestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof TablestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TablestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndtablestr(EndtablestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndtablestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndtablestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInitialstr(InitialstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof InitialstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((InitialstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBinary_number(Binary_numberContext ctx){
		if ( extendedContext != null && extendedContext instanceof Binary_numberContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Binary_numberContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitQuestinmark(QuestinmarkContext ctx){
		if ( extendedContext != null && extendedContext instanceof QuestinmarkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((QuestinmarkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitId(IdContext ctx){
		if ( extendedContext != null && extendedContext instanceof IdContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((IdContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAssignstrstr(AssignstrstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof AssignstrstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AssignstrstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAliasstr(AliasstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof AliasstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AliasstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAlways_combstr(Always_combstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof Always_combstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Always_combstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAlways_latchstr(Always_latchstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof Always_latchstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Always_latchstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAlways_ffstr(Always_ffstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof Always_ffstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Always_ffstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFinalstr(FinalstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof FinalstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((FinalstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPlusequals(PlusequalsContext ctx){
		if ( extendedContext != null && extendedContext instanceof PlusequalsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PlusequalsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMinusequals(MinusequalsContext ctx){
		if ( extendedContext != null && extendedContext instanceof MinusequalsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((MinusequalsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStartequals(StartequalsContext ctx){
		if ( extendedContext != null && extendedContext instanceof StartequalsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StartequalsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSlashequals(SlashequalsContext ctx){
		if ( extendedContext != null && extendedContext instanceof SlashequalsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SlashequalsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPercentileequal(PercentileequalContext ctx){
		if ( extendedContext != null && extendedContext instanceof PercentileequalContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PercentileequalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAndequals(AndequalsContext ctx){
		if ( extendedContext != null && extendedContext instanceof AndequalsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AndequalsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOrequal(OrequalContext ctx){
		if ( extendedContext != null && extendedContext instanceof OrequalContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((OrequalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitXorequal(XorequalContext ctx){
		if ( extendedContext != null && extendedContext instanceof XorequalContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((XorequalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLshift_assign(Lshift_assignContext ctx){
		if ( extendedContext != null && extendedContext instanceof Lshift_assignContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Lshift_assignContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRshift_assign(Rshift_assignContext ctx){
		if ( extendedContext != null && extendedContext instanceof Rshift_assignContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rshift_assignContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUnsigned_lshift_assign(Unsigned_lshift_assignContext ctx){
		if ( extendedContext != null && extendedContext instanceof Unsigned_lshift_assignContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unsigned_lshift_assignContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUnsigned_rshift_assign(Unsigned_rshift_assignContext ctx){
		if ( extendedContext != null && extendedContext instanceof Unsigned_rshift_assignContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unsigned_rshift_assignContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDeassignstr(DeassignstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DeassignstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DeassignstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitForcestr(ForcestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ForcestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ForcestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitReleasestr(ReleasestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ReleasestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ReleasestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitForkstr(ForkstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ForkstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ForkstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitJoinstr(JoinstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof JoinstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((JoinstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitJoin_anystr(Join_anystrContext ctx){
		if ( extendedContext != null && extendedContext instanceof Join_anystrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Join_anystrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitJoin_namestr(Join_namestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof Join_namestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Join_namestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRepeatstr(RepeatstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RepeatstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RepeatstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAttherate(AttherateContext ctx){
		if ( extendedContext != null && extendedContext instanceof AttherateContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AttherateContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAttheratestar(AttheratestarContext ctx){
		if ( extendedContext != null && extendedContext instanceof AttheratestarContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AttheratestarContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLparenstarrparen(LparenstarrparenContext ctx){
		if ( extendedContext != null && extendedContext instanceof LparenstarrparenContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LparenstarrparenContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitReturnstr(ReturnstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ReturnstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ReturnstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBreakstr(BreakstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof BreakstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((BreakstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitContinuestr(ContinuestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ContinuestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ContinuestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWaitstr(WaitstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof WaitstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((WaitstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWait_orderstr(Wait_orderstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof Wait_orderstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Wait_orderstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDerivegt(DerivegtContext ctx){
		if ( extendedContext != null && extendedContext instanceof DerivegtContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DerivegtContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUniquestr(UniquestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof UniquestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((UniquestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUnique0str(Unique0strContext ctx){
		if ( extendedContext != null && extendedContext instanceof Unique0strContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unique0strContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPrioritystr(PrioritystrContext ctx){
		if ( extendedContext != null && extendedContext instanceof PrioritystrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PrioritystrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMatchesstr(MatchesstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof MatchesstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((MatchesstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInsidestr(InsidestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof InsidestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((InsidestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCasezstr(CasezstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof CasezstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((CasezstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCasexstr(CasexstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof CasexstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((CasexstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAndandand(AndandandContext ctx){
		if ( extendedContext != null && extendedContext instanceof AndandandContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AndandandContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRandcasestr(RandcasestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RandcasestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RandcasestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEscapelcurl(EscapelcurlContext ctx){
		if ( extendedContext != null && extendedContext instanceof EscapelcurlContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EscapelcurlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitForeverstr(ForeverstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ForeverstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ForeverstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWhilestr(WhilestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof WhilestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((WhilestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDostr(DostrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DostrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DostrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEscapequote(EscapequoteContext ctx){
		if ( extendedContext != null && extendedContext instanceof EscapequoteContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EscapequoteContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHash_zero(Hash_zeroContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hash_zeroContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hash_zeroContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndclockingstr(EndclockingstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndclockingstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndclockingstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGlobalstr(GlobalstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof GlobalstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((GlobalstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRandsequencestr(RandsequencestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RandsequencestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RandsequencestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOr(OrContext ctx){
		if ( extendedContext != null && extendedContext instanceof OrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((OrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSpecifystr(SpecifystrContext ctx){
		if ( extendedContext != null && extendedContext instanceof SpecifystrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SpecifystrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndspecifystr(EndspecifystrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndspecifystrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndspecifystrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPulsestyle_oneventstr(Pulsestyle_oneventstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pulsestyle_oneventstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pulsestyle_oneventstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPulsestyle_ondetectstr(Pulsestyle_ondetectstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pulsestyle_ondetectstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pulsestyle_ondetectstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitShowcancelledstr(ShowcancelledstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ShowcancelledstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ShowcancelledstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNoshowcancelledstr(NoshowcancelledstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof NoshowcancelledstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NoshowcancelledstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStargt(StargtContext ctx){
		if ( extendedContext != null && extendedContext instanceof StargtContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StargtContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPosedgestr(PosedgestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof PosedgestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PosedgestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNegedgestr(NegedgestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof NegedgestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NegedgestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEdgestr(EdgestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EdgestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EdgestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIfnonestr(IfnonestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof IfnonestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((IfnonestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarsetupstr(DollarsetupstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarsetupstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarsetupstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarholdstr(DollarholdstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarholdstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarholdstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarsetupholdstr(DollarsetupholdstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarsetupholdstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarsetupholdstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarrecoverystr(DollarrecoverystrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarrecoverystrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarrecoverystrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarremovalstr(DollarremovalstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarremovalstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarremovalstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarrecremstr(DollarrecremstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarrecremstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarrecremstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarskewstr(DollarskewstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarskewstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarskewstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollartimeskewstr(DollartimeskewstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollartimeskewstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollartimeskewstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarfullskewstr(DollarfullskewstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarfullskewstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarfullskewstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarperiodstr(DollarperiodstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarperiodstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarperiodstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollaewidthstr(DollaewidthstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollaewidthstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollaewidthstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarnochangestr(DollarnochangestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarnochangestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarnochangestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitZ_or_x(Z_or_xContext ctx){
		if ( extendedContext != null && extendedContext instanceof Z_or_xContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Z_or_xContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCompliment(ComplimentContext ctx){
		if ( extendedContext != null && extendedContext instanceof ComplimentContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ComplimentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCase_equality(Case_equalityContext ctx){
		if ( extendedContext != null && extendedContext instanceof Case_equalityContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_equalityContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCase_inequality(Case_inequalityContext ctx){
		if ( extendedContext != null && extendedContext instanceof Case_inequalityContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_inequalityContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRshift(RshiftContext ctx){
		if ( extendedContext != null && extendedContext instanceof RshiftContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RshiftContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLshift(LshiftContext ctx){
		if ( extendedContext != null && extendedContext instanceof LshiftContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LshiftContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPluscolon(PluscolonContext ctx){
		if ( extendedContext != null && extendedContext instanceof PluscolonContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PluscolonContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMinuscolon(MinuscolonContext ctx){
		if ( extendedContext != null && extendedContext instanceof MinuscolonContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((MinuscolonContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStdcoloncolon(StdcoloncolonContext ctx){
		if ( extendedContext != null && extendedContext instanceof StdcoloncolonContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StdcoloncolonContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRandomizestr(RandomizestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof RandomizestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RandomizestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNullstr(NullstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof NullstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NullstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAlshift(AlshiftContext ctx){
		if ( extendedContext != null && extendedContext instanceof AlshiftContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AlshiftContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitArshift(ArshiftContext ctx){
		if ( extendedContext != null && extendedContext instanceof ArshiftContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ArshiftContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCase_q(Case_qContext ctx){
		if ( extendedContext != null && extendedContext instanceof Case_qContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_qContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNot_case_q(Not_case_qContext ctx){
		if ( extendedContext != null && extendedContext instanceof Not_case_qContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Not_case_qContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAnd(AndContext ctx){
		if ( extendedContext != null && extendedContext instanceof AndContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AndContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitXor(XorContext ctx){
		if ( extendedContext != null && extendedContext instanceof XorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((XorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitXnor(XnorContext ctx){
		if ( extendedContext != null && extendedContext instanceof XnorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((XnorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitXorn(XornContext ctx){
		if ( extendedContext != null && extendedContext instanceof XornContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((XornContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitThisstr(ThisstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ThisstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ThisstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLocalcoloncolon(LocalcoloncolonContext ctx){
		if ( extendedContext != null && extendedContext instanceof LocalcoloncolonContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LocalcoloncolonContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTime_unit(Time_unitContext ctx){
		if ( extendedContext != null && extendedContext instanceof Time_unitContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Time_unitContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNand(NandContext ctx){
		if ( extendedContext != null && extendedContext instanceof NandContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NandContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNor(NorContext ctx){
		if ( extendedContext != null && extendedContext instanceof NorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDderive(DderiveContext ctx){
		if ( extendedContext != null && extendedContext instanceof DderiveContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DderiveContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitScalar_constant0(Scalar_constant0Context ctx){
		if ( extendedContext != null && extendedContext instanceof Scalar_constant0ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Scalar_constant0ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitScalar_constant1(Scalar_constant1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Scalar_constant1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Scalar_constant1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitString(StringContext ctx){
		if ( extendedContext != null && extendedContext instanceof StringContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StringContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLparenstar(LparenstarContext ctx){
		if ( extendedContext != null && extendedContext instanceof LparenstarContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LparenstarContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStarrparen(StarrparenContext ctx){
		if ( extendedContext != null && extendedContext instanceof StarrparenContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StarrparenContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEsc_identifier(Esc_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Esc_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Esc_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarrootstr(DollarrootstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarrootstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarrootstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDollarunitstr(DollarunitstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof DollarunitstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DollarunitstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTf_id(Tf_idContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tf_idContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_idContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOctal_number(Octal_numberContext ctx){
		if ( extendedContext != null && extendedContext instanceof Octal_numberContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Octal_numberContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHex_number(Hex_numberContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hex_numberContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hex_numberContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPragma_def(Pragma_defContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pragma_defContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pragma_defContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPragma_text(Pragma_textContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pragma_textContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pragma_textContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRandsequence_statement(Randsequence_statementContext ctx){
		if ( extendedContext != null && extendedContext instanceof Randsequence_statementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Randsequence_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProduction(ProductionContext ctx){
		if ( extendedContext != null && extendedContext instanceof ProductionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ProductionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRs_rule(Rs_ruleContext ctx){
		if ( extendedContext != null && extendedContext instanceof Rs_ruleContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRs_production_list(Rs_production_listContext ctx){
		if ( extendedContext != null && extendedContext instanceof Rs_production_listContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_production_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRs_code_block(Rs_code_blockContext ctx){
		if ( extendedContext != null && extendedContext instanceof Rs_code_blockContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_code_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWeight_specification(Weight_specificationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Weight_specificationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Weight_specificationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRs_prod(Rs_prodContext ctx){
		if ( extendedContext != null && extendedContext instanceof Rs_prodContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_prodContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProduction_item(Production_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Production_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Production_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRs_if_else(Rs_if_elseContext ctx){
		if ( extendedContext != null && extendedContext instanceof Rs_if_elseContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_if_elseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRs_repeat(Rs_repeatContext ctx){
		if ( extendedContext != null && extendedContext instanceof Rs_repeatContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_repeatContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRs_case(Rs_caseContext ctx){
		if ( extendedContext != null && extendedContext instanceof Rs_caseContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_caseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRs_case_item(Rs_case_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Rs_case_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_case_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSpecify_block(Specify_blockContext ctx){
		if ( extendedContext != null && extendedContext instanceof Specify_blockContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specify_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSpecify_item(Specify_itemContext ctx){
		if ( extendedContext != null && extendedContext instanceof Specify_itemContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specify_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPulsestyle_declaration(Pulsestyle_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Pulsestyle_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pulsestyle_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitShowcancelled_declaration(Showcancelled_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Showcancelled_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Showcancelled_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPath_declaration(Path_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Path_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Path_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSimple_path_declaration(Simple_path_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Simple_path_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_path_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitParallel_path_description(Parallel_path_descriptionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Parallel_path_descriptionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parallel_path_descriptionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFull_path_description(Full_path_descriptionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Full_path_descriptionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Full_path_descriptionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_path_inputs(List_of_path_inputsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_path_inputsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_path_inputsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_path_outputs(List_of_path_outputsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_path_outputsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_path_outputsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSpecify_input_terminal_descriptor(Specify_input_terminal_descriptorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Specify_input_terminal_descriptorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specify_input_terminal_descriptorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSpecify_output_terminal_descriptor(Specify_output_terminal_descriptorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Specify_output_terminal_descriptorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specify_output_terminal_descriptorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInput_identifier(Input_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Input_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Input_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOutput_identifier(Output_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Output_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Output_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPath_delay_value(Path_delay_valueContext ctx){
		if ( extendedContext != null && extendedContext instanceof Path_delay_valueContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Path_delay_valueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_path_delay_expressions(List_of_path_delay_expressionsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_path_delay_expressionsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_path_delay_expressionsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitT_path_delay_expression(T_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof T_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTrise_path_delay_expression(Trise_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Trise_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Trise_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTfall_path_delay_expression(Tfall_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tfall_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tfall_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTz_path_delay_expression(Tz_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tz_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tz_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitT01_path_delay_expression(T01_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof T01_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T01_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitT10_path_delay_expression(T10_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof T10_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T10_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitT0z_path_delay_expression(T0z_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof T0z_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T0z_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTz1_path_delay_expression(Tz1_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tz1_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tz1_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitT1z_path_delay_expression(T1z_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof T1z_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T1z_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTz0_path_delay_expression(Tz0_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tz0_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tz0_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitT0x_path_delay_expression(T0x_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof T0x_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T0x_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTx1_path_delay_expression(Tx1_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tx1_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tx1_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitT1x_path_delay_expression(T1x_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof T1x_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T1x_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTx0_path_delay_expression(Tx0_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tx0_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tx0_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTxz_path_delay_expression(Txz_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Txz_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Txz_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTzx_path_delay_expression(Tzx_path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tzx_path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tzx_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPath_delay_expression(Path_delay_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Path_delay_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEdge_sensitive_path_declaration(Edge_sensitive_path_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Edge_sensitive_path_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_sensitive_path_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitParallel_edge_sensitive_path_description(Parallel_edge_sensitive_path_descriptionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Parallel_edge_sensitive_path_descriptionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parallel_edge_sensitive_path_descriptionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFull_edge_sensitive_path_description(Full_edge_sensitive_path_descriptionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Full_edge_sensitive_path_descriptionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Full_edge_sensitive_path_descriptionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitData_source_expression(Data_source_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Data_source_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Data_source_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEdge_identifier(Edge_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Edge_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitState_dependent_path_declaration(State_dependent_path_declarationContext ctx){
		if ( extendedContext != null && extendedContext instanceof State_dependent_path_declarationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((State_dependent_path_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPolarity_operator(Polarity_operatorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Polarity_operatorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Polarity_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSystem_timing_check(System_timing_checkContext ctx){
		if ( extendedContext != null && extendedContext instanceof System_timing_checkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((System_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSetup_timing_check(Setup_timing_checkContext ctx){
		if ( extendedContext != null && extendedContext instanceof Setup_timing_checkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Setup_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHold_timing_check(Hold_timing_checkContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hold_timing_checkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hold_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSetuphold_timing_check(Setuphold_timing_checkContext ctx){
		if ( extendedContext != null && extendedContext instanceof Setuphold_timing_checkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Setuphold_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRecovery_timing_check(Recovery_timing_checkContext ctx){
		if ( extendedContext != null && extendedContext instanceof Recovery_timing_checkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Recovery_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRemoval_timing_check(Removal_timing_checkContext ctx){
		if ( extendedContext != null && extendedContext instanceof Removal_timing_checkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Removal_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRecrem_timing_check(Recrem_timing_checkContext ctx){
		if ( extendedContext != null && extendedContext instanceof Recrem_timing_checkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Recrem_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSkew_timing_check(Skew_timing_checkContext ctx){
		if ( extendedContext != null && extendedContext instanceof Skew_timing_checkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Skew_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTimeskew_timing_check(Timeskew_timing_checkContext ctx){
		if ( extendedContext != null && extendedContext instanceof Timeskew_timing_checkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timeskew_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFullskew_timing_check(Fullskew_timing_checkContext ctx){
		if ( extendedContext != null && extendedContext instanceof Fullskew_timing_checkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Fullskew_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPeriod_timing_check(Period_timing_checkContext ctx){
		if ( extendedContext != null && extendedContext instanceof Period_timing_checkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Period_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitWidth_timing_check(Width_timing_checkContext ctx){
		if ( extendedContext != null && extendedContext instanceof Width_timing_checkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Width_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNochange_timing_check(Nochange_timing_checkContext ctx){
		if ( extendedContext != null && extendedContext instanceof Nochange_timing_checkContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Nochange_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTimecheck_condition(Timecheck_conditionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Timecheck_conditionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timecheck_conditionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitControlled_reference_event(Controlled_reference_eventContext ctx){
		if ( extendedContext != null && extendedContext instanceof Controlled_reference_eventContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Controlled_reference_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitData_event(Data_eventContext ctx){
		if ( extendedContext != null && extendedContext instanceof Data_eventContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Data_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDelayed_data(Delayed_dataContext ctx){
		if ( extendedContext != null && extendedContext instanceof Delayed_dataContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delayed_dataContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDelayed_reference(Delayed_referenceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Delayed_referenceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delayed_referenceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEnd_edge_offset(End_edge_offsetContext ctx){
		if ( extendedContext != null && extendedContext instanceof End_edge_offsetContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((End_edge_offsetContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEvent_based_flag(Event_based_flagContext ctx){
		if ( extendedContext != null && extendedContext instanceof Event_based_flagContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Event_based_flagContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNotifier(NotifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof NotifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NotifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitReference_event(Reference_eventContext ctx){
		if ( extendedContext != null && extendedContext instanceof Reference_eventContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Reference_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRemain_active_flag(Remain_active_flagContext ctx){
		if ( extendedContext != null && extendedContext instanceof Remain_active_flagContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Remain_active_flagContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTimestamp_condition(Timestamp_conditionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Timestamp_conditionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timestamp_conditionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStart_edge_offset(Start_edge_offsetContext ctx){
		if ( extendedContext != null && extendedContext instanceof Start_edge_offsetContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Start_edge_offsetContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitThreshold(ThresholdContext ctx){
		if ( extendedContext != null && extendedContext instanceof ThresholdContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ThresholdContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTiming_check_limit(Timing_check_limitContext ctx){
		if ( extendedContext != null && extendedContext instanceof Timing_check_limitContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timing_check_limitContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTiming_check_event(Timing_check_eventContext ctx){
		if ( extendedContext != null && extendedContext instanceof Timing_check_eventContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timing_check_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitControlled_timing_check_event(Controlled_timing_check_eventContext ctx){
		if ( extendedContext != null && extendedContext instanceof Controlled_timing_check_eventContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Controlled_timing_check_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTiming_check_event_control(Timing_check_event_controlContext ctx){
		if ( extendedContext != null && extendedContext instanceof Timing_check_event_controlContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timing_check_event_controlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSpecify_terminal_descriptor(Specify_terminal_descriptorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Specify_terminal_descriptorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specify_terminal_descriptorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEdge_control_specifier(Edge_control_specifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Edge_control_specifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_control_specifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEdge_descriptor(Edge_descriptorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Edge_descriptorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_descriptorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTiming_check_condition(Timing_check_conditionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Timing_check_conditionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timing_check_conditionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitScalar_timing_check_condition(Scalar_timing_check_conditionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Scalar_timing_check_conditionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Scalar_timing_check_conditionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitScalar_constant(Scalar_constantContext ctx){
		if ( extendedContext != null && extendedContext instanceof Scalar_constantContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Scalar_constantContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConcatenation(ConcatenationContext ctx){
		if ( extendedContext != null && extendedContext instanceof ConcatenationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ConcatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_concatenation(Constant_concatenationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_concatenationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_multiple_concatenation(Constant_multiple_concatenationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_multiple_concatenationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_multiple_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_path_concatenation(Module_path_concatenationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_path_concatenationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_path_multiple_concatenation(Module_path_multiple_concatenationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_path_multiple_concatenationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_multiple_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMultiple_concatenation(Multiple_concatenationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Multiple_concatenationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Multiple_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStreaming_concatenation(Streaming_concatenationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Streaming_concatenationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Streaming_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStream_operator(Stream_operatorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Stream_operatorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Stream_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSlice_size(Slice_sizeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Slice_sizeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Slice_sizeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStream_concatenation(Stream_concatenationContext ctx){
		if ( extendedContext != null && extendedContext instanceof Stream_concatenationContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Stream_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitStream_expression(Stream_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Stream_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Stream_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitArray_range_expression(Array_range_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Array_range_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Array_range_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEmpty_queue(Empty_queueContext ctx){
		if ( extendedContext != null && extendedContext instanceof Empty_queueContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Empty_queueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_function_call(Constant_function_callContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_function_callContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_function_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTf_call(Tf_callContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tf_callContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSystem_tf_call(System_tf_callContext ctx){
		if ( extendedContext != null && extendedContext instanceof System_tf_callContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((System_tf_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSubroutine_call(Subroutine_callContext ctx){
		if ( extendedContext != null && extendedContext instanceof Subroutine_callContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Subroutine_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFunction_subroutine_call(Function_subroutine_callContext ctx){
		if ( extendedContext != null && extendedContext instanceof Function_subroutine_callContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_subroutine_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_arguments(List_of_argumentsContext ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_argumentsContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_argumentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_arguments_part1(List_of_arguments_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_arguments_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_arguments_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitList_of_arguments_part2(List_of_arguments_part2Context ctx){
		if ( extendedContext != null && extendedContext instanceof List_of_arguments_part2ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_arguments_part2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMethod_call(Method_callContext ctx){
		if ( extendedContext != null && extendedContext instanceof Method_callContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Method_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMethod_call_body(Method_call_bodyContext ctx){
		if ( extendedContext != null && extendedContext instanceof Method_call_bodyContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Method_call_bodyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBuilt_in_method_call(Built_in_method_callContext ctx){
		if ( extendedContext != null && extendedContext instanceof Built_in_method_callContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Built_in_method_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitArray_manipulation_call(Array_manipulation_callContext ctx){
		if ( extendedContext != null && extendedContext instanceof Array_manipulation_callContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Array_manipulation_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRandomize_call(Randomize_callContext ctx){
		if ( extendedContext != null && extendedContext instanceof Randomize_callContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Randomize_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMethod_call_root(Method_call_rootContext ctx){
		if ( extendedContext != null && extendedContext instanceof Method_call_rootContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Method_call_rootContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitArray_method_name(Array_method_nameContext ctx){
		if ( extendedContext != null && extendedContext instanceof Array_method_nameContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Array_method_nameContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInc_or_dec_expression(Inc_or_dec_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Inc_or_dec_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inc_or_dec_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInc_or_dec_expression_part1(Inc_or_dec_expression_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Inc_or_dec_expression_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inc_or_dec_expression_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInc_or_dec_expression_part2(Inc_or_dec_expression_part2Context ctx){
		if ( extendedContext != null && extendedContext instanceof Inc_or_dec_expression_part2ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inc_or_dec_expression_part2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_binary_and(Const_expr_binary_andContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_mutl(Const_expr_mutlContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_add(Const_expr_addContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_equality(Const_expr_equalityContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_comp(Const_expr_compContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_log_or(Const_expr_log_orContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_binary_or(Const_expr_binary_orContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_only_primary(Const_expr_only_primaryContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_binary_xor(Const_expr_binary_xorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_log_and(Const_expr_log_andContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_shift(Const_expr_shiftContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_st_st(Const_expr_st_stContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_conditional(Const_expr_conditionalContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_unary_op(Const_expr_unary_opContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_mintypmax_expression(Constant_mintypmax_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_mintypmax_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_mintypmax_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_param_expression(Constant_param_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_param_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_param_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitParam_expression(Param_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Param_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Param_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_range_expression(Constant_range_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_range_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_range_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_part_select_range(Constant_part_select_rangeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_part_select_rangeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_part_select_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_range(Constant_rangeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_rangeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_indexed_range(Constant_indexed_rangeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_indexed_rangeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_indexed_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpr_(Expr_Context ctx){
		if ( extendedContext != null && extendedContext instanceof Expr_ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Expr_ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_binary_or(Expression_binary_orContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_binary_xor(Expression_binary_xorContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_add(Expression_addContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_log_or(Expression_log_orContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_only_primary(Expression_only_primaryContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_log_and(Expression_log_andContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_inc_or_dec(Expression_inc_or_decContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_tagged_union(Expression_tagged_unionContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_conditional_exp(Expression_conditional_expContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_comp(Expression_compContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_inside_exp(Expression_inside_expContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_mult(Expression_multContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_binary_and(Expression_binary_andContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_equality(Expression_equalityContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_shift(Expression_shiftContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_op_assign(Expression_op_assignContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_st_st(Expression_st_stContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExpression_unary_op(Expression_unary_opContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMatches_pattern(Matches_patternContext ctx){
		if ( extendedContext != null && extendedContext instanceof Matches_patternContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Matches_patternContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTagged_union_expression(Tagged_union_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tagged_union_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tagged_union_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitValue_range(Value_rangeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Value_rangeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Value_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMintypmax_expression(Mintypmax_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Mintypmax_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Mintypmax_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_path_expression(Module_path_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_path_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_path_conditional_expression(Module_path_conditional_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_path_conditional_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_conditional_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_path_binary_expression(Module_path_binary_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_path_binary_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_binary_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_path_unary_expression(Module_path_unary_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_path_unary_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_unary_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_path_mintypmax_expression(Module_path_mintypmax_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_path_mintypmax_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_mintypmax_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPart_select_range(Part_select_rangeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Part_select_rangeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Part_select_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIndexed_range(Indexed_rangeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Indexed_rangeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Indexed_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGenvar_expression(Genvar_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Genvar_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Genvar_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_primary(Constant_primaryContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_primaryContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_primaryContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_path_primary(Module_path_primaryContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_path_primaryContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_primaryContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPrimary_no_function_call(Primary_no_function_callContext ctx){
		if ( extendedContext != null && extendedContext instanceof Primary_no_function_callContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Primary_no_function_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPrimary(PrimaryContext ctx){
		if ( extendedContext != null && extendedContext instanceof PrimaryContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PrimaryContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_qualifier(Class_qualifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_qualifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_qualifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRange_expression(Range_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Range_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Range_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPrimary_literal(Primary_literalContext ctx){
		if ( extendedContext != null && extendedContext instanceof Primary_literalContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Primary_literalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTime_literal(Time_literalContext ctx){
		if ( extendedContext != null && extendedContext instanceof Time_literalContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Time_literalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitImplicit_class_handle(Implicit_class_handleContext ctx){
		if ( extendedContext != null && extendedContext instanceof Implicit_class_handleContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Implicit_class_handleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBit_select(Bit_selectContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bit_selectContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bit_selectContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSelect(SelectContext ctx){
		if ( extendedContext != null && extendedContext instanceof SelectContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SelectContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNonrange_select(Nonrange_selectContext ctx){
		if ( extendedContext != null && extendedContext instanceof Nonrange_selectContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Nonrange_selectContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_bit_select(Constant_bit_selectContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_bit_selectContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_bit_selectContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_select(Constant_selectContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_selectContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_selectContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_cast(Constant_castContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_castContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_castContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstant_let_expression(Constant_let_expressionContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constant_let_expressionContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_let_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCast(CastContext ctx){
		if ( extendedContext != null && extendedContext instanceof CastContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((CastContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNet_lvalue(Net_lvalueContext ctx){
		if ( extendedContext != null && extendedContext instanceof Net_lvalueContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_lvalueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVariable_lvalue(Variable_lvalueContext ctx){
		if ( extendedContext != null && extendedContext instanceof Variable_lvalueContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_lvalueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNonrange_variable_lvalue(Nonrange_variable_lvalueContext ctx){
		if ( extendedContext != null && extendedContext instanceof Nonrange_variable_lvalueContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Nonrange_variable_lvalueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUnary_operator(Unary_operatorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Unary_operatorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unary_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBinary_operator(Binary_operatorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Binary_operatorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Binary_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInc_or_dec_operator(Inc_or_dec_operatorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Inc_or_dec_operatorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inc_or_dec_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIncrement(IncrementContext ctx){
		if ( extendedContext != null && extendedContext instanceof IncrementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((IncrementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDecrement(DecrementContext ctx){
		if ( extendedContext != null && extendedContext instanceof DecrementContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DecrementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUnary_module_path_operator(Unary_module_path_operatorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Unary_module_path_operatorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unary_module_path_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBinary_module_path_operator(Binary_module_path_operatorContext ctx){
		if ( extendedContext != null && extendedContext instanceof Binary_module_path_operatorContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Binary_module_path_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUnbased_unsized_literal(Unbased_unsized_literalContext ctx){
		if ( extendedContext != null && extendedContext instanceof Unbased_unsized_literalContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unbased_unsized_literalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitString_literal(String_literalContext ctx){
		if ( extendedContext != null && extendedContext instanceof String_literalContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((String_literalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAttribute_instance(Attribute_instanceContext ctx){
		if ( extendedContext != null && extendedContext instanceof Attribute_instanceContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Attribute_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAttr_spec(Attr_specContext ctx){
		if ( extendedContext != null && extendedContext instanceof Attr_specContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Attr_specContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitAttr_name(Attr_nameContext ctx){
		if ( extendedContext != null && extendedContext instanceof Attr_nameContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Attr_nameContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitArray_identifier(Array_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Array_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Array_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBlock_identifier(Block_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Block_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Block_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBin_identifier(Bin_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bin_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bin_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitC_identifier(C_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof C_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((C_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCell_identifier(Cell_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cell_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cell_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitChecker_identifier(Checker_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Checker_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_identifier(Class_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClass_variable_identifier(Class_variable_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Class_variable_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_variable_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClocking_identifier(Clocking_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Clocking_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConfig_identifier(Config_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Config_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Config_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConst_identifier(Const_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Const_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Const_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitConstraint_identifier(Constraint_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Constraint_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCovergroup_identifier(Covergroup_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Covergroup_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Covergroup_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCovergroup_variable_identifier(Covergroup_variable_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Covergroup_variable_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Covergroup_variable_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCover_point_identifier(Cover_point_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cover_point_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cover_point_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCross_identifier(Cross_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Cross_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cross_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDynamic_array_variable_identifier(Dynamic_array_variable_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Dynamic_array_variable_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dynamic_array_variable_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEnum_identifier(Enum_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Enum_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enum_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEscaped_identifier(Escaped_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Escaped_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Escaped_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFormal_identifier(Formal_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Formal_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Formal_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitFunction_identifier(Function_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Function_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGenerate_block_identifier(Generate_block_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Generate_block_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_block_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitGenvar_identifier(Genvar_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Genvar_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Genvar_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_array_identifier(Hierarchical_array_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hierarchical_array_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_array_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_block_identifier(Hierarchical_block_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hierarchical_block_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_block_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_event_identifier(Hierarchical_event_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hierarchical_event_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_event_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_identifier(Hierarchical_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hierarchical_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_net_identifier(Hierarchical_net_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hierarchical_net_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_net_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_parameter_identifier(Hierarchical_parameter_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hierarchical_parameter_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_parameter_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_property_identifier(Hierarchical_property_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hierarchical_property_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_property_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_sequence_identifier(Hierarchical_sequence_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hierarchical_sequence_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_sequence_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_task_identifier(Hierarchical_task_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hierarchical_task_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_task_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_tf_identifier(Hierarchical_tf_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hierarchical_tf_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_tf_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_variable_identifier(Hierarchical_variable_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Hierarchical_variable_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_variable_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIdentifier(IdentifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof IdentifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((IdentifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitIndex_variable_identifier(Index_variable_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Index_variable_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Index_variable_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInterface_identifier(Interface_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Interface_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInterface_instance_identifier(Interface_instance_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Interface_instance_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_instance_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInout_port_identifier(Inout_port_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Inout_port_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inout_port_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInput_port_identifier(Input_port_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Input_port_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Input_port_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInstance_identifier(Instance_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Instance_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Instance_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLibrary_identifier(Library_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Library_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Library_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMember_identifier(Member_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Member_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Member_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMethod_identifier(Method_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Method_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Method_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModport_identifier(Modport_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Modport_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModule_identifier(Module_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Module_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNet_identifier(Net_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Net_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitOutput_port_identifier(Output_port_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Output_port_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Output_port_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPackage_identifier(Package_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Package_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPackage_scope(Package_scopeContext ctx){
		if ( extendedContext != null && extendedContext instanceof Package_scopeContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_scopeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitParameter_identifier(Parameter_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Parameter_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parameter_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPort_identifier(Port_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Port_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Port_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProduction_identifier(Production_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Production_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Production_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProgram_identifier(Program_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Program_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProperty_identifier(Property_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Property_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPs_class_identifier(Ps_class_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ps_class_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_class_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPs_covergroup_identifier(Ps_covergroup_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ps_covergroup_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_covergroup_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPs_identifier(Ps_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ps_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPs_or_hierarchical_array_identifier(Ps_or_hierarchical_array_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ps_or_hierarchical_array_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_or_hierarchical_array_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPs_or_hierarchical_array_identifier_part1(Ps_or_hierarchical_array_identifier_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Ps_or_hierarchical_array_identifier_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_or_hierarchical_array_identifier_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPs_or_hierarchical_net_identifier(Ps_or_hierarchical_net_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ps_or_hierarchical_net_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_or_hierarchical_net_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPs_or_hierarchical_property_identifier(Ps_or_hierarchical_property_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ps_or_hierarchical_property_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_or_hierarchical_property_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPs_or_hierarchical_sequence_identifier(Ps_or_hierarchical_sequence_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ps_or_hierarchical_sequence_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_or_hierarchical_sequence_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPs_or_hierarchical_tf_identifier(Ps_or_hierarchical_tf_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ps_or_hierarchical_tf_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_or_hierarchical_tf_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPs_parameter_identifier(Ps_parameter_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ps_parameter_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_parameter_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPs_parameter_identifier_part1(Ps_parameter_identifier_part1Context ctx){
		if ( extendedContext != null && extendedContext instanceof Ps_parameter_identifier_part1ContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_parameter_identifier_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPs_type_identifier(Ps_type_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Ps_type_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_type_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSequence_identifier(Sequence_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Sequence_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSignal_identifier(Signal_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Signal_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Signal_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSimple_identifier(Simple_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Simple_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSpecparam_identifier(Specparam_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Specparam_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specparam_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSystem_tf_identifier(System_tf_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof System_tf_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((System_tf_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTask_identifier(Task_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Task_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Task_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTf_identifier(Tf_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Tf_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTerminal_identifier(Terminal_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Terminal_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Terminal_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTopmodule_identifier(Topmodule_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Topmodule_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Topmodule_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitType_identifier(Type_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Type_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Type_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitUdp_identifier(Udp_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Udp_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitBins_identifier(Bins_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Bins_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVariable_identifier(Variable_identifierContext ctx){
		if ( extendedContext != null && extendedContext instanceof Variable_identifierContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitNumber(NumberContext ctx){
		if ( extendedContext != null && extendedContext instanceof NumberContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NumberContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEof(EofContext ctx){
		if ( extendedContext != null && extendedContext instanceof EofContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EofContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndmodulestr(EndmodulestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndmodulestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndmodulestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitColon(ColonContext ctx){
		if ( extendedContext != null && extendedContext instanceof ColonContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ColonContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExternstr(ExternstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExternstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExternstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitSemi(SemiContext ctx){
		if ( extendedContext != null && extendedContext instanceof SemiContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SemiContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitModulestr(ModulestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ModulestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ModulestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitMacromodulestr(MacromodulestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof MacromodulestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((MacromodulestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndinterfacestr(EndinterfacestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndinterfacestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndinterfacestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitInterfacestr(InterfacestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof InterfacestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((InterfacestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLparen(LparenContext ctx){
		if ( extendedContext != null && extendedContext instanceof LparenContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LparenContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDotstar(DotstarContext ctx){
		if ( extendedContext != null && extendedContext instanceof DotstarContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DotstarContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRparen(RparenContext ctx){
		if ( extendedContext != null && extendedContext instanceof RparenContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RparenContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndprogramstr(EndprogramstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndprogramstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndprogramstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitProgramstr(ProgramstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ProgramstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ProgramstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitCheckerstr(CheckerstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof CheckerstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((CheckerstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndcheckerstr(EndcheckerstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndcheckerstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndcheckerstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitVirtualstr(VirtualstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof VirtualstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((VirtualstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitClassstr(ClassstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ClassstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ClassstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitExtendsstr(ExtendsstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof ExtendsstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExtendsstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndclassstr(EndclassstrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndclassstrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndclassstrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitPackagestr(PackagestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof PackagestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PackagestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitEndpackagestr(EndpackagestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof EndpackagestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((EndpackagestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTimeunit(TimeunitContext ctx){
		if ( extendedContext != null && extendedContext instanceof TimeunitContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TimeunitContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDiv(DivContext ctx){
		if ( extendedContext != null && extendedContext instanceof DivContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DivContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitHash(HashContext ctx){
		if ( extendedContext != null && extendedContext instanceof HashContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((HashContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitComma(CommaContext ctx){
		if ( extendedContext != null && extendedContext instanceof CommaContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((CommaContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitTypestr(TypestrContext ctx){
		if ( extendedContext != null && extendedContext instanceof TypestrContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TypestrContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitDot(DotContext ctx){
		if ( extendedContext != null && extendedContext instanceof DotContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DotContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitLcurl(LcurlContext ctx){
		if ( extendedContext != null && extendedContext instanceof LcurlContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LcurlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public org.antlr.v4.runtime.ParserRuleContext visitRcurl(RcurlContext ctx){
		if ( extendedContext != null && extendedContext instanceof RcurlContextExt){
			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RcurlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}


	/*	@Override public org.antlr.v4.runtime.ParserRuleContext visitDecrement(VerilogPrimeParser.DecrementContext ctx) { 
		if ( extendedContext != null && extendedContext instanceof DecrementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DecrementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIncrement(VerilogPrimeParser.IncrementContext ctx) { 
		if ( extendedContext != null && extendedContext instanceof IncrementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((IncrementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public ParserRuleContext visitSource_text(Source_textContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Source_textContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Source_textContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDescription(DescriptionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof DescriptionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DescriptionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_declaration(Module_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_nonansi_header(Module_nonansi_headerContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_nonansi_headerContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_nonansi_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_ansi_header(Module_ansi_headerContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_ansi_headerContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_ansi_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_keyword(Module_keywordContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_keywordContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_keywordContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInterface_declaration(Interface_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Interface_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInterface_nonansi_header(Interface_nonansi_headerContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Interface_nonansi_headerContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_nonansi_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInterface_ansi_header(Interface_ansi_headerContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Interface_ansi_headerContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_ansi_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProgram_declaration(Program_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Program_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProgram_nonansi_header(Program_nonansi_headerContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Program_nonansi_headerContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_nonansi_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProgram_ansi_header(Program_ansi_headerContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Program_ansi_headerContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_ansi_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitChecker_declaration(Checker_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Checker_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_declaration(Class_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPackage_declaration(Package_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Package_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPackage_declaration_part1(Package_declaration_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Package_declaration_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_declaration_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTimeunits_declaration(Timeunits_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Timeunits_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timeunits_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitParameter_port_list(Parameter_port_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Parameter_port_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parameter_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_parameter_port_declaration(List_of_parameter_port_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_parameter_port_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_parameter_port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitParameter_port_declaration(Parameter_port_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Parameter_port_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parameter_port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_ports(List_of_portsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_portsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_portsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_port_declarations(List_of_port_declarationsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_port_declarationsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_port_declarationsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_port_declarations_part1(List_of_port_declarations_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_port_declarations_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_port_declarations_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPort_declaration(Port_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Port_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPort(PortContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof PortContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PortContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPort_expression(Port_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Port_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Port_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPort_reference(Port_referenceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Port_referenceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Port_referenceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPort_direction(Port_directionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Port_directionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Port_directionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNet_port_header(Net_port_headerContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Net_port_headerContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_port_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitVariable_port_header(Variable_port_headerContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Variable_port_headerContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_port_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInterface_port_header(Interface_port_headerContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Interface_port_headerContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_port_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAnsi_port_declaration(Ansi_port_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ansi_port_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ansi_port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitElaboration_system_task(Elaboration_system_taskContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Elaboration_system_taskContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Elaboration_system_taskContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFinish_number(Finish_numberContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Finish_numberContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Finish_numberContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_common_item(Module_common_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_common_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_common_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_item(Module_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_or_generate_item(Module_or_generate_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_or_generate_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_or_generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNon_port_module_item(Non_port_module_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Non_port_module_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Non_port_module_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitParameter_override(Parameter_overrideContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Parameter_overrideContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parameter_overrideContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBind_directive(Bind_directiveContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bind_directiveContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bind_directiveContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBind_target_scope(Bind_target_scopeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bind_target_scopeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bind_target_scopeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBind_target_instance(Bind_target_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bind_target_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bind_target_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBind_target_instance_list(Bind_target_instance_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bind_target_instance_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bind_target_instance_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBind_instantiation(Bind_instantiationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bind_instantiationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bind_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConfig_declaration(Config_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Config_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Config_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDesign_statement(Design_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Design_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Design_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDesign_statement_part1(Design_statement_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Design_statement_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Design_statement_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConfig_rule_statement(Config_rule_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Config_rule_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Config_rule_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDefault_clause(Default_clauseContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Default_clauseContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Default_clauseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInst_clause(Inst_clauseContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Inst_clauseContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inst_clauseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInst_name(Inst_nameContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Inst_nameContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inst_nameContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCell_clause(Cell_clauseContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cell_clauseContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cell_clauseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLiblist_clause(Liblist_clauseContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Liblist_clauseContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Liblist_clauseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUse_clause(Use_clauseContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Use_clauseContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Use_clauseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_or_generate_item_declaration(Module_or_generate_item_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_or_generate_item_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_or_generate_item_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInterface_or_generate_item(Interface_or_generate_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Interface_or_generate_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_or_generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExtern_tf_declaration(Extern_tf_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Extern_tf_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Extern_tf_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInterface_item(Interface_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Interface_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNon_port_interface_item(Non_port_interface_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Non_port_interface_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Non_port_interface_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProgram_item(Program_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Program_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNon_port_program_item(Non_port_program_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Non_port_program_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Non_port_program_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProgram_generate_item(Program_generate_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Program_generate_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitChecker_port_list(Checker_port_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Checker_port_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitChecker_port_item(Checker_port_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Checker_port_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_port_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitChecker_or_generate_item(Checker_or_generate_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Checker_or_generate_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_or_generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitChecker_or_generate_item_declaration(Checker_or_generate_item_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Checker_or_generate_item_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_or_generate_item_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitChecker_generate_item(Checker_generate_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Checker_generate_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitChecker_always_construct(Checker_always_constructContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Checker_always_constructContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_always_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_item(Class_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_property(Class_propertyContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_propertyContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_propertyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_method(Class_methodContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_methodContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_methodContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_constructor_prototype(Class_constructor_prototypeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_constructor_prototypeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_constructor_prototypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_constraint(Class_constraintContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_constraintContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_constraintContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_item_qualifier(Class_item_qualifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_item_qualifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_item_qualifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_qualifier(Property_qualifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_qualifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_qualifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRandom_qualifier(Random_qualifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Random_qualifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Random_qualifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitMethod_qualifier(Method_qualifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Method_qualifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Method_qualifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitMethod_prototype(Method_prototypeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Method_prototypeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Method_prototypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_constructor_declaration(Class_constructor_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_constructor_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_constructor_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstraint_declaration(Constraint_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constraint_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstraint_block(Constraint_blockContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constraint_blockContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstraint_block_item(Constraint_block_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constraint_block_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_block_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSolve_before_list(Solve_before_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Solve_before_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Solve_before_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSolve_before_primary(Solve_before_primaryContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Solve_before_primaryContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Solve_before_primaryContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstraint_expression(Constraint_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constraint_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstraint_set(Constraint_setContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constraint_setContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_setContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDist_list(Dist_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Dist_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dist_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDist_item(Dist_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Dist_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dist_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDist_weight(Dist_weightContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Dist_weightContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dist_weightContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstraint_prototype(Constraint_prototypeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constraint_prototypeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_prototypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExtern_constraint_declaration(Extern_constraint_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Extern_constraint_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Extern_constraint_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitIdentifier_list(Identifier_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Identifier_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Identifier_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPackage_item(Package_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Package_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPackage_or_generate_item_declaration(Package_or_generate_item_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Package_or_generate_item_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_or_generate_item_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAnonymous_program(Anonymous_programContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Anonymous_programContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Anonymous_programContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAnonymous_program_item(Anonymous_program_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Anonymous_program_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Anonymous_program_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLocal_parameter_declaration(Local_parameter_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Local_parameter_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Local_parameter_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitParameter_declaration(Parameter_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Parameter_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parameter_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSpecparam_declaration(Specparam_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Specparam_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specparam_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInout_declaration(Inout_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Inout_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inout_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInput_declaration(Input_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Input_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Input_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOutput_declaration(Output_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Output_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Output_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInterface_port_declaration(Interface_port_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Interface_port_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRef_declaration(Ref_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ref_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ref_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitData_declaration(Data_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Data_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Data_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPackage_import_declaration(Package_import_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Package_import_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_import_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPackage_import_item(Package_import_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Package_import_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_import_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPackage_export_declaration(Package_export_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Package_export_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_export_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGenvar_declaration(Genvar_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Genvar_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Genvar_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNet_declaration(Net_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Net_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitType_declaration(Type_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Type_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Type_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLifetime(LifetimeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof LifetimeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LifetimeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCasting_type(Casting_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Casting_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Casting_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitData_type(Data_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Data_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Data_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitData_type_or_implicit(Data_type_or_implicitContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Data_type_or_implicitContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Data_type_or_implicitContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitImplicit_data_type(Implicit_data_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Implicit_data_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Implicit_data_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEnum_base_type(Enum_base_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Enum_base_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enum_base_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEnum_name_declaration(Enum_name_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Enum_name_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enum_name_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEnum_name_declaration_part1(Enum_name_declaration_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Enum_name_declaration_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enum_name_declaration_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_scope(Class_scopeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_scopeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_scopeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_type(Class_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_type_part1(Class_type_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_type_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_type_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInteger_type(Integer_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Integer_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Integer_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInteger_atom_type(Integer_atom_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Integer_atom_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Integer_atom_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInteger_vector_type(Integer_vector_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Integer_vector_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Integer_vector_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNon_integer_type(Non_integer_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Non_integer_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Non_integer_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNet_type(Net_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Net_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNet_port_type(Net_port_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Net_port_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_port_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitVariable_port_type(Variable_port_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Variable_port_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_port_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitVar_data_type(Var_data_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Var_data_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Var_data_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSigning(SigningContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof SigningContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SigningContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSimple_type(Simple_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Simple_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitStruct_union_member(Struct_union_memberContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Struct_union_memberContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Struct_union_memberContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitData_type_or_void(Data_type_or_voidContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Data_type_or_voidContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Data_type_or_voidContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitStruct_union(Struct_unionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Struct_unionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Struct_unionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitType_reference(Type_referenceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Type_referenceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Type_referenceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDrive_strength(Drive_strengthContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Drive_strengthContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Drive_strengthContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitStrength0(Strength0Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Strength0ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Strength0ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitStrength1(Strength1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Strength1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Strength1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCharge_strength(Charge_strengthContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Charge_strengthContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Charge_strengthContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDelay3(Delay3Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Delay3ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delay3ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDelay2(Delay2Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Delay2ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delay2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDelay_value(Delay_valueContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Delay_valueContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delay_valueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_defparam_assignments(List_of_defparam_assignmentsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_defparam_assignmentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_defparam_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_genvar_identifiers(List_of_genvar_identifiersContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_genvar_identifiersContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_genvar_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_interface_identifiers(List_of_interface_identifiersContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_interface_identifiersContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_interface_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_interface_identifiers_part1(List_of_interface_identifiers_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_interface_identifiers_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_interface_identifiers_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_param_assignments(List_of_param_assignmentsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_param_assignmentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_param_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_port_identifiers(List_of_port_identifiersContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_port_identifiersContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_port_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_port_identifiers_part1(List_of_port_identifiers_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_port_identifiers_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_port_identifiers_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_udp_port_identifiers(List_of_udp_port_identifiersContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_udp_port_identifiersContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_udp_port_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_specparam_assignments(List_of_specparam_assignmentsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_specparam_assignmentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_specparam_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_tf_variable_identifiers(List_of_tf_variable_identifiersContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_tf_variable_identifiersContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_tf_variable_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_tf_variable_identifiers_part1(List_of_tf_variable_identifiers_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_tf_variable_identifiers_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_tf_variable_identifiers_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_type_assignments(List_of_type_assignmentsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_type_assignmentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_type_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_variable_decl_assignments(List_of_variable_decl_assignmentsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_variable_decl_assignmentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_variable_decl_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_variable_identifiers(List_of_variable_identifiersContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_variable_identifiersContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_variable_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_variable_identifiers_part1(List_of_variable_identifiers_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_variable_identifiers_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_variable_identifiers_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_variable_port_identifiers(List_of_variable_port_identifiersContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_variable_port_identifiersContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_variable_port_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_variable_port_identifiers_part1(List_of_variable_port_identifiers_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_variable_port_identifiers_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_variable_port_identifiers_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_virtual_interface_decl(List_of_virtual_interface_declContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_virtual_interface_declContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_virtual_interface_declContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_virtual_interface_decl_part1(List_of_virtual_interface_decl_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_virtual_interface_decl_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_virtual_interface_decl_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDefparam_assignment(Defparam_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Defparam_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Defparam_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_net_decl_assignments(List_of_net_decl_assignmentsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_net_decl_assignmentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_net_decl_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNet_decl_assignment(Net_decl_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Net_decl_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_decl_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitParam_assignment(Param_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Param_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Param_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSpecparam_assignment(Specparam_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Specparam_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specparam_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitType_assignment(Type_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Type_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Type_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPulse_control_specparam(Pulse_control_specparamContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Pulse_control_specparamContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pulse_control_specparamContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitError_limit_value(Error_limit_valueContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Error_limit_valueContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Error_limit_valueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitReject_limit_value(Reject_limit_valueContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Reject_limit_valueContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Reject_limit_valueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLimit_value(Limit_valueContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Limit_valueContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Limit_valueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitVariable_decl_assignment(Variable_decl_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Variable_decl_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_decl_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_new(Class_newContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_newContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_newContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDynamic_array_new(Dynamic_array_newContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Dynamic_array_newContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dynamic_array_newContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUnpacked_dimension(Unpacked_dimensionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Unpacked_dimensionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unpacked_dimensionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPacked_dimension(Packed_dimensionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Packed_dimensionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Packed_dimensionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAssociative_dimension(Associative_dimensionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Associative_dimensionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Associative_dimensionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitVariable_dimension(Variable_dimensionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Variable_dimensionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_dimensionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitQueue_dimension(Queue_dimensionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Queue_dimensionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Queue_dimensionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUnsized_dimension(Unsized_dimensionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Unsized_dimensionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unsized_dimensionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFunction_data_type_or_implicit(Function_data_type_or_implicitContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Function_data_type_or_implicitContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_data_type_or_implicitContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFunction_declaration(Function_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Function_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFunction_body_declaration(Function_body_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Function_body_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_body_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFunction_prototype(Function_prototypeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Function_prototypeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_prototypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDpi_import_export(Dpi_import_exportContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Dpi_import_exportContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_import_exportContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDpi_spec_string(Dpi_spec_stringContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Dpi_spec_stringContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_spec_stringContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDpi_function_import_property(Dpi_function_import_propertyContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Dpi_function_import_propertyContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_function_import_propertyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDpi_task_import_property(Dpi_task_import_propertyContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Dpi_task_import_propertyContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_task_import_propertyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDpi_function_proto(Dpi_function_protoContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Dpi_function_protoContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_function_protoContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDpi_task_proto(Dpi_task_protoContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Dpi_task_protoContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dpi_task_protoContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTask_declaration(Task_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Task_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Task_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTask_body_declaration(Task_body_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Task_body_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Task_body_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTf_item_declaration(Tf_item_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tf_item_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_item_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTf_port_list(Tf_port_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tf_port_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTf_port_item(Tf_port_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tf_port_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_port_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTf_port_direction(Tf_port_directionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tf_port_directionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_port_directionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTf_port_declaration(Tf_port_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tf_port_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTask_prototype(Task_prototypeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Task_prototypeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Task_prototypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBlock_item_declaration(Block_item_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Block_item_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Block_item_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOverload_declaration(Overload_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Overload_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Overload_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOverload_operator(Overload_operatorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Overload_operatorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Overload_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOverload_proto_formals(Overload_proto_formalsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Overload_proto_formalsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Overload_proto_formalsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitVirtual_interface_declaration(Virtual_interface_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Virtual_interface_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Virtual_interface_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModport_declaration(Modport_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Modport_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModport_item(Modport_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Modport_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModport_ports_declaration(Modport_ports_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Modport_ports_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_ports_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModport_clocking_declaration(Modport_clocking_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Modport_clocking_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_clocking_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModport_simple_ports_declaration(Modport_simple_ports_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Modport_simple_ports_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_simple_ports_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModport_simple_port(Modport_simple_portContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Modport_simple_portContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_simple_portContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModport_tf_ports_declaration(Modport_tf_ports_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Modport_tf_ports_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_tf_ports_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModport_tf_port(Modport_tf_portContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Modport_tf_portContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_tf_portContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitImport_export(Import_exportContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Import_exportContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Import_exportContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConcurrent_assertion_item(Concurrent_assertion_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Concurrent_assertion_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Concurrent_assertion_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConcurrent_assertion_statement(Concurrent_assertion_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Concurrent_assertion_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Concurrent_assertion_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAssert_property_statement(Assert_property_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Assert_property_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assert_property_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAssume_property_statement(Assume_property_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Assume_property_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assume_property_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCover_property_statement(Cover_property_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cover_property_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cover_property_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpect_property_statement(Expect_property_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Expect_property_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Expect_property_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCover_sequence_statement(Cover_sequence_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cover_sequence_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cover_sequence_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRestrict_property_statement(Restrict_property_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Restrict_property_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Restrict_property_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_instance(Property_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_list_of_arguments(Property_list_of_argumentsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_list_of_argumentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_list_of_argumentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_list_of_arguments_part1(Property_list_of_arguments_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_list_of_arguments_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_list_of_arguments_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_list_of_arguments_part2(Property_list_of_arguments_part2Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_list_of_arguments_part2ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_list_of_arguments_part2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_actual_arg(Property_actual_argContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_actual_argContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_actual_argContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAssertion_item_declaration(Assertion_item_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Assertion_item_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assertion_item_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_declaration(Property_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_port_list(Property_port_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_port_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_port_item(Property_port_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_port_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_port_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_lvar_port_direction(Property_lvar_port_directionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_lvar_port_directionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_lvar_port_directionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_formal_type(Property_formal_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_formal_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_formal_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_spec(Property_specContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_specContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_specContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_statement_spec(Property_statement_specContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_statement_specContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_statement_specContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_statement(Property_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_case_item(Property_case_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_case_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_case_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_expr(Property_exprContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_exprContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_exprContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_declaration(Sequence_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_port_list(Sequence_port_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_port_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_port_item(Sequence_port_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_port_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_port_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_lvar_port_direction(Sequence_lvar_port_directionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_lvar_port_directionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_lvar_port_directionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_formal_type(Sequence_formal_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_formal_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_formal_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_expr(Sequence_exprContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_exprContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_exprContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCycle_delay_range(Cycle_delay_rangeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cycle_delay_rangeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cycle_delay_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_method_call(Sequence_method_callContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_method_callContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_method_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_match_item(Sequence_match_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_match_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_match_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_instance(Sequence_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_list_of_arguments(Sequence_list_of_argumentsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_list_of_argumentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_list_of_argumentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_list_of_arguments_part1(Sequence_list_of_arguments_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_list_of_arguments_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_list_of_arguments_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_list_of_arguments_part2(Sequence_list_of_arguments_part2Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_list_of_arguments_part2ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_list_of_arguments_part2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_actual_arg(Sequence_actual_argContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_actual_argContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_actual_argContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBoolean_abbrev(Boolean_abbrevContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Boolean_abbrevContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Boolean_abbrevContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_abbrev(Sequence_abbrevContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_abbrevContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_abbrevContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConsecutive_repetition(Consecutive_repetitionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Consecutive_repetitionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Consecutive_repetitionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNon_consecutive_repetition(Non_consecutive_repetitionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Non_consecutive_repetitionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Non_consecutive_repetitionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGoto_repetition(Goto_repetitionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Goto_repetitionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Goto_repetitionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_or_range_expression(Const_or_range_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Const_or_range_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Const_or_range_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCycle_delay_const_range_expression(Cycle_delay_const_range_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cycle_delay_const_range_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cycle_delay_const_range_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_or_dist(Expression_or_distContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Expression_or_distContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Expression_or_distContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAssertion_variable_declaration(Assertion_variable_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Assertion_variable_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assertion_variable_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLet_declaration(Let_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Let_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLet_identifier(Let_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Let_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLet_port_list(Let_port_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Let_port_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLet_port_item(Let_port_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Let_port_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_port_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLet_formal_type(Let_formal_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Let_formal_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_formal_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLet_expression(Let_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Let_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLet_list_of_arguments(Let_list_of_argumentsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Let_list_of_argumentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_list_of_argumentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLet_list_of_arguments_part1(Let_list_of_arguments_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Let_list_of_arguments_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_list_of_arguments_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLet_list_of_arguments_part2(Let_list_of_arguments_part2Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Let_list_of_arguments_part2ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_list_of_arguments_part2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLet_actual_arg(Let_actual_argContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Let_actual_argContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Let_actual_argContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCovergroup_declaration(Covergroup_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Covergroup_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Covergroup_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCoverage_spec_or_option(Coverage_spec_or_optionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Coverage_spec_or_optionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Coverage_spec_or_optionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCoverage_option(Coverage_optionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Coverage_optionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Coverage_optionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCoverage_spec(Coverage_specContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Coverage_specContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Coverage_specContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCoverage_event(Coverage_eventContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Coverage_eventContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Coverage_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBlock_event_expression(Block_event_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Block_event_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Block_event_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHierarchical_btf_identifier(Hierarchical_btf_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hierarchical_btf_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_btf_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCover_point(Cover_pointContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cover_pointContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cover_pointContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBins_or_empty(Bins_or_emptyContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bins_or_emptyContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_or_emptyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBins_or_options(Bins_or_optionsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bins_or_optionsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_or_optionsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBins_or_options_part1(Bins_or_options_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bins_or_options_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_or_options_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBins_keyword(Bins_keywordContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bins_keywordContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_keywordContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRange_list(Range_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Range_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Range_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTrans_list(Trans_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Trans_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Trans_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTrans_set(Trans_setContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Trans_setContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Trans_setContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTrans_range_list(Trans_range_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Trans_range_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Trans_range_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTrans_item(Trans_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Trans_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Trans_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRepeat_range(Repeat_rangeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Repeat_rangeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Repeat_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCover_cross(Cover_crossContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cover_crossContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cover_crossContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_coverpoints(List_of_coverpointsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_coverpointsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_coverpointsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCross_item(Cross_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cross_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cross_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSelect_bins_or_empty(Select_bins_or_emptyContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Select_bins_or_emptyContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Select_bins_or_emptyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBins_selection_or_option(Bins_selection_or_optionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bins_selection_or_optionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_selection_or_optionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBins_selection(Bins_selectionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bins_selectionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_selectionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSelect_expression(Select_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Select_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Select_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSelect_expression_part1(Select_expression_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Select_expression_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Select_expression_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSelect_condition(Select_conditionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Select_conditionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Select_conditionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBins_expression(Bins_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bins_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOpen_range_list(Open_range_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Open_range_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Open_range_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOpen_value_range(Open_value_rangeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Open_value_rangeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Open_value_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGate_instantiation(Gate_instantiationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Gate_instantiationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Gate_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCmos_switch_instance(Cmos_switch_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cmos_switch_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cmos_switch_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEnable_gate_instance(Enable_gate_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Enable_gate_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enable_gate_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitMos_switch_instance(Mos_switch_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Mos_switch_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Mos_switch_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitN_input_gate_instance(N_input_gate_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof N_input_gate_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((N_input_gate_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitN_output_gate_instance(N_output_gate_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof N_output_gate_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((N_output_gate_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPass_switch_instance(Pass_switch_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Pass_switch_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pass_switch_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPass_enable_switch_instance(Pass_enable_switch_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Pass_enable_switch_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pass_enable_switch_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPull_gate_instance(Pull_gate_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Pull_gate_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pull_gate_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPulldown_strength(Pulldown_strengthContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Pulldown_strengthContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pulldown_strengthContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPullup_strength(Pullup_strengthContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Pullup_strengthContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pullup_strengthContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEnable_terminal(Enable_terminalContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Enable_terminalContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enable_terminalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInout_terminal(Inout_terminalContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Inout_terminalContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inout_terminalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInput_terminal(Input_terminalContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Input_terminalContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Input_terminalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNcontrol_terminal(Ncontrol_terminalContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ncontrol_terminalContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ncontrol_terminalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOutput_terminal(Output_terminalContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Output_terminalContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Output_terminalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPcontrol_terminal(Pcontrol_terminalContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Pcontrol_terminalContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pcontrol_terminalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCmos_switchtype(Cmos_switchtypeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cmos_switchtypeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cmos_switchtypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEnable_gatetype(Enable_gatetypeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Enable_gatetypeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enable_gatetypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitMos_switchtype(Mos_switchtypeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Mos_switchtypeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Mos_switchtypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitN_input_gatetype(N_input_gatetypeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof N_input_gatetypeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((N_input_gatetypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitN_output_gatetype(N_output_gatetypeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof N_output_gatetypeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((N_output_gatetypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPass_en_switchtype(Pass_en_switchtypeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Pass_en_switchtypeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pass_en_switchtypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPass_switchtype(Pass_switchtypeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Pass_switchtypeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pass_switchtypeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_instantiation(Module_instantiationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_instantiationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitParameter_value_assignment(Parameter_value_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Parameter_value_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parameter_value_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_parameter_assignments(List_of_parameter_assignmentsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_parameter_assignmentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_parameter_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOrdered_parameter_assignment(Ordered_parameter_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ordered_parameter_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ordered_parameter_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNamed_parameter_assignment(Named_parameter_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Named_parameter_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Named_parameter_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHierarchical_instance(Hierarchical_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hierarchical_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitName_of_instance(Name_of_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Name_of_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Name_of_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_port_connections(List_of_port_connectionsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_port_connectionsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_port_connectionsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOrdered_port_connection(Ordered_port_connectionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ordered_port_connectionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ordered_port_connectionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNamed_port_connection(Named_port_connectionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Named_port_connectionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Named_port_connectionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInterface_instantiation(Interface_instantiationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Interface_instantiationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProgram_instantiation(Program_instantiationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Program_instantiationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitChecker_instantiation(Checker_instantiationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Checker_instantiationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_checker_port_connections(List_of_checker_port_connectionsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_checker_port_connectionsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_checker_port_connectionsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOrdered_checker_port_connection(Ordered_checker_port_connectionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ordered_checker_port_connectionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ordered_checker_port_connectionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNamed_checker_port_connection(Named_checker_port_connectionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Named_checker_port_connectionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Named_checker_port_connectionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGenerate_region(Generate_regionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Generate_regionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_regionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLoop_generate_construct(Loop_generate_constructContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Loop_generate_constructContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Loop_generate_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGenvar_initialization(Genvar_initializationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Genvar_initializationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Genvar_initializationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConditional_generate_construct(Conditional_generate_constructContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Conditional_generate_constructContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Conditional_generate_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitIf_generate_construct(If_generate_constructContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof If_generate_constructContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((If_generate_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCase_generate_construct(Case_generate_constructContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Case_generate_constructContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_generate_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCase_generate_item(Case_generate_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Case_generate_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGenerate_block(Generate_blockContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Generate_blockContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGenerate_block_part1(Generate_block_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Generate_block_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_block_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGenerate_block_part2(Generate_block_part2Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Generate_block_part2ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_block_part2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGenerate_block_part3(Generate_block_part3Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Generate_block_part3ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_block_part3ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGenerate_item(Generate_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Generate_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_nonansi_declaration(Udp_nonansi_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_nonansi_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_nonansi_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGenvar_iteration(Genvar_iterationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Genvar_iterationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Genvar_iterationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_ansi_declaration(Udp_ansi_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_ansi_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_ansi_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_declaration(Udp_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_port_list(Udp_port_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_port_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_declaration_port_list(Udp_declaration_port_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_declaration_port_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_declaration_port_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_port_declaration(Udp_port_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_port_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_output_declaration(Udp_output_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_output_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_output_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_input_declaration(Udp_input_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_input_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_input_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_reg_declaration(Udp_reg_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_reg_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_reg_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_body(Udp_bodyContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_bodyContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_bodyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCombinational_body(Combinational_bodyContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Combinational_bodyContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Combinational_bodyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCombinational_entry(Combinational_entryContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Combinational_entryContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Combinational_entryContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequential_body(Sequential_bodyContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequential_bodyContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequential_bodyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_initial_statement(Udp_initial_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_initial_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_initial_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInit_val(Init_valContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Init_valContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Init_valContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequential_entry(Sequential_entryContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequential_entryContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequential_entryContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSeq_input_list(Seq_input_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Seq_input_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Seq_input_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLevel_input_list(Level_input_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Level_input_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Level_input_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEdge_input_list(Edge_input_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Edge_input_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_input_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEdge_input_list_part1(Edge_input_list_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Edge_input_list_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_input_list_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEdge_indicator(Edge_indicatorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Edge_indicatorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_indicatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCurrent_state(Current_stateContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Current_stateContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Current_stateContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNext_state(Next_stateContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Next_stateContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Next_stateContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOutput_symbol(Output_symbolContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Output_symbolContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Output_symbolContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLevel_symbol(Level_symbolContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Level_symbolContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Level_symbolContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEdge_symbol(Edge_symbolContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Edge_symbolContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_symbolContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_instantiation(Udp_instantiationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_instantiationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_instance(Udp_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitContinuous_assign(Continuous_assignContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Continuous_assignContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Continuous_assignContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_net_assignments(List_of_net_assignmentsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_net_assignmentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_net_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_variable_assignments(List_of_variable_assignmentsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_variable_assignmentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_variable_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNet_alias(Net_aliasContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Net_aliasContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_aliasContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNet_assignment(Net_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Net_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInitial_construct(Initial_constructContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Initial_constructContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Initial_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAlways_construct(Always_constructContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Always_constructContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Always_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAlways_keyword(Always_keywordContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Always_keywordContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Always_keywordContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFinal_construct(Final_constructContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Final_constructContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Final_constructContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBlocking_assignment(Blocking_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Blocking_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Blocking_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOperator_assignment(Operator_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Operator_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Operator_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAssignment_operator(Assignment_operatorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Assignment_operatorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNonblocking_assignment(Nonblocking_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Nonblocking_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Nonblocking_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProcedural_continuous_assignment(Procedural_continuous_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Procedural_continuous_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Procedural_continuous_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAction_block(Action_blockContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Action_blockContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Action_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSeq_block(Seq_blockContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Seq_blockContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Seq_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSeq_block_part1(Seq_block_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Seq_block_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Seq_block_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPar_block(Par_blockContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Par_blockContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Par_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPar_block_part1(Par_block_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Par_block_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Par_block_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitJoin_keyword(Join_keywordContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Join_keywordContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Join_keywordContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitStatement_or_null(Statement_or_nullContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Statement_or_nullContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Statement_or_nullContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitStatement(StatementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof StatementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StatementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitStatement_item(Statement_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Statement_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Statement_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFunction_statement(Function_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Function_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFunction_statement_or_null(Function_statement_or_nullContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Function_statement_or_nullContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_statement_or_nullContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitVariable_identifier_list(Variable_identifier_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Variable_identifier_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_identifier_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProcedural_timing_control_statement(Procedural_timing_control_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Procedural_timing_control_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Procedural_timing_control_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDelay_or_event_control(Delay_or_event_controlContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Delay_or_event_controlContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delay_or_event_controlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDelay_control(Delay_controlContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Delay_controlContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delay_controlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEvent_control(Event_controlContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Event_controlContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Event_controlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEvent_expression(Event_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Event_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Event_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

//	@Override
//	public ParserRuleContext visitEvent_expression_part1(Event_expression_part1Context ctx)
//	{
//		if ( extendedContext != null && extendedContext instanceof Event_expression_part1ContextExt){
//			ctx.extendedContext.setEvaluatedStatus(extendedContext.getEvaluatedStatus());
//			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
//			ctx.extendedContext.setMostRecentExtendedContext(extendedContext.getExtendedContext());
//			((Event_expression_part1ContextExt)extendedContext).setContext(ctx);
//			return ctx;
//		}
//		else{
//			throw new ClassCastException(extendedContext.getClass().toString());
//		}
//
//	}

	@Override
	public ParserRuleContext visitProcedural_timing_control(Procedural_timing_controlContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Procedural_timing_controlContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Procedural_timing_controlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitJump_statement(Jump_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Jump_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Jump_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitWait_statement(Wait_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Wait_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Wait_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEvent_trigger(Event_triggerContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Event_triggerContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Event_triggerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDisable_statement(Disable_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Disable_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Disable_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConditional_statement(Conditional_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Conditional_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Conditional_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUnique_priority(Unique_priorityContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Unique_priorityContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unique_priorityContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCase_statement(Case_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Case_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCase_keyword(Case_keywordContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Case_keywordContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_keywordContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCase_expression(Case_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Case_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCase_item(Case_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Case_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCase_pattern_item(Case_pattern_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Case_pattern_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_pattern_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCase_inside_item(Case_inside_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Case_inside_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_inside_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCase_item_expression(Case_item_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Case_item_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Case_item_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRandcase_statement(Randcase_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Randcase_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Randcase_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRandcase_item(Randcase_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Randcase_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Randcase_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPattern(PatternContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof PatternContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PatternContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAssignment_pattern(Assignment_patternContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Assignment_patternContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_patternContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitStructure_pattern_key(Structure_pattern_keyContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Structure_pattern_keyContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Structure_pattern_keyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitArray_pattern_key(Array_pattern_keyContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Array_pattern_keyContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Array_pattern_keyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAssignment_pattern_key(Assignment_pattern_keyContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Assignment_pattern_keyContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_pattern_keyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitVariable_assignment(Variable_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Variable_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAssignment_pattern_expression(Assignment_pattern_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Assignment_pattern_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_pattern_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAssignment_pattern_expression_type(Assignment_pattern_expression_typeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Assignment_pattern_expression_typeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_pattern_expression_typeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_assignment_pattern_expression(Constant_assignment_pattern_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_assignment_pattern_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_assignment_pattern_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAssignment_pattern_net_lvalue(Assignment_pattern_net_lvalueContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Assignment_pattern_net_lvalueContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_pattern_net_lvalueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAssignment_pattern_variable_lvalue(Assignment_pattern_variable_lvalueContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Assignment_pattern_variable_lvalueContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assignment_pattern_variable_lvalueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLoop_statement(Loop_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Loop_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Loop_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFor_initialization(For_initializationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof For_initializationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((For_initializationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFor_variable_declaration(For_variable_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof For_variable_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((For_variable_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFor_step(For_stepContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof For_stepContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((For_stepContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFor_step_assignment(For_step_assignmentContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof For_step_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((For_step_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLoop_variables(Loop_variablesContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Loop_variablesContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Loop_variablesContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLoop_variables_part1(Loop_variables_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Loop_variables_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Loop_variables_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSubroutine_call_statement(Subroutine_call_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Subroutine_call_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Subroutine_call_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAssertion_item(Assertion_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Assertion_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assertion_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDeferred_immediate_assertion_item(Deferred_immediate_assertion_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Deferred_immediate_assertion_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Deferred_immediate_assertion_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProcedural_assertion_statement(Procedural_assertion_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Procedural_assertion_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Procedural_assertion_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitImmediate_assertion_statement(Immediate_assertion_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Immediate_assertion_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Immediate_assertion_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSimple_immediate_assertion_statement(Simple_immediate_assertion_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Simple_immediate_assertion_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_immediate_assertion_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSimple_immediate_assert_statement(Simple_immediate_assert_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Simple_immediate_assert_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_immediate_assert_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSimple_immediate_assume_statement(Simple_immediate_assume_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Simple_immediate_assume_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_immediate_assume_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSimple_immediate_cover_statement(Simple_immediate_cover_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Simple_immediate_cover_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_immediate_cover_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDeferred_immediate_assertion_statement(Deferred_immediate_assertion_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Deferred_immediate_assertion_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Deferred_immediate_assertion_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDeferred_immediate_assert_statement(Deferred_immediate_assert_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Deferred_immediate_assert_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Deferred_immediate_assert_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDeferred_immediate_assume_statement(Deferred_immediate_assume_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Deferred_immediate_assume_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Deferred_immediate_assume_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDeferred_immediate_cover_statement(Deferred_immediate_cover_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Deferred_immediate_cover_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Deferred_immediate_cover_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClocking_declaration(Clocking_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Clocking_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClocking_declaration_part1(Clocking_declaration_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Clocking_declaration_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_declaration_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClocking_event(Clocking_eventContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Clocking_eventContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClocking_item(Clocking_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Clocking_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDefault_skew(Default_skewContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Default_skewContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Default_skewContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClocking_direction(Clocking_directionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Clocking_directionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_directionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClocking_direction_part1(Clocking_direction_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Clocking_direction_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_direction_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_clocking_decl_assign(List_of_clocking_decl_assignContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_clocking_decl_assignContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_clocking_decl_assignContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClocking_decl_assign(Clocking_decl_assignContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Clocking_decl_assignContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_decl_assignContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClocking_skew(Clocking_skewContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Clocking_skewContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_skewContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClocking_drive(Clocking_driveContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Clocking_driveContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_driveContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCycle_delay(Cycle_delayContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cycle_delayContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cycle_delayContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClockvar(ClockvarContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ClockvarContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ClockvarContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClockvar_expression(Clockvar_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Clockvar_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clockvar_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRandsequence_statement(Randsequence_statementContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Randsequence_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Randsequence_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProduction(ProductionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ProductionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ProductionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRs_rule(Rs_ruleContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Rs_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRs_production_list(Rs_production_listContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Rs_production_listContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_production_listContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitWeight_specification(Weight_specificationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Weight_specificationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Weight_specificationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRs_code_block(Rs_code_blockContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Rs_code_blockContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_code_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRs_prod(Rs_prodContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Rs_prodContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_prodContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProduction_item(Production_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Production_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Production_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRs_if_else(Rs_if_elseContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Rs_if_elseContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_if_elseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRs_repeat(Rs_repeatContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Rs_repeatContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_repeatContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRs_case(Rs_caseContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Rs_caseContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_caseContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRs_case_item(Rs_case_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Rs_case_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rs_case_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSpecify_block(Specify_blockContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Specify_blockContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specify_blockContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSpecify_item(Specify_itemContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Specify_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specify_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPulsestyle_declaration(Pulsestyle_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Pulsestyle_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pulsestyle_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitShowcancelled_declaration(Showcancelled_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Showcancelled_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Showcancelled_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPath_declaration(Path_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Path_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Path_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSimple_path_declaration(Simple_path_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Simple_path_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_path_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitParallel_path_description(Parallel_path_descriptionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Parallel_path_descriptionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parallel_path_descriptionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFull_path_description(Full_path_descriptionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Full_path_descriptionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Full_path_descriptionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_path_inputs(List_of_path_inputsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_path_inputsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_path_inputsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_path_outputs(List_of_path_outputsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_path_outputsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_path_outputsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSpecify_input_terminal_descriptor(Specify_input_terminal_descriptorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Specify_input_terminal_descriptorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specify_input_terminal_descriptorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSpecify_output_terminal_descriptor(Specify_output_terminal_descriptorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Specify_output_terminal_descriptorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specify_output_terminal_descriptorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInput_identifier(Input_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Input_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Input_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOutput_identifier(Output_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Output_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Output_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPath_delay_value(Path_delay_valueContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Path_delay_valueContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Path_delay_valueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_path_delay_expressions(List_of_path_delay_expressionsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_path_delay_expressionsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_path_delay_expressionsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitT_path_delay_expression(T_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof T_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTrise_path_delay_expression(Trise_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Trise_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Trise_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTfall_path_delay_expression(Tfall_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tfall_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tfall_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTz_path_delay_expression(Tz_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tz_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tz_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitT01_path_delay_expression(T01_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof T01_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T01_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitT10_path_delay_expression(T10_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof T10_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T10_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitT0z_path_delay_expression(T0z_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof T0z_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T0z_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTz1_path_delay_expression(Tz1_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tz1_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tz1_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitT1z_path_delay_expression(T1z_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof T1z_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T1z_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTz0_path_delay_expression(Tz0_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tz0_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tz0_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitT0x_path_delay_expression(T0x_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof T0x_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T0x_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTx1_path_delay_expression(Tx1_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tx1_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tx1_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitT1x_path_delay_expression(T1x_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof T1x_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((T1x_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTx0_path_delay_expression(Tx0_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tx0_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tx0_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTxz_path_delay_expression(Txz_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Txz_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Txz_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTzx_path_delay_expression(Tzx_path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tzx_path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tzx_path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPath_delay_expression(Path_delay_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Path_delay_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Path_delay_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEdge_sensitive_path_declaration(Edge_sensitive_path_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Edge_sensitive_path_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_sensitive_path_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitParallel_edge_sensitive_path_description(Parallel_edge_sensitive_path_descriptionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Parallel_edge_sensitive_path_descriptionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parallel_edge_sensitive_path_descriptionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFull_edge_sensitive_path_description(Full_edge_sensitive_path_descriptionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Full_edge_sensitive_path_descriptionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Full_edge_sensitive_path_descriptionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitData_source_expression(Data_source_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Data_source_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Data_source_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEdge_identifier(Edge_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Edge_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitState_dependent_path_declaration(State_dependent_path_declarationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof State_dependent_path_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((State_dependent_path_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPolarity_operator(Polarity_operatorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Polarity_operatorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Polarity_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSystem_timing_check(System_timing_checkContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof System_timing_checkContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((System_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSetup_timing_check(Setup_timing_checkContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Setup_timing_checkContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Setup_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHold_timing_check(Hold_timing_checkContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hold_timing_checkContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hold_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSetuphold_timing_check(Setuphold_timing_checkContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Setuphold_timing_checkContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Setuphold_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRecovery_timing_check(Recovery_timing_checkContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Recovery_timing_checkContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Recovery_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRemoval_timing_check(Removal_timing_checkContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Removal_timing_checkContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Removal_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRecrem_timing_check(Recrem_timing_checkContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Recrem_timing_checkContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Recrem_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSkew_timing_check(Skew_timing_checkContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Skew_timing_checkContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Skew_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTimeskew_timing_check(Timeskew_timing_checkContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Timeskew_timing_checkContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timeskew_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFullskew_timing_check(Fullskew_timing_checkContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Fullskew_timing_checkContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Fullskew_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPeriod_timing_check(Period_timing_checkContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Period_timing_checkContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Period_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitWidth_timing_check(Width_timing_checkContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Width_timing_checkContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Width_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNochange_timing_check(Nochange_timing_checkContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Nochange_timing_checkContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Nochange_timing_checkContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTimecheck_condition(Timecheck_conditionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Timecheck_conditionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timecheck_conditionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitControlled_reference_event(Controlled_reference_eventContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Controlled_reference_eventContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Controlled_reference_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitData_event(Data_eventContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Data_eventContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Data_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDelayed_data(Delayed_dataContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Delayed_dataContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delayed_dataContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDelayed_reference(Delayed_referenceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Delayed_referenceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Delayed_referenceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEnd_edge_offset(End_edge_offsetContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof End_edge_offsetContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((End_edge_offsetContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEvent_based_flag(Event_based_flagContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Event_based_flagContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Event_based_flagContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNotifier(NotifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof NotifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NotifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitReference_event(Reference_eventContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Reference_eventContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Reference_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRemain_active_flag(Remain_active_flagContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Remain_active_flagContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Remain_active_flagContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTimestamp_condition(Timestamp_conditionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Timestamp_conditionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timestamp_conditionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitStart_edge_offset(Start_edge_offsetContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Start_edge_offsetContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Start_edge_offsetContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitThreshold(ThresholdContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ThresholdContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ThresholdContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTiming_check_limit(Timing_check_limitContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Timing_check_limitContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timing_check_limitContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTiming_check_event(Timing_check_eventContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Timing_check_eventContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timing_check_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitControlled_timing_check_event(Controlled_timing_check_eventContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Controlled_timing_check_eventContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Controlled_timing_check_eventContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTiming_check_event_control(Timing_check_event_controlContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Timing_check_event_controlContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timing_check_event_controlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSpecify_terminal_descriptor(Specify_terminal_descriptorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Specify_terminal_descriptorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specify_terminal_descriptorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEdge_control_specifier(Edge_control_specifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Edge_control_specifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_control_specifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEdge_descriptor(Edge_descriptorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Edge_descriptorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Edge_descriptorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTiming_check_condition(Timing_check_conditionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Timing_check_conditionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timing_check_conditionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitScalar_timing_check_condition(Scalar_timing_check_conditionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Scalar_timing_check_conditionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Scalar_timing_check_conditionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitScalar_constant(Scalar_constantContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Scalar_constantContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Scalar_constantContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConcatenation(ConcatenationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ConcatenationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ConcatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_concatenation(Constant_concatenationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_concatenationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_multiple_concatenation(Constant_multiple_concatenationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_multiple_concatenationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_multiple_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_path_concatenation(Module_path_concatenationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_path_concatenationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_path_multiple_concatenation(Module_path_multiple_concatenationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_path_multiple_concatenationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_multiple_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitMultiple_concatenation(Multiple_concatenationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Multiple_concatenationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Multiple_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitStreaming_concatenation(Streaming_concatenationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Streaming_concatenationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Streaming_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitStream_operator(Stream_operatorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Stream_operatorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Stream_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSlice_size(Slice_sizeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Slice_sizeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Slice_sizeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitStream_concatenation(Stream_concatenationContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Stream_concatenationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Stream_concatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitStream_expression(Stream_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Stream_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Stream_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitArray_range_expression(Array_range_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Array_range_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Array_range_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEmpty_queue(Empty_queueContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Empty_queueContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Empty_queueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_function_call(Constant_function_callContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_function_callContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_function_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTf_call(Tf_callContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tf_callContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSystem_tf_call(System_tf_callContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof System_tf_callContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((System_tf_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSubroutine_call(Subroutine_callContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Subroutine_callContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Subroutine_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFunction_subroutine_call(Function_subroutine_callContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Function_subroutine_callContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_subroutine_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_arguments(List_of_argumentsContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_argumentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_argumentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_arguments_part1(List_of_arguments_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_arguments_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_arguments_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitList_of_arguments_part2(List_of_arguments_part2Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof List_of_arguments_part2ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_arguments_part2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitMethod_call(Method_callContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Method_callContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Method_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitMethod_call_body(Method_call_bodyContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Method_call_bodyContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Method_call_bodyContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBuilt_in_method_call(Built_in_method_callContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Built_in_method_callContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Built_in_method_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitArray_manipulation_call(Array_manipulation_callContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Array_manipulation_callContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Array_manipulation_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRandomize_call(Randomize_callContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Randomize_callContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Randomize_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitMethod_call_root(Method_call_rootContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Method_call_rootContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Method_call_rootContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitArray_method_name(Array_method_nameContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Array_method_nameContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Array_method_nameContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInc_or_dec_expression(Inc_or_dec_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Inc_or_dec_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inc_or_dec_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInc_or_dec_expression_part1(Inc_or_dec_expression_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Inc_or_dec_expression_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inc_or_dec_expression_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInc_or_dec_expression_part2(Inc_or_dec_expression_part2Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Inc_or_dec_expression_part2ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inc_or_dec_expression_part2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_expr_st_st(Const_expr_st_stContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_expr_equality(Const_expr_equalityContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_expr_binary_xor(Const_expr_binary_xorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_expr_unary_op(Const_expr_unary_opContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override
	public ParserRuleContext visitConst_expr_comp(Const_expr_compContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_expr_binary_or(Const_expr_binary_orContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_expr_log_or(Const_expr_log_orContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_expr_log_and(Const_expr_log_andContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_expr_binary_and(Const_expr_binary_andContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_expr_conditional(Const_expr_conditionalContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_expr_mutl(Const_expr_mutlContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_expr_add(Const_expr_addContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_expr_only_primary(Const_expr_only_primaryContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_expr_shift(Const_expr_shiftContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_mintypmax_expression(Constant_mintypmax_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_param_expression(Constant_param_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitParam_expression(Param_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Param_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Param_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_range_expression(Constant_range_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_range_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_range_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_part_select_range(Constant_part_select_rangeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_part_select_rangeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_part_select_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_range(Constant_rangeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_rangeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_indexed_range(Constant_indexed_rangeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_indexed_rangeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_indexed_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpr_(Expr_Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Expr_ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Expr_ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_shift(Expression_shiftContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_binary_or(Expression_binary_orContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_mult(Expression_multContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_only_primary(Expression_only_primaryContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_log_and(Expression_log_andContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_inside_exp(Expression_inside_expContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_op_assign(Expression_op_assignContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_comp(Expression_compContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_tagged_union(Expression_tagged_unionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_equality(Expression_equalityContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_log_or(Expression_log_orContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_add(Expression_addContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_inc_or_dec(Expression_inc_or_decContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_st_st(Expression_st_stContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_binary_and(Expression_binary_andContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_conditional_exp(Expression_conditional_expContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_binary_xor(Expression_binary_xorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitExpression_unary_op(Expression_unary_opContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			extendedContext.setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitMatches_pattern(Matches_patternContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Matches_patternContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Matches_patternContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTagged_union_expression(Tagged_union_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tagged_union_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tagged_union_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitValue_range(Value_rangeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Value_rangeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Value_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitMintypmax_expression(Mintypmax_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Mintypmax_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Mintypmax_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_path_expression(Module_path_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_path_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_path_conditional_expression(Module_path_conditional_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_path_conditional_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_conditional_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_path_binary_expression(Module_path_binary_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_path_binary_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_binary_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_path_unary_expression(Module_path_unary_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_path_unary_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_unary_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_path_mintypmax_expression(Module_path_mintypmax_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_path_mintypmax_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_mintypmax_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPart_select_range(Part_select_rangeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Part_select_rangeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Part_select_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitIndexed_range(Indexed_rangeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Indexed_rangeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Indexed_rangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGenvar_expression(Genvar_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Genvar_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Genvar_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_primary(Constant_primaryContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_primaryContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_primaryContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_path_primary(Module_path_primaryContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_path_primaryContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_path_primaryContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPrimary_no_function_call(Primary_no_function_callContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Primary_no_function_callContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Primary_no_function_callContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPrimary(PrimaryContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof PrimaryContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PrimaryContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_qualifier(Class_qualifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_qualifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_qualifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitRange_expression(Range_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Range_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Range_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPrimary_literal(Primary_literalContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Primary_literalContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Primary_literalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTime_literal(Time_literalContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Time_literalContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Time_literalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitImplicit_class_handle(Implicit_class_handleContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Implicit_class_handleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Implicit_class_handleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBit_select(Bit_selectContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bit_selectContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bit_selectContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSelect(SelectContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof SelectContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((SelectContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNonrange_select(Nonrange_selectContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Nonrange_selectContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Nonrange_selectContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_bit_select(Constant_bit_selectContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_bit_selectContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_bit_selectContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_select(Constant_selectContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_selectContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_selectContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_cast(Constant_castContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_castContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_castContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstant_let_expression(Constant_let_expressionContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constant_let_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constant_let_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCast(CastContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof CastContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((CastContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNet_lvalue(Net_lvalueContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Net_lvalueContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_lvalueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitVariable_lvalue(Variable_lvalueContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Variable_lvalueContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_lvalueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNonrange_variable_lvalue(Nonrange_variable_lvalueContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Nonrange_variable_lvalueContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Nonrange_variable_lvalueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUnary_operator(Unary_operatorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Unary_operatorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unary_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBinary_operator(Binary_operatorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Binary_operatorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Binary_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInc_or_dec_operator(Inc_or_dec_operatorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Inc_or_dec_operatorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inc_or_dec_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUnary_module_path_operator(Unary_module_path_operatorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Unary_module_path_operatorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unary_module_path_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBinary_module_path_operator(Binary_module_path_operatorContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Binary_module_path_operatorContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Binary_module_path_operatorContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUnbased_unsized_literal(Unbased_unsized_literalContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Unbased_unsized_literalContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Unbased_unsized_literalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitString_literal(String_literalContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof String_literalContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((String_literalContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAttribute_instance(Attribute_instanceContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Attribute_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Attribute_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAttr_spec(Attr_specContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Attr_specContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Attr_specContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitAttr_name(Attr_nameContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Attr_nameContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Attr_nameContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitArray_identifier(Array_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Array_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Array_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBlock_identifier(Block_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Block_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Block_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBin_identifier(Bin_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bin_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bin_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitC_identifier(C_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof C_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((C_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCell_identifier(Cell_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cell_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cell_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitChecker_identifier(Checker_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Checker_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Checker_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_identifier(Class_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClass_variable_identifier(Class_variable_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Class_variable_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Class_variable_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitClocking_identifier(Clocking_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Clocking_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Clocking_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConfig_identifier(Config_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Config_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Config_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConst_identifier(Const_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Const_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Const_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitConstraint_identifier(Constraint_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Constraint_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Constraint_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCovergroup_identifier(Covergroup_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Covergroup_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Covergroup_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCovergroup_variable_identifier(Covergroup_variable_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Covergroup_variable_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Covergroup_variable_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCover_point_identifier(Cover_point_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cover_point_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cover_point_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitCross_identifier(Cross_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Cross_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Cross_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitDynamic_array_variable_identifier(Dynamic_array_variable_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Dynamic_array_variable_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dynamic_array_variable_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEnum_identifier(Enum_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Enum_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Enum_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitEscaped_identifier(Escaped_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Escaped_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Escaped_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFormal_identifier(Formal_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Formal_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Formal_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitFunction_identifier(Function_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Function_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Function_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGenerate_block_identifier(Generate_block_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Generate_block_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Generate_block_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitGenvar_identifier(Genvar_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Genvar_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Genvar_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHierarchical_array_identifier(Hierarchical_array_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hierarchical_array_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_array_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHierarchical_block_identifier(Hierarchical_block_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hierarchical_block_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_block_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHierarchical_event_identifier(Hierarchical_event_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hierarchical_event_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_event_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHierarchical_identifier(Hierarchical_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hierarchical_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHierarchical_net_identifier(Hierarchical_net_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hierarchical_net_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_net_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHierarchical_parameter_identifier(Hierarchical_parameter_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hierarchical_parameter_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_parameter_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHierarchical_property_identifier(Hierarchical_property_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hierarchical_property_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_property_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHierarchical_sequence_identifier(Hierarchical_sequence_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hierarchical_sequence_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_sequence_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHierarchical_task_identifier(Hierarchical_task_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hierarchical_task_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_task_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHierarchical_tf_identifier(Hierarchical_tf_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hierarchical_tf_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_tf_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitHierarchical_variable_identifier(Hierarchical_variable_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Hierarchical_variable_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_variable_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitIdentifier(IdentifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof IdentifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((IdentifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitIndex_variable_identifier(Index_variable_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Index_variable_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Index_variable_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInterface_identifier(Interface_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Interface_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInterface_instance_identifier(Interface_instance_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Interface_instance_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Interface_instance_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInout_port_identifier(Inout_port_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Inout_port_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Inout_port_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInput_port_identifier(Input_port_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Input_port_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Input_port_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitInstance_identifier(Instance_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Instance_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Instance_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitLibrary_identifier(Library_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Library_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Library_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitMember_identifier(Member_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Member_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Member_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitMethod_identifier(Method_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Method_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Method_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModport_identifier(Modport_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Modport_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Modport_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitModule_identifier(Module_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Module_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNet_identifier(Net_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Net_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitOutput_port_identifier(Output_port_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Output_port_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Output_port_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPackage_identifier(Package_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Package_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPackage_scope(Package_scopeContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Package_scopeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Package_scopeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitParameter_identifier(Parameter_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Parameter_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parameter_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPort_identifier(Port_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Port_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Port_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProduction_identifier(Production_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Production_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Production_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProgram_identifier(Program_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Program_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Program_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitProperty_identifier(Property_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Property_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Property_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPs_class_identifier(Ps_class_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ps_class_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_class_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPs_covergroup_identifier(Ps_covergroup_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ps_covergroup_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_covergroup_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPs_identifier(Ps_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ps_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPs_or_hierarchical_array_identifier(Ps_or_hierarchical_array_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ps_or_hierarchical_array_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_or_hierarchical_array_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPs_or_hierarchical_array_identifier_part1(Ps_or_hierarchical_array_identifier_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ps_or_hierarchical_array_identifier_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_or_hierarchical_array_identifier_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPs_or_hierarchical_net_identifier(Ps_or_hierarchical_net_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ps_or_hierarchical_net_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_or_hierarchical_net_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPs_or_hierarchical_property_identifier(Ps_or_hierarchical_property_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ps_or_hierarchical_property_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_or_hierarchical_property_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPs_or_hierarchical_sequence_identifier(Ps_or_hierarchical_sequence_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ps_or_hierarchical_sequence_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_or_hierarchical_sequence_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPs_or_hierarchical_tf_identifier(Ps_or_hierarchical_tf_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ps_or_hierarchical_tf_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_or_hierarchical_tf_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPs_parameter_identifier(Ps_parameter_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ps_parameter_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_parameter_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPs_parameter_identifier_part1(Ps_parameter_identifier_part1Context ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ps_parameter_identifier_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_parameter_identifier_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitPs_type_identifier(Ps_type_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Ps_type_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ps_type_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSequence_identifier(Sequence_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Sequence_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Sequence_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSignal_identifier(Signal_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Signal_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Signal_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSimple_identifier(Simple_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Simple_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSpecparam_identifier(Specparam_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Specparam_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Specparam_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitSystem_tf_identifier(System_tf_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof System_tf_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((System_tf_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTask_identifier(Task_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Task_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Task_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTf_identifier(Tf_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Tf_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tf_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTerminal_identifier(Terminal_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Terminal_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Terminal_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitTopmodule_identifier(Topmodule_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Topmodule_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Topmodule_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitType_identifier(Type_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Type_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Type_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitUdp_identifier(Udp_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Udp_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Udp_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitBins_identifier(Bins_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Bins_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Bins_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitVariable_identifier(Variable_identifierContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof Variable_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Variable_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}

	@Override
	public ParserRuleContext visitNumber(NumberContext ctx)
	{
		if ( extendedContext != null && extendedContext instanceof NumberContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NumberContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}

	}*/

}


package com.proteus.cgen.verilogprime;

import com.proteus.cgen.verilogprime.ext.AbstractBaseExt;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParserBaseVisitor;


public class ExtendedContextVisitor extends VerilogPrimeParserBaseVisitor<AbstractBaseExt>{
	
	@Override public AbstractBaseExt visitSource_text(VerilogPrimeParser.Source_textContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDescription(VerilogPrimeParser.DescriptionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_declaration(VerilogPrimeParser.Module_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_nonansi_header(VerilogPrimeParser.Module_nonansi_headerContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_ansi_header(VerilogPrimeParser.Module_ansi_headerContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_keyword(VerilogPrimeParser.Module_keywordContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInterface_declaration(VerilogPrimeParser.Interface_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInterface_nonansi_header(VerilogPrimeParser.Interface_nonansi_headerContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInterface_ansi_header(VerilogPrimeParser.Interface_ansi_headerContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProgram_declaration(VerilogPrimeParser.Program_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProgram_nonansi_header(VerilogPrimeParser.Program_nonansi_headerContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProgram_ansi_header(VerilogPrimeParser.Program_ansi_headerContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitChecker_declaration(VerilogPrimeParser.Checker_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_declaration(VerilogPrimeParser.Class_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPackage_declaration(VerilogPrimeParser.Package_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPackage_declaration_part1(VerilogPrimeParser.Package_declaration_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTimeunits_declaration(VerilogPrimeParser.Timeunits_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitParameter_port_list(VerilogPrimeParser.Parameter_port_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_parameter_port_declaration(VerilogPrimeParser.List_of_parameter_port_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitParameter_port_declaration(VerilogPrimeParser.Parameter_port_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_ports(VerilogPrimeParser.List_of_portsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_port_declarations(VerilogPrimeParser.List_of_port_declarationsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_port_declarations_part1(VerilogPrimeParser.List_of_port_declarations_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPort_declaration(VerilogPrimeParser.Port_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPort(VerilogPrimeParser.PortContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPort_expression(VerilogPrimeParser.Port_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPort_reference(VerilogPrimeParser.Port_referenceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPort_direction(VerilogPrimeParser.Port_directionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNet_port_header(VerilogPrimeParser.Net_port_headerContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVariable_port_header(VerilogPrimeParser.Variable_port_headerContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInterface_port_header(VerilogPrimeParser.Interface_port_headerContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAnsi_port_declaration(VerilogPrimeParser.Ansi_port_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitElaboration_system_task(VerilogPrimeParser.Elaboration_system_taskContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFinish_number(VerilogPrimeParser.Finish_numberContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_common_item(VerilogPrimeParser.Module_common_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_item(VerilogPrimeParser.Module_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_or_generate_item(VerilogPrimeParser.Module_or_generate_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNon_port_module_item(VerilogPrimeParser.Non_port_module_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitParameter_override(VerilogPrimeParser.Parameter_overrideContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBind_directive(VerilogPrimeParser.Bind_directiveContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBind_target_scope(VerilogPrimeParser.Bind_target_scopeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBind_target_instance(VerilogPrimeParser.Bind_target_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBind_target_instance_list(VerilogPrimeParser.Bind_target_instance_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBind_instantiation(VerilogPrimeParser.Bind_instantiationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConfig_declaration(VerilogPrimeParser.Config_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDesign_statement(VerilogPrimeParser.Design_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDesign_statement_part1(VerilogPrimeParser.Design_statement_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConfig_rule_statement(VerilogPrimeParser.Config_rule_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDefault_clause(VerilogPrimeParser.Default_clauseContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInst_clause(VerilogPrimeParser.Inst_clauseContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInst_name(VerilogPrimeParser.Inst_nameContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCell_clause(VerilogPrimeParser.Cell_clauseContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLiblist_clause(VerilogPrimeParser.Liblist_clauseContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUse_clause(VerilogPrimeParser.Use_clauseContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_or_generate_item_declaration(VerilogPrimeParser.Module_or_generate_item_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInterface_or_generate_item(VerilogPrimeParser.Interface_or_generate_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExtern_tf_declaration(VerilogPrimeParser.Extern_tf_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInterface_item(VerilogPrimeParser.Interface_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNon_port_interface_item(VerilogPrimeParser.Non_port_interface_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProgram_item(VerilogPrimeParser.Program_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNon_port_program_item(VerilogPrimeParser.Non_port_program_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProgram_generate_item(VerilogPrimeParser.Program_generate_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitChecker_port_list(VerilogPrimeParser.Checker_port_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitChecker_port_item(VerilogPrimeParser.Checker_port_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitChecker_or_generate_item(VerilogPrimeParser.Checker_or_generate_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitChecker_or_generate_item_declaration(VerilogPrimeParser.Checker_or_generate_item_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitChecker_generate_item(VerilogPrimeParser.Checker_generate_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitChecker_always_construct(VerilogPrimeParser.Checker_always_constructContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_item(VerilogPrimeParser.Class_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_property(VerilogPrimeParser.Class_propertyContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_method(VerilogPrimeParser.Class_methodContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_constructor_prototype(VerilogPrimeParser.Class_constructor_prototypeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_constraint(VerilogPrimeParser.Class_constraintContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_item_qualifier(VerilogPrimeParser.Class_item_qualifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_qualifier(VerilogPrimeParser.Property_qualifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRandom_qualifier(VerilogPrimeParser.Random_qualifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMethod_qualifier(VerilogPrimeParser.Method_qualifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMethod_prototype(VerilogPrimeParser.Method_prototypeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_constructor_declaration(VerilogPrimeParser.Class_constructor_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstraint_declaration(VerilogPrimeParser.Constraint_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstraint_block(VerilogPrimeParser.Constraint_blockContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstraint_block_item(VerilogPrimeParser.Constraint_block_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSolve_before_list(VerilogPrimeParser.Solve_before_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSolve_before_primary(VerilogPrimeParser.Solve_before_primaryContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstraint_expression(VerilogPrimeParser.Constraint_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstraint_set(VerilogPrimeParser.Constraint_setContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDist_list(VerilogPrimeParser.Dist_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDist_item(VerilogPrimeParser.Dist_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDist_weight(VerilogPrimeParser.Dist_weightContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstraint_prototype(VerilogPrimeParser.Constraint_prototypeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExtern_constraint_declaration(VerilogPrimeParser.Extern_constraint_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIdentifier_list(VerilogPrimeParser.Identifier_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPackage_item(VerilogPrimeParser.Package_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPackage_or_generate_item_declaration(VerilogPrimeParser.Package_or_generate_item_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAnonymous_program(VerilogPrimeParser.Anonymous_programContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAnonymous_program_item(VerilogPrimeParser.Anonymous_program_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLocal_parameter_declaration(VerilogPrimeParser.Local_parameter_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitParameter_declaration(VerilogPrimeParser.Parameter_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSpecparam_declaration(VerilogPrimeParser.Specparam_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInout_declaration(VerilogPrimeParser.Inout_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInput_declaration(VerilogPrimeParser.Input_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOutput_declaration(VerilogPrimeParser.Output_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInterface_port_declaration(VerilogPrimeParser.Interface_port_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRef_declaration(VerilogPrimeParser.Ref_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitData_declaration(VerilogPrimeParser.Data_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPackage_import_declaration(VerilogPrimeParser.Package_import_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPackage_import_item(VerilogPrimeParser.Package_import_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPackage_export_declaration(VerilogPrimeParser.Package_export_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGenvar_declaration(VerilogPrimeParser.Genvar_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNet_declaration(VerilogPrimeParser.Net_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitType_declaration(VerilogPrimeParser.Type_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLifetime(VerilogPrimeParser.LifetimeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCasting_type(VerilogPrimeParser.Casting_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitData_type(VerilogPrimeParser.Data_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitData_type_or_implicit(VerilogPrimeParser.Data_type_or_implicitContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitImplicit_data_type(VerilogPrimeParser.Implicit_data_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEnum_base_type(VerilogPrimeParser.Enum_base_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEnum_name_declaration(VerilogPrimeParser.Enum_name_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEnum_name_declaration_part1(VerilogPrimeParser.Enum_name_declaration_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_scope(VerilogPrimeParser.Class_scopeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_type(VerilogPrimeParser.Class_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_type_part1(VerilogPrimeParser.Class_type_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInteger_type(VerilogPrimeParser.Integer_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInteger_atom_type(VerilogPrimeParser.Integer_atom_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInteger_vector_type(VerilogPrimeParser.Integer_vector_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNon_integer_type(VerilogPrimeParser.Non_integer_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNet_type(VerilogPrimeParser.Net_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNet_port_type(VerilogPrimeParser.Net_port_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVariable_port_type(VerilogPrimeParser.Variable_port_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVar_data_type(VerilogPrimeParser.Var_data_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSigning(VerilogPrimeParser.SigningContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSimple_type(VerilogPrimeParser.Simple_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStruct_union_member(VerilogPrimeParser.Struct_union_memberContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitData_type_or_void(VerilogPrimeParser.Data_type_or_voidContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStruct_union(VerilogPrimeParser.Struct_unionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitType_reference(VerilogPrimeParser.Type_referenceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDrive_strength(VerilogPrimeParser.Drive_strengthContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStrength0(VerilogPrimeParser.Strength0Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStrength1(VerilogPrimeParser.Strength1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCharge_strength(VerilogPrimeParser.Charge_strengthContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDelay3(VerilogPrimeParser.Delay3Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDelay2(VerilogPrimeParser.Delay2Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDelay_value(VerilogPrimeParser.Delay_valueContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_defparam_assignments(VerilogPrimeParser.List_of_defparam_assignmentsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_genvar_identifiers(VerilogPrimeParser.List_of_genvar_identifiersContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_interface_identifiers(VerilogPrimeParser.List_of_interface_identifiersContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_interface_identifiers_part1(VerilogPrimeParser.List_of_interface_identifiers_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_param_assignments(VerilogPrimeParser.List_of_param_assignmentsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_port_identifiers(VerilogPrimeParser.List_of_port_identifiersContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_port_identifiers_part1(VerilogPrimeParser.List_of_port_identifiers_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_udp_port_identifiers(VerilogPrimeParser.List_of_udp_port_identifiersContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_specparam_assignments(VerilogPrimeParser.List_of_specparam_assignmentsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_tf_variable_identifiers(VerilogPrimeParser.List_of_tf_variable_identifiersContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_tf_variable_identifiers_part1(VerilogPrimeParser.List_of_tf_variable_identifiers_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_type_assignments(VerilogPrimeParser.List_of_type_assignmentsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_variable_decl_assignments(VerilogPrimeParser.List_of_variable_decl_assignmentsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_variable_identifiers(VerilogPrimeParser.List_of_variable_identifiersContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_variable_identifiers_part1(VerilogPrimeParser.List_of_variable_identifiers_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_variable_port_identifiers(VerilogPrimeParser.List_of_variable_port_identifiersContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_variable_port_identifiers_part1(VerilogPrimeParser.List_of_variable_port_identifiers_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_virtual_interface_decl(VerilogPrimeParser.List_of_virtual_interface_declContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_virtual_interface_decl_part1(VerilogPrimeParser.List_of_virtual_interface_decl_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDefparam_assignment(VerilogPrimeParser.Defparam_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_net_decl_assignments(VerilogPrimeParser.List_of_net_decl_assignmentsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNet_decl_assignment(VerilogPrimeParser.Net_decl_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitParam_assignment(VerilogPrimeParser.Param_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSpecparam_assignment(VerilogPrimeParser.Specparam_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitType_assignment(VerilogPrimeParser.Type_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPulse_control_specparam(VerilogPrimeParser.Pulse_control_specparamContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitError_limit_value(VerilogPrimeParser.Error_limit_valueContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitReject_limit_value(VerilogPrimeParser.Reject_limit_valueContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLimit_value(VerilogPrimeParser.Limit_valueContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVariable_decl_assignment(VerilogPrimeParser.Variable_decl_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_new(VerilogPrimeParser.Class_newContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDynamic_array_new(VerilogPrimeParser.Dynamic_array_newContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUnpacked_dimension(VerilogPrimeParser.Unpacked_dimensionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPacked_dimension(VerilogPrimeParser.Packed_dimensionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssociative_dimension(VerilogPrimeParser.Associative_dimensionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVariable_dimension(VerilogPrimeParser.Variable_dimensionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitQueue_dimension(VerilogPrimeParser.Queue_dimensionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUnsized_dimension(VerilogPrimeParser.Unsized_dimensionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFunction_data_type_or_implicit(VerilogPrimeParser.Function_data_type_or_implicitContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFunction_declaration(VerilogPrimeParser.Function_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFunction_body_declaration(VerilogPrimeParser.Function_body_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFunction_prototype(VerilogPrimeParser.Function_prototypeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDpi_import_export(VerilogPrimeParser.Dpi_import_exportContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDpi_spec_string(VerilogPrimeParser.Dpi_spec_stringContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDpi_function_import_property(VerilogPrimeParser.Dpi_function_import_propertyContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDpi_task_import_property(VerilogPrimeParser.Dpi_task_import_propertyContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDpi_function_proto(VerilogPrimeParser.Dpi_function_protoContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDpi_task_proto(VerilogPrimeParser.Dpi_task_protoContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTask_declaration(VerilogPrimeParser.Task_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTask_body_declaration(VerilogPrimeParser.Task_body_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTf_item_declaration(VerilogPrimeParser.Tf_item_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTf_port_list(VerilogPrimeParser.Tf_port_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTf_port_item(VerilogPrimeParser.Tf_port_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTf_port_direction(VerilogPrimeParser.Tf_port_directionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTf_port_declaration(VerilogPrimeParser.Tf_port_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTask_prototype(VerilogPrimeParser.Task_prototypeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBlock_item_declaration(VerilogPrimeParser.Block_item_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOverload_declaration(VerilogPrimeParser.Overload_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOverload_operator(VerilogPrimeParser.Overload_operatorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOverload_proto_formals(VerilogPrimeParser.Overload_proto_formalsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVirtual_interface_declaration(VerilogPrimeParser.Virtual_interface_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModport_declaration(VerilogPrimeParser.Modport_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModport_item(VerilogPrimeParser.Modport_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModport_ports_declaration(VerilogPrimeParser.Modport_ports_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModport_clocking_declaration(VerilogPrimeParser.Modport_clocking_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModport_simple_ports_declaration(VerilogPrimeParser.Modport_simple_ports_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModport_simple_port(VerilogPrimeParser.Modport_simple_portContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModport_tf_ports_declaration(VerilogPrimeParser.Modport_tf_ports_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModport_tf_port(VerilogPrimeParser.Modport_tf_portContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitImport_export(VerilogPrimeParser.Import_exportContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConcurrent_assertion_item(VerilogPrimeParser.Concurrent_assertion_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConcurrent_assertion_statement(VerilogPrimeParser.Concurrent_assertion_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssert_property_statement(VerilogPrimeParser.Assert_property_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssume_property_statement(VerilogPrimeParser.Assume_property_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCover_property_statement(VerilogPrimeParser.Cover_property_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpect_property_statement(VerilogPrimeParser.Expect_property_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCover_sequence_statement(VerilogPrimeParser.Cover_sequence_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRestrict_property_statement(VerilogPrimeParser.Restrict_property_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_instance(VerilogPrimeParser.Property_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_list_of_arguments(VerilogPrimeParser.Property_list_of_argumentsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_list_of_arguments_part1(VerilogPrimeParser.Property_list_of_arguments_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_list_of_arguments_part2(VerilogPrimeParser.Property_list_of_arguments_part2Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_actual_arg(VerilogPrimeParser.Property_actual_argContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssertion_item_declaration(VerilogPrimeParser.Assertion_item_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_declaration(VerilogPrimeParser.Property_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_port_list(VerilogPrimeParser.Property_port_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_port_item(VerilogPrimeParser.Property_port_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_lvar_port_direction(VerilogPrimeParser.Property_lvar_port_directionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_formal_type(VerilogPrimeParser.Property_formal_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_spec(VerilogPrimeParser.Property_specContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_statement_spec(VerilogPrimeParser.Property_statement_specContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_statement(VerilogPrimeParser.Property_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_case_item(VerilogPrimeParser.Property_case_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_expr(VerilogPrimeParser.Property_exprContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_declaration(VerilogPrimeParser.Sequence_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_port_list(VerilogPrimeParser.Sequence_port_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_port_item(VerilogPrimeParser.Sequence_port_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_lvar_port_direction(VerilogPrimeParser.Sequence_lvar_port_directionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_formal_type(VerilogPrimeParser.Sequence_formal_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_expr(VerilogPrimeParser.Sequence_exprContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCycle_delay_range(VerilogPrimeParser.Cycle_delay_rangeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_method_call(VerilogPrimeParser.Sequence_method_callContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_match_item(VerilogPrimeParser.Sequence_match_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_instance(VerilogPrimeParser.Sequence_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_list_of_arguments(VerilogPrimeParser.Sequence_list_of_argumentsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_list_of_arguments_part1(VerilogPrimeParser.Sequence_list_of_arguments_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_list_of_arguments_part2(VerilogPrimeParser.Sequence_list_of_arguments_part2Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_actual_arg(VerilogPrimeParser.Sequence_actual_argContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBoolean_abbrev(VerilogPrimeParser.Boolean_abbrevContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_abbrev(VerilogPrimeParser.Sequence_abbrevContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConsecutive_repetition(VerilogPrimeParser.Consecutive_repetitionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNon_consecutive_repetition(VerilogPrimeParser.Non_consecutive_repetitionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGoto_repetition(VerilogPrimeParser.Goto_repetitionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_or_range_expression(VerilogPrimeParser.Const_or_range_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCycle_delay_const_range_expression(VerilogPrimeParser.Cycle_delay_const_range_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_or_dist(VerilogPrimeParser.Expression_or_distContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssertion_variable_declaration(VerilogPrimeParser.Assertion_variable_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLet_declaration(VerilogPrimeParser.Let_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLet_identifier(VerilogPrimeParser.Let_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLet_port_list(VerilogPrimeParser.Let_port_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLet_port_item(VerilogPrimeParser.Let_port_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLet_formal_type(VerilogPrimeParser.Let_formal_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLet_expression(VerilogPrimeParser.Let_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLet_list_of_arguments(VerilogPrimeParser.Let_list_of_argumentsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLet_list_of_arguments_part1(VerilogPrimeParser.Let_list_of_arguments_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLet_list_of_arguments_part2(VerilogPrimeParser.Let_list_of_arguments_part2Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLet_actual_arg(VerilogPrimeParser.Let_actual_argContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCovergroup_declaration(VerilogPrimeParser.Covergroup_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCoverage_spec_or_option(VerilogPrimeParser.Coverage_spec_or_optionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCoverage_option(VerilogPrimeParser.Coverage_optionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCoverage_spec(VerilogPrimeParser.Coverage_specContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCoverage_event(VerilogPrimeParser.Coverage_eventContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBlock_event_expression(VerilogPrimeParser.Block_event_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHierarchical_btf_identifier(VerilogPrimeParser.Hierarchical_btf_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCover_point(VerilogPrimeParser.Cover_pointContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBins_or_empty(VerilogPrimeParser.Bins_or_emptyContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBins_or_options(VerilogPrimeParser.Bins_or_optionsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBins_or_options_part1(VerilogPrimeParser.Bins_or_options_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBins_keyword(VerilogPrimeParser.Bins_keywordContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRange_list(VerilogPrimeParser.Range_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTrans_list(VerilogPrimeParser.Trans_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTrans_set(VerilogPrimeParser.Trans_setContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTrans_range_list(VerilogPrimeParser.Trans_range_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTrans_item(VerilogPrimeParser.Trans_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRepeat_range(VerilogPrimeParser.Repeat_rangeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCover_cross(VerilogPrimeParser.Cover_crossContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_coverpoints(VerilogPrimeParser.List_of_coverpointsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCross_item(VerilogPrimeParser.Cross_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSelect_bins_or_empty(VerilogPrimeParser.Select_bins_or_emptyContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBins_selection_or_option(VerilogPrimeParser.Bins_selection_or_optionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBins_selection(VerilogPrimeParser.Bins_selectionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSelect_expression(VerilogPrimeParser.Select_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSelect_expression_part1(VerilogPrimeParser.Select_expression_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSelect_condition(VerilogPrimeParser.Select_conditionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBins_expression(VerilogPrimeParser.Bins_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOpen_range_list(VerilogPrimeParser.Open_range_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOpen_value_range(VerilogPrimeParser.Open_value_rangeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGate_instantiation(VerilogPrimeParser.Gate_instantiationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCmos_switch_instance(VerilogPrimeParser.Cmos_switch_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEnable_gate_instance(VerilogPrimeParser.Enable_gate_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMos_switch_instance(VerilogPrimeParser.Mos_switch_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitN_input_gate_instance(VerilogPrimeParser.N_input_gate_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitN_output_gate_instance(VerilogPrimeParser.N_output_gate_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPass_switch_instance(VerilogPrimeParser.Pass_switch_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPass_enable_switch_instance(VerilogPrimeParser.Pass_enable_switch_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPull_gate_instance(VerilogPrimeParser.Pull_gate_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPulldown_strength(VerilogPrimeParser.Pulldown_strengthContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPullup_strength(VerilogPrimeParser.Pullup_strengthContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEnable_terminal(VerilogPrimeParser.Enable_terminalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInout_terminal(VerilogPrimeParser.Inout_terminalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInput_terminal(VerilogPrimeParser.Input_terminalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNcontrol_terminal(VerilogPrimeParser.Ncontrol_terminalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOutput_terminal(VerilogPrimeParser.Output_terminalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPcontrol_terminal(VerilogPrimeParser.Pcontrol_terminalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCmos_switchtype(VerilogPrimeParser.Cmos_switchtypeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEnable_gatetype(VerilogPrimeParser.Enable_gatetypeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMos_switchtype(VerilogPrimeParser.Mos_switchtypeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitN_input_gatetype(VerilogPrimeParser.N_input_gatetypeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitN_output_gatetype(VerilogPrimeParser.N_output_gatetypeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPass_en_switchtype(VerilogPrimeParser.Pass_en_switchtypeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPass_switchtype(VerilogPrimeParser.Pass_switchtypeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_instantiation(VerilogPrimeParser.Module_instantiationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitParameter_value_assignment(VerilogPrimeParser.Parameter_value_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_parameter_assignments(VerilogPrimeParser.List_of_parameter_assignmentsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOrdered_parameter_assignment(VerilogPrimeParser.Ordered_parameter_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNamed_parameter_assignment(VerilogPrimeParser.Named_parameter_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHierarchical_instance(VerilogPrimeParser.Hierarchical_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitName_of_instance(VerilogPrimeParser.Name_of_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_port_connections(VerilogPrimeParser.List_of_port_connectionsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOrdered_port_connection(VerilogPrimeParser.Ordered_port_connectionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNamed_port_connection(VerilogPrimeParser.Named_port_connectionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInterface_instantiation(VerilogPrimeParser.Interface_instantiationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProgram_instantiation(VerilogPrimeParser.Program_instantiationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitChecker_instantiation(VerilogPrimeParser.Checker_instantiationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_checker_port_connections(VerilogPrimeParser.List_of_checker_port_connectionsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOrdered_checker_port_connection(VerilogPrimeParser.Ordered_checker_port_connectionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNamed_checker_port_connection(VerilogPrimeParser.Named_checker_port_connectionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGenerate_region(VerilogPrimeParser.Generate_regionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLoop_generate_construct(VerilogPrimeParser.Loop_generate_constructContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGenvar_initialization(VerilogPrimeParser.Genvar_initializationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConditional_generate_construct(VerilogPrimeParser.Conditional_generate_constructContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIf_generate_construct(VerilogPrimeParser.If_generate_constructContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCase_generate_construct(VerilogPrimeParser.Case_generate_constructContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCase_generate_item(VerilogPrimeParser.Case_generate_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGenerate_block(VerilogPrimeParser.Generate_blockContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGenerate_block_part1(VerilogPrimeParser.Generate_block_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGenerate_block_part2(VerilogPrimeParser.Generate_block_part2Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGenerate_block_part3(VerilogPrimeParser.Generate_block_part3Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGenerate_item(VerilogPrimeParser.Generate_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_nonansi_declaration(VerilogPrimeParser.Udp_nonansi_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGenvar_iteration(VerilogPrimeParser.Genvar_iterationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_ansi_declaration(VerilogPrimeParser.Udp_ansi_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_declaration(VerilogPrimeParser.Udp_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_port_list(VerilogPrimeParser.Udp_port_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_declaration_port_list(VerilogPrimeParser.Udp_declaration_port_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_port_declaration(VerilogPrimeParser.Udp_port_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_output_declaration(VerilogPrimeParser.Udp_output_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_input_declaration(VerilogPrimeParser.Udp_input_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_reg_declaration(VerilogPrimeParser.Udp_reg_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_body(VerilogPrimeParser.Udp_bodyContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCombinational_body(VerilogPrimeParser.Combinational_bodyContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCombinational_entry(VerilogPrimeParser.Combinational_entryContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequential_body(VerilogPrimeParser.Sequential_bodyContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_initial_statement(VerilogPrimeParser.Udp_initial_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInit_val(VerilogPrimeParser.Init_valContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequential_entry(VerilogPrimeParser.Sequential_entryContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSeq_input_list(VerilogPrimeParser.Seq_input_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLevel_input_list(VerilogPrimeParser.Level_input_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEdge_input_list(VerilogPrimeParser.Edge_input_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEdge_input_list_part1(VerilogPrimeParser.Edge_input_list_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEdge_indicator(VerilogPrimeParser.Edge_indicatorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCurrent_state(VerilogPrimeParser.Current_stateContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNext_state(VerilogPrimeParser.Next_stateContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOutput_symbol(VerilogPrimeParser.Output_symbolContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLevel_symbol(VerilogPrimeParser.Level_symbolContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEdge_symbol(VerilogPrimeParser.Edge_symbolContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_instantiation(VerilogPrimeParser.Udp_instantiationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_instance(VerilogPrimeParser.Udp_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitContinuous_assign(VerilogPrimeParser.Continuous_assignContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_net_assignments(VerilogPrimeParser.List_of_net_assignmentsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_variable_assignments(VerilogPrimeParser.List_of_variable_assignmentsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNet_alias(VerilogPrimeParser.Net_aliasContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNet_assignment(VerilogPrimeParser.Net_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInitial_construct(VerilogPrimeParser.Initial_constructContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAlways_construct(VerilogPrimeParser.Always_constructContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAlways_keyword(VerilogPrimeParser.Always_keywordContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFinal_construct(VerilogPrimeParser.Final_constructContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBlocking_assignment(VerilogPrimeParser.Blocking_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOperator_assignment(VerilogPrimeParser.Operator_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssignment_operator(VerilogPrimeParser.Assignment_operatorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNonblocking_assignment(VerilogPrimeParser.Nonblocking_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProcedural_continuous_assignment(VerilogPrimeParser.Procedural_continuous_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAction_block(VerilogPrimeParser.Action_blockContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSeq_block(VerilogPrimeParser.Seq_blockContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSeq_block_part1(VerilogPrimeParser.Seq_block_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPar_block(VerilogPrimeParser.Par_blockContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPar_block_part1(VerilogPrimeParser.Par_block_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitJoin_keyword(VerilogPrimeParser.Join_keywordContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStatement_or_null(VerilogPrimeParser.Statement_or_nullContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStatement(VerilogPrimeParser.StatementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStatement_item(VerilogPrimeParser.Statement_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFunction_statement(VerilogPrimeParser.Function_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFunction_statement_or_null(VerilogPrimeParser.Function_statement_or_nullContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVariable_identifier_list(VerilogPrimeParser.Variable_identifier_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProcedural_timing_control_statement(VerilogPrimeParser.Procedural_timing_control_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDelay_or_event_control(VerilogPrimeParser.Delay_or_event_controlContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDelay_control(VerilogPrimeParser.Delay_controlContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEvent_control(VerilogPrimeParser.Event_controlContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEvent_expression(VerilogPrimeParser.Event_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProcedural_timing_control(VerilogPrimeParser.Procedural_timing_controlContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitJump_statement(VerilogPrimeParser.Jump_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWait_statement(VerilogPrimeParser.Wait_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEvent_trigger(VerilogPrimeParser.Event_triggerContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDisable_statement(VerilogPrimeParser.Disable_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConditional_statement(VerilogPrimeParser.Conditional_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUnique_priority(VerilogPrimeParser.Unique_priorityContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCase_statement(VerilogPrimeParser.Case_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCase_keyword(VerilogPrimeParser.Case_keywordContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCase_expression(VerilogPrimeParser.Case_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCase_item(VerilogPrimeParser.Case_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCase_pattern_item(VerilogPrimeParser.Case_pattern_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCase_inside_item(VerilogPrimeParser.Case_inside_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCase_item_expression(VerilogPrimeParser.Case_item_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRandcase_statement(VerilogPrimeParser.Randcase_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRandcase_item(VerilogPrimeParser.Randcase_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPattern(VerilogPrimeParser.PatternContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssignment_pattern(VerilogPrimeParser.Assignment_patternContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStructure_pattern_key(VerilogPrimeParser.Structure_pattern_keyContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitArray_pattern_key(VerilogPrimeParser.Array_pattern_keyContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssignment_pattern_key(VerilogPrimeParser.Assignment_pattern_keyContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVariable_assignment(VerilogPrimeParser.Variable_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssignment_pattern_expression(VerilogPrimeParser.Assignment_pattern_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssignment_pattern_expression_type(VerilogPrimeParser.Assignment_pattern_expression_typeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_assignment_pattern_expression(VerilogPrimeParser.Constant_assignment_pattern_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssignment_pattern_net_lvalue(VerilogPrimeParser.Assignment_pattern_net_lvalueContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssignment_pattern_variable_lvalue(VerilogPrimeParser.Assignment_pattern_variable_lvalueContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLoop_statement(VerilogPrimeParser.Loop_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFor_initialization(VerilogPrimeParser.For_initializationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFor_variable_declaration(VerilogPrimeParser.For_variable_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFor_step(VerilogPrimeParser.For_stepContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFor_step_assignment(VerilogPrimeParser.For_step_assignmentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLoop_variables(VerilogPrimeParser.Loop_variablesContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLoop_variables_part1(VerilogPrimeParser.Loop_variables_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSubroutine_call_statement(VerilogPrimeParser.Subroutine_call_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssertion_item(VerilogPrimeParser.Assertion_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDeferred_immediate_assertion_item(VerilogPrimeParser.Deferred_immediate_assertion_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProcedural_assertion_statement(VerilogPrimeParser.Procedural_assertion_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitImmediate_assertion_statement(VerilogPrimeParser.Immediate_assertion_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSimple_immediate_assertion_statement(VerilogPrimeParser.Simple_immediate_assertion_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSimple_immediate_assert_statement(VerilogPrimeParser.Simple_immediate_assert_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSimple_immediate_assume_statement(VerilogPrimeParser.Simple_immediate_assume_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSimple_immediate_cover_statement(VerilogPrimeParser.Simple_immediate_cover_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDeferred_immediate_assertion_statement(VerilogPrimeParser.Deferred_immediate_assertion_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDeferred_immediate_assert_statement(VerilogPrimeParser.Deferred_immediate_assert_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDeferred_immediate_assume_statement(VerilogPrimeParser.Deferred_immediate_assume_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDeferred_immediate_cover_statement(VerilogPrimeParser.Deferred_immediate_cover_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClocking_declaration(VerilogPrimeParser.Clocking_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClocking_declaration_part1(VerilogPrimeParser.Clocking_declaration_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClocking_event(VerilogPrimeParser.Clocking_eventContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClocking_item(VerilogPrimeParser.Clocking_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDefault_skew(VerilogPrimeParser.Default_skewContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClocking_direction(VerilogPrimeParser.Clocking_directionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClocking_direction_part1(VerilogPrimeParser.Clocking_direction_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_clocking_decl_assign(VerilogPrimeParser.List_of_clocking_decl_assignContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClocking_decl_assign(VerilogPrimeParser.Clocking_decl_assignContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClocking_skew(VerilogPrimeParser.Clocking_skewContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClocking_drive(VerilogPrimeParser.Clocking_driveContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCycle_delay(VerilogPrimeParser.Cycle_delayContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClockvar(VerilogPrimeParser.ClockvarContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClockvar_expression(VerilogPrimeParser.Clockvar_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRandsequence_statement(VerilogPrimeParser.Randsequence_statementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProduction(VerilogPrimeParser.ProductionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRs_rule(VerilogPrimeParser.Rs_ruleContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRs_production_list(VerilogPrimeParser.Rs_production_listContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWeight_specification(VerilogPrimeParser.Weight_specificationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRs_code_block(VerilogPrimeParser.Rs_code_blockContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRs_prod(VerilogPrimeParser.Rs_prodContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProduction_item(VerilogPrimeParser.Production_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRs_if_else(VerilogPrimeParser.Rs_if_elseContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRs_repeat(VerilogPrimeParser.Rs_repeatContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRs_case(VerilogPrimeParser.Rs_caseContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRs_case_item(VerilogPrimeParser.Rs_case_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSpecify_block(VerilogPrimeParser.Specify_blockContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSpecify_item(VerilogPrimeParser.Specify_itemContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPulsestyle_declaration(VerilogPrimeParser.Pulsestyle_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitShowcancelled_declaration(VerilogPrimeParser.Showcancelled_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPath_declaration(VerilogPrimeParser.Path_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSimple_path_declaration(VerilogPrimeParser.Simple_path_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitParallel_path_description(VerilogPrimeParser.Parallel_path_descriptionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFull_path_description(VerilogPrimeParser.Full_path_descriptionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_path_inputs(VerilogPrimeParser.List_of_path_inputsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_path_outputs(VerilogPrimeParser.List_of_path_outputsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSpecify_input_terminal_descriptor(VerilogPrimeParser.Specify_input_terminal_descriptorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSpecify_output_terminal_descriptor(VerilogPrimeParser.Specify_output_terminal_descriptorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInput_identifier(VerilogPrimeParser.Input_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOutput_identifier(VerilogPrimeParser.Output_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPath_delay_value(VerilogPrimeParser.Path_delay_valueContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_path_delay_expressions(VerilogPrimeParser.List_of_path_delay_expressionsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitT_path_delay_expression(VerilogPrimeParser.T_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTrise_path_delay_expression(VerilogPrimeParser.Trise_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTfall_path_delay_expression(VerilogPrimeParser.Tfall_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTz_path_delay_expression(VerilogPrimeParser.Tz_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitT01_path_delay_expression(VerilogPrimeParser.T01_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitT10_path_delay_expression(VerilogPrimeParser.T10_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitT0z_path_delay_expression(VerilogPrimeParser.T0z_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTz1_path_delay_expression(VerilogPrimeParser.Tz1_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitT1z_path_delay_expression(VerilogPrimeParser.T1z_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTz0_path_delay_expression(VerilogPrimeParser.Tz0_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitT0x_path_delay_expression(VerilogPrimeParser.T0x_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTx1_path_delay_expression(VerilogPrimeParser.Tx1_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitT1x_path_delay_expression(VerilogPrimeParser.T1x_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTx0_path_delay_expression(VerilogPrimeParser.Tx0_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTxz_path_delay_expression(VerilogPrimeParser.Txz_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTzx_path_delay_expression(VerilogPrimeParser.Tzx_path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPath_delay_expression(VerilogPrimeParser.Path_delay_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEdge_sensitive_path_declaration(VerilogPrimeParser.Edge_sensitive_path_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitParallel_edge_sensitive_path_description(VerilogPrimeParser.Parallel_edge_sensitive_path_descriptionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFull_edge_sensitive_path_description(VerilogPrimeParser.Full_edge_sensitive_path_descriptionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitData_source_expression(VerilogPrimeParser.Data_source_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEdge_identifier(VerilogPrimeParser.Edge_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitState_dependent_path_declaration(VerilogPrimeParser.State_dependent_path_declarationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPolarity_operator(VerilogPrimeParser.Polarity_operatorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSystem_timing_check(VerilogPrimeParser.System_timing_checkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSetup_timing_check(VerilogPrimeParser.Setup_timing_checkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHold_timing_check(VerilogPrimeParser.Hold_timing_checkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSetuphold_timing_check(VerilogPrimeParser.Setuphold_timing_checkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRecovery_timing_check(VerilogPrimeParser.Recovery_timing_checkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRemoval_timing_check(VerilogPrimeParser.Removal_timing_checkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRecrem_timing_check(VerilogPrimeParser.Recrem_timing_checkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSkew_timing_check(VerilogPrimeParser.Skew_timing_checkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTimeskew_timing_check(VerilogPrimeParser.Timeskew_timing_checkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFullskew_timing_check(VerilogPrimeParser.Fullskew_timing_checkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPeriod_timing_check(VerilogPrimeParser.Period_timing_checkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWidth_timing_check(VerilogPrimeParser.Width_timing_checkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNochange_timing_check(VerilogPrimeParser.Nochange_timing_checkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTimecheck_condition(VerilogPrimeParser.Timecheck_conditionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitControlled_reference_event(VerilogPrimeParser.Controlled_reference_eventContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitData_event(VerilogPrimeParser.Data_eventContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDelayed_data(VerilogPrimeParser.Delayed_dataContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDelayed_reference(VerilogPrimeParser.Delayed_referenceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEnd_edge_offset(VerilogPrimeParser.End_edge_offsetContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEvent_based_flag(VerilogPrimeParser.Event_based_flagContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNotifier(VerilogPrimeParser.NotifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitReference_event(VerilogPrimeParser.Reference_eventContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRemain_active_flag(VerilogPrimeParser.Remain_active_flagContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTimestamp_condition(VerilogPrimeParser.Timestamp_conditionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStart_edge_offset(VerilogPrimeParser.Start_edge_offsetContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitThreshold(VerilogPrimeParser.ThresholdContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTiming_check_limit(VerilogPrimeParser.Timing_check_limitContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTiming_check_event(VerilogPrimeParser.Timing_check_eventContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitControlled_timing_check_event(VerilogPrimeParser.Controlled_timing_check_eventContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTiming_check_event_control(VerilogPrimeParser.Timing_check_event_controlContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSpecify_terminal_descriptor(VerilogPrimeParser.Specify_terminal_descriptorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEdge_control_specifier(VerilogPrimeParser.Edge_control_specifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEdge_descriptor(VerilogPrimeParser.Edge_descriptorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTiming_check_condition(VerilogPrimeParser.Timing_check_conditionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitScalar_timing_check_condition(VerilogPrimeParser.Scalar_timing_check_conditionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitScalar_constant(VerilogPrimeParser.Scalar_constantContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConcatenation(VerilogPrimeParser.ConcatenationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_concatenation(VerilogPrimeParser.Constant_concatenationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_multiple_concatenation(VerilogPrimeParser.Constant_multiple_concatenationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_path_concatenation(VerilogPrimeParser.Module_path_concatenationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_path_multiple_concatenation(VerilogPrimeParser.Module_path_multiple_concatenationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMultiple_concatenation(VerilogPrimeParser.Multiple_concatenationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStreaming_concatenation(VerilogPrimeParser.Streaming_concatenationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStream_operator(VerilogPrimeParser.Stream_operatorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSlice_size(VerilogPrimeParser.Slice_sizeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStream_concatenation(VerilogPrimeParser.Stream_concatenationContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStream_expression(VerilogPrimeParser.Stream_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitArray_range_expression(VerilogPrimeParser.Array_range_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEmpty_queue(VerilogPrimeParser.Empty_queueContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_function_call(VerilogPrimeParser.Constant_function_callContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTf_call(VerilogPrimeParser.Tf_callContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSystem_tf_call(VerilogPrimeParser.System_tf_callContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSubroutine_call(VerilogPrimeParser.Subroutine_callContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFunction_subroutine_call(VerilogPrimeParser.Function_subroutine_callContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_arguments(VerilogPrimeParser.List_of_argumentsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_arguments_part1(VerilogPrimeParser.List_of_arguments_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitList_of_arguments_part2(VerilogPrimeParser.List_of_arguments_part2Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMethod_call(VerilogPrimeParser.Method_callContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMethod_call_body(VerilogPrimeParser.Method_call_bodyContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBuilt_in_method_call(VerilogPrimeParser.Built_in_method_callContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitArray_manipulation_call(VerilogPrimeParser.Array_manipulation_callContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRandomize_call(VerilogPrimeParser.Randomize_callContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMethod_call_root(VerilogPrimeParser.Method_call_rootContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitArray_method_name(VerilogPrimeParser.Array_method_nameContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInc_or_dec_expression(VerilogPrimeParser.Inc_or_dec_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInc_or_dec_expression_part1(VerilogPrimeParser.Inc_or_dec_expression_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInc_or_dec_expression_part2(VerilogPrimeParser.Inc_or_dec_expression_part2Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_binary_and(VerilogPrimeParser.Const_expr_binary_andContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_mutl(VerilogPrimeParser.Const_expr_mutlContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_add(VerilogPrimeParser.Const_expr_addContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_equality(VerilogPrimeParser.Const_expr_equalityContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_comp(VerilogPrimeParser.Const_expr_compContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_log_or(VerilogPrimeParser.Const_expr_log_orContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_binary_or(VerilogPrimeParser.Const_expr_binary_orContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_only_primary(VerilogPrimeParser.Const_expr_only_primaryContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_binary_xor(VerilogPrimeParser.Const_expr_binary_xorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_log_and(VerilogPrimeParser.Const_expr_log_andContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_shift(VerilogPrimeParser.Const_expr_shiftContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_st_st(VerilogPrimeParser.Const_expr_st_stContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_conditional(VerilogPrimeParser.Const_expr_conditionalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_expr_unary_op(VerilogPrimeParser.Const_expr_unary_opContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_mintypmax_expression(VerilogPrimeParser.Constant_mintypmax_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_param_expression(VerilogPrimeParser.Constant_param_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitParam_expression(VerilogPrimeParser.Param_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_range_expression(VerilogPrimeParser.Constant_range_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_part_select_range(VerilogPrimeParser.Constant_part_select_rangeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_range(VerilogPrimeParser.Constant_rangeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_indexed_range(VerilogPrimeParser.Constant_indexed_rangeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpr_(VerilogPrimeParser.Expr_Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_binary_or(VerilogPrimeParser.Expression_binary_orContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_binary_xor(VerilogPrimeParser.Expression_binary_xorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_add(VerilogPrimeParser.Expression_addContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_log_or(VerilogPrimeParser.Expression_log_orContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_only_primary(VerilogPrimeParser.Expression_only_primaryContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_log_and(VerilogPrimeParser.Expression_log_andContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_inc_or_dec(VerilogPrimeParser.Expression_inc_or_decContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_tagged_union(VerilogPrimeParser.Expression_tagged_unionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_conditional_exp(VerilogPrimeParser.Expression_conditional_expContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_comp(VerilogPrimeParser.Expression_compContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_inside_exp(VerilogPrimeParser.Expression_inside_expContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_mult(VerilogPrimeParser.Expression_multContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_binary_and(VerilogPrimeParser.Expression_binary_andContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_equality(VerilogPrimeParser.Expression_equalityContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_shift(VerilogPrimeParser.Expression_shiftContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_op_assign(VerilogPrimeParser.Expression_op_assignContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_st_st(VerilogPrimeParser.Expression_st_stContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpression_unary_op(VerilogPrimeParser.Expression_unary_opContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMatches_pattern(VerilogPrimeParser.Matches_patternContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTagged_union_expression(VerilogPrimeParser.Tagged_union_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitValue_range(VerilogPrimeParser.Value_rangeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMintypmax_expression(VerilogPrimeParser.Mintypmax_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_path_expression(VerilogPrimeParser.Module_path_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_path_conditional_expression(VerilogPrimeParser.Module_path_conditional_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_path_binary_expression(VerilogPrimeParser.Module_path_binary_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_path_unary_expression(VerilogPrimeParser.Module_path_unary_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_path_mintypmax_expression(VerilogPrimeParser.Module_path_mintypmax_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPart_select_range(VerilogPrimeParser.Part_select_rangeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIndexed_range(VerilogPrimeParser.Indexed_rangeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGenvar_expression(VerilogPrimeParser.Genvar_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_primary(VerilogPrimeParser.Constant_primaryContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_path_primary(VerilogPrimeParser.Module_path_primaryContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPrimary_no_function_call(VerilogPrimeParser.Primary_no_function_callContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPrimary(VerilogPrimeParser.PrimaryContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_qualifier(VerilogPrimeParser.Class_qualifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRange_expression(VerilogPrimeParser.Range_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPrimary_literal(VerilogPrimeParser.Primary_literalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTime_literal(VerilogPrimeParser.Time_literalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitImplicit_class_handle(VerilogPrimeParser.Implicit_class_handleContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBit_select(VerilogPrimeParser.Bit_selectContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSelect(VerilogPrimeParser.SelectContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNonrange_select(VerilogPrimeParser.Nonrange_selectContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_bit_select(VerilogPrimeParser.Constant_bit_selectContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_select(VerilogPrimeParser.Constant_selectContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_cast(VerilogPrimeParser.Constant_castContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstant_let_expression(VerilogPrimeParser.Constant_let_expressionContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCast(VerilogPrimeParser.CastContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNet_lvalue(VerilogPrimeParser.Net_lvalueContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVariable_lvalue(VerilogPrimeParser.Variable_lvalueContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNonrange_variable_lvalue(VerilogPrimeParser.Nonrange_variable_lvalueContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUnary_operator(VerilogPrimeParser.Unary_operatorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBinary_operator(VerilogPrimeParser.Binary_operatorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInc_or_dec_operator(VerilogPrimeParser.Inc_or_dec_operatorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIncrement(VerilogPrimeParser.IncrementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDecrement(VerilogPrimeParser.DecrementContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUnary_module_path_operator(VerilogPrimeParser.Unary_module_path_operatorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBinary_module_path_operator(VerilogPrimeParser.Binary_module_path_operatorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUnbased_unsized_literal(VerilogPrimeParser.Unbased_unsized_literalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitString_literal(VerilogPrimeParser.String_literalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAttribute_instance(VerilogPrimeParser.Attribute_instanceContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAttr_spec(VerilogPrimeParser.Attr_specContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAttr_name(VerilogPrimeParser.Attr_nameContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitArray_identifier(VerilogPrimeParser.Array_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBlock_identifier(VerilogPrimeParser.Block_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBin_identifier(VerilogPrimeParser.Bin_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitC_identifier(VerilogPrimeParser.C_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCell_identifier(VerilogPrimeParser.Cell_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitChecker_identifier(VerilogPrimeParser.Checker_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_identifier(VerilogPrimeParser.Class_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClass_variable_identifier(VerilogPrimeParser.Class_variable_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClocking_identifier(VerilogPrimeParser.Clocking_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConfig_identifier(VerilogPrimeParser.Config_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConst_identifier(VerilogPrimeParser.Const_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstraint_identifier(VerilogPrimeParser.Constraint_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCovergroup_identifier(VerilogPrimeParser.Covergroup_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCovergroup_variable_identifier(VerilogPrimeParser.Covergroup_variable_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCover_point_identifier(VerilogPrimeParser.Cover_point_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCross_identifier(VerilogPrimeParser.Cross_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDynamic_array_variable_identifier(VerilogPrimeParser.Dynamic_array_variable_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEnum_identifier(VerilogPrimeParser.Enum_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEscaped_identifier(VerilogPrimeParser.Escaped_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFormal_identifier(VerilogPrimeParser.Formal_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFunction_identifier(VerilogPrimeParser.Function_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGenerate_block_identifier(VerilogPrimeParser.Generate_block_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGenvar_identifier(VerilogPrimeParser.Genvar_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHierarchical_array_identifier(VerilogPrimeParser.Hierarchical_array_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHierarchical_block_identifier(VerilogPrimeParser.Hierarchical_block_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHierarchical_event_identifier(VerilogPrimeParser.Hierarchical_event_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHierarchical_identifier(VerilogPrimeParser.Hierarchical_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHierarchical_net_identifier(VerilogPrimeParser.Hierarchical_net_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHierarchical_parameter_identifier(VerilogPrimeParser.Hierarchical_parameter_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHierarchical_property_identifier(VerilogPrimeParser.Hierarchical_property_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHierarchical_sequence_identifier(VerilogPrimeParser.Hierarchical_sequence_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHierarchical_task_identifier(VerilogPrimeParser.Hierarchical_task_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHierarchical_tf_identifier(VerilogPrimeParser.Hierarchical_tf_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHierarchical_variable_identifier(VerilogPrimeParser.Hierarchical_variable_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIdentifier(VerilogPrimeParser.IdentifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIndex_variable_identifier(VerilogPrimeParser.Index_variable_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInterface_identifier(VerilogPrimeParser.Interface_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInterface_instance_identifier(VerilogPrimeParser.Interface_instance_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInout_port_identifier(VerilogPrimeParser.Inout_port_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInput_port_identifier(VerilogPrimeParser.Input_port_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInstance_identifier(VerilogPrimeParser.Instance_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLibrary_identifier(VerilogPrimeParser.Library_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMember_identifier(VerilogPrimeParser.Member_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMethod_identifier(VerilogPrimeParser.Method_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModport_identifier(VerilogPrimeParser.Modport_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModule_identifier(VerilogPrimeParser.Module_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNet_identifier(VerilogPrimeParser.Net_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOutput_port_identifier(VerilogPrimeParser.Output_port_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPackage_identifier(VerilogPrimeParser.Package_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPackage_scope(VerilogPrimeParser.Package_scopeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitParameter_identifier(VerilogPrimeParser.Parameter_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPort_identifier(VerilogPrimeParser.Port_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProduction_identifier(VerilogPrimeParser.Production_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProgram_identifier(VerilogPrimeParser.Program_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProperty_identifier(VerilogPrimeParser.Property_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPs_class_identifier(VerilogPrimeParser.Ps_class_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPs_covergroup_identifier(VerilogPrimeParser.Ps_covergroup_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPs_identifier(VerilogPrimeParser.Ps_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPs_or_hierarchical_array_identifier(VerilogPrimeParser.Ps_or_hierarchical_array_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPs_or_hierarchical_array_identifier_part1(VerilogPrimeParser.Ps_or_hierarchical_array_identifier_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPs_or_hierarchical_net_identifier(VerilogPrimeParser.Ps_or_hierarchical_net_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPs_or_hierarchical_property_identifier(VerilogPrimeParser.Ps_or_hierarchical_property_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPs_or_hierarchical_sequence_identifier(VerilogPrimeParser.Ps_or_hierarchical_sequence_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPs_or_hierarchical_tf_identifier(VerilogPrimeParser.Ps_or_hierarchical_tf_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPs_parameter_identifier(VerilogPrimeParser.Ps_parameter_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPs_parameter_identifier_part1(VerilogPrimeParser.Ps_parameter_identifier_part1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPs_type_identifier(VerilogPrimeParser.Ps_type_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequence_identifier(VerilogPrimeParser.Sequence_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSignal_identifier(VerilogPrimeParser.Signal_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSimple_identifier(VerilogPrimeParser.Simple_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSpecparam_identifier(VerilogPrimeParser.Specparam_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSystem_tf_identifier(VerilogPrimeParser.System_tf_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTask_identifier(VerilogPrimeParser.Task_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTf_identifier(VerilogPrimeParser.Tf_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTerminal_identifier(VerilogPrimeParser.Terminal_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTopmodule_identifier(VerilogPrimeParser.Topmodule_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitType_identifier(VerilogPrimeParser.Type_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUdp_identifier(VerilogPrimeParser.Udp_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBins_identifier(VerilogPrimeParser.Bins_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVariable_identifier(VerilogPrimeParser.Variable_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNumber(VerilogPrimeParser.NumberContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEof(VerilogPrimeParser.EofContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndmodulestr(VerilogPrimeParser.EndmodulestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitColon(VerilogPrimeParser.ColonContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExternstr(VerilogPrimeParser.ExternstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSemi(VerilogPrimeParser.SemiContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModulestr(VerilogPrimeParser.ModulestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMacromodulestr(VerilogPrimeParser.MacromodulestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndinterfacestr(VerilogPrimeParser.EndinterfacestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInterfacestr(VerilogPrimeParser.InterfacestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLparen(VerilogPrimeParser.LparenContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDotstar(VerilogPrimeParser.DotstarContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRparen(VerilogPrimeParser.RparenContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndprogramstr(VerilogPrimeParser.EndprogramstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProgramstr(VerilogPrimeParser.ProgramstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCheckerstr(VerilogPrimeParser.CheckerstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndcheckerstr(VerilogPrimeParser.EndcheckerstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVirtualstr(VerilogPrimeParser.VirtualstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClassstr(VerilogPrimeParser.ClassstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExtendsstr(VerilogPrimeParser.ExtendsstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndclassstr(VerilogPrimeParser.EndclassstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPackagestr(VerilogPrimeParser.PackagestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndpackagestr(VerilogPrimeParser.EndpackagestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTimeunit(VerilogPrimeParser.TimeunitContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDiv(VerilogPrimeParser.DivContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHash(VerilogPrimeParser.HashContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitComma(VerilogPrimeParser.CommaContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTypestr(VerilogPrimeParser.TypestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDot(VerilogPrimeParser.DotContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLcurl(VerilogPrimeParser.LcurlContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRcurl(VerilogPrimeParser.RcurlContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInputstr(VerilogPrimeParser.InputstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOutputstr(VerilogPrimeParser.OutputstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInoutstr(VerilogPrimeParser.InoutstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRefstr(VerilogPrimeParser.RefstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssign(VerilogPrimeParser.AssignContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarfatalstr(VerilogPrimeParser.DollarfatalstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarerrorstr(VerilogPrimeParser.DollarerrorstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarwarningstr(VerilogPrimeParser.DollarwarningstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarinfostr(VerilogPrimeParser.DollarinfostrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDefparamstr(VerilogPrimeParser.DefparamstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBindstr(VerilogPrimeParser.BindstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConfigstr(VerilogPrimeParser.ConfigstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndconfigstr(VerilogPrimeParser.EndconfigstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDesignstr(VerilogPrimeParser.DesignstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDefaultstr(VerilogPrimeParser.DefaultstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInstancestr(VerilogPrimeParser.InstancestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCellstr(VerilogPrimeParser.CellstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLibliststr(VerilogPrimeParser.LibliststrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUsestr(VerilogPrimeParser.UsestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitClockingstr(VerilogPrimeParser.ClockingstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDisablestr(VerilogPrimeParser.DisablestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIffstr(VerilogPrimeParser.IffstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitForkjoinstr(VerilogPrimeParser.ForkjoinstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAlwaysstr(VerilogPrimeParser.AlwaysstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConststr(VerilogPrimeParser.ConststrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFunctionstr(VerilogPrimeParser.FunctionstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNewstr(VerilogPrimeParser.NewstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStaticstr(VerilogPrimeParser.StaticstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitProtectedstr(VerilogPrimeParser.ProtectedstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLocalstr(VerilogPrimeParser.LocalstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRandstr(VerilogPrimeParser.RandstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRandcstr(VerilogPrimeParser.RandcstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPurestr(VerilogPrimeParser.PurestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSuperstr(VerilogPrimeParser.SuperstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndfunctionstr(VerilogPrimeParser.EndfunctionstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitConstraintstr(VerilogPrimeParser.ConstraintstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSolvestr(VerilogPrimeParser.SolvestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBeforestr(VerilogPrimeParser.BeforestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDerive(VerilogPrimeParser.DeriveContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIfstr(VerilogPrimeParser.IfstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitElsestr(VerilogPrimeParser.ElsestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitForeachstr(VerilogPrimeParser.ForeachstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLbrack(VerilogPrimeParser.LbrackContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRbrack(VerilogPrimeParser.RbrackContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitColonequals(VerilogPrimeParser.ColonequalsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitColonslash(VerilogPrimeParser.ColonslashContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLocalparamstr(VerilogPrimeParser.LocalparamstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitParameterstr(VerilogPrimeParser.ParameterstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSpecparamstr(VerilogPrimeParser.SpecparamstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVarstr(VerilogPrimeParser.VarstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitImportstr(VerilogPrimeParser.ImportstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitColoncolon(VerilogPrimeParser.ColoncolonContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStar(VerilogPrimeParser.StarContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExport(VerilogPrimeParser.ExportContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStartcoloncolonstar(VerilogPrimeParser.StartcoloncolonstarContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGenvarstr(VerilogPrimeParser.GenvarstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVectoredstr(VerilogPrimeParser.VectoredstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitScalaredstr(VerilogPrimeParser.ScalaredstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTypedefstr(VerilogPrimeParser.TypedefstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEnumstr(VerilogPrimeParser.EnumstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStructstr(VerilogPrimeParser.StructstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUnionstr(VerilogPrimeParser.UnionstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAutomaticstr(VerilogPrimeParser.AutomaticstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStringstr(VerilogPrimeParser.StringstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPackedstr(VerilogPrimeParser.PackedstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitChandlestr(VerilogPrimeParser.ChandlestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEventstr(VerilogPrimeParser.EventstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitZero_or_one(VerilogPrimeParser.Zero_or_oneContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEdge_spec(VerilogPrimeParser.Edge_specContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDecimal_number(VerilogPrimeParser.Decimal_numberContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBytestr(VerilogPrimeParser.BytestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitShortintstr(VerilogPrimeParser.ShortintstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIntstr(VerilogPrimeParser.IntstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLongintstr(VerilogPrimeParser.LongintstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIntegerstr(VerilogPrimeParser.IntegerstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTimestr(VerilogPrimeParser.TimestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBitstr(VerilogPrimeParser.BitstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLogicstr(VerilogPrimeParser.LogicstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRegstr(VerilogPrimeParser.RegstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitShortreal(VerilogPrimeParser.ShortrealContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRealstr(VerilogPrimeParser.RealstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRealtimestr(VerilogPrimeParser.RealtimestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSupply0str(VerilogPrimeParser.Supply0strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSupply1str(VerilogPrimeParser.Supply1strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTristr(VerilogPrimeParser.TristrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTriandstr(VerilogPrimeParser.TriandstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTriorstr(VerilogPrimeParser.TriorstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTriregstr(VerilogPrimeParser.TriregstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTri0str(VerilogPrimeParser.Tri0strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTri1str(VerilogPrimeParser.Tri1strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUwirestr(VerilogPrimeParser.UwirestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWirestr(VerilogPrimeParser.WirestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWandstr(VerilogPrimeParser.WandstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWorstr(VerilogPrimeParser.WorstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSignedstr(VerilogPrimeParser.SignedstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUnsignedstr(VerilogPrimeParser.UnsignedstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitVoidstr(VerilogPrimeParser.VoidstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTaggedstr(VerilogPrimeParser.TaggedstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHighz1str(VerilogPrimeParser.Highz1strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHighz0str(VerilogPrimeParser.Highz0strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStrong0(VerilogPrimeParser.Strong0Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPull0str(VerilogPrimeParser.Pull0strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWeak0str(VerilogPrimeParser.Weak0strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStrong1(VerilogPrimeParser.Strong1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPull1str(VerilogPrimeParser.Pull1strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWeak1str(VerilogPrimeParser.Weak1strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSmallstr(VerilogPrimeParser.SmallstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMediumstr(VerilogPrimeParser.MediumstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLargestr(VerilogPrimeParser.LargestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitReal_number(VerilogPrimeParser.Real_numberContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOnestepstr(VerilogPrimeParser.OnestepstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPathpulsedollar(VerilogPrimeParser.PathpulsedollarContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollar(VerilogPrimeParser.DollarContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTaskstr(VerilogPrimeParser.TaskstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDpi_spec_ing2str(VerilogPrimeParser.Dpi_spec_ing2strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDpi_spec_ing1str(VerilogPrimeParser.Dpi_spec_ing1strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitContextstr(VerilogPrimeParser.ContextstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndtaskstr(VerilogPrimeParser.EndtaskstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPlus(VerilogPrimeParser.PlusContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMinus(VerilogPrimeParser.MinusContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStarstar(VerilogPrimeParser.StarstarContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModulo(VerilogPrimeParser.ModuloContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEquals(VerilogPrimeParser.EqualsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNot_equals(VerilogPrimeParser.Not_equalsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLt(VerilogPrimeParser.LtContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLe(VerilogPrimeParser.LeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGt(VerilogPrimeParser.GtContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGe(VerilogPrimeParser.GeContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitModportstr(VerilogPrimeParser.ModportstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssertstr(VerilogPrimeParser.AssertstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPropertystr(VerilogPrimeParser.PropertystrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssumestr(VerilogPrimeParser.AssumestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCoverstr(VerilogPrimeParser.CoverstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitExpectstr(VerilogPrimeParser.ExpectstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSequencestr(VerilogPrimeParser.SequencestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRestrictstr(VerilogPrimeParser.RestrictstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndpropertystr(VerilogPrimeParser.EndpropertystrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCasestr(VerilogPrimeParser.CasestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndcasestr(VerilogPrimeParser.EndcasestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNotstr(VerilogPrimeParser.NotstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOrstr(VerilogPrimeParser.OrstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAndstr(VerilogPrimeParser.AndstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOrderive(VerilogPrimeParser.OrderiveContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOrimplies(VerilogPrimeParser.OrimpliesContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndsequencestr(VerilogPrimeParser.EndsequencestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUntypedstr(VerilogPrimeParser.UntypedstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIntersectstr(VerilogPrimeParser.IntersectstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFirst_matchstr(VerilogPrimeParser.First_matchstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitThroughoutstr(VerilogPrimeParser.ThroughoutstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWithinstr(VerilogPrimeParser.WithinstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDouble_hash(VerilogPrimeParser.Double_hashContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDiststr(VerilogPrimeParser.DiststrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLetstr(VerilogPrimeParser.LetstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCovergroupstr(VerilogPrimeParser.CovergroupstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndgroupstr(VerilogPrimeParser.EndgroupstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOptiondot(VerilogPrimeParser.OptiondotContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitType_optiondot(VerilogPrimeParser.Type_optiondotContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWithstr(VerilogPrimeParser.WithstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSamplestr(VerilogPrimeParser.SamplestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAttheratelparen(VerilogPrimeParser.AttheratelparenContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBeginstr(VerilogPrimeParser.BeginstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndstr(VerilogPrimeParser.EndstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCoverpointstr(VerilogPrimeParser.CoverpointstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWildcardstr(VerilogPrimeParser.WildcardstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBinsstr(VerilogPrimeParser.BinsstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIllegal_binsstr(VerilogPrimeParser.Illegal_binsstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIgnore_binsstr(VerilogPrimeParser.Ignore_binsstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitImplies(VerilogPrimeParser.ImpliesContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCrossstr(VerilogPrimeParser.CrossstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNot(VerilogPrimeParser.NotContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLog_and(VerilogPrimeParser.Log_andContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLog_or(VerilogPrimeParser.Log_orContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBinsofstr(VerilogPrimeParser.BinsofstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPulldownstr(VerilogPrimeParser.PulldownstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPullupstr(VerilogPrimeParser.PullupstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCmosstr(VerilogPrimeParser.CmosstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRcmosstr(VerilogPrimeParser.RcmosstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBufif0str(VerilogPrimeParser.Bufif0strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBufif1str(VerilogPrimeParser.Bufif1strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNotif0str(VerilogPrimeParser.Notif0strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNotif1str(VerilogPrimeParser.Notif1strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNmosstr(VerilogPrimeParser.NmosstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPmos(VerilogPrimeParser.PmosContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRnmosstr(VerilogPrimeParser.RnmosstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRpmosstr(VerilogPrimeParser.RpmosstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNandstr(VerilogPrimeParser.NandstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNorstr(VerilogPrimeParser.NorstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitXorstrstr(VerilogPrimeParser.XorstrstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitXnorstr(VerilogPrimeParser.XnorstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBufstr(VerilogPrimeParser.BufstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTranif0str(VerilogPrimeParser.Tranif0strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTranif1str(VerilogPrimeParser.Tranif1strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRtranif1str(VerilogPrimeParser.Rtranif1strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRtranif0str(VerilogPrimeParser.Rtranif0strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTranstr(VerilogPrimeParser.TranstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRtranstr(VerilogPrimeParser.RtranstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGeneratestr(VerilogPrimeParser.GeneratestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndgeneratestr(VerilogPrimeParser.EndgeneratestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitForstr(VerilogPrimeParser.ForstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPrimitivestr(VerilogPrimeParser.PrimitivestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndprimitivestr(VerilogPrimeParser.EndprimitivestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTablestr(VerilogPrimeParser.TablestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndtablestr(VerilogPrimeParser.EndtablestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInitialstr(VerilogPrimeParser.InitialstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBinary_number(VerilogPrimeParser.Binary_numberContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitQuestinmark(VerilogPrimeParser.QuestinmarkContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitId(VerilogPrimeParser.IdContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAssignstrstr(VerilogPrimeParser.AssignstrstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAliasstr(VerilogPrimeParser.AliasstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAlways_combstr(VerilogPrimeParser.Always_combstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAlways_latchstr(VerilogPrimeParser.Always_latchstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAlways_ffstr(VerilogPrimeParser.Always_ffstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitFinalstr(VerilogPrimeParser.FinalstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPlusequals(VerilogPrimeParser.PlusequalsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMinusequals(VerilogPrimeParser.MinusequalsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStartequals(VerilogPrimeParser.StartequalsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSlashequals(VerilogPrimeParser.SlashequalsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPercentileequal(VerilogPrimeParser.PercentileequalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAndequals(VerilogPrimeParser.AndequalsContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOrequal(VerilogPrimeParser.OrequalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitXorequal(VerilogPrimeParser.XorequalContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLshift_assign(VerilogPrimeParser.Lshift_assignContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRshift_assign(VerilogPrimeParser.Rshift_assignContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUnsigned_lshift_assign(VerilogPrimeParser.Unsigned_lshift_assignContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUnsigned_rshift_assign(VerilogPrimeParser.Unsigned_rshift_assignContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDeassignstr(VerilogPrimeParser.DeassignstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitForcestr(VerilogPrimeParser.ForcestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitReleasestr(VerilogPrimeParser.ReleasestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitForkstr(VerilogPrimeParser.ForkstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitJoinstr(VerilogPrimeParser.JoinstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitJoin_anystr(VerilogPrimeParser.Join_anystrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitJoin_namestr(VerilogPrimeParser.Join_namestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRepeatstr(VerilogPrimeParser.RepeatstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAttherate(VerilogPrimeParser.AttherateContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAttheratestar(VerilogPrimeParser.AttheratestarContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLparenstarrparen(VerilogPrimeParser.LparenstarrparenContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitReturnstr(VerilogPrimeParser.ReturnstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitBreakstr(VerilogPrimeParser.BreakstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitContinuestr(VerilogPrimeParser.ContinuestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWaitstr(VerilogPrimeParser.WaitstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWait_orderstr(VerilogPrimeParser.Wait_orderstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDerivegt(VerilogPrimeParser.DerivegtContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUniquestr(VerilogPrimeParser.UniquestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitUnique0str(VerilogPrimeParser.Unique0strContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPrioritystr(VerilogPrimeParser.PrioritystrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMatchesstr(VerilogPrimeParser.MatchesstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitInsidestr(VerilogPrimeParser.InsidestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCasezstr(VerilogPrimeParser.CasezstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCasexstr(VerilogPrimeParser.CasexstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAndandand(VerilogPrimeParser.AndandandContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRandcasestr(VerilogPrimeParser.RandcasestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEscapelcurl(VerilogPrimeParser.EscapelcurlContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitForeverstr(VerilogPrimeParser.ForeverstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitWhilestr(VerilogPrimeParser.WhilestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDostr(VerilogPrimeParser.DostrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEscapequote(VerilogPrimeParser.EscapequoteContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHash_zero(VerilogPrimeParser.Hash_zeroContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndclockingstr(VerilogPrimeParser.EndclockingstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitGlobalstr(VerilogPrimeParser.GlobalstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRandsequencestr(VerilogPrimeParser.RandsequencestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOr(VerilogPrimeParser.OrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitSpecifystr(VerilogPrimeParser.SpecifystrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEndspecifystr(VerilogPrimeParser.EndspecifystrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPulsestyle_oneventstr(VerilogPrimeParser.Pulsestyle_oneventstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPulsestyle_ondetectstr(VerilogPrimeParser.Pulsestyle_ondetectstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitShowcancelledstr(VerilogPrimeParser.ShowcancelledstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNoshowcancelledstr(VerilogPrimeParser.NoshowcancelledstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStargt(VerilogPrimeParser.StargtContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPosedgestr(VerilogPrimeParser.PosedgestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNegedgestr(VerilogPrimeParser.NegedgestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEdgestr(VerilogPrimeParser.EdgestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitIfnonestr(VerilogPrimeParser.IfnonestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarsetupstr(VerilogPrimeParser.DollarsetupstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarholdstr(VerilogPrimeParser.DollarholdstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarsetupholdstr(VerilogPrimeParser.DollarsetupholdstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarrecoverystr(VerilogPrimeParser.DollarrecoverystrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarremovalstr(VerilogPrimeParser.DollarremovalstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarrecremstr(VerilogPrimeParser.DollarrecremstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarskewstr(VerilogPrimeParser.DollarskewstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollartimeskewstr(VerilogPrimeParser.DollartimeskewstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarfullskewstr(VerilogPrimeParser.DollarfullskewstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarperiodstr(VerilogPrimeParser.DollarperiodstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollaewidthstr(VerilogPrimeParser.DollaewidthstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarnochangestr(VerilogPrimeParser.DollarnochangestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitZ_or_x(VerilogPrimeParser.Z_or_xContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCompliment(VerilogPrimeParser.ComplimentContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCase_equality(VerilogPrimeParser.Case_equalityContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCase_inequality(VerilogPrimeParser.Case_inequalityContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRshift(VerilogPrimeParser.RshiftContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLshift(VerilogPrimeParser.LshiftContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPluscolon(VerilogPrimeParser.PluscolonContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitMinuscolon(VerilogPrimeParser.MinuscolonContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStdcoloncolon(VerilogPrimeParser.StdcoloncolonContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitRandomizestr(VerilogPrimeParser.RandomizestrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNullstr(VerilogPrimeParser.NullstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAlshift(VerilogPrimeParser.AlshiftContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitArshift(VerilogPrimeParser.ArshiftContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitCase_q(VerilogPrimeParser.Case_qContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNot_case_q(VerilogPrimeParser.Not_case_qContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitAnd(VerilogPrimeParser.AndContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitXor(VerilogPrimeParser.XorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitXnor(VerilogPrimeParser.XnorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitXorn(VerilogPrimeParser.XornContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitThisstr(VerilogPrimeParser.ThisstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLocalcoloncolon(VerilogPrimeParser.LocalcoloncolonContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTime_unit(VerilogPrimeParser.Time_unitContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNand(VerilogPrimeParser.NandContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitNor(VerilogPrimeParser.NorContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDderive(VerilogPrimeParser.DderiveContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitScalar_constant0(VerilogPrimeParser.Scalar_constant0Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitScalar_constant1(VerilogPrimeParser.Scalar_constant1Context ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitString(VerilogPrimeParser.StringContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitLparenstar(VerilogPrimeParser.LparenstarContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitStarrparen(VerilogPrimeParser.StarrparenContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitEsc_identifier(VerilogPrimeParser.Esc_identifierContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarrootstr(VerilogPrimeParser.DollarrootstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitDollarunitstr(VerilogPrimeParser.DollarunitstrContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitTf_id(VerilogPrimeParser.Tf_idContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitOctal_number(VerilogPrimeParser.Octal_numberContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitHex_number(VerilogPrimeParser.Hex_numberContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPragma_def(VerilogPrimeParser.Pragma_defContext ctx) {return ctx.extendedContext;}
	
	@Override public AbstractBaseExt visitPragma_text(VerilogPrimeParser.Pragma_textContext ctx) {return ctx.extendedContext;}
}

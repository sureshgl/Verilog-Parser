parser grammar VerilogPrimeParser;


@lexer::members {

    private boolean isPragma(){

        StringBuilder commentText = new StringBuilder();
        int ahead = 1;
        int next = _input.LA(ahead++);
        commentText.append((char)next);
        while(next != -1 && next != '\r' && next != '\n')
        {
            next = _input.LA(ahead++);
            commentText.append((char)next);
        }

        if(commentText.toString().trim().startsWith("pragma")) {
            return true;
        }
        else {
            // Let the lexer consume all the characters!
            for(int i = 0; i < commentText.length(); i++)
            {
                _input.consume();
            }
            return false;
        }
    }
}

@header{
    import com.proteus.cgen.verilogprime.ext.*;
}

options{
    tokenVocab=VerilogPrimeLexer;
}

source_text
locals [ Source_textContextExt extendedContext ]
:  timeunits_declaration?  description*  eof ;

description
locals [ DescriptionContextExt extendedContext ]
:  module_declaration 
|  udp_declaration 
|  interface_declaration 
|  program_declaration 
|  checker_declaration 
|  package_declaration 
|  attribute_instance* (  package_item  |  bind_directive  );

module_declaration
locals [ Module_declarationContextExt extendedContext ]
:  module_nonansi_header  timeunits_declaration?  module_item*  endmodulestr (  colon  module_identifier  )? 
|  module_ansi_header  timeunits_declaration?  non_port_module_item*  endmodulestr (  colon  module_identifier  )? 
|  externstr (  module_nonansi_header  |  module_ansi_header  );

module_nonansi_header
locals [ Module_nonansi_headerContextExt extendedContext ]
:  attribute_instance*  module_keyword  lifetime?  module_identifier (  package_import_declaration  )*  parameter_port_list?  list_of_ports  semi pragma_def? ;

module_ansi_header
locals [ Module_ansi_headerContextExt extendedContext ]
:  attribute_instance*  module_keyword  lifetime?  module_identifier (  package_import_declaration  )*  parameter_port_list?  list_of_port_declarations?  semi  pragma_def?;

module_keyword
locals [ Module_keywordContextExt extendedContext ]
:  modulestr 
|  macromodulestr ;

interface_declaration
locals [ Interface_declarationContextExt extendedContext ]
:  interface_nonansi_header  timeunits_declaration?  interface_item*  endinterfacestr (  colon  interface_identifier  )? 
|  interface_ansi_header  timeunits_declaration?  non_port_interface_item*  endinterfacestr (  colon  interface_identifier  )? 
|  attribute_instance*  interfacestr  interface_identifier  lparen  dotstar  rparen  semi  timeunits_declaration?  interface_item*  endinterfacestr (  colon  interface_identifier  )? 
|  externstr (  interface_nonansi_header  |  interface_ansi_header  );

interface_nonansi_header
locals [ Interface_nonansi_headerContextExt extendedContext ]
:  attribute_instance*  interfacestr  lifetime?  interface_identifier (  package_import_declaration  )*  parameter_port_list?  list_of_ports  semi ;

interface_ansi_header
locals [ Interface_ansi_headerContextExt extendedContext ]
:  attribute_instance*  interfacestr  lifetime?  interface_identifier  package_import_declaration*  parameter_port_list?  list_of_port_declarations? ;

program_declaration
locals [ Program_declarationContextExt extendedContext ]
:  program_nonansi_header  timeunits_declaration?  program_item*  endprogramstr (  colon  program_identifier  )? 
|  program_ansi_header  timeunits_declaration? (  non_port_program_item  )*  endprogramstr (  colon  program_identifier  )? 
|  attribute_instance*  programstr  program_identifier  lparen  dotstar  rparen  semi  timeunits_declaration?  program_item*  endprogramstr (  colon  program_identifier  )? 
|  externstr (  program_nonansi_header  |  program_ansi_header  );

program_nonansi_header
locals [ Program_nonansi_headerContextExt extendedContext ]
:  attribute_instance*  programstr  lifetime?  program_identifier (  package_import_declaration  )*  parameter_port_list?  list_of_ports  semi ;

program_ansi_header
locals [ Program_ansi_headerContextExt extendedContext ]
:  attribute_instance*  programstr  lifetime?  program_identifier (  package_import_declaration  )*  parameter_port_list?  list_of_port_declarations?  semi ;

checker_declaration
locals [ Checker_declarationContextExt extendedContext ]
:  checkerstr  checker_identifier (  lparen  checker_port_list?  rparen  )?  semi  checker_or_generate_item*  endcheckerstr (  colon  checker_identifier  )? ;

class_declaration
locals [ Class_declarationContextExt extendedContext ]
: (  virtualstr  )?  classstr  lifetime?  class_identifier  parameter_port_list? (  extendsstr  class_type (  lparen  list_of_arguments  rparen  )?  )?  semi  class_item*  endclassstr (  colon  class_identifier  )? ;

package_declaration
locals [ Package_declarationContextExt extendedContext ]
:  attribute_instance*  packagestr  lifetime?  package_identifier  semi  timeunits_declaration? (  package_declaration_part1  )*  endpackagestr (  colon  package_identifier  )? ;

package_declaration_part1
locals [ Package_declaration_part1ContextExt extendedContext ]
:  attribute_instance*  package_item ;

timeunits_declaration
locals [ Timeunits_declarationContextExt extendedContext ]
:  timeunit  time_literal (  div  time_literal  )?  semi ;

parameter_port_list
locals [ Parameter_port_listContextExt extendedContext ]
:  hash  lparen ( (  list_of_param_assignments (  comma  parameter_port_declaration  )*  ) |  list_of_parameter_port_declaration  )?  rparen ;

list_of_parameter_port_declaration
locals [ List_of_parameter_port_declarationContextExt extendedContext ]
:  parameter_port_declaration (  comma  parameter_port_declaration  )* ;

parameter_port_declaration
locals [ Parameter_port_declarationContextExt extendedContext ]
:  parameter_declaration 
|  local_parameter_declaration 
|  data_type  list_of_param_assignments 
|  typestr  list_of_type_assignments ;

list_of_ports
locals [ List_of_portsContextExt extendedContext ]
:  lparen  port (  comma  port  )*  rparen ;

list_of_port_declarations
locals [ List_of_port_declarationsContextExt extendedContext ]
:  lparen (  list_of_port_declarations_part1 (  comma  list_of_port_declarations_part1  )*  )?  rparen ;

list_of_port_declarations_part1
locals [ List_of_port_declarations_part1ContextExt extendedContext ]
:  attribute_instance*  ansi_port_declaration ;

port_declaration
locals [ Port_declarationContextExt extendedContext ]
:  attribute_instance* (  inout_declaration  |  input_declaration  |  output_declaration  |  ref_declaration  |  interface_port_declaration  );

port
locals [ PortContextExt extendedContext ]
: (  port_expression  )? 
|  dot  port_identifier  lparen  port_expression?  rparen ;

port_expression
locals [ Port_expressionContextExt extendedContext ]
:  port_reference 
|  lcurl  port_reference (  comma  port_reference  )*  rcurl ;

port_reference
locals [ Port_referenceContextExt extendedContext ]
:  port_identifier  constant_select ;

port_direction
locals [ Port_directionContextExt extendedContext ]
:  inputstr 
|  outputstr 
|  inoutstr 
|  refstr ;

net_port_header
locals [ Net_port_headerContextExt extendedContext ]
: (  port_direction  )?  net_port_type ;

variable_port_header
locals [ Variable_port_headerContextExt extendedContext ]
: (  port_direction  )?  variable_port_type ;

interface_port_header
locals [ Interface_port_headerContextExt extendedContext ]
:  interface_identifier (  dot  modport_identifier  )? 
|  interfacestr (  dot  modport_identifier  )? ;

ansi_port_declaration
locals [ Ansi_port_declarationContextExt extendedContext ]
: (  net_port_header  |  interface_port_header  )?  port_identifier (  unpacked_dimension  )* (  assign  constant_expression  )? 
|  variable_port_header?  port_identifier  variable_dimension* (  assign  constant_expression  )? 
| (  port_direction  )?  dot  port_identifier  lparen  expression?  rparen ;

elaboration_system_task
locals [ Elaboration_system_taskContextExt extendedContext ]
:  dollarfatalstr (  lparen  finish_number (  comma  list_of_arguments  )?  rparen  )?  semi 
|  dollarerrorstr (  lparen  list_of_arguments?  rparen  )?  semi 
|  dollarwarningstr (  lparen  list_of_arguments?  rparen  )?  semi 
|  dollarinfostr (  lparen  list_of_arguments?  rparen  )?  semi ;

finish_number
locals [ Finish_numberContextExt extendedContext ]
:  number ;

module_common_item
locals [ Module_common_itemContextExt extendedContext ]
:  module_or_generate_item_declaration 
|  interface_instantiation 
|  program_instantiation 
|  assertion_item 
|  bind_directive 
|  continuous_assign 
|  net_alias 
|  initial_construct 
|  final_construct 
|  always_construct 
|  loop_generate_construct 
|  conditional_generate_construct 
|  elaboration_system_task ;

module_item
locals [ Module_itemContextExt extendedContext ]
:  port_declaration  semi 
|  non_port_module_item ;

module_or_generate_item
locals [ Module_or_generate_itemContextExt extendedContext ]
:  attribute_instance*  parameter_override 
|  attribute_instance*  gate_instantiation 
|  attribute_instance*  udp_instantiation 
|  attribute_instance*  module_instantiation 
|  attribute_instance*  module_common_item ;

non_port_module_item
locals [ Non_port_module_itemContextExt extendedContext ]
:  generate_region 
|  module_or_generate_item 
|  specify_block 
|  attribute_instance*  specparam_declaration 
|  program_declaration 
|  module_declaration 
|  interface_declaration 
|  timeunits_declaration 
|  checker_declaration ;

parameter_override
locals [ Parameter_overrideContextExt extendedContext ]
:  defparamstr  list_of_defparam_assignments  semi ;

bind_directive
locals [ Bind_directiveContextExt extendedContext ]
:  bindstr  bind_target_scope (  colon  bind_target_instance_list  )?  bind_instantiation  semi 
|  bindstr  bind_target_instance  bind_instantiation  semi ;

bind_target_scope
locals [ Bind_target_scopeContextExt extendedContext ]
:  module_identifier 
|  interface_identifier ;

bind_target_instance
locals [ Bind_target_instanceContextExt extendedContext ]
:  hierarchical_identifier  constant_bit_select ;

bind_target_instance_list
locals [ Bind_target_instance_listContextExt extendedContext ]
:  bind_target_instance (  comma  bind_target_instance  )* ;

bind_instantiation
locals [ Bind_instantiationContextExt extendedContext ]
:  program_instantiation 
|  module_instantiation 
|  interface_instantiation 
|  checker_instantiation ;

config_declaration
locals [ Config_declarationContextExt extendedContext ]
:  configstr  config_identifier  semi (  local_parameter_declaration  )*  design_statement (  config_rule_statement  )*  endconfigstr (  colon  config_identifier  )? ;

design_statement
locals [ Design_statementContextExt extendedContext ]
:  designstr  design_statement_part1*  semi ;

design_statement_part1
locals [ Design_statement_part1ContextExt extendedContext ]
: (  library_identifier  dot  )?  cell_identifier ;

config_rule_statement
locals [ Config_rule_statementContextExt extendedContext ]
:  default_clause  liblist_clause  semi 
|  inst_clause  liblist_clause  semi 
|  inst_clause  use_clause  semi 
|  cell_clause  liblist_clause  semi 
|  cell_clause  use_clause  semi ;

default_clause
locals [ Default_clauseContextExt extendedContext ]
:  defaultstr ;

inst_clause
locals [ Inst_clauseContextExt extendedContext ]
:  instancestr  inst_name ;

inst_name
locals [ Inst_nameContextExt extendedContext ]
:  topmodule_identifier (  dot  instance_identifier  )* ;

cell_clause
locals [ Cell_clauseContextExt extendedContext ]
:  cellstr (  library_identifier  dot  )?  cell_identifier ;

liblist_clause
locals [ Liblist_clauseContextExt extendedContext ]
:  libliststr (  library_identifier  )? ;

use_clause
locals [ Use_clauseContextExt extendedContext ]
:  usestr (  library_identifier  dot  )?  cell_identifier (  colon  configstr  )? 
|  usestr  named_parameter_assignment (  comma  named_parameter_assignment  )* (  colon  configstr  )? 
|  usestr (  library_identifier  dot  )?  cell_identifier  named_parameter_assignment (  comma  named_parameter_assignment  )* (  colon  configstr  )? ;

module_or_generate_item_declaration
locals [ Module_or_generate_item_declarationContextExt extendedContext ]
:  package_or_generate_item_declaration 
|  genvar_declaration 
|  clocking_declaration 
|  defaultstr  clockingstr  clocking_identifier  semi 
|  defaultstr  disablestr  iffstr  expression_or_dist  semi ;

interface_or_generate_item
locals [ Interface_or_generate_itemContextExt extendedContext ]
:  attribute_instance*  module_common_item 
|  attribute_instance*  modport_declaration 
|  attribute_instance*  extern_tf_declaration ;

extern_tf_declaration
locals [ Extern_tf_declarationContextExt extendedContext ]
:  externstr  method_prototype  semi 
|  externstr  forkjoinstr  task_prototype  semi ;

interface_item
locals [ Interface_itemContextExt extendedContext ]
:  port_declaration  semi 
|  non_port_interface_item ;

non_port_interface_item
locals [ Non_port_interface_itemContextExt extendedContext ]
:  generate_region 
|  interface_or_generate_item 
|  program_declaration 
|  interface_declaration 
|  checker_declaration 
|  timeunits_declaration ;

program_item
locals [ Program_itemContextExt extendedContext ]
:  port_declaration  semi 
|  non_port_program_item ;

non_port_program_item
locals [ Non_port_program_itemContextExt extendedContext ]
:  attribute_instance*  continuous_assign 
|  attribute_instance*  module_or_generate_item_declaration 
|  attribute_instance*  initial_construct 
|  attribute_instance*  final_construct 
|  attribute_instance*  concurrent_assertion_item 
|  attribute_instance*  timeunits_declaration 
|  program_generate_item ;

program_generate_item
locals [ Program_generate_itemContextExt extendedContext ]
:  loop_generate_construct 
|  conditional_generate_construct 
|  generate_region 
|  elaboration_system_task ;

checker_port_list
locals [ Checker_port_listContextExt extendedContext ]
:  checker_port_item (  comma  checker_port_item  )* ;

checker_port_item
locals [ Checker_port_itemContextExt extendedContext ]
:  attribute_instance*  property_formal_type  port_identifier  variable_dimension* (  assign  property_actual_arg  )? ;

checker_or_generate_item
locals [ Checker_or_generate_itemContextExt extendedContext ]
:  checker_or_generate_item_declaration 
|  initial_construct 
|  checker_always_construct 
|  final_construct 
|  assertion_item 
|  checker_generate_item ;

checker_or_generate_item_declaration
locals [ Checker_or_generate_item_declarationContextExt extendedContext ]
:  data_declaration 
|  function_declaration 
|  assertion_item_declaration 
|  covergroup_declaration 
|  overload_declaration 
|  genvar_declaration 
|  clocking_declaration 
|  defaultstr  clockingstr  clocking_identifier  semi 
|  defaultstr  disablestr  iffstr  expression_or_dist  semi 
|  semi ;

checker_generate_item
locals [ Checker_generate_itemContextExt extendedContext ]
:  loop_generate_construct 
|  conditional_generate_construct 
|  generate_region 
|  elaboration_system_task ;

checker_always_construct
locals [ Checker_always_constructContextExt extendedContext ]
:  alwaysstr  statement ;

class_item
locals [ Class_itemContextExt extendedContext ]
:  attribute_instance*  class_property 
|  attribute_instance*  class_method 
|  attribute_instance*  class_constraint 
|  attribute_instance*  class_declaration 
|  attribute_instance*  covergroup_declaration 
|  local_parameter_declaration  semi 
|  parameter_declaration  semi 
|  semi ;

class_property
locals [ Class_propertyContextExt extendedContext ]
: (  property_qualifier  )*  data_declaration 
|  conststr  class_item_qualifier*  data_type  const_identifier (  assign  constant_expression  )?  semi ;

class_method
locals [ Class_methodContextExt extendedContext ]
:  method_qualifier*  task_declaration 
|  method_qualifier*  function_declaration 
|  externstr  method_qualifier*  method_prototype  semi 
|  method_qualifier*  class_constructor_declaration 
|  externstr  method_qualifier*  class_constructor_prototype ;

class_constructor_prototype
locals [ Class_constructor_prototypeContextExt extendedContext ]
:  functionstr  newstr  lparen  tf_port_list?  rparen  semi ;

class_constraint
locals [ Class_constraintContextExt extendedContext ]
:  constraint_prototype 
|  constraint_declaration ;

class_item_qualifier
locals [ Class_item_qualifierContextExt extendedContext ]
:  staticstr 
|  protectedstr 
|  localstr ;

property_qualifier
locals [ Property_qualifierContextExt extendedContext ]
:  random_qualifier 
|  class_item_qualifier ;

random_qualifier
locals [ Random_qualifierContextExt extendedContext ]
:  randstr 
|  randcstr ;

method_qualifier
locals [ Method_qualifierContextExt extendedContext ]
:  purestr?  virtualstr 
|  class_item_qualifier ;

method_prototype
locals [ Method_prototypeContextExt extendedContext ]
:  task_prototype 
|  function_prototype ;

class_constructor_declaration
locals [ Class_constructor_declarationContextExt extendedContext ]
:  functionstr  class_scope?  newstr (  lparen  tf_port_list?  rparen  )?  semi  block_item_declaration? (  superstr  dot  newstr (  lparen  list_of_arguments  rparen  )?  semi  )?  function_statement_or_null*  endfunctionstr (  colon  newstr  )? ;

constraint_declaration
locals [ Constraint_declarationContextExt extendedContext ]
: (  staticstr  )?  constraintstr  constraint_identifier  constraint_block ;

constraint_block
locals [ Constraint_blockContextExt extendedContext ]
:  lcurl  constraint_block_item*  rcurl ;

constraint_block_item
locals [ Constraint_block_itemContextExt extendedContext ]
:  solvestr  solve_before_list  beforestr  solve_before_list  semi 
|  constraint_expression ;

solve_before_list
locals [ Solve_before_listContextExt extendedContext ]
:  solve_before_primary (  comma  solve_before_primary  )* ;

solve_before_primary
locals [ Solve_before_primaryContextExt extendedContext ]
: (  implicit_class_handle  dot  |  class_scope  )?  hierarchical_identifier  select ;

constraint_expression
locals [ Constraint_expressionContextExt extendedContext ]
:  expression_or_dist  semi 
|  expression  derive  constraint_set 
|  ifstr  lparen  expression  rparen  constraint_set (  elsestr  constraint_set  )? 
|  foreachstr  lparen  ps_or_hierarchical_array_identifier  lbrack  loop_variables  rbrack  rparen  constraint_set ;

constraint_set
locals [ Constraint_setContextExt extendedContext ]
:  constraint_expression 
|  lcurl (  constraint_expression  )*  rcurl ;

dist_list
locals [ Dist_listContextExt extendedContext ]
:  dist_item (  comma  dist_item  )* ;

dist_item
locals [ Dist_itemContextExt extendedContext ]
:  value_range  dist_weight? ;

dist_weight
locals [ Dist_weightContextExt extendedContext ]
:  colonequals  expression 
|  colonslash  expression ;

constraint_prototype
locals [ Constraint_prototypeContextExt extendedContext ]
:  staticstr?  constraintstr  constraint_identifier  semi ;

extern_constraint_declaration
locals [ Extern_constraint_declarationContextExt extendedContext ]
:  staticstr?  constraintstr  class_scope  constraint_identifier  constraint_block ;

identifier_list
locals [ Identifier_listContextExt extendedContext ]
:  identifier (  comma  identifier  )* ;

package_item
locals [ Package_itemContextExt extendedContext ]
:  package_or_generate_item_declaration 
|  anonymous_program 
|  package_export_declaration 
|  timeunits_declaration ;

package_or_generate_item_declaration
locals [ Package_or_generate_item_declarationContextExt extendedContext ]
:  net_declaration 
|  data_declaration 
|  task_declaration 
|  function_declaration 
|  dpi_import_export 
|  extern_constraint_declaration 
|  class_declaration 
|  class_constructor_declaration 
|  local_parameter_declaration  semi 
|  parameter_declaration  semi 
|  covergroup_declaration 
|  overload_declaration 
|  assertion_item_declaration 
|  semi ;

anonymous_program
locals [ Anonymous_programContextExt extendedContext ]
:  programstr  semi  anonymous_program_item*  endprogramstr ;

anonymous_program_item
locals [ Anonymous_program_itemContextExt extendedContext ]
:  task_declaration 
|  function_declaration 
|  class_declaration 
|  covergroup_declaration 
|  class_constructor_declaration 
|  semi ;

local_parameter_declaration
locals [ Local_parameter_declarationContextExt extendedContext ]
:  localparamstr  data_type_or_implicit  list_of_param_assignments 
|  localparamstr  typestr  list_of_type_assignments ;

parameter_declaration
locals [ Parameter_declarationContextExt extendedContext ]
:  parameterstr  data_type_or_implicit  list_of_param_assignments 
|  parameterstr  typestr  list_of_type_assignments ;

specparam_declaration
locals [ Specparam_declarationContextExt extendedContext ]
:  specparamstr  packed_dimension?  list_of_specparam_assignments  semi ;

inout_declaration
locals [ Inout_declarationContextExt extendedContext ]
:  inoutstr  net_port_type  list_of_port_identifiers ;

input_declaration
locals [ Input_declarationContextExt extendedContext ]
:  inputstr  net_port_type  list_of_port_identifiers 
|  inputstr  variable_port_type  list_of_variable_identifiers ;

output_declaration
locals [ Output_declarationContextExt extendedContext ]
:  outputstr  net_port_type  list_of_port_identifiers 
|  outputstr  variable_port_type  list_of_variable_port_identifiers ;

interface_port_declaration
locals [ Interface_port_declarationContextExt extendedContext ]
:  interface_identifier  list_of_interface_identifiers 
|  interface_identifier  dot  modport_identifier  list_of_interface_identifiers ;

ref_declaration
locals [ Ref_declarationContextExt extendedContext ]
:  refstr  variable_port_type  list_of_port_identifiers ;

data_declaration
locals [ Data_declarationContextExt extendedContext ]
: (  conststr  )? (  varstr  )? (  lifetime  )?  data_type_or_implicit  list_of_variable_decl_assignments  semi 
|  type_declaration 
|  package_import_declaration 
|  virtual_interface_declaration ;

package_import_declaration
locals [ Package_import_declarationContextExt extendedContext ]
:  importstr  package_import_item (  comma  package_import_item  )*  semi ;

package_import_item
locals [ Package_import_itemContextExt extendedContext ]
:  package_identifier  coloncolon  identifier 
|  package_identifier  coloncolon  star ;

package_export_declaration
locals [ Package_export_declarationContextExt extendedContext ]
:  export  startcoloncolonstar  semi 
|  export  package_import_item (  comma  package_import_item  )*  semi ;

genvar_declaration
locals [ Genvar_declarationContextExt extendedContext ]
:  genvarstr  list_of_genvar_identifiers  semi ;

net_declaration
locals [ Net_declarationContextExt extendedContext ]
:  net_type (  drive_strength  |  charge_strength  )? (  vectoredstr  |  scalaredstr  )?  data_type_or_implicit  delay3?  list_of_net_decl_assignments  semi ;

type_declaration
locals [ Type_declarationContextExt extendedContext ]
:  typedefstr  data_type  type_identifier (  variable_dimension  )*  semi 
|  typedefstr  interface_instance_identifier  constant_bit_select  dot  type_identifier  type_identifier  semi 
|  typedefstr (  enumstr  |  structstr  |  unionstr  |  classstr  )?  type_identifier  semi ;

lifetime
locals [ LifetimeContextExt extendedContext ]
:  staticstr 
|  automaticstr ;

casting_type
locals [ Casting_typeContextExt extendedContext ]
:  simple_type 
|  signing 
|  stringstr 
|  conststr ;

data_type
locals [ Data_typeContextExt extendedContext ]
:  integer_vector_type  signing? (  packed_dimension  )* 
|  integer_atom_type  signing? 
|  non_integer_type 
|  struct_union (  packedstr (  signing  )?  )?  lcurl  struct_union_member (  struct_union_member  )*  rcurl  packed_dimension* 
|  enumstr  enum_base_type?  lcurl  enum_name_declaration (  comma  enum_name_declaration  )*  rcurl  packed_dimension* 
|  stringstr 
|  chandlestr 
|  virtualstr (  interfacestr  )?  interface_identifier 
| (  class_scope  |  package_scope  )?  type_identifier  packed_dimension* 
|  class_type 
|  eventstr 
|  ps_covergroup_identifier 
|  type_reference ;

data_type_or_implicit
locals [ Data_type_or_implicitContextExt extendedContext ]
:  data_type 
|  implicit_data_type ;

implicit_data_type
locals [ Implicit_data_typeContextExt extendedContext ]
: (  signing  )?  packed_dimension* ;

enum_base_type
locals [ Enum_base_typeContextExt extendedContext ]
:  integer_atom_type (  signing  )? 
|  integer_vector_type  signing? (  packed_dimension  )? 
|  type_identifier (  packed_dimension  )? ;

enum_name_declaration
locals [ Enum_name_declarationContextExt extendedContext ]
:  enum_identifier (  enum_name_declaration_part1 (  colon (  zero_or_one  |  edge_spec  |  decimal_number  ) )?  rbrack  )? (  assign  constant_expression  )? ;

enum_name_declaration_part1
locals [ Enum_name_declaration_part1ContextExt extendedContext ]
:  lbrack (  zero_or_one  |  edge_spec  |  decimal_number  );

class_scope
locals [ Class_scopeContextExt extendedContext ]
:  class_type  coloncolon ;

class_type
locals [ Class_typeContextExt extendedContext ]
:  ps_class_identifier (  parameter_value_assignment  )?  class_type_part1* ;

class_type_part1
locals [ Class_type_part1ContextExt extendedContext ]
:  coloncolon  class_identifier (  parameter_value_assignment  )? ;

integer_type
locals [ Integer_typeContextExt extendedContext ]
:  integer_vector_type 
|  integer_atom_type ;

integer_atom_type
locals [ Integer_atom_typeContextExt extendedContext ]
:  bytestr 
|  shortintstr 
|  intstr 
|  longintstr 
|  integerstr 
|  timestr ;

integer_vector_type
locals [ Integer_vector_typeContextExt extendedContext ]
:  bitstr 
|  logicstr 
|  regstr ;

non_integer_type
locals [ Non_integer_typeContextExt extendedContext ]
:  shortreal 
|  realstr 
|  realtimestr ;

net_type
locals [ Net_typeContextExt extendedContext ]
:  supply0str 
|  supply1str 
|  tristr 
|  triandstr 
|  triorstr 
|  triregstr 
|  tri0str 
|  tri1str 
|  uwirestr 
|  wirestr 
|  wandstr 
|  worstr ;

net_port_type
locals [ Net_port_typeContextExt extendedContext ]
:  net_type?  data_type_or_implicit ;

variable_port_type
locals [ Variable_port_typeContextExt extendedContext ]
:  var_data_type ;

var_data_type
locals [ Var_data_typeContextExt extendedContext ]
:  data_type 
|  varstr  data_type_or_implicit ;

signing
locals [ SigningContextExt extendedContext ]
:  signedstr 
|  unsignedstr ;

simple_type
locals [ Simple_typeContextExt extendedContext ]
:  integer_type 
|  non_integer_type 
|  ps_type_identifier 
|  ps_parameter_identifier ;

struct_union_member
locals [ Struct_union_memberContextExt extendedContext ]
:  attribute_instance*  random_qualifier?  data_type_or_void  list_of_variable_decl_assignments  semi ;

data_type_or_void
locals [ Data_type_or_voidContextExt extendedContext ]
:  data_type 
|  voidstr ;

struct_union
locals [ Struct_unionContextExt extendedContext ]
:  structstr 
|  unionstr (  taggedstr  )? ;

type_reference
locals [ Type_referenceContextExt extendedContext ]
:  typestr  lparen  expression  rparen 
|  typestr  lparen  data_type  rparen ;

drive_strength
locals [ Drive_strengthContextExt extendedContext ]
:  lparen  strength0  comma  strength1  rparen 
|  lparen  strength1  comma  strength0  rparen 
|  lparen  strength0  comma  highz1str  rparen 
|  lparen  strength1  comma  highz0str  rparen 
|  lparen  highz0str  comma  strength1  rparen 
|  lparen  highz1str  comma  strength0  rparen ;

strength0
locals [ Strength0ContextExt extendedContext ]
:  supply0str 
|  strong0 
|  pull0str 
|  weak0str ;

strength1
locals [ Strength1ContextExt extendedContext ]
:  supply1str 
|  strong1 
|  pull1str 
|  weak1str ;

charge_strength
locals [ Charge_strengthContextExt extendedContext ]
:  lparen  smallstr  rparen 
|  lparen  mediumstr  rparen 
|  lparen  largestr  rparen ;

delay3
locals [ Delay3ContextExt extendedContext ]
:  hash  delay_value 
|  hash  lparen  mintypmax_expression (  comma  mintypmax_expression (  comma  mintypmax_expression  )?  )?  rparen ;

delay2
locals [ Delay2ContextExt extendedContext ]
:  hash  delay_value 
|  hash  lparen  mintypmax_expression (  comma  mintypmax_expression  )?  rparen ;

delay_value
locals [ Delay_valueContextExt extendedContext ]
:  edge_spec 
|  zero_or_one 
|  decimal_number 
|  real_number 
|  ps_identifier 
|  time_literal 
|  onestepstr ;

list_of_defparam_assignments
locals [ List_of_defparam_assignmentsContextExt extendedContext ]
:  defparam_assignment (  comma  defparam_assignment  )* ;

list_of_genvar_identifiers
locals [ List_of_genvar_identifiersContextExt extendedContext ]
:  genvar_identifier (  comma  genvar_identifier  )* ;

list_of_interface_identifiers
locals [ List_of_interface_identifiersContextExt extendedContext ]
:  list_of_interface_identifiers_part1 (  comma  list_of_interface_identifiers_part1  )* ;

list_of_interface_identifiers_part1
locals [ List_of_interface_identifiers_part1ContextExt extendedContext ]
:  interface_identifier  unpacked_dimension* ;

list_of_param_assignments
locals [ List_of_param_assignmentsContextExt extendedContext ]
:  param_assignment (  comma  param_assignment  )* ;

list_of_port_identifiers
locals [ List_of_port_identifiersContextExt extendedContext ]
:  list_of_port_identifiers_part1 (  comma  list_of_port_identifiers_part1  )* ;

list_of_port_identifiers_part1
locals [ List_of_port_identifiers_part1ContextExt extendedContext ]
:  port_identifier  unpacked_dimension* ;

list_of_udp_port_identifiers
locals [ List_of_udp_port_identifiersContextExt extendedContext ]
:  port_identifier (  comma  port_identifier  )* ;

list_of_specparam_assignments
locals [ List_of_specparam_assignmentsContextExt extendedContext ]
:  specparam_assignment (  comma  specparam_assignment  )* ;

list_of_tf_variable_identifiers
locals [ List_of_tf_variable_identifiersContextExt extendedContext ]
:  list_of_tf_variable_identifiers_part1 (  comma  list_of_tf_variable_identifiers_part1  )* ;

list_of_tf_variable_identifiers_part1
locals [ List_of_tf_variable_identifiers_part1ContextExt extendedContext ]
:  port_identifier (  variable_dimension  )* (  assign  expression  )? ;

list_of_type_assignments
locals [ List_of_type_assignmentsContextExt extendedContext ]
:  type_assignment (  comma  type_assignment  )* ;

list_of_variable_decl_assignments
locals [ List_of_variable_decl_assignmentsContextExt extendedContext ]
:  variable_decl_assignment (  comma  variable_decl_assignment  )* ;

list_of_variable_identifiers
locals [ List_of_variable_identifiersContextExt extendedContext ]
:  list_of_variable_identifiers_part1 (  comma  list_of_variable_identifiers_part1  )* ;

list_of_variable_identifiers_part1
locals [ List_of_variable_identifiers_part1ContextExt extendedContext ]
:  variable_identifier  variable_dimension* ;

list_of_variable_port_identifiers
locals [ List_of_variable_port_identifiersContextExt extendedContext ]
:  list_of_variable_port_identifiers_part1 (  comma  list_of_variable_port_identifiers_part1  )* ;

list_of_variable_port_identifiers_part1
locals [ List_of_variable_port_identifiers_part1ContextExt extendedContext ]
:  port_identifier  variable_dimension* (  assign  constant_expression  )? ;

list_of_virtual_interface_decl
locals [ List_of_virtual_interface_declContextExt extendedContext ]
:  list_of_virtual_interface_decl_part1 (  comma  list_of_virtual_interface_decl_part1  )* ;

list_of_virtual_interface_decl_part1
locals [ List_of_virtual_interface_decl_part1ContextExt extendedContext ]
:  variable_identifier (  assign  interface_instance_identifier  )? ;

defparam_assignment
locals [ Defparam_assignmentContextExt extendedContext ]
:  hierarchical_parameter_identifier  assign  constant_mintypmax_expression ;

list_of_net_decl_assignments
locals [ List_of_net_decl_assignmentsContextExt extendedContext ]
:  net_decl_assignment (  comma  net_decl_assignment  )* ;

net_decl_assignment
locals [ Net_decl_assignmentContextExt extendedContext ]
:  net_identifier  unpacked_dimension* (  assign  expression  )? ;

param_assignment
locals [ Param_assignmentContextExt extendedContext ]
:  parameter_identifier (  unpacked_dimension  )* (  assign  constant_param_expression  )* ;

specparam_assignment
locals [ Specparam_assignmentContextExt extendedContext ]
:  specparam_identifier  assign  constant_mintypmax_expression 
|  pulse_control_specparam ;

type_assignment
locals [ Type_assignmentContextExt extendedContext ]
:  type_identifier (  assign  data_type  )? ;

pulse_control_specparam
locals [ Pulse_control_specparamContextExt extendedContext ]
:  pathpulsedollar  assign  lparen  reject_limit_value (  comma  error_limit_value  )?  rparen 
|  pathpulsedollar  specify_input_terminal_descriptor  dollar  specify_output_terminal_descriptor  assign  lparen  reject_limit_value (  comma  error_limit_value  )?  rparen ;

error_limit_value
locals [ Error_limit_valueContextExt extendedContext ]
:  limit_value ;

reject_limit_value
locals [ Reject_limit_valueContextExt extendedContext ]
:  limit_value ;

limit_value
locals [ Limit_valueContextExt extendedContext ]
:  constant_mintypmax_expression ;

variable_decl_assignment
locals [ Variable_decl_assignmentContextExt extendedContext ]
:  variable_identifier  variable_dimension* (  assign  expression  )? 
|  dynamic_array_variable_identifier  unsized_dimension (  variable_dimension  )* (  assign  dynamic_array_new  )? 
|  class_variable_identifier (  assign  class_new  )? ;

class_new
locals [ Class_newContextExt extendedContext ]
:  newstr (  lparen  list_of_arguments  rparen  |  expression  )? ;

dynamic_array_new
locals [ Dynamic_array_newContextExt extendedContext ]
:  newstr  lbrack  expression  rbrack (  lparen  expression  rparen  )? ;

unpacked_dimension
locals [ Unpacked_dimensionContextExt extendedContext ]
:  lbrack  constant_range  rbrack 
|  lbrack  constant_expression  rbrack ;

packed_dimension
locals [ Packed_dimensionContextExt extendedContext ]
:  lbrack  constant_range  rbrack 
|  unsized_dimension ;

associative_dimension
locals [ Associative_dimensionContextExt extendedContext ]
:  lbrack  data_type  rbrack 
|  lbrack  star  rbrack ;

variable_dimension
locals [ Variable_dimensionContextExt extendedContext ]
:  unsized_dimension 
|  unpacked_dimension 
|  associative_dimension 
|  queue_dimension ;

queue_dimension
locals [ Queue_dimensionContextExt extendedContext ]
:  lbrack  dollar (  colon  constant_expression  )?  rbrack ;

unsized_dimension
locals [ Unsized_dimensionContextExt extendedContext ]
:  lbrack  rbrack ;

function_data_type_or_implicit
locals [ Function_data_type_or_implicitContextExt extendedContext ]
:  data_type_or_void 
|  implicit_data_type ;

function_declaration
locals [ Function_declarationContextExt extendedContext ]
:  functionstr  lifetime?  function_body_declaration ;

function_body_declaration
locals [ Function_body_declarationContextExt extendedContext ]
:  function_data_type_or_implicit (  interface_identifier  dot  |  class_scope  )?  function_identifier  semi (  tf_item_declaration  )* (  function_statement_or_null  )*  endfunctionstr (  colon  function_identifier  )? 
|  function_data_type_or_implicit (  interface_identifier  dot  |  class_scope  )?  function_identifier  lparen  tf_port_list?  rparen  semi  block_item_declaration*  function_statement_or_null*  endfunctionstr (  colon  function_identifier  )? ;

function_prototype
locals [ Function_prototypeContextExt extendedContext ]
:  functionstr  data_type_or_void  function_identifier  lparen  tf_port_list?  rparen ;

dpi_import_export
locals [ Dpi_import_exportContextExt extendedContext ]
:  importstr  dpi_spec_string  dpi_function_import_property? (  c_identifier  assign  )?  dpi_function_proto  semi 
|  importstr  dpi_spec_string  dpi_task_import_property? (  c_identifier  assign  )?  dpi_task_proto  semi 
|  export  dpi_spec_string (  c_identifier  assign  )?  functionstr  function_identifier  semi 
|  export  dpi_spec_string (  c_identifier  assign  )?  taskstr  task_identifier  semi ;

dpi_spec_string
locals [ Dpi_spec_stringContextExt extendedContext ]
:  dpi_spec_ing2str 
|  dpi_spec_ing1str ;

dpi_function_import_property
locals [ Dpi_function_import_propertyContextExt extendedContext ]
:  contextstr 
|  purestr ;

dpi_task_import_property
locals [ Dpi_task_import_propertyContextExt extendedContext ]
:  contextstr ;

dpi_function_proto
locals [ Dpi_function_protoContextExt extendedContext ]
:  function_prototype ;

dpi_task_proto
locals [ Dpi_task_protoContextExt extendedContext ]
:  task_prototype ;

task_declaration
locals [ Task_declarationContextExt extendedContext ]
:  taskstr  lifetime?  task_body_declaration ;

task_body_declaration
locals [ Task_body_declarationContextExt extendedContext ]
: (  interface_identifier  dot  |  class_scope  )?  task_identifier  semi (  tf_item_declaration  )* (  statement_or_null  )*  endtaskstr (  colon  task_identifier  )? 
| (  interface_identifier  dot  |  class_scope  )?  task_identifier  lparen  tf_port_list?  rparen  semi (  block_item_declaration  )*  statement_or_null*  endtaskstr (  colon  task_identifier  )? ;

tf_item_declaration
locals [ Tf_item_declarationContextExt extendedContext ]
:  block_item_declaration 
|  tf_port_declaration ;

tf_port_list
locals [ Tf_port_listContextExt extendedContext ]
:  tf_port_item (  comma  tf_port_item  )* ;

tf_port_item
locals [ Tf_port_itemContextExt extendedContext ]
:  attribute_instance* (  tf_port_direction  )? (  varstr  )?  data_type_or_implicit (  port_identifier  variable_dimension* (  assign  expression  )?  )? ;

tf_port_direction
locals [ Tf_port_directionContextExt extendedContext ]
:  port_direction 
|  conststr  refstr ;

tf_port_declaration
locals [ Tf_port_declarationContextExt extendedContext ]
:  attribute_instance*  tf_port_direction (  varstr  )?  data_type_or_implicit  list_of_tf_variable_identifiers  semi ;

task_prototype
locals [ Task_prototypeContextExt extendedContext ]
:  taskstr  task_identifier  lparen  tf_port_list?  rparen ;

block_item_declaration
locals [ Block_item_declarationContextExt extendedContext ]
:  attribute_instance*  data_declaration 
|  attribute_instance*  local_parameter_declaration  semi 
|  attribute_instance*  parameter_declaration  semi 
|  attribute_instance*  overload_declaration 
|  attribute_instance*  let_declaration ;

overload_declaration
locals [ Overload_declarationContextExt extendedContext ]
:  bindstr  overload_operator  functionstr  data_type  function_identifier  lparen  overload_proto_formals  rparen  semi ;

overload_operator
locals [ Overload_operatorContextExt extendedContext ]
:  plus 
|  increment 
|  minus 
|  decrement 
|  star 
|  starstar 
|  div 
|  modulo 
|  equals 
|  not_equals 
|  lt 
|  le 
|  gt 
|  ge 
|  assign ;

overload_proto_formals
locals [ Overload_proto_formalsContextExt extendedContext ]
:  data_type (  comma  data_type  )* ;

virtual_interface_declaration
locals [ Virtual_interface_declarationContextExt extendedContext ]
:  virtualstr (  interfacestr  )?  interface_identifier (  parameter_value_assignment  )? (  dot  modport_identifier  )?  list_of_virtual_interface_decl  semi ;

modport_declaration
locals [ Modport_declarationContextExt extendedContext ]
:  modportstr  modport_item (  comma  modport_item  )*  semi ;

modport_item
locals [ Modport_itemContextExt extendedContext ]
:  modport_identifier  lparen  modport_ports_declaration (  comma  modport_ports_declaration  )*  rparen ;

modport_ports_declaration
locals [ Modport_ports_declarationContextExt extendedContext ]
:  attribute_instance*  modport_simple_ports_declaration 
|  attribute_instance*  modport_tf_ports_declaration 
|  attribute_instance*  modport_clocking_declaration ;

modport_clocking_declaration
locals [ Modport_clocking_declarationContextExt extendedContext ]
:  clockingstr  clocking_identifier ;

modport_simple_ports_declaration
locals [ Modport_simple_ports_declarationContextExt extendedContext ]
:  port_direction  modport_simple_port (  comma  modport_simple_port  )* ;

modport_simple_port
locals [ Modport_simple_portContextExt extendedContext ]
:  port_identifier 
|  dot  port_identifier  lparen  expression?  rparen ;

modport_tf_ports_declaration
locals [ Modport_tf_ports_declarationContextExt extendedContext ]
:  import_export  modport_tf_port (  comma  modport_tf_port  )* ;

modport_tf_port
locals [ Modport_tf_portContextExt extendedContext ]
:  method_prototype 
|  tf_identifier ;

import_export
locals [ Import_exportContextExt extendedContext ]
:  importstr 
|  export ;

concurrent_assertion_item
locals [ Concurrent_assertion_itemContextExt extendedContext ]
: (  block_identifier  colon  )?  concurrent_assertion_statement 
|  checker_instantiation ;

concurrent_assertion_statement
locals [ Concurrent_assertion_statementContextExt extendedContext ]
:  assert_property_statement 
|  assume_property_statement 
|  cover_property_statement 
|  cover_sequence_statement 
|  restrict_property_statement ;

assert_property_statement
locals [ Assert_property_statementContextExt extendedContext ]
:  assertstr  propertystr  lparen  property_spec  rparen  action_block ;

assume_property_statement
locals [ Assume_property_statementContextExt extendedContext ]
:  assumestr  propertystr  lparen  property_spec  rparen  action_block ;

cover_property_statement
locals [ Cover_property_statementContextExt extendedContext ]
:  coverstr  propertystr  lparen  property_spec  rparen  statement_or_null ;

expect_property_statement
locals [ Expect_property_statementContextExt extendedContext ]
:  expectstr  lparen  property_spec  rparen  action_block ;

cover_sequence_statement
locals [ Cover_sequence_statementContextExt extendedContext ]
:  coverstr  sequencestr  lparen  clocking_event? (  disablestr  iffstr  lparen  expression_or_dist  rparen  )?  sequence_expr  rparen  statement_or_null ;

restrict_property_statement
locals [ Restrict_property_statementContextExt extendedContext ]
:  restrictstr  propertystr  lparen  property_spec  rparen  semi ;

property_instance
locals [ Property_instanceContextExt extendedContext ]
:  ps_or_hierarchical_property_identifier (  lparen  property_list_of_arguments?  rparen  )? ;

property_list_of_arguments
locals [ Property_list_of_argumentsContextExt extendedContext ]
:  property_actual_arg?  property_list_of_arguments_part1* (  comma  property_list_of_arguments_part2  )* 
|  property_list_of_arguments_part2 (  comma  property_list_of_arguments_part2  )* ;

property_list_of_arguments_part1
locals [ Property_list_of_arguments_part1ContextExt extendedContext ]
:  comma  property_actual_arg? ;

property_list_of_arguments_part2
locals [ Property_list_of_arguments_part2ContextExt extendedContext ]
:  dot  identifier  lparen  property_actual_arg?  rparen ;

property_actual_arg
locals [ Property_actual_argContextExt extendedContext ]
:  property_expr 
|  sequence_actual_arg ;

assertion_item_declaration
locals [ Assertion_item_declarationContextExt extendedContext ]
:  property_declaration 
|  sequence_declaration 
|  let_declaration ;

property_declaration
locals [ Property_declarationContextExt extendedContext ]
:  propertystr  property_identifier (  lparen  property_port_list?  rparen  )?  semi  assertion_variable_declaration*  property_statement_spec  endpropertystr (  colon  property_identifier  )? ;

property_port_list
locals [ Property_port_listContextExt extendedContext ]
:  property_port_item (  comma  property_port_item  )* ;

property_port_item
locals [ Property_port_itemContextExt extendedContext ]
:  attribute_instance* (  localstr  property_lvar_port_direction?  )?  property_formal_type  port_identifier  variable_dimension* (  assign  property_actual_arg  )* ;

property_lvar_port_direction
locals [ Property_lvar_port_directionContextExt extendedContext ]
:  inputstr ;

property_formal_type
locals [ Property_formal_typeContextExt extendedContext ]
:  sequence_formal_type 
|  propertystr ;

property_spec
locals [ Property_specContextExt extendedContext ]
: (  clocking_event  )? (  disablestr  iffstr  lparen  expression_or_dist  rparen  )?  property_expr ;

property_statement_spec
locals [ Property_statement_specContextExt extendedContext ]
:  clocking_event? (  disablestr  iffstr  lparen  expression_or_dist  rparen  )?  property_statement ;

property_statement
locals [ Property_statementContextExt extendedContext ]
:  property_expr  semi 
|  casestr  lparen  expression_or_dist  rparen  property_case_item  property_case_item*  endcasestr 
|  ifstr  lparen  expression_or_dist  rparen  property_expr (  elsestr  property_expr  )? ;

property_case_item
locals [ Property_case_itemContextExt extendedContext ]
:  expression_or_dist (  comma  expression_or_dist  )*  colon  property_statement 
|  defaultstr (  colon  )?  property_statement ;

property_expr
locals [ Property_exprContextExt extendedContext ]
:  sequence_expr 
|  lparen  property_expr  rparen 
|  notstr  property_expr 
|  property_expr  orstr  property_expr 
|  property_expr  andstr  property_expr 
|  sequence_expr  orderive  property_expr 
|  sequence_expr  orimplies  property_expr 
|  ifstr  lparen  expression_or_dist  rparen  property_expr (  elsestr  property_expr  )? 
|  property_instance 
|  clocking_event  property_expr ;

sequence_declaration
locals [ Sequence_declarationContextExt extendedContext ]
:  sequencestr  sequence_identifier (  lparen  sequence_port_list?  rparen  )?  semi  assertion_variable_declaration*  sequence_expr  semi  endsequencestr (  colon  sequence_identifier  )? ;

sequence_port_list
locals [ Sequence_port_listContextExt extendedContext ]
:  sequence_port_item (  comma  sequence_port_item  )* ;

sequence_port_item
locals [ Sequence_port_itemContextExt extendedContext ]
:  attribute_instance* (  localstr  sequence_lvar_port_direction?  )?  sequence_formal_type  port_identifier  variable_dimension* (  assign  sequence_actual_arg  )? ;

sequence_lvar_port_direction
locals [ Sequence_lvar_port_directionContextExt extendedContext ]
:  inputstr 
|  inoutstr 
|  outputstr ;

sequence_formal_type
locals [ Sequence_formal_typeContextExt extendedContext ]
:  data_type_or_implicit 
|  sequencestr 
|  eventstr 
|  untypedstr ;

sequence_expr
locals [ Sequence_exprContextExt extendedContext ]
:  cycle_delay_range  sequence_expr (  cycle_delay_range  sequence_expr  )* 
|  sequence_expr  cycle_delay_range  sequence_expr (  cycle_delay_range  sequence_expr  )* 
|  expression_or_dist (  boolean_abbrev  )? 
|  lparen  expression_or_dist (  comma  sequence_match_item  )*  rparen (  boolean_abbrev  )? 
|  sequence_instance (  sequence_abbrev  )? 
|  lparen  sequence_expr (  comma  sequence_match_item  )*  rparen (  sequence_abbrev  )? 
|  sequence_expr  andstr  sequence_expr 
|  sequence_expr  intersectstr  sequence_expr 
|  sequence_expr  orstr  sequence_expr 
|  first_matchstr  lparen  sequence_expr (  comma  sequence_match_item  )*  rparen 
|  expression_or_dist  throughoutstr  sequence_expr 
|  sequence_expr  withinstr  sequence_expr 
|  clocking_event  sequence_expr ;

cycle_delay_range
locals [ Cycle_delay_rangeContextExt extendedContext ]
:  double_hash  constant_primary 
|  double_hash  lbrack  cycle_delay_const_range_expression  rbrack 
|  double_hash  lbrack  star  rbrack 
|  double_hash  lbrack  plus  rbrack ;

sequence_method_call
locals [ Sequence_method_callContextExt extendedContext ]
:  sequence_instance  dot  method_identifier ;

sequence_match_item
locals [ Sequence_match_itemContextExt extendedContext ]
:  operator_assignment 
|  inc_or_dec_expression 
|  subroutine_call ;

sequence_instance
locals [ Sequence_instanceContextExt extendedContext ]
:  ps_or_hierarchical_sequence_identifier (  lparen  sequence_list_of_arguments?  rparen  )? ;

sequence_list_of_arguments
locals [ Sequence_list_of_argumentsContextExt extendedContext ]
:  sequence_actual_arg?  sequence_list_of_arguments_part1* (  comma  sequence_list_of_arguments_part2  )* 
|  sequence_list_of_arguments_part2 (  comma  sequence_list_of_arguments_part2  )* ;

sequence_list_of_arguments_part1
locals [ Sequence_list_of_arguments_part1ContextExt extendedContext ]
:  comma  sequence_actual_arg? ;

sequence_list_of_arguments_part2
locals [ Sequence_list_of_arguments_part2ContextExt extendedContext ]
:  dot  identifier  lparen  sequence_actual_arg?  rparen ;

sequence_actual_arg
locals [ Sequence_actual_argContextExt extendedContext ]
:  event_expression 
|  sequence_expr ;

boolean_abbrev
locals [ Boolean_abbrevContextExt extendedContext ]
:  consecutive_repetition 
|  non_consecutive_repetition 
|  goto_repetition ;

sequence_abbrev
locals [ Sequence_abbrevContextExt extendedContext ]
:  consecutive_repetition ;

consecutive_repetition
locals [ Consecutive_repetitionContextExt extendedContext ]
:  lbrack  star  const_or_range_expression  rbrack 
|  lbrack  star  rbrack 
|  lbrack  plus  rbrack ;

non_consecutive_repetition
locals [ Non_consecutive_repetitionContextExt extendedContext ]
:  lbrack  assign  const_or_range_expression  rbrack ;

goto_repetition
locals [ Goto_repetitionContextExt extendedContext ]
:  lbrack  derive  const_or_range_expression  rbrack ;

const_or_range_expression
locals [ Const_or_range_expressionContextExt extendedContext ]
:  constant_expression 
|  cycle_delay_const_range_expression ;

cycle_delay_const_range_expression
locals [ Cycle_delay_const_range_expressionContextExt extendedContext ]
:  constant_expression  colon  constant_expression 
|  constant_expression  colon  dollar ;

expression_or_dist
locals [ Expression_or_distContextExt extendedContext ]
:  expression (  diststr  lcurl  dist_list  rcurl  )? ;

assertion_variable_declaration
locals [ Assertion_variable_declarationContextExt extendedContext ]
:  var_data_type  list_of_variable_decl_assignments  semi ;

let_declaration
locals [ Let_declarationContextExt extendedContext ]
:  letstr  let_identifier (  lparen  let_port_list?  rparen  )?  assign  expression  semi ;

let_identifier
locals [ Let_identifierContextExt extendedContext ]
:  identifier ;

let_port_list
locals [ Let_port_listContextExt extendedContext ]
:  let_port_item (  comma  let_port_item  )* ;

let_port_item
locals [ Let_port_itemContextExt extendedContext ]
:  attribute_instance*  let_formal_type  port_identifier  variable_dimension* (  assign  expression  )? ;

let_formal_type
locals [ Let_formal_typeContextExt extendedContext ]
:  data_type_or_implicit ;

let_expression
locals [ Let_expressionContextExt extendedContext ]
:  package_scope?  let_identifier (  lparen  let_list_of_arguments?  rparen  )? ;

let_list_of_arguments
locals [ Let_list_of_argumentsContextExt extendedContext ]
:  let_actual_arg?  let_list_of_arguments_part1* (  comma  let_list_of_arguments_part2  )* 
|  let_list_of_arguments_part2 (  comma  let_list_of_arguments_part2  )* ;

let_list_of_arguments_part1
locals [ Let_list_of_arguments_part1ContextExt extendedContext ]
:  comma  let_actual_arg? ;

let_list_of_arguments_part2
locals [ Let_list_of_arguments_part2ContextExt extendedContext ]
:  dot  identifier  lparen  let_actual_arg?  rparen ;

let_actual_arg
locals [ Let_actual_argContextExt extendedContext ]
:  expression ;

covergroup_declaration
locals [ Covergroup_declarationContextExt extendedContext ]
:  covergroupstr  covergroup_identifier (  lparen (  tf_port_list  )?  rparen  )? (  coverage_event  )?  semi (  coverage_spec_or_option  )*  endgroupstr (  colon  covergroup_identifier  )? ;

coverage_spec_or_option
locals [ Coverage_spec_or_optionContextExt extendedContext ]
: (  attribute_instance  )*  coverage_spec 
| (  attribute_instance  )*  coverage_option  semi ;

coverage_option
locals [ Coverage_optionContextExt extendedContext ]
:  optiondot  member_identifier  assign  expression 
|  type_optiondot  member_identifier  assign  constant_expression ;

coverage_spec
locals [ Coverage_specContextExt extendedContext ]
:  cover_point 
|  cover_cross ;

coverage_event
locals [ Coverage_eventContextExt extendedContext ]
:  clocking_event 
|  withstr  functionstr  samplestr  lparen (  tf_port_list  )?  rparen 
|  attheratelparen  block_event_expression  rparen ;

block_event_expression
locals [ Block_event_expressionContextExt extendedContext ]
: (  beginstr  hierarchical_btf_identifier  |  endstr  hierarchical_btf_identifier  )(  orstr  block_event_expression  )* ;

hierarchical_btf_identifier
locals [ Hierarchical_btf_identifierContextExt extendedContext ]
:  hierarchical_tf_identifier 
|  hierarchical_block_identifier 
|  hierarchical_identifier (  class_scope  )?  method_identifier ;

cover_point
locals [ Cover_pointContextExt extendedContext ]
: (  cover_point_identifier  colon  )?  coverpointstr  expression (  iffstr  lparen  expression  rparen  )?  bins_or_empty ;

bins_or_empty
locals [ Bins_or_emptyContextExt extendedContext ]
:  lcurl (  attribute_instance  )* (  bins_or_options  semi  )*  rcurl 
|  semi ;

bins_or_options
locals [ Bins_or_optionsContextExt extendedContext ]
:  coverage_option 
| (  wildcardstr  )?  bins_keyword  bins_or_options_part1  assign  lcurl  open_range_list  rcurl (  iffstr  lparen  expression  rparen  )? 
| (  wildcardstr  )?  bins_keyword  bin_identifier (  lbrack  rbrack  )?  assign  trans_list (  iffstr  lparen  expression  rparen  )? 
|  bins_keyword  bins_or_options_part1  assign  defaultstr (  iffstr  lparen  expression  rparen  )? 
|  bins_keyword  bin_identifier  assign  defaultstr  sequencestr (  iffstr  lparen  expression  rparen  )? ;

bins_or_options_part1
locals [ Bins_or_options_part1ContextExt extendedContext ]
:  bin_identifier (  lbrack (  expression  )?  rbrack  )? ;

bins_keyword
locals [ Bins_keywordContextExt extendedContext ]
:  binsstr 
|  illegal_binsstr 
|  ignore_binsstr ;

range_list
locals [ Range_listContextExt extendedContext ]
:  value_range (  comma  value_range  )* ;

trans_list
locals [ Trans_listContextExt extendedContext ]
:  lparen  trans_set  rparen (  comma  lparen  trans_set  rparen  )* ;

trans_set
locals [ Trans_setContextExt extendedContext ]
:  trans_range_list (  implies  trans_range_list  )* ;

trans_range_list
locals [ Trans_range_listContextExt extendedContext ]
:  trans_item 
|  trans_item  lbrack  star  repeat_range  rbrack 
|  trans_item  lbrack  derive  repeat_range  rbrack 
|  trans_item  lbrack  assign  repeat_range  rbrack ;

trans_item
locals [ Trans_itemContextExt extendedContext ]
:  range_list ;

repeat_range
locals [ Repeat_rangeContextExt extendedContext ]
:  expression 
|  expression  colon  expression ;

cover_cross
locals [ Cover_crossContextExt extendedContext ]
: (  cross_identifier  colon  )?  crossstr  list_of_coverpoints (  iffstr  lparen  expression  rparen  )?  select_bins_or_empty ;

list_of_coverpoints
locals [ List_of_coverpointsContextExt extendedContext ]
:  cross_item  comma  cross_item (  comma  cross_item  )* ;

cross_item
locals [ Cross_itemContextExt extendedContext ]
:  cover_point_identifier 
|  variable_identifier ;

select_bins_or_empty
locals [ Select_bins_or_emptyContextExt extendedContext ]
:  lcurl (  bins_selection_or_option  semi  )*  rcurl 
|  semi ;

bins_selection_or_option
locals [ Bins_selection_or_optionContextExt extendedContext ]
:  attribute_instance*  coverage_option 
|  attribute_instance*  bins_selection ;

bins_selection
locals [ Bins_selectionContextExt extendedContext ]
:  bins_keyword  bin_identifier  assign  select_expression (  iffstr  lparen  expression  rparen  )? ;

select_expression
locals [ Select_expressionContextExt extendedContext ]
: (  select_condition  |  not  select_condition  |  lparen  select_expression  rparen  ) select_expression_part1* ;

select_expression_part1
locals [ Select_expression_part1ContextExt extendedContext ]
:  log_and  select_expression 
|  log_or  select_expression ;

select_condition
locals [ Select_conditionContextExt extendedContext ]
:  binsofstr  lparen  bins_expression  rparen (  intersectstr  lcurl  open_range_list  rcurl  )? ;

bins_expression
locals [ Bins_expressionContextExt extendedContext ]
:  variable_identifier 
|  cover_point_identifier (  dot  bins_identifier  )? ;

open_range_list
locals [ Open_range_listContextExt extendedContext ]
:  open_value_range (  comma  open_value_range  )* ;

open_value_range
locals [ Open_value_rangeContextExt extendedContext ]
:  value_range ;

gate_instantiation
locals [ Gate_instantiationContextExt extendedContext ]
:  cmos_switchtype (  delay3  )?  cmos_switch_instance (  comma  cmos_switch_instance  )*  semi 
|  enable_gatetype (  drive_strength  )? (  delay3  )?  enable_gate_instance (  comma  enable_gate_instance  )*  semi 
|  mos_switchtype (  delay3  )?  mos_switch_instance (  comma  mos_switch_instance  )*  semi 
|  n_input_gatetype (  drive_strength  )? (  delay2  )?  n_input_gate_instance (  comma  n_input_gate_instance  )*  semi 
|  n_output_gatetype (  drive_strength  )? (  delay2  )?  n_output_gate_instance (  comma  n_output_gate_instance  )*  semi 
|  pass_en_switchtype (  delay2  )?  pass_enable_switch_instance (  comma  pass_enable_switch_instance  )*  semi 
|  pass_switchtype  pass_switch_instance (  comma  pass_switch_instance  )*  semi 
|  pulldownstr (  pulldown_strength  )?  pull_gate_instance (  comma  pull_gate_instance  )*  semi 
|  pullupstr (  pullup_strength  )?  pull_gate_instance (  comma  pull_gate_instance  )*  semi ;

cmos_switch_instance
locals [ Cmos_switch_instanceContextExt extendedContext ]
: (  name_of_instance  )?  lparen  output_terminal  comma  input_terminal  comma  ncontrol_terminal  comma  pcontrol_terminal  rparen ;

enable_gate_instance
locals [ Enable_gate_instanceContextExt extendedContext ]
: (  name_of_instance  )?  lparen  output_terminal  comma  input_terminal  comma  enable_terminal  rparen ;

mos_switch_instance
locals [ Mos_switch_instanceContextExt extendedContext ]
: (  name_of_instance  )?  lparen  output_terminal  comma  input_terminal  comma  enable_terminal  rparen ;

n_input_gate_instance
locals [ N_input_gate_instanceContextExt extendedContext ]
: (  name_of_instance  )?  lparen  output_terminal  comma  input_terminal (  comma  input_terminal  )*  rparen ;

n_output_gate_instance
locals [ N_output_gate_instanceContextExt extendedContext ]
: (  name_of_instance  )?  lparen  output_terminal (  comma  output_terminal  )*  comma  input_terminal  rparen ;

pass_switch_instance
locals [ Pass_switch_instanceContextExt extendedContext ]
: (  name_of_instance  )?  lparen  inout_terminal  comma  inout_terminal  rparen ;

pass_enable_switch_instance
locals [ Pass_enable_switch_instanceContextExt extendedContext ]
: (  name_of_instance  )?  lparen  inout_terminal  comma  inout_terminal  comma  enable_terminal  rparen ;

pull_gate_instance
locals [ Pull_gate_instanceContextExt extendedContext ]
: (  name_of_instance  )?  lparen  output_terminal  rparen ;

pulldown_strength
locals [ Pulldown_strengthContextExt extendedContext ]
:  lparen  strength0  comma  strength1  rparen 
|  lparen  strength1  comma  strength0  rparen 
|  lparen  strength0  rparen ;

pullup_strength
locals [ Pullup_strengthContextExt extendedContext ]
:  lparen  strength0  comma  strength1  rparen 
|  lparen  strength1  comma  strength0  rparen 
|  lparen  strength1  rparen ;

enable_terminal
locals [ Enable_terminalContextExt extendedContext ]
:  expression ;

inout_terminal
locals [ Inout_terminalContextExt extendedContext ]
:  net_lvalue ;

input_terminal
locals [ Input_terminalContextExt extendedContext ]
:  expression ;

ncontrol_terminal
locals [ Ncontrol_terminalContextExt extendedContext ]
:  expression ;

output_terminal
locals [ Output_terminalContextExt extendedContext ]
:  net_lvalue ;

pcontrol_terminal
locals [ Pcontrol_terminalContextExt extendedContext ]
:  expression ;

cmos_switchtype
locals [ Cmos_switchtypeContextExt extendedContext ]
:  cmosstr 
|  rcmosstr ;

enable_gatetype
locals [ Enable_gatetypeContextExt extendedContext ]
:  bufif0str 
|  bufif1str 
|  notif0str 
|  notif1str ;

mos_switchtype
locals [ Mos_switchtypeContextExt extendedContext ]
:  nmosstr 
|  pmos 
|  rnmosstr 
|  rpmosstr ;

n_input_gatetype
locals [ N_input_gatetypeContextExt extendedContext ]
:  andstr 
|  nandstr 
|  orstr 
|  norstr 
|  xorstrstr 
|  xnorstr ;

n_output_gatetype
locals [ N_output_gatetypeContextExt extendedContext ]
:  bufstr 
|  notstr ;

pass_en_switchtype
locals [ Pass_en_switchtypeContextExt extendedContext ]
:  tranif0str 
|  tranif1str 
|  rtranif1str 
|  rtranif0str ;

pass_switchtype
locals [ Pass_switchtypeContextExt extendedContext ]
:  transtr 
|  rtranstr ;

module_instantiation
locals [ Module_instantiationContextExt extendedContext ]
:  module_identifier (  parameter_value_assignment  )?  hierarchical_instance (  comma  hierarchical_instance  )*  semi pragma_def? ;

parameter_value_assignment
locals [ Parameter_value_assignmentContextExt extendedContext ]
:  hash  lparen (  list_of_parameter_assignments  )?  rparen ;

list_of_parameter_assignments
locals [ List_of_parameter_assignmentsContextExt extendedContext ]
:  ordered_parameter_assignment (  comma  ordered_parameter_assignment  )* 
|  named_parameter_assignment (  comma  named_parameter_assignment  )* ;

ordered_parameter_assignment
locals [ Ordered_parameter_assignmentContextExt extendedContext ]
:  param_expression ;

named_parameter_assignment
locals [ Named_parameter_assignmentContextExt extendedContext ]
:  dot  parameter_identifier  lparen (  param_expression  )?  rparen ;

hierarchical_instance
locals [ Hierarchical_instanceContextExt extendedContext ]
:  name_of_instance  lparen (  list_of_port_connections  )?  rparen ;

name_of_instance
locals [ Name_of_instanceContextExt extendedContext ]
:  instance_identifier (  unpacked_dimension  )* ;

list_of_port_connections
locals [ List_of_port_connectionsContextExt extendedContext ]
:  ordered_port_connection (  comma  ordered_port_connection  )* 
|  named_port_connection (  comma  named_port_connection  )* ;

ordered_port_connection
locals [ Ordered_port_connectionContextExt extendedContext ]
:  attribute_instance* (  expression  )? ;

named_port_connection
locals [ Named_port_connectionContextExt extendedContext ]
:  attribute_instance*  dot  port_identifier (  lparen (  expression  )?  rparen  )? 
|  attribute_instance*  dotstar ;

interface_instantiation
locals [ Interface_instantiationContextExt extendedContext ]
:  interface_identifier (  parameter_value_assignment  )?  hierarchical_instance (  comma  hierarchical_instance  )*  semi ;

program_instantiation
locals [ Program_instantiationContextExt extendedContext ]
:  program_identifier (  parameter_value_assignment  )?  hierarchical_instance (  comma  hierarchical_instance  )*  semi ;

checker_instantiation
locals [ Checker_instantiationContextExt extendedContext ]
:  checker_identifier  name_of_instance  lparen (  list_of_checker_port_connections  )?  rparen  semi ;

list_of_checker_port_connections
locals [ List_of_checker_port_connectionsContextExt extendedContext ]
:  ordered_checker_port_connection (  comma  ordered_checker_port_connection  )* 
|  named_checker_port_connection (  comma  named_checker_port_connection  )* ;

ordered_checker_port_connection
locals [ Ordered_checker_port_connectionContextExt extendedContext ]
:  attribute_instance* (  property_actual_arg  )? ;

named_checker_port_connection
locals [ Named_checker_port_connectionContextExt extendedContext ]
:  attribute_instance*  dot  port_identifier (  lparen (  property_actual_arg  )?  rparen  )? 
|  attribute_instance*  dotstar ;

generate_region
locals [ Generate_regionContextExt extendedContext ]
:  generatestr (  generate_block  )*  endgeneratestr ;

loop_generate_construct
locals [ Loop_generate_constructContextExt extendedContext ]
:  forstr  lparen  genvar_initialization  semi  genvar_expression  semi  genvar_iteration  rparen  generate_block pragma_def?;

genvar_initialization
locals [ Genvar_initializationContextExt extendedContext ]
: (  genvarstr  )?  genvar_identifier  assign  constant_expression ;

conditional_generate_construct
locals [ Conditional_generate_constructContextExt extendedContext ]
:  if_generate_construct 
|  case_generate_construct ;

if_generate_construct
locals [ If_generate_constructContextExt extendedContext ]
:  ifstr  lparen  constant_expression  rparen  generate_block (  elsestr  generate_block  )? ;

case_generate_construct
locals [ Case_generate_constructContextExt extendedContext ]
:  casestr  lparen  constant_expression  rparen  case_generate_item (  case_generate_item  )*  endcasestr ;

case_generate_item
locals [ Case_generate_itemContextExt extendedContext ]
:  constant_expression (  comma  constant_expression  )*  colon  generate_block 
|  defaultstr (  colon  )?  generate_block ;

generate_block
locals [ Generate_blockContextExt extendedContext ]
:  generate_item 
| (  generate_block_identifier  colon  )?  generate_block_part1  generate_block_part3*  generate_block_part2 ;

generate_block_part1
locals [ Generate_block_part1ContextExt extendedContext ]
:  beginstr (  colon  generate_block_identifier  )? ;

generate_block_part2
locals [ Generate_block_part2ContextExt extendedContext ]
:  endstr (  colon  generate_block_identifier  )? ;

generate_block_part3
locals [ Generate_block_part3ContextExt extendedContext ]
:  generate_item 
|  generate_block ;

generate_item
locals [ Generate_itemContextExt extendedContext ]
:  module_or_generate_item 
|  interface_or_generate_item 
|  checker_or_generate_item ;

udp_nonansi_declaration
locals [ Udp_nonansi_declarationContextExt extendedContext ]
:  attribute_instance*  primitivestr  udp_identifier  lparen  udp_port_list  rparen  semi ;

genvar_iteration
locals [ Genvar_iterationContextExt extendedContext ]
:  genvar_identifier  assignment_operator  genvar_expression 
|  inc_or_dec_operator  genvar_identifier 
|  genvar_identifier  inc_or_dec_operator ;

udp_ansi_declaration
locals [ Udp_ansi_declarationContextExt extendedContext ]
:  attribute_instance*  primitivestr  udp_identifier  lparen  udp_declaration_port_list  rparen  semi ;

udp_declaration
locals [ Udp_declarationContextExt extendedContext ]
:  udp_nonansi_declaration  udp_port_declaration (  udp_port_declaration  )*  udp_body  endprimitivestr (  colon  udp_identifier  )? 
|  udp_ansi_declaration  udp_body  endprimitivestr (  colon  udp_identifier  )? 
|  externstr  udp_nonansi_declaration 
|  externstr  udp_ansi_declaration 
|  attribute_instance*  primitivestr  udp_identifier  lparen  dotstar  rparen  semi (  udp_port_declaration  )*  udp_body  endprimitivestr (  colon  udp_identifier  )? ;

udp_port_list
locals [ Udp_port_listContextExt extendedContext ]
:  output_port_identifier  comma  input_port_identifier (  comma  input_port_identifier  )* ;

udp_declaration_port_list
locals [ Udp_declaration_port_listContextExt extendedContext ]
:  udp_output_declaration  comma  udp_input_declaration (  comma  udp_input_declaration  )* ;

udp_port_declaration
locals [ Udp_port_declarationContextExt extendedContext ]
:  udp_output_declaration  semi 
|  udp_input_declaration  semi 
|  udp_reg_declaration  semi ;

udp_output_declaration
locals [ Udp_output_declarationContextExt extendedContext ]
:  attribute_instance*  outputstr (  regstr  )?  port_identifier (  assign  constant_expression  )? ;

udp_input_declaration
locals [ Udp_input_declarationContextExt extendedContext ]
:  attribute_instance*  inputstr  list_of_udp_port_identifiers ;

udp_reg_declaration
locals [ Udp_reg_declarationContextExt extendedContext ]
:  attribute_instance*  regstr  variable_identifier ;

udp_body
locals [ Udp_bodyContextExt extendedContext ]
:  combinational_body 
|  sequential_body ;

combinational_body
locals [ Combinational_bodyContextExt extendedContext ]
:  tablestr  combinational_entry (  combinational_entry  )*  endtablestr ;

combinational_entry
locals [ Combinational_entryContextExt extendedContext ]
:  level_input_list  colon  output_symbol  semi ;

sequential_body
locals [ Sequential_bodyContextExt extendedContext ]
: (  udp_initial_statement  )?  tablestr  sequential_entry (  sequential_entry  )*  endtablestr ;

udp_initial_statement
locals [ Udp_initial_statementContextExt extendedContext ]
:  initialstr  output_port_identifier  assign  init_val  semi ;

init_val
locals [ Init_valContextExt extendedContext ]
:  binary_number 
|  zero_or_one 
|  edge_spec ;

sequential_entry
locals [ Sequential_entryContextExt extendedContext ]
:  seq_input_list  colon  current_state  colon  next_state  semi ;

seq_input_list
locals [ Seq_input_listContextExt extendedContext ]
:  level_input_list 
|  edge_input_list ;

level_input_list
locals [ Level_input_listContextExt extendedContext ]
:  level_symbol (  level_symbol  )* ;

edge_input_list
locals [ Edge_input_listContextExt extendedContext ]
:  edge_input_list_part1 (  level_symbol  )* ;

edge_input_list_part1
locals [ Edge_input_list_part1ContextExt extendedContext ]
: (  level_symbol  )*  edge_indicator ;

edge_indicator
locals [ Edge_indicatorContextExt extendedContext ]
:  lparen  level_symbol  level_symbol  rparen 
|  edge_symbol ;

current_state
locals [ Current_stateContextExt extendedContext ]
:  level_symbol ;

next_state
locals [ Next_stateContextExt extendedContext ]
:  output_symbol 
|  minus ;

output_symbol
locals [ Output_symbolContextExt extendedContext ]
:  binary_number 
|  edge_spec 
|  zero_or_one ;

level_symbol
locals [ Level_symbolContextExt extendedContext ]
:  binary_number 
|  edge_spec 
|  zero_or_one 
|  questinmark 
|  id ;

edge_symbol
locals [ Edge_symbolContextExt extendedContext ]
:  id 
|  star ;

udp_instantiation
locals [ Udp_instantiationContextExt extendedContext ]
:  udp_identifier (  drive_strength  )? (  delay2  )?  udp_instance (  comma  udp_instance  )*  semi ;

udp_instance
locals [ Udp_instanceContextExt extendedContext ]
: (  name_of_instance  )?  lparen  output_terminal  comma  input_terminal (  comma  input_terminal  )*  rparen ;

continuous_assign
locals [ Continuous_assignContextExt extendedContext ]
:  assignstrstr (  drive_strength  )? (  delay3  )? (  list_of_net_assignments  ) semi ;

list_of_net_assignments
locals [ List_of_net_assignmentsContextExt extendedContext ]
:  net_assignment (  comma  net_assignment  )* ;

list_of_variable_assignments
locals [ List_of_variable_assignmentsContextExt extendedContext ]
:  variable_assignment (  comma  variable_assignment  )* ;

net_alias
locals [ Net_aliasContextExt extendedContext ]
:  aliasstr  net_lvalue  assign  net_lvalue (  assign  net_lvalue  )*  semi ;

net_assignment
locals [ Net_assignmentContextExt extendedContext ]
:  net_lvalue  assign  expression ;

initial_construct
locals [ Initial_constructContextExt extendedContext ]
:  initialstr  statement_or_null ;

always_construct
locals [ Always_constructContextExt extendedContext ]
:  always_keyword  statement ;

always_keyword
locals [ Always_keywordContextExt extendedContext ]
:  alwaysstr 
|  always_combstr 
|  always_latchstr 
|  always_ffstr ;

final_construct
locals [ Final_constructContextExt extendedContext ]
:  finalstr  function_statement ;

blocking_assignment
locals [ Blocking_assignmentContextExt extendedContext ]
:  variable_lvalue  assign  delay_or_event_control  expression 
|  nonrange_variable_lvalue  assign  dynamic_array_new 
| (  implicit_class_handle  dot  |  class_scope  |  package_scope  )?  hierarchical_variable_identifier  select  assign  class_new 
|  operator_assignment ;

operator_assignment
locals [ Operator_assignmentContextExt extendedContext ]
:  variable_lvalue  assignment_operator  expression ;

assignment_operator
locals [ Assignment_operatorContextExt extendedContext ]
:  assign 
|  plusequals 
|  minusequals 
|  startequals 
|  slashequals 
|  percentileequal 
|  andequals 
|  orequal 
|  xorequal 
|  lshift_assign 
|  rshift_assign 
|  unsigned_lshift_assign 
|  unsigned_rshift_assign ;

nonblocking_assignment
locals [ Nonblocking_assignmentContextExt extendedContext ]
:  variable_lvalue  le (  delay_or_event_control  )?  expression ;

procedural_continuous_assignment
locals [ Procedural_continuous_assignmentContextExt extendedContext ]
:  assignstrstr  variable_assignment 
|  deassignstr  variable_lvalue 
|  forcestr  variable_assignment 
|  forcestr  net_assignment 
|  releasestr  variable_lvalue 
|  releasestr  net_lvalue ;

action_block
locals [ Action_blockContextExt extendedContext ]
:  statement_or_null 
| (  statement  )?  elsestr  statement_or_null ;

seq_block
locals [ Seq_blockContextExt extendedContext ]
:  seq_block_part1 (  block_item_declaration  )* (  statement_or_null  )*  endstr (  colon  block_identifier  )? ;

seq_block_part1
locals [ Seq_block_part1ContextExt extendedContext ]
:  beginstr (  colon  block_identifier  )? ;

par_block
locals [ Par_blockContextExt extendedContext ]
:  par_block_part1 (  block_item_declaration  )* (  statement_or_null  )*  join_keyword (  colon  block_identifier  )? ;

par_block_part1
locals [ Par_block_part1ContextExt extendedContext ]
:  forkstr (  colon  block_identifier  )? ;

join_keyword
locals [ Join_keywordContextExt extendedContext ]
:  joinstr 
|  join_anystr 
|  join_namestr ;

statement_or_null
locals [ Statement_or_nullContextExt extendedContext ]
:  statement 
|  attribute_instance*  semi ;

statement
locals [ StatementContextExt extendedContext ]
: (  block_identifier  colon  )?  attribute_instance*  statement_item ;

statement_item
locals [ Statement_itemContextExt extendedContext ]
:  blocking_assignment  semi 
|  nonblocking_assignment  semi 
|  procedural_continuous_assignment  semi 
|  case_statement 
|  conditional_statement 
|  inc_or_dec_expression  semi 
|  subroutine_call_statement 
|  disable_statement 
|  event_trigger 
|  loop_statement 
|  jump_statement 
|  par_block 
|  procedural_timing_control_statement 
|  seq_block 
|  wait_statement 
|  procedural_assertion_statement 
|  clocking_drive  semi 
|  randsequence_statement 
|  randcase_statement 
|  expect_property_statement ;

function_statement
locals [ Function_statementContextExt extendedContext ]
:  statement ;

function_statement_or_null
locals [ Function_statement_or_nullContextExt extendedContext ]
:  function_statement 
|  attribute_instance*  semi ;

variable_identifier_list
locals [ Variable_identifier_listContextExt extendedContext ]
:  variable_identifier (  comma  variable_identifier  )* ;

procedural_timing_control_statement
locals [ Procedural_timing_control_statementContextExt extendedContext ]
:  procedural_timing_control  statement_or_null ;

delay_or_event_control
locals [ Delay_or_event_controlContextExt extendedContext ]
:  delay_control 
|  event_control 
|  repeatstr  lparen  expression  rparen  event_control ;

delay_control
locals [ Delay_controlContextExt extendedContext ]
:  hash  delay_value 
|  hash  lparen  mintypmax_expression  rparen ;

event_control
locals [ Event_controlContextExt extendedContext ]
:  attherate  hierarchical_event_identifier 
|  attherate  lparen  event_expression  rparen 
|  attheratestar 
|  attherate  lparenstarrparen 
|  attherate  ps_or_hierarchical_sequence_identifier ;

event_expression
locals [ Event_expressionContextExt extendedContext ]
: ( (  edge_identifier  )?  expression (  iffstr  expression  )?  |  sequence_instance (  iffstr  expression  )?  |  lparen  event_expression  rparen  )(  orstr  event_expression  |  comma  event_expression  )* ;

procedural_timing_control
locals [ Procedural_timing_controlContextExt extendedContext ]
:  delay_control 
|  event_control 
|  cycle_delay ;

jump_statement
locals [ Jump_statementContextExt extendedContext ]
:  returnstr (  expression  )?  semi 
|  breakstr  semi 
|  continuestr  semi ;

wait_statement
locals [ Wait_statementContextExt extendedContext ]
:  waitstr  lparen  expression  rparen  statement_or_null 
|  waitstr  forkstr  semi 
|  wait_orderstr  lparen  hierarchical_identifier (  comma  hierarchical_identifier  )*  rparen  action_block ;

event_trigger
locals [ Event_triggerContextExt extendedContext ]
:  derive  hierarchical_event_identifier  semi 
|  derivegt (  delay_or_event_control  )?  hierarchical_event_identifier  semi ;

disable_statement
locals [ Disable_statementContextExt extendedContext ]
:  disablestr  hierarchical_task_identifier  semi 
|  disablestr  hierarchical_block_identifier  semi 
|  disablestr  forkstr  semi ;

conditional_statement
locals [ Conditional_statementContextExt extendedContext ]
: (  unique_priority  )?  ifstr  lparen  expression  rparen  statement_or_null (  elsestr  ifstr  lparen  expression  rparen  statement_or_null  )* (  elsestr  statement_or_null  )? ;

unique_priority
locals [ Unique_priorityContextExt extendedContext ]
:  uniquestr 
|  unique0str 
|  prioritystr ;

case_statement
locals [ Case_statementContextExt extendedContext ]
: (  unique_priority  )?  case_keyword  lparen  case_expression  rparen  case_item (  case_item  )*  endcasestr 
| (  unique_priority  )?  case_keyword  lparen  case_expression  rparen  matchesstr  case_pattern_item (  case_pattern_item  )*  endcasestr 
| (  unique_priority  )?  casestr  lparen  case_expression  rparen  insidestr  case_inside_item (  case_inside_item  )*  endcasestr ;

case_keyword
locals [ Case_keywordContextExt extendedContext ]
:  casestr 
|  casezstr 
|  casexstr ;

case_expression
locals [ Case_expressionContextExt extendedContext ]
:  expression ;

case_item
locals [ Case_itemContextExt extendedContext ]
:  case_item_expression (  comma  case_item_expression  )*  colon  statement_or_null 
|  defaultstr (  colon  )?  statement_or_null ;

case_pattern_item
locals [ Case_pattern_itemContextExt extendedContext ]
:  pattern (  andandand  expression  )?  colon  statement_or_null 
|  defaultstr (  colon  )?  statement_or_null ;

case_inside_item
locals [ Case_inside_itemContextExt extendedContext ]
:  open_range_list  colon  statement_or_null 
|  defaultstr (  colon  )?  statement_or_null ;

case_item_expression
locals [ Case_item_expressionContextExt extendedContext ]
:  expression ;

randcase_statement
locals [ Randcase_statementContextExt extendedContext ]
:  randcasestr  randcase_item (  randcase_item  )*  endcasestr ;

randcase_item
locals [ Randcase_itemContextExt extendedContext ]
:  expression  colon  statement_or_null ;

pattern
locals [ PatternContextExt extendedContext ]
:  dot  variable_identifier 
|  dotstar 
|  constant_expression 
|  taggedstr  member_identifier (  pattern  )? 
|  escapelcurl  pattern (  comma  pattern  )*  rcurl 
|  escapelcurl  member_identifier  colon  pattern (  comma  member_identifier  colon  pattern  )*  rcurl ;

assignment_pattern
locals [ Assignment_patternContextExt extendedContext ]
:  escapelcurl  expression (  comma  expression  )*  rcurl 
|  escapelcurl  structure_pattern_key  colon  expression (  comma  structure_pattern_key  colon  expression  )*  rcurl 
|  escapelcurl  array_pattern_key  colon  expression (  comma  array_pattern_key  colon  expression  )*  rcurl 
|  escapelcurl  constant_expression  lcurl  expression (  comma  expression  )*  rcurl  rcurl ;

structure_pattern_key
locals [ Structure_pattern_keyContextExt extendedContext ]
:  member_identifier 
|  assignment_pattern_key ;

array_pattern_key
locals [ Array_pattern_keyContextExt extendedContext ]
:  constant_expression 
|  assignment_pattern_key ;

assignment_pattern_key
locals [ Assignment_pattern_keyContextExt extendedContext ]
:  simple_type 
|  defaultstr ;

variable_assignment
locals [ Variable_assignmentContextExt extendedContext ]
:  variable_lvalue  assign  expression ;

assignment_pattern_expression
locals [ Assignment_pattern_expressionContextExt extendedContext ]
: (  assignment_pattern_expression_type  )?  assignment_pattern ;

assignment_pattern_expression_type
locals [ Assignment_pattern_expression_typeContextExt extendedContext ]
:  ps_type_identifier 
|  ps_parameter_identifier 
|  integer_atom_type 
|  type_reference ;

constant_assignment_pattern_expression
locals [ Constant_assignment_pattern_expressionContextExt extendedContext ]
:  assignment_pattern_expression ;

assignment_pattern_net_lvalue
locals [ Assignment_pattern_net_lvalueContextExt extendedContext ]
:  escapelcurl  net_lvalue (  comma  net_lvalue  )*  rcurl ;

assignment_pattern_variable_lvalue
locals [ Assignment_pattern_variable_lvalueContextExt extendedContext ]
:  escapelcurl  variable_lvalue (  comma  variable_lvalue  )*  rcurl ;

loop_statement
locals [ Loop_statementContextExt extendedContext ]
:  foreverstr  statement_or_null 
|  repeatstr  lparen  expression  rparen  statement_or_null 
|  whilestr  lparen  expression  rparen  statement_or_null 
|  forstr  lparen  for_initialization  semi  expression  semi  for_step  rparen  statement_or_null 
|  dostr  statement_or_null  whilestr  lparen  expression  rparen  semi 
|  foreachstr  lparen  ps_or_hierarchical_array_identifier (  loop_variables  )?  rparen  statement ;

for_initialization
locals [ For_initializationContextExt extendedContext ]
:  list_of_variable_assignments 
|  for_variable_declaration (  comma  for_variable_declaration  )* ;

for_variable_declaration
locals [ For_variable_declarationContextExt extendedContext ]
:  data_type  variable_identifier  assign  expression (  comma  variable_identifier  assign  expression  )* ;

for_step
locals [ For_stepContextExt extendedContext ]
:  for_step_assignment (  comma  for_step_assignment  )* ;

for_step_assignment
locals [ For_step_assignmentContextExt extendedContext ]
:  operator_assignment 
|  inc_or_dec_expression 
|  function_subroutine_call ;

loop_variables
locals [ Loop_variablesContextExt extendedContext ]
: (  index_variable_identifier  )?  loop_variables_part1* ;

loop_variables_part1
locals [ Loop_variables_part1ContextExt extendedContext ]
:  comma (  index_variable_identifier  )? ;

subroutine_call_statement
locals [ Subroutine_call_statementContextExt extendedContext ]
:  subroutine_call  semi 
|  voidstr  escapequote  lparen  function_subroutine_call  rparen  semi ;

assertion_item
locals [ Assertion_itemContextExt extendedContext ]
:  concurrent_assertion_item 
|  deferred_immediate_assertion_item ;

deferred_immediate_assertion_item
locals [ Deferred_immediate_assertion_itemContextExt extendedContext ]
: (  block_identifier  colon  )?  deferred_immediate_assertion_statement ;

procedural_assertion_statement
locals [ Procedural_assertion_statementContextExt extendedContext ]
:  concurrent_assertion_statement 
|  immediate_assertion_statement 
|  checker_instantiation ;

immediate_assertion_statement
locals [ Immediate_assertion_statementContextExt extendedContext ]
:  simple_immediate_assertion_statement 
|  deferred_immediate_assertion_statement ;

simple_immediate_assertion_statement
locals [ Simple_immediate_assertion_statementContextExt extendedContext ]
:  simple_immediate_assert_statement 
|  simple_immediate_assume_statement 
|  simple_immediate_cover_statement ;

simple_immediate_assert_statement
locals [ Simple_immediate_assert_statementContextExt extendedContext ]
:  assertstr  lparen  expression  rparen  action_block ;

simple_immediate_assume_statement
locals [ Simple_immediate_assume_statementContextExt extendedContext ]
:  assumestr  lparen  expression  rparen  action_block ;

simple_immediate_cover_statement
locals [ Simple_immediate_cover_statementContextExt extendedContext ]
:  coverstr  lparen  expression  rparen  statement_or_null ;

deferred_immediate_assertion_statement
locals [ Deferred_immediate_assertion_statementContextExt extendedContext ]
:  deferred_immediate_assert_statement 
|  deferred_immediate_assume_statement 
|  deferred_immediate_cover_statement ;

deferred_immediate_assert_statement
locals [ Deferred_immediate_assert_statementContextExt extendedContext ]
:  assertstr  hash_zero  lparen  expression  rparen  action_block ;

deferred_immediate_assume_statement
locals [ Deferred_immediate_assume_statementContextExt extendedContext ]
:  assumestr  hash_zero  lparen  expression  rparen  action_block ;

deferred_immediate_cover_statement
locals [ Deferred_immediate_cover_statementContextExt extendedContext ]
:  coverstr  hash_zero  lparen  expression  rparen  action_block  statement_or_null ;

clocking_declaration
locals [ Clocking_declarationContextExt extendedContext ]
: (  defaultstr  )?  clocking_declaration_part1  clocking_event  semi (  clocking_item  )*  endclockingstr (  colon  clocking_identifier  )? 
|  globalstr  clocking_declaration_part1  clocking_event  semi  endclockingstr (  colon  clocking_identifier  )? ;

clocking_declaration_part1
locals [ Clocking_declaration_part1ContextExt extendedContext ]
:  clockingstr (  clocking_identifier  )? ;

clocking_event
locals [ Clocking_eventContextExt extendedContext ]
:  attherate  identifier 
|  attherate  lparen  event_expression  rparen ;

clocking_item
locals [ Clocking_itemContextExt extendedContext ]
:  defaultstr  default_skew  semi 
|  clocking_direction  list_of_clocking_decl_assign  semi 
|  attribute_instance*  assertion_item_declaration ;

default_skew
locals [ Default_skewContextExt extendedContext ]
:  inputstr  clocking_skew 
|  outputstr  clocking_skew 
|  inputstr  clocking_skew  outputstr  clocking_skew ;

clocking_direction
locals [ Clocking_directionContextExt extendedContext ]
:  inputstr (  clocking_skew  )? 
|  clocking_direction_part1 
|  inputstr (  clocking_skew  )?  clocking_direction_part1 
|  inoutstr ;

clocking_direction_part1
locals [ Clocking_direction_part1ContextExt extendedContext ]
:  outputstr (  clocking_skew  )? ;

list_of_clocking_decl_assign
locals [ List_of_clocking_decl_assignContextExt extendedContext ]
:  clocking_decl_assign (  comma  clocking_decl_assign  )* ;

clocking_decl_assign
locals [ Clocking_decl_assignContextExt extendedContext ]
:  signal_identifier (  assign  expression  )? ;

clocking_skew
locals [ Clocking_skewContextExt extendedContext ]
:  edge_identifier (  delay_control  )? 
|  delay_control ;

clocking_drive
locals [ Clocking_driveContextExt extendedContext ]
:  clockvar_expression  le (  cycle_delay  )?  expression ;

cycle_delay
locals [ Cycle_delayContextExt extendedContext ]
:  double_hash (  zero_or_one  |  edge_spec  |  decimal_number  )
|  double_hash  identifier 
|  double_hash  lparen  expression  rparen ;

clockvar
locals [ ClockvarContextExt extendedContext ]
:  hierarchical_identifier ;

clockvar_expression
locals [ Clockvar_expressionContextExt extendedContext ]
:  clockvar  select ;

randsequence_statement
locals [ Randsequence_statementContextExt extendedContext ]
:  randsequencestr  lparen (  production_identifier  )?  rparen  production (  production  )*  endsequencestr ;

production
locals [ ProductionContextExt extendedContext ]
: (  data_type_or_void  )?  production_identifier (  lparen  tf_port_list  rparen  )?  colon  rs_rule (  or  rs_rule  )*  semi ;

rs_rule
locals [ Rs_ruleContextExt extendedContext ]
:  rs_production_list (  colonequals  weight_specification (  rs_code_block  )?  )? ;

rs_production_list
locals [ Rs_production_listContextExt extendedContext ]
:  rs_prod (  rs_prod  )* 
|  randstr  joinstr (  lparen  expression  rparen  )?  production_item  production_item (  production_item  )* ;

weight_specification
locals [ Weight_specificationContextExt extendedContext ]
: (  zero_or_one  |  edge_spec  |  decimal_number  )
|  ps_identifier 
|  lparen  expression  rparen ;

rs_code_block
locals [ Rs_code_blockContextExt extendedContext ]
:  lcurl (  data_declaration  )* (  statement_or_null  )*  rcurl ;

rs_prod
locals [ Rs_prodContextExt extendedContext ]
:  production_item 
|  rs_code_block 
|  rs_if_else 
|  rs_repeat 
|  rs_case ;

production_item
locals [ Production_itemContextExt extendedContext ]
:  production_identifier (  lparen  list_of_arguments  rparen  )? ;

rs_if_else
locals [ Rs_if_elseContextExt extendedContext ]
:  ifstr  lparen  expression  rparen  production_item (  elsestr  production_item  )? ;

rs_repeat
locals [ Rs_repeatContextExt extendedContext ]
:  repeatstr  lparen  expression  rparen  production_item ;

rs_case
locals [ Rs_caseContextExt extendedContext ]
:  casestr  lparen  case_expression  rparen  rs_case_item (  rs_case_item  )*  endcasestr ;

rs_case_item
locals [ Rs_case_itemContextExt extendedContext ]
:  case_item_expression (  comma  case_item_expression  )*  colon  production_item  semi 
|  defaultstr (  colon  )?  production_item  semi ;

specify_block
locals [ Specify_blockContextExt extendedContext ]
:  specifystr  specify_item*  endspecifystr ;

specify_item
locals [ Specify_itemContextExt extendedContext ]
:  specparam_declaration 
|  pulsestyle_declaration 
|  showcancelled_declaration 
|  path_declaration 
|  system_timing_check ;

pulsestyle_declaration
locals [ Pulsestyle_declarationContextExt extendedContext ]
:  pulsestyle_oneventstr  list_of_path_outputs  semi 
|  pulsestyle_ondetectstr  list_of_path_outputs  semi ;

showcancelled_declaration
locals [ Showcancelled_declarationContextExt extendedContext ]
:  showcancelledstr  list_of_path_outputs  semi 
|  noshowcancelledstr  list_of_path_outputs  semi ;

path_declaration
locals [ Path_declarationContextExt extendedContext ]
:  simple_path_declaration  semi 
|  edge_sensitive_path_declaration  semi 
|  state_dependent_path_declaration  semi ;

simple_path_declaration
locals [ Simple_path_declarationContextExt extendedContext ]
:  parallel_path_description  assign  path_delay_value 
|  full_path_description  assign  path_delay_value ;

parallel_path_description
locals [ Parallel_path_descriptionContextExt extendedContext ]
:  lparen  specify_input_terminal_descriptor  polarity_operator?  implies  specify_output_terminal_descriptor  rparen ;

full_path_description
locals [ Full_path_descriptionContextExt extendedContext ]
:  lparen  list_of_path_inputs  polarity_operator?  stargt  list_of_path_outputs  rparen ;

list_of_path_inputs
locals [ List_of_path_inputsContextExt extendedContext ]
:  specify_input_terminal_descriptor (  comma  specify_input_terminal_descriptor  )* ;

list_of_path_outputs
locals [ List_of_path_outputsContextExt extendedContext ]
:  specify_output_terminal_descriptor (  comma  specify_output_terminal_descriptor  )* ;

specify_input_terminal_descriptor
locals [ Specify_input_terminal_descriptorContextExt extendedContext ]
:  input_identifier (  lbrack  constant_range_expression  rbrack  )? ;

specify_output_terminal_descriptor
locals [ Specify_output_terminal_descriptorContextExt extendedContext ]
:  output_identifier (  lbrack  constant_range_expression  rbrack  )? ;

input_identifier
locals [ Input_identifierContextExt extendedContext ]
:  input_port_identifier 
|  inout_port_identifier 
|  interface_identifier  dot  port_identifier ;

output_identifier
locals [ Output_identifierContextExt extendedContext ]
:  output_port_identifier 
|  inout_port_identifier 
|  interface_identifier  dot  port_identifier ;

path_delay_value
locals [ Path_delay_valueContextExt extendedContext ]
:  list_of_path_delay_expressions 
|  lparen  list_of_path_delay_expressions  rparen ;

list_of_path_delay_expressions
locals [ List_of_path_delay_expressionsContextExt extendedContext ]
:  t_path_delay_expression 
|  trise_path_delay_expression  comma  tfall_path_delay_expression 
|  trise_path_delay_expression  comma  tfall_path_delay_expression  comma  tz_path_delay_expression 
|  t01_path_delay_expression  comma  t10_path_delay_expression  comma  t0z_path_delay_expression  comma  tz1_path_delay_expression  comma  t1z_path_delay_expression  comma  tz0_path_delay_expression 
|  t01_path_delay_expression  comma  t10_path_delay_expression  comma  t0z_path_delay_expression  comma  tz1_path_delay_expression  comma  t1z_path_delay_expression  comma  tz0_path_delay_expression  comma  t0x_path_delay_expression  comma  tx1_path_delay_expression  comma  t1x_path_delay_expression  comma  tx0_path_delay_expression  comma  txz_path_delay_expression  comma  tzx_path_delay_expression ;

t_path_delay_expression
locals [ T_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

trise_path_delay_expression
locals [ Trise_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

tfall_path_delay_expression
locals [ Tfall_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

tz_path_delay_expression
locals [ Tz_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

t01_path_delay_expression
locals [ T01_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

t10_path_delay_expression
locals [ T10_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

t0z_path_delay_expression
locals [ T0z_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

tz1_path_delay_expression
locals [ Tz1_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

t1z_path_delay_expression
locals [ T1z_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

tz0_path_delay_expression
locals [ Tz0_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

t0x_path_delay_expression
locals [ T0x_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

tx1_path_delay_expression
locals [ Tx1_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

t1x_path_delay_expression
locals [ T1x_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

tx0_path_delay_expression
locals [ Tx0_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

txz_path_delay_expression
locals [ Txz_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

tzx_path_delay_expression
locals [ Tzx_path_delay_expressionContextExt extendedContext ]
:  path_delay_expression ;

path_delay_expression
locals [ Path_delay_expressionContextExt extendedContext ]
:  constant_mintypmax_expression ;

edge_sensitive_path_declaration
locals [ Edge_sensitive_path_declarationContextExt extendedContext ]
:  parallel_edge_sensitive_path_description  assign  path_delay_value 
|  full_edge_sensitive_path_description  assign  path_delay_value ;

parallel_edge_sensitive_path_description
locals [ Parallel_edge_sensitive_path_descriptionContextExt extendedContext ]
:  lparen  edge_identifier?  specify_input_terminal_descriptor  implies  lparen  specify_output_terminal_descriptor  polarity_operator?  colon  data_source_expression  rparen  rparen ;

full_edge_sensitive_path_description
locals [ Full_edge_sensitive_path_descriptionContextExt extendedContext ]
:  lparen  edge_identifier?  list_of_path_inputs  stargt  lparen  list_of_path_outputs  polarity_operator?  colon  data_source_expression  rparen  rparen ;

data_source_expression
locals [ Data_source_expressionContextExt extendedContext ]
:  expression ;

edge_identifier
locals [ Edge_identifierContextExt extendedContext ]
:  posedgestr 
|  negedgestr 
|  edgestr ;

state_dependent_path_declaration
locals [ State_dependent_path_declarationContextExt extendedContext ]
:  ifstr  lparen  module_path_expression  rparen  simple_path_declaration 
|  ifstr  lparen  module_path_expression  rparen  edge_sensitive_path_declaration 
|  ifnonestr  simple_path_declaration ;

polarity_operator
locals [ Polarity_operatorContextExt extendedContext ]
:  plus 
|  minus ;

system_timing_check
locals [ System_timing_checkContextExt extendedContext ]
:  setup_timing_check 
|  hold_timing_check 
|  setuphold_timing_check 
|  recovery_timing_check 
|  removal_timing_check 
|  recrem_timing_check 
|  skew_timing_check 
|  timeskew_timing_check 
|  fullskew_timing_check 
|  period_timing_check 
|  width_timing_check 
|  nochange_timing_check ;

setup_timing_check
locals [ Setup_timing_checkContextExt extendedContext ]
:  dollarsetupstr  lparen  data_event  comma  reference_event  comma  timing_check_limit (  comma  notifier  )?  rparen  semi ;

hold_timing_check
locals [ Hold_timing_checkContextExt extendedContext ]
:  dollarholdstr  lparen  reference_event  comma  data_event  comma  timing_check_limit (  comma  notifier  )?  rparen  semi ;

setuphold_timing_check
locals [ Setuphold_timing_checkContextExt extendedContext ]
:  dollarsetupholdstr  lparen  reference_event  comma  data_event  comma  timing_check_limit  comma  timing_check_limit (  comma  notifier? (  comma  timestamp_condition? (  comma  timecheck_condition? (  comma  delayed_reference? (  comma  delayed_data?  )?  )?  )?  )?  )?  rparen  semi ;

recovery_timing_check
locals [ Recovery_timing_checkContextExt extendedContext ]
:  dollarrecoverystr  lparen  reference_event  comma  data_event  comma  timing_check_limit (  comma  notifier  )?  rparen  semi ;

removal_timing_check
locals [ Removal_timing_checkContextExt extendedContext ]
:  dollarremovalstr  lparen  reference_event  comma  data_event  comma  timing_check_limit (  comma  notifier  )?  rparen  semi ;

recrem_timing_check
locals [ Recrem_timing_checkContextExt extendedContext ]
:  dollarrecremstr  lparen  reference_event  comma  data_event  comma  timing_check_limit  comma  timing_check_limit (  comma  notifier? (  comma  timestamp_condition? (  comma  timecheck_condition? (  comma  delayed_reference? (  comma  delayed_data?  )?  )?  )?  )?  )?  rparen  semi ;

skew_timing_check
locals [ Skew_timing_checkContextExt extendedContext ]
:  dollarskewstr  lparen  reference_event  comma  data_event  comma  timing_check_limit (  comma  notifier  )?  rparen  semi ;

timeskew_timing_check
locals [ Timeskew_timing_checkContextExt extendedContext ]
:  dollartimeskewstr  lparen  reference_event  comma  data_event  comma  timing_check_limit (  comma  notifier? (  comma  event_based_flag? (  comma  remain_active_flag?  )?  )?  )?  rparen  semi ;

fullskew_timing_check
locals [ Fullskew_timing_checkContextExt extendedContext ]
:  dollarfullskewstr  lparen  reference_event  comma  data_event  comma  timing_check_limit  comma  timing_check_limit (  comma  notifier (  comma  event_based_flag (  comma  remain_active_flag  )?  )?  )?  rparen  semi ;

period_timing_check
locals [ Period_timing_checkContextExt extendedContext ]
:  dollarperiodstr  lparen  controlled_reference_event  comma  timing_check_limit (  comma  notifier  )?  rparen  semi ;

width_timing_check
locals [ Width_timing_checkContextExt extendedContext ]
:  dollaewidthstr  lparen  controlled_reference_event  comma  timing_check_limit  comma  threshold (  comma  notifier  )?  rparen  semi ;

nochange_timing_check
locals [ Nochange_timing_checkContextExt extendedContext ]
:  dollarnochangestr  lparen  reference_event  comma  data_event  comma  start_edge_offset  comma  end_edge_offset (  comma  notifier  )?  rparen  semi ;

timecheck_condition
locals [ Timecheck_conditionContextExt extendedContext ]
:  mintypmax_expression ;

controlled_reference_event
locals [ Controlled_reference_eventContextExt extendedContext ]
:  controlled_timing_check_event ;

data_event
locals [ Data_eventContextExt extendedContext ]
:  timing_check_event ;

delayed_data
locals [ Delayed_dataContextExt extendedContext ]
:  terminal_identifier 
|  terminal_identifier  lbrack  constant_mintypmax_expression  rbrack ;

delayed_reference
locals [ Delayed_referenceContextExt extendedContext ]
:  terminal_identifier 
|  terminal_identifier  lbrack  constant_mintypmax_expression  rbrack ;

end_edge_offset
locals [ End_edge_offsetContextExt extendedContext ]
:  mintypmax_expression ;

event_based_flag
locals [ Event_based_flagContextExt extendedContext ]
:  constant_expression ;

notifier
locals [ NotifierContextExt extendedContext ]
:  variable_identifier ;

reference_event
locals [ Reference_eventContextExt extendedContext ]
:  timing_check_event ;

remain_active_flag
locals [ Remain_active_flagContextExt extendedContext ]
:  constant_mintypmax_expression ;

timestamp_condition
locals [ Timestamp_conditionContextExt extendedContext ]
:  mintypmax_expression ;

start_edge_offset
locals [ Start_edge_offsetContextExt extendedContext ]
:  mintypmax_expression ;

threshold
locals [ ThresholdContextExt extendedContext ]
:  constant_expression ;

timing_check_limit
locals [ Timing_check_limitContextExt extendedContext ]
:  expression ;

timing_check_event
locals [ Timing_check_eventContextExt extendedContext ]
:  timing_check_event_control?  specify_terminal_descriptor (  andandand  timing_check_condition  )? ;

controlled_timing_check_event
locals [ Controlled_timing_check_eventContextExt extendedContext ]
:  timing_check_event_control  specify_terminal_descriptor (  andandand  timing_check_condition  )? ;

timing_check_event_control
locals [ Timing_check_event_controlContextExt extendedContext ]
:  posedgestr 
|  negedgestr 
|  edgestr 
|  edge_control_specifier ;

specify_terminal_descriptor
locals [ Specify_terminal_descriptorContextExt extendedContext ]
:  specify_input_terminal_descriptor 
|  specify_output_terminal_descriptor ;

edge_control_specifier
locals [ Edge_control_specifierContextExt extendedContext ]
:  edgestr  lbrack  edge_descriptor (  comma  edge_descriptor  )*  rbrack ;

edge_descriptor
locals [ Edge_descriptorContextExt extendedContext ]
:  edge_spec 
|  z_or_x  zero_or_one 
|  zero_or_one  z_or_x ;

timing_check_condition
locals [ Timing_check_conditionContextExt extendedContext ]
:  scalar_timing_check_condition 
|  lparen  scalar_timing_check_condition  rparen ;

scalar_timing_check_condition
locals [ Scalar_timing_check_conditionContextExt extendedContext ]
:  expression 
|  compliment  expression 
|  expression  equals  scalar_constant 
|  expression  case_equality  scalar_constant 
|  expression  not_equals  scalar_constant 
|  expression  case_inequality  scalar_constant ;

scalar_constant
locals [ Scalar_constantContextExt extendedContext ]
:  binary_number 
|  edge_spec 
|  zero_or_one ;

concatenation
locals [ ConcatenationContextExt extendedContext ]
:  lcurl  expression (  comma  expression  )*  rcurl ;

constant_concatenation
locals [ Constant_concatenationContextExt extendedContext ]
:  lcurl  constant_expression (  comma  constant_expression  )*  rcurl ;

constant_multiple_concatenation
locals [ Constant_multiple_concatenationContextExt extendedContext ]
:  lcurl  constant_expression  constant_concatenation  rcurl ;

module_path_concatenation
locals [ Module_path_concatenationContextExt extendedContext ]
:  lcurl  module_path_expression (  comma  module_path_expression  )*  rcurl ;

module_path_multiple_concatenation
locals [ Module_path_multiple_concatenationContextExt extendedContext ]
:  lcurl  constant_expression  module_path_concatenation  rcurl ;

multiple_concatenation
locals [ Multiple_concatenationContextExt extendedContext ]
:  lcurl  expression  concatenation  rcurl ;

streaming_concatenation
locals [ Streaming_concatenationContextExt extendedContext ]
:  lcurl  stream_operator  slice_size?  stream_concatenation  rcurl ;

stream_operator
locals [ Stream_operatorContextExt extendedContext ]
:  rshift 
|  lshift ;

slice_size
locals [ Slice_sizeContextExt extendedContext ]
:  simple_type 
|  constant_expression ;

stream_concatenation
locals [ Stream_concatenationContextExt extendedContext ]
:  lcurl  stream_expression (  comma  stream_expression  )*  rcurl ;

stream_expression
locals [ Stream_expressionContextExt extendedContext ]
:  expression (  withstr  lbrack  array_range_expression  rbrack  )? ;

array_range_expression
locals [ Array_range_expressionContextExt extendedContext ]
:  expression 
|  expression  colon  expression 
|  expression  pluscolon  expression 
|  expression  minuscolon  expression ;

empty_queue
locals [ Empty_queueContextExt extendedContext ]
:  lcurl  rcurl ;

constant_function_call
locals [ Constant_function_callContextExt extendedContext ]
:  function_subroutine_call ;

tf_call
locals [ Tf_callContextExt extendedContext ]
:  ps_or_hierarchical_tf_identifier  attribute_instance? (  lparen  list_of_arguments  rparen  )? ;

system_tf_call
locals [ System_tf_callContextExt extendedContext ]
:  system_tf_identifier (  lparen  list_of_arguments  rparen  )? 
|  system_tf_identifier  lparen  data_type (  comma  expression  )?  rparen ;

subroutine_call
locals [ Subroutine_callContextExt extendedContext ]
:  tf_call 
|  system_tf_call 
|  method_call 
| (  stdcoloncolon  )?  randomize_call ;

function_subroutine_call
locals [ Function_subroutine_callContextExt extendedContext ]
:  subroutine_call ;

list_of_arguments
locals [ List_of_argumentsContextExt extendedContext ]
:  expression?  list_of_arguments_part1* (  comma  list_of_arguments_part2  )* 
|  list_of_arguments_part2 (  comma  list_of_arguments_part2  )* ;

list_of_arguments_part1
locals [ List_of_arguments_part1ContextExt extendedContext ]
:  comma  expression? ;

list_of_arguments_part2
locals [ List_of_arguments_part2ContextExt extendedContext ]
:  dot  identifier  lparen  expression?  rparen ;

method_call
locals [ Method_callContextExt extendedContext ]
:  method_call_root  dot  method_call_body ;

method_call_body
locals [ Method_call_bodyContextExt extendedContext ]
:  method_identifier  attribute_instance? (  lparen  list_of_arguments  rparen  )? 
|  built_in_method_call ;

built_in_method_call
locals [ Built_in_method_callContextExt extendedContext ]
:  array_manipulation_call 
|  randomize_call ;

array_manipulation_call
locals [ Array_manipulation_callContextExt extendedContext ]
:  array_method_name  attribute_instance? (  lparen  list_of_arguments  rparen  )? (  withstr  lparen  expression  rparen  )? ;

randomize_call
locals [ Randomize_callContextExt extendedContext ]
:  randomizestr  attribute_instance? (  lparen (  variable_identifier_list  |  nullstr  )?  rparen  )? (  withstr (  lparen  identifier_list?  rparen  )?  constraint_block  )? ;

method_call_root
locals [ Method_call_rootContextExt extendedContext ]
:  primary_no_function_call 
|  implicit_class_handle ;

array_method_name
locals [ Array_method_nameContextExt extendedContext ]
:  method_identifier 
|  uniquestr 
|  andstr 
|  orstr 
|  xorstrstr ;

inc_or_dec_expression
locals [ Inc_or_dec_expressionContextExt extendedContext ]
:  inc_or_dec_expression_part1  variable_lvalue 
|  inc_or_dec_expression_part2  inc_or_dec_operator ;

inc_or_dec_expression_part1
locals [ Inc_or_dec_expression_part1ContextExt extendedContext ]
:  inc_or_dec_operator  attribute_instance? ;

inc_or_dec_expression_part2
locals [ Inc_or_dec_expression_part2ContextExt extendedContext ]
:  variable_lvalue  attribute_instance? ;

constant_expression
locals [ Constant_expressionContextExt extendedContext ]
:  constant_primary #const_expr_only_primary
|  unary_operator  attribute_instance*  constant_primary #const_expr_unary_op
|  constant_expression  starstar  attribute_instance*  constant_expression #const_expr_st_st
|  constant_expression (  star  |  div  |  modulo  ) attribute_instance*  constant_expression #const_expr_mutl
|  constant_expression (  plus  |  minus  ) attribute_instance*  constant_expression #const_expr_add
|  constant_expression (  lshift  |  rshift  |  alshift  |  arshift  ) attribute_instance*  constant_expression #const_expr_shift
|  constant_expression (  lt  |  gt  |  le  |  ge  ) attribute_instance*  constant_expression #const_expr_comp
|  constant_expression (  equals  |  not_equals  |  case_equality  |  case_inequality  |  case_q  |  not_case_q  ) attribute_instance*  constant_expression #const_expr_equality
|  constant_expression (  and  ) attribute_instance*  constant_expression #const_expr_binary_and
|  constant_expression (  xor  |  xnor  |  xorn  ) attribute_instance*  constant_expression #const_expr_binary_xor
|  constant_expression (  or  ) attribute_instance*  constant_expression #const_expr_binary_or
|  constant_expression (  log_and  ) attribute_instance*  constant_expression #const_expr_log_and
|  constant_expression (  log_or  ) attribute_instance*  constant_expression #const_expr_log_or
|  constant_expression  questinmark  attribute_instance*  constant_expression  colon  constant_expression #const_expr_conditional;

constant_mintypmax_expression
locals [ Constant_mintypmax_expressionContextExt extendedContext ]
:  constant_expression 
|  constant_expression  colon  constant_expression  colon  constant_expression ;

constant_param_expression
locals [ Constant_param_expressionContextExt extendedContext ]
:  constant_mintypmax_expression 
|  data_type 
|  dollar ;

param_expression
locals [ Param_expressionContextExt extendedContext ]
:  mintypmax_expression 
|  data_type ;

constant_range_expression
locals [ Constant_range_expressionContextExt extendedContext ]
:  constant_expression 
|  constant_part_select_range ;

constant_part_select_range
locals [ Constant_part_select_rangeContextExt extendedContext ]
:  constant_range 
|  constant_indexed_range ;

constant_range
locals [ Constant_rangeContextExt extendedContext ]
:  constant_expression  colon  constant_expression ;

constant_indexed_range
locals [ Constant_indexed_rangeContextExt extendedContext ]
:  constant_expression  pluscolon  constant_expression 
|  constant_expression  minuscolon  constant_expression ;

expr_
locals [ Expr_ContextExt extendedContext ]
:  expression ;

expression
locals [ ExpressionContextExt extendedContext ]
:  primary #expression_only_primary
|  unary_operator  attribute_instance*  primary #expression_unary_op
|  inc_or_dec_expression #expression_inc_or_dec
|  lparen  operator_assignment  rparen #expression_op_assign
|  expression  starstar  attribute_instance*  expression #expression_st_st
|  expression (  star  |  div  |  modulo  ) attribute_instance*  expression #expression_mult
|  expression (  plus  |  minus  ) attribute_instance*  expression #expression_add
|  expression (  lshift  |  rshift  |  alshift  |  arshift  ) attribute_instance*  expression #expression_shift
|  expression (  lt  |  gt  |  le  |  ge  ) attribute_instance*  expression #expression_comp
|  expression  insidestr  lcurl  open_range_list  rcurl #expression_inside_exp
|  expression (  equals  |  not_equals  |  case_equality  |  case_inequality  |  case_q  |  not_case_q  ) attribute_instance*  expression #expression_equality
|  expression (  and  ) attribute_instance*  expression #expression_binary_and
|  expression (  xor  |  xnor  |  xorn  ) attribute_instance*  expression #expression_binary_xor
|  expression (  or  ) attribute_instance*  expression #expression_binary_or
|  expression (  log_and  ) attribute_instance*  expression #expression_log_and
|  expression (  log_or  ) attribute_instance*  expression #expression_log_or
|  expression (  questinmark  attribute_instance*  expression  colon  expression  )#expression_conditional_exp
|  tagged_union_expression #expression_tagged_union;

matches_pattern
locals [ Matches_patternContextExt extendedContext ]
:  matchesstr  pattern ;

tagged_union_expression
locals [ Tagged_union_expressionContextExt extendedContext ]
:  taggedstr  member_identifier  expression? ;

value_range
locals [ Value_rangeContextExt extendedContext ]
:  expression 
|  lbrack  expression  colon  expression  rbrack ;

mintypmax_expression
locals [ Mintypmax_expressionContextExt extendedContext ]
:  expression 
|  expression  colon  expression  colon  expression ;

module_path_expression
locals [ Module_path_expressionContextExt extendedContext ]
:  module_path_conditional_expression ;

module_path_conditional_expression
locals [ Module_path_conditional_expressionContextExt extendedContext ]
:  module_path_binary_expression (  questinmark  attribute_instance?  module_path_expression  colon  module_path_expression  )? ;

module_path_binary_expression
locals [ Module_path_binary_expressionContextExt extendedContext ]
:  module_path_unary_expression (  binary_module_path_operator  attribute_instance?  module_path_unary_expression  )? ;

module_path_unary_expression
locals [ Module_path_unary_expressionContextExt extendedContext ]
:  unary_module_path_operator  attribute_instance?  module_path_primary ;

module_path_mintypmax_expression
locals [ Module_path_mintypmax_expressionContextExt extendedContext ]
:  module_path_expression 
|  module_path_expression  colon  module_path_expression  colon  module_path_expression ;

part_select_range
locals [ Part_select_rangeContextExt extendedContext ]
:  constant_range 
|  indexed_range ;

indexed_range
locals [ Indexed_rangeContextExt extendedContext ]
:  expression  pluscolon  constant_expression 
|  expression  minuscolon  constant_expression ;

genvar_expression
locals [ Genvar_expressionContextExt extendedContext ]
:  constant_expression ;

constant_primary
locals [ Constant_primaryContextExt extendedContext ]
:  primary_literal 
|  ps_parameter_identifier  constant_select 
|  specparam_identifier (  lbrack  constant_range_expression  rbrack  )? 
|  genvar_identifier 
| (  package_scope  |  class_scope  )?  enum_identifier 
|  constant_concatenation (  lbrack  constant_range_expression  rbrack  )? 
|  constant_multiple_concatenation (  lbrack  constant_range_expression  rbrack  )? 
|  constant_function_call 
|  constant_let_expression 
|  lparen  constant_mintypmax_expression  rparen 
|  constant_cast 
|  constant_assignment_pattern_expression 
|  type_reference ;

module_path_primary
locals [ Module_path_primaryContextExt extendedContext ]
:  number 
|  identifier 
|  module_path_concatenation 
|  module_path_multiple_concatenation 
|  function_subroutine_call 
|  lparen  module_path_mintypmax_expression  rparen ;

primary_no_function_call
locals [ Primary_no_function_callContextExt extendedContext ]
:  primary_literal 
| (  implicit_class_handle  dot  |  class_scope  |  package_scope  )?  hierarchical_identifier  select 
|  empty_queue 
|  concatenation (  lbrack  range_expression  rbrack  )? 
|  multiple_concatenation (  lbrack  range_expression  rbrack  )? 
|  let_expression 
|  lparen  mintypmax_expression  rparen 
|  cast 
|  assignment_pattern_expression 
|  streaming_concatenation 
|  sequence_method_call 
|  thisstr 
|  dollar 
|  nullstr ;

primary
locals [ PrimaryContextExt extendedContext ]
:  primary_no_function_call 
|  function_subroutine_call ;

class_qualifier
locals [ Class_qualifierContextExt extendedContext ]
: (  localcoloncolon  )? (  implicit_class_handle  dot  |  class_scope  )? ;

range_expression
locals [ Range_expressionContextExt extendedContext ]
:  expression 
|  part_select_range ;

primary_literal
locals [ Primary_literalContextExt extendedContext ]
:  number 
|  time_literal 
|  unbased_unsized_literal 
|  string_literal ;

time_literal
locals [ Time_literalContextExt extendedContext ]
:  zero_or_one  time_unit 
|  edge_spec  time_unit 
|  decimal_number  time_unit 
|  real_number  time_unit ;

implicit_class_handle
locals [ Implicit_class_handleContextExt extendedContext ]
:  thisstr  dot  superstr 
|  thisstr 
|  superstr ;

bit_select
locals [ Bit_selectContextExt extendedContext ]
: (  lbrack  expression  rbrack  )* ;

select
locals [ SelectContextExt extendedContext ]
: ( (  dot  member_identifier  bit_select  )*  dot  member_identifier  )?  bit_select (  lbrack  part_select_range  rbrack  )? ;

nonrange_select
locals [ Nonrange_selectContextExt extendedContext ]
: ( (  dot  member_identifier  bit_select  )*  dot  member_identifier  )?  bit_select ;

constant_bit_select
locals [ Constant_bit_selectContextExt extendedContext ]
: (  lbrack  constant_expression  rbrack  )* ;

constant_select
locals [ Constant_selectContextExt extendedContext ]
: ( (  dot  member_identifier  constant_bit_select  )*  dot  member_identifier  )?  constant_bit_select (  lbrack  constant_part_select_range  rbrack  )* ;

constant_cast
locals [ Constant_castContextExt extendedContext ]
:  casting_type  escapequote  lparen  constant_expression  rparen ;

constant_let_expression
locals [ Constant_let_expressionContextExt extendedContext ]
:  let_expression ;

cast
locals [ CastContextExt extendedContext ]
:  casting_type  escapequote  lparen  expression  rparen ;

net_lvalue
locals [ Net_lvalueContextExt extendedContext ]
:  ps_or_hierarchical_net_identifier  constant_select 
|  lcurl  net_lvalue (  comma  net_lvalue  )*  rcurl 
|  lbrack  assignment_pattern_expression_type  rbrack  assignment_pattern_net_lvalue ;

variable_lvalue
locals [ Variable_lvalueContextExt extendedContext ]
: (  implicit_class_handle  dot  |  package_scope  )?  hierarchical_variable_identifier  select 
|  lcurl  variable_lvalue (  comma  variable_lvalue  )*  rcurl 
| (  assignment_pattern_expression_type  )?  assignment_pattern_variable_lvalue 
|  streaming_concatenation ;

nonrange_variable_lvalue
locals [ Nonrange_variable_lvalueContextExt extendedContext ]
: (  implicit_class_handle  dot  |  package_scope  )?  hierarchical_variable_identifier  nonrange_select ;

unary_operator
locals [ Unary_operatorContextExt extendedContext ]
:  plus 
|  minus 
|  not 
|  compliment 
|  and 
|  nand 
|  or 
|  nor 
|  xor 
|  xorn 
|  xnor ;

binary_operator
locals [ Binary_operatorContextExt extendedContext ]
:  plus 
|  minus 
|  star 
|  div 
|  modulo 
|  equals 
|  not_equals 
|  case_equality 
|  case_inequality 
|  case_q 
|  not_case_q 
|  log_and 
|  log_or 
|  starstar 
|  lt 
|  le 
|  gt 
|  ge 
|  and 
|  or 
|  xor 
|  xnor 
|  xorn 
|  rshift 
|  lshift 
|  arshift 
|  alshift 
|  derive 
|  dderive ;

inc_or_dec_operator
locals [ Inc_or_dec_operatorContextExt extendedContext ]
:  increment 
|  decrement ;

increment
locals [ IncrementContextExt extendedContext ]
:  plus  plus ;

decrement
locals [ DecrementContextExt extendedContext ]
:  minus  minus ;

unary_module_path_operator
locals [ Unary_module_path_operatorContextExt extendedContext ]
:  not 
|  compliment 
|  and 
|  nand 
|  or 
|  nor 
|  xor 
|  xnor 
|  xorn ;

binary_module_path_operator
locals [ Binary_module_path_operatorContextExt extendedContext ]
:  equals 
|  not_equals 
|  log_and 
|  log_or 
|  and 
|  or 
|  xor 
|  xnor 
|  xorn ;

unbased_unsized_literal
locals [ Unbased_unsized_literalContextExt extendedContext ]
:  scalar_constant0 
|  scalar_constant1 
|  escapequote  z_or_x ;

string_literal
locals [ String_literalContextExt extendedContext ]
:  string ;

attribute_instance
locals [ Attribute_instanceContextExt extendedContext ]
:  lparenstar  attr_spec (  comma  attr_spec  )*  starrparen ;

attr_spec
locals [ Attr_specContextExt extendedContext ]
:  attr_name (  assign  constant_expression  )? ;

attr_name
locals [ Attr_nameContextExt extendedContext ]
:  identifier ;

array_identifier
locals [ Array_identifierContextExt extendedContext ]
:  identifier ;

block_identifier
locals [ Block_identifierContextExt extendedContext ]
:  identifier ;

bin_identifier
locals [ Bin_identifierContextExt extendedContext ]
:  identifier ;

c_identifier
locals [ C_identifierContextExt extendedContext ]
:  simple_identifier ;

cell_identifier
locals [ Cell_identifierContextExt extendedContext ]
:  identifier ;

checker_identifier
locals [ Checker_identifierContextExt extendedContext ]
:  identifier ;

class_identifier
locals [ Class_identifierContextExt extendedContext ]
:  identifier ;

class_variable_identifier
locals [ Class_variable_identifierContextExt extendedContext ]
:  variable_identifier ;

clocking_identifier
locals [ Clocking_identifierContextExt extendedContext ]
:  identifier ;

config_identifier
locals [ Config_identifierContextExt extendedContext ]
:  identifier ;

const_identifier
locals [ Const_identifierContextExt extendedContext ]
:  identifier ;

constraint_identifier
locals [ Constraint_identifierContextExt extendedContext ]
:  identifier ;

covergroup_identifier
locals [ Covergroup_identifierContextExt extendedContext ]
:  identifier ;

covergroup_variable_identifier
locals [ Covergroup_variable_identifierContextExt extendedContext ]
:  variable_identifier ;

cover_point_identifier
locals [ Cover_point_identifierContextExt extendedContext ]
:  identifier ;

cross_identifier
locals [ Cross_identifierContextExt extendedContext ]
:  identifier ;

dynamic_array_variable_identifier
locals [ Dynamic_array_variable_identifierContextExt extendedContext ]
:  variable_identifier ;

enum_identifier
locals [ Enum_identifierContextExt extendedContext ]
:  identifier ;

escaped_identifier
locals [ Escaped_identifierContextExt extendedContext ]
:  esc_identifier ;

formal_identifier
locals [ Formal_identifierContextExt extendedContext ]
:  identifier ;

function_identifier
locals [ Function_identifierContextExt extendedContext ]
:  identifier ;

generate_block_identifier
locals [ Generate_block_identifierContextExt extendedContext ]
:  identifier ;

genvar_identifier
locals [ Genvar_identifierContextExt extendedContext ]
:  identifier ;

hierarchical_array_identifier
locals [ Hierarchical_array_identifierContextExt extendedContext ]
:  hierarchical_identifier ;

hierarchical_block_identifier
locals [ Hierarchical_block_identifierContextExt extendedContext ]
:  hierarchical_identifier ;

hierarchical_event_identifier
locals [ Hierarchical_event_identifierContextExt extendedContext ]
:  hierarchical_identifier ;

hierarchical_identifier
locals [ Hierarchical_identifierContextExt extendedContext ]
: (  dollarrootstr  dot  )? (  identifier  constant_bit_select  dot  )*  identifier ;

hierarchical_net_identifier
locals [ Hierarchical_net_identifierContextExt extendedContext ]
:  hierarchical_identifier ;

hierarchical_parameter_identifier
locals [ Hierarchical_parameter_identifierContextExt extendedContext ]
:  hierarchical_identifier ;

hierarchical_property_identifier
locals [ Hierarchical_property_identifierContextExt extendedContext ]
:  hierarchical_identifier ;

hierarchical_sequence_identifier
locals [ Hierarchical_sequence_identifierContextExt extendedContext ]
:  hierarchical_identifier ;

hierarchical_task_identifier
locals [ Hierarchical_task_identifierContextExt extendedContext ]
:  hierarchical_identifier ;

hierarchical_tf_identifier
locals [ Hierarchical_tf_identifierContextExt extendedContext ]
:  hierarchical_identifier ;

hierarchical_variable_identifier
locals [ Hierarchical_variable_identifierContextExt extendedContext ]
:  hierarchical_identifier ;

identifier
locals [ IdentifierContextExt extendedContext ]
:  simple_identifier 
|  escaped_identifier ;

index_variable_identifier
locals [ Index_variable_identifierContextExt extendedContext ]
:  identifier ;

interface_identifier
locals [ Interface_identifierContextExt extendedContext ]
:  identifier ;

interface_instance_identifier
locals [ Interface_instance_identifierContextExt extendedContext ]
:  identifier ;

inout_port_identifier
locals [ Inout_port_identifierContextExt extendedContext ]
:  identifier ;

input_port_identifier
locals [ Input_port_identifierContextExt extendedContext ]
:  identifier ;

instance_identifier
locals [ Instance_identifierContextExt extendedContext ]
:  identifier ;

library_identifier
locals [ Library_identifierContextExt extendedContext ]
:  identifier ;

member_identifier
locals [ Member_identifierContextExt extendedContext ]
:  identifier ;

method_identifier
locals [ Method_identifierContextExt extendedContext ]
:  identifier ;

modport_identifier
locals [ Modport_identifierContextExt extendedContext ]
:  identifier ;

module_identifier
locals [ Module_identifierContextExt extendedContext ]
:  identifier ;

net_identifier
locals [ Net_identifierContextExt extendedContext ]
:  identifier ;

output_port_identifier
locals [ Output_port_identifierContextExt extendedContext ]
:  identifier ;

package_identifier
locals [ Package_identifierContextExt extendedContext ]
:  identifier ;

package_scope
locals [ Package_scopeContextExt extendedContext ]
:  package_identifier  coloncolon 
|  dollarunitstr  coloncolon ;

parameter_identifier
locals [ Parameter_identifierContextExt extendedContext ]
:  identifier ;

port_identifier
locals [ Port_identifierContextExt extendedContext ]
:  identifier ;

production_identifier
locals [ Production_identifierContextExt extendedContext ]
:  identifier ;

program_identifier
locals [ Program_identifierContextExt extendedContext ]
:  identifier ;

property_identifier
locals [ Property_identifierContextExt extendedContext ]
:  identifier ;

ps_class_identifier
locals [ Ps_class_identifierContextExt extendedContext ]
:  package_scope?  class_identifier ;

ps_covergroup_identifier
locals [ Ps_covergroup_identifierContextExt extendedContext ]
:  package_scope?  covergroup_identifier ;

ps_identifier
locals [ Ps_identifierContextExt extendedContext ]
:  package_scope?  identifier ;

ps_or_hierarchical_array_identifier
locals [ Ps_or_hierarchical_array_identifierContextExt extendedContext ]
:  ps_or_hierarchical_array_identifier_part1*  hierarchical_array_identifier ;

ps_or_hierarchical_array_identifier_part1
locals [ Ps_or_hierarchical_array_identifier_part1ContextExt extendedContext ]
:  implicit_class_handle  dot 
|  class_scope 
|  package_scope ;

ps_or_hierarchical_net_identifier
locals [ Ps_or_hierarchical_net_identifierContextExt extendedContext ]
:  package_scope?  net_identifier 
|  hierarchical_net_identifier ;

ps_or_hierarchical_property_identifier
locals [ Ps_or_hierarchical_property_identifierContextExt extendedContext ]
:  package_scope?  property_identifier 
|  hierarchical_property_identifier ;

ps_or_hierarchical_sequence_identifier
locals [ Ps_or_hierarchical_sequence_identifierContextExt extendedContext ]
:  package_scope?  sequence_identifier 
|  hierarchical_sequence_identifier ;

ps_or_hierarchical_tf_identifier
locals [ Ps_or_hierarchical_tf_identifierContextExt extendedContext ]
:  package_scope?  tf_identifier 
|  hierarchical_tf_identifier ;

ps_parameter_identifier
locals [ Ps_parameter_identifierContextExt extendedContext ]
:  package_scope?  parameter_identifier 
|  ps_parameter_identifier_part1*  parameter_identifier ;

ps_parameter_identifier_part1
locals [ Ps_parameter_identifier_part1ContextExt extendedContext ]
:  generate_block_identifier (  lbrack  constant_expression  rbrack  )?  dot ;

ps_type_identifier
locals [ Ps_type_identifierContextExt extendedContext ]
: (  localcoloncolon  |  package_scope  )?  type_identifier ;

sequence_identifier
locals [ Sequence_identifierContextExt extendedContext ]
:  identifier ;

signal_identifier
locals [ Signal_identifierContextExt extendedContext ]
:  identifier ;

simple_identifier
locals [ Simple_identifierContextExt extendedContext ]
:  id ;

specparam_identifier
locals [ Specparam_identifierContextExt extendedContext ]
:  identifier ;

system_tf_identifier
locals [ System_tf_identifierContextExt extendedContext ]
:  tf_id ;

task_identifier
locals [ Task_identifierContextExt extendedContext ]
:  identifier ;

tf_identifier
locals [ Tf_identifierContextExt extendedContext ]
:  identifier ;

terminal_identifier
locals [ Terminal_identifierContextExt extendedContext ]
:  identifier ;

topmodule_identifier
locals [ Topmodule_identifierContextExt extendedContext ]
:  identifier ;

type_identifier
locals [ Type_identifierContextExt extendedContext ]
:  identifier ;

udp_identifier
locals [ Udp_identifierContextExt extendedContext ]
:  identifier ;

bins_identifier
locals [ Bins_identifierContextExt extendedContext ]
:  identifier ;

variable_identifier
locals [ Variable_identifierContextExt extendedContext ]
:  identifier ;

number
locals [ NumberContextExt extendedContext ]
:  minus?  edge_spec 
|  minus?  zero_or_one 
|  minus?  decimal_number 
|  octal_number 
|  binary_number 
|  hex_number 
|  real_number ;

eof
locals [ EofContextExt extendedContext ]
:  EOF ;

endmodulestr
locals [ EndmodulestrContextExt extendedContext ]
:  ENDMODULESTR 
;

colon
locals [ ColonContextExt extendedContext ]
:  COLON 
;

externstr
locals [ ExternstrContextExt extendedContext ]
:  EXTERNSTR 
;

semi
locals [ SemiContextExt extendedContext ]
:  SEMI 
;

modulestr
locals [ ModulestrContextExt extendedContext ]
:  MODULESTR 
;

macromodulestr
locals [ MacromodulestrContextExt extendedContext ]
:  MACROMODULESTR 
;

endinterfacestr
locals [ EndinterfacestrContextExt extendedContext ]
:  ENDINTERFACESTR 
;

interfacestr
locals [ InterfacestrContextExt extendedContext ]
:  INTERFACESTR 
;

lparen
locals [ LparenContextExt extendedContext ]
:  LPAREN 
;

dotstar
locals [ DotstarContextExt extendedContext ]
:  DOTSTAR 
;

rparen
locals [ RparenContextExt extendedContext ]
:  RPAREN 
;

endprogramstr
locals [ EndprogramstrContextExt extendedContext ]
:  ENDPROGRAMSTR 
;

programstr
locals [ ProgramstrContextExt extendedContext ]
:  PROGRAMSTR 
;

checkerstr
locals [ CheckerstrContextExt extendedContext ]
:  CHECKERSTR 
;

endcheckerstr
locals [ EndcheckerstrContextExt extendedContext ]
:  ENDCHECKERSTR 
;

virtualstr
locals [ VirtualstrContextExt extendedContext ]
:  VIRTUALSTR 
;

classstr
locals [ ClassstrContextExt extendedContext ]
:  CLASSSTR 
;

extendsstr
locals [ ExtendsstrContextExt extendedContext ]
:  EXTENDSSTR 
;

endclassstr
locals [ EndclassstrContextExt extendedContext ]
:  ENDCLASSSTR 
;

packagestr
locals [ PackagestrContextExt extendedContext ]
:  PACKAGESTR 
;

endpackagestr
locals [ EndpackagestrContextExt extendedContext ]
:  ENDPACKAGESTR 
;

timeunit
locals [ TimeunitContextExt extendedContext ]
:  TIMEUNIT 
;

div
locals [ DivContextExt extendedContext ]
:  DIV 
;

hash
locals [ HashContextExt extendedContext ]
:  HASH 
;

comma
locals [ CommaContextExt extendedContext ]
:  COMMA 
;

typestr
locals [ TypestrContextExt extendedContext ]
:  TYPESTR 
;

dot
locals [ DotContextExt extendedContext ]
:  DOT 
;

lcurl
locals [ LcurlContextExt extendedContext ]
:  LCURL 
;

rcurl
locals [ RcurlContextExt extendedContext ]
:  RCURL 
;

inputstr
locals [ InputstrContextExt extendedContext ]
:  INPUTSTR 
;

outputstr
locals [ OutputstrContextExt extendedContext ]
:  OUTPUTSTR 
;

inoutstr
locals [ InoutstrContextExt extendedContext ]
:  INOUTSTR 
;

refstr
locals [ RefstrContextExt extendedContext ]
:  REFSTR 
;

assign
locals [ AssignContextExt extendedContext ]
:  ASSIGN 
;

dollarfatalstr
locals [ DollarfatalstrContextExt extendedContext ]
:  DOLLARFATALSTR 
;

dollarerrorstr
locals [ DollarerrorstrContextExt extendedContext ]
:  DOLLARERRORSTR 
;

dollarwarningstr
locals [ DollarwarningstrContextExt extendedContext ]
:  DOLLARWARNINGSTR 
;

dollarinfostr
locals [ DollarinfostrContextExt extendedContext ]
:  DOLLARINFOSTR 
;

defparamstr
locals [ DefparamstrContextExt extendedContext ]
:  DEFPARAMSTR 
;

bindstr
locals [ BindstrContextExt extendedContext ]
:  BINDSTR 
;

configstr
locals [ ConfigstrContextExt extendedContext ]
:  CONFIGSTR 
;

endconfigstr
locals [ EndconfigstrContextExt extendedContext ]
:  ENDCONFIGSTR 
;

designstr
locals [ DesignstrContextExt extendedContext ]
:  DESIGNSTR 
;

defaultstr
locals [ DefaultstrContextExt extendedContext ]
:  DEFAULTSTR 
;

instancestr
locals [ InstancestrContextExt extendedContext ]
:  INSTANCESTR 
;

cellstr
locals [ CellstrContextExt extendedContext ]
:  CELLSTR 
;

libliststr
locals [ LibliststrContextExt extendedContext ]
:  LIBLISTSTR 
;

usestr
locals [ UsestrContextExt extendedContext ]
:  USESTR 
;

clockingstr
locals [ ClockingstrContextExt extendedContext ]
:  CLOCKINGSTR 
;

disablestr
locals [ DisablestrContextExt extendedContext ]
:  DISABLESTR 
;

iffstr
locals [ IffstrContextExt extendedContext ]
:  IFFSTR 
;

forkjoinstr
locals [ ForkjoinstrContextExt extendedContext ]
:  FORKJOINSTR 
;

alwaysstr
locals [ AlwaysstrContextExt extendedContext ]
:  ALWAYSSTR 
;

conststr
locals [ ConststrContextExt extendedContext ]
:  CONSTSTR 
;

functionstr
locals [ FunctionstrContextExt extendedContext ]
:  FUNCTIONSTR 
;

newstr
locals [ NewstrContextExt extendedContext ]
:  NEWSTR 
;

staticstr
locals [ StaticstrContextExt extendedContext ]
:  STATICSTR 
;

protectedstr
locals [ ProtectedstrContextExt extendedContext ]
:  PROTECTEDSTR 
;

localstr
locals [ LocalstrContextExt extendedContext ]
:  LOCALSTR 
;

randstr
locals [ RandstrContextExt extendedContext ]
:  RANDSTR 
;

randcstr
locals [ RandcstrContextExt extendedContext ]
:  RANDCSTR 
;

purestr
locals [ PurestrContextExt extendedContext ]
:  PURESTR 
;

superstr
locals [ SuperstrContextExt extendedContext ]
:  SUPERSTR 
;

endfunctionstr
locals [ EndfunctionstrContextExt extendedContext ]
:  ENDFUNCTIONSTR 
;

constraintstr
locals [ ConstraintstrContextExt extendedContext ]
:  CONSTRAINTSTR 
;

solvestr
locals [ SolvestrContextExt extendedContext ]
:  SOLVESTR 
;

beforestr
locals [ BeforestrContextExt extendedContext ]
:  BEFORESTR 
;

derive
locals [ DeriveContextExt extendedContext ]
:  DERIVE 
;

ifstr
locals [ IfstrContextExt extendedContext ]
:  IFSTR 
;

elsestr
locals [ ElsestrContextExt extendedContext ]
:  ELSESTR 
;

foreachstr
locals [ ForeachstrContextExt extendedContext ]
:  FOREACHSTR 
;

lbrack
locals [ LbrackContextExt extendedContext ]
:  LBRACK 
;

rbrack
locals [ RbrackContextExt extendedContext ]
:  RBRACK 
;

colonequals
locals [ ColonequalsContextExt extendedContext ]
:  COLONEQUALS 
;

colonslash
locals [ ColonslashContextExt extendedContext ]
:  COLONSLASH 
;

localparamstr
locals [ LocalparamstrContextExt extendedContext ]
:  LOCALPARAMSTR 
;

parameterstr
locals [ ParameterstrContextExt extendedContext ]
:  PARAMETERSTR 
;

specparamstr
locals [ SpecparamstrContextExt extendedContext ]
:  SPECPARAMSTR 
;

varstr
locals [ VarstrContextExt extendedContext ]
:  VARSTR 
;

importstr
locals [ ImportstrContextExt extendedContext ]
:  IMPORTSTR 
;

coloncolon
locals [ ColoncolonContextExt extendedContext ]
:  COLONCOLON 
;

star
locals [ StarContextExt extendedContext ]
:  STAR 
;

export
locals [ ExportContextExt extendedContext ]
:  EXPORT 
;

startcoloncolonstar
locals [ StartcoloncolonstarContextExt extendedContext ]
:  STARTCOLONCOLONSTAR 
;

genvarstr
locals [ GenvarstrContextExt extendedContext ]
:  GENVARSTR 
;

vectoredstr
locals [ VectoredstrContextExt extendedContext ]
:  VECTOREDSTR 
;

scalaredstr
locals [ ScalaredstrContextExt extendedContext ]
:  SCALAREDSTR 
;

typedefstr
locals [ TypedefstrContextExt extendedContext ]
:  TYPEDEFSTR 
;

enumstr
locals [ EnumstrContextExt extendedContext ]
:  ENUMSTR 
;

structstr
locals [ StructstrContextExt extendedContext ]
:  STRUCTSTR 
;

unionstr
locals [ UnionstrContextExt extendedContext ]
:  UNIONSTR 
;

automaticstr
locals [ AutomaticstrContextExt extendedContext ]
:  AUTOMATICSTR 
;

stringstr
locals [ StringstrContextExt extendedContext ]
:  STRINGSTR 
;

packedstr
locals [ PackedstrContextExt extendedContext ]
:  PACKEDSTR 
;

chandlestr
locals [ ChandlestrContextExt extendedContext ]
:  CHANDLESTR 
;

eventstr
locals [ EventstrContextExt extendedContext ]
:  EVENTSTR 
;

zero_or_one
locals [ Zero_or_oneContextExt extendedContext ]
:  Zero_Or_One 
;

edge_spec
locals [ Edge_specContextExt extendedContext ]
:  EDGE_SPEC 
;

decimal_number
locals [ Decimal_numberContextExt extendedContext ]
:  Decimal_number 
;

bytestr
locals [ BytestrContextExt extendedContext ]
:  BYTESTR 
;

shortintstr
locals [ ShortintstrContextExt extendedContext ]
:  SHORTINTSTR 
;

intstr
locals [ IntstrContextExt extendedContext ]
:  INTSTR 
;

longintstr
locals [ LongintstrContextExt extendedContext ]
:  LONGINTSTR 
;

integerstr
locals [ IntegerstrContextExt extendedContext ]
:  INTEGERSTR 
;

timestr
locals [ TimestrContextExt extendedContext ]
:  TIMESTR 
;

bitstr
locals [ BitstrContextExt extendedContext ]
:  BITSTR 
;

logicstr
locals [ LogicstrContextExt extendedContext ]
:  LOGICSTR 
;

regstr
locals [ RegstrContextExt extendedContext ]
:  REGSTR 
;

shortreal
locals [ ShortrealContextExt extendedContext ]
:  SHORTREAL 
;

realstr
locals [ RealstrContextExt extendedContext ]
:  REALSTR 
;

realtimestr
locals [ RealtimestrContextExt extendedContext ]
:  REALTIMESTR 
;

supply0str
locals [ Supply0strContextExt extendedContext ]
:  SUPPLY0STR 
;

supply1str
locals [ Supply1strContextExt extendedContext ]
:  SUPPLY1STR 
;

tristr
locals [ TristrContextExt extendedContext ]
:  TRISTR 
;

triandstr
locals [ TriandstrContextExt extendedContext ]
:  TRIANDSTR 
;

triorstr
locals [ TriorstrContextExt extendedContext ]
:  TRIORSTR 
;

triregstr
locals [ TriregstrContextExt extendedContext ]
:  TRIREGSTR 
;

tri0str
locals [ Tri0strContextExt extendedContext ]
:  TRI0STR 
;

tri1str
locals [ Tri1strContextExt extendedContext ]
:  TRI1STR 
;

uwirestr
locals [ UwirestrContextExt extendedContext ]
:  UWIRESTR 
;

wirestr
locals [ WirestrContextExt extendedContext ]
:  WIRESTR 
;

wandstr
locals [ WandstrContextExt extendedContext ]
:  WANDSTR 
;

worstr
locals [ WorstrContextExt extendedContext ]
:  WORSTR 
;

signedstr
locals [ SignedstrContextExt extendedContext ]
:  SIGNEDSTR 
;

unsignedstr
locals [ UnsignedstrContextExt extendedContext ]
:  UNSIGNEDSTR 
;

voidstr
locals [ VoidstrContextExt extendedContext ]
:  VOIDSTR 
;

taggedstr
locals [ TaggedstrContextExt extendedContext ]
:  TAGGEDSTR 
;

highz1str
locals [ Highz1strContextExt extendedContext ]
:  HIGHZ1STR 
;

highz0str
locals [ Highz0strContextExt extendedContext ]
:  HIGHZ0STR 
;

strong0
locals [ Strong0ContextExt extendedContext ]
:  STRONG0 
;

pull0str
locals [ Pull0strContextExt extendedContext ]
:  PULL0STR 
;

weak0str
locals [ Weak0strContextExt extendedContext ]
:  WEAK0STR 
;

strong1
locals [ Strong1ContextExt extendedContext ]
:  STRONG1 
;

pull1str
locals [ Pull1strContextExt extendedContext ]
:  PULL1STR 
;

weak1str
locals [ Weak1strContextExt extendedContext ]
:  WEAK1STR 
;

smallstr
locals [ SmallstrContextExt extendedContext ]
:  SMALLSTR 
;

mediumstr
locals [ MediumstrContextExt extendedContext ]
:  MEDIUMSTR 
;

largestr
locals [ LargestrContextExt extendedContext ]
:  LARGESTR 
;

real_number
locals [ Real_numberContextExt extendedContext ]
:  Real_number 
;

onestepstr
locals [ OnestepstrContextExt extendedContext ]
:  ONESTEPSTR 
;

pathpulsedollar
locals [ PathpulsedollarContextExt extendedContext ]
:  PATHPULSEDOLLAR 
;

dollar
locals [ DollarContextExt extendedContext ]
:  DOLLAR 
;

taskstr
locals [ TaskstrContextExt extendedContext ]
:  TASKSTR 
;

dpi_spec_ing2str
locals [ Dpi_spec_ing2strContextExt extendedContext ]
:  DPI_SPEC_ING2STR 
;

dpi_spec_ing1str
locals [ Dpi_spec_ing1strContextExt extendedContext ]
:  DPI_SPEC_ING1STR 
;

contextstr
locals [ ContextstrContextExt extendedContext ]
:  CONTEXTSTR 
;

endtaskstr
locals [ EndtaskstrContextExt extendedContext ]
:  ENDTASKSTR 
;

plus
locals [ PlusContextExt extendedContext ]
:  PLUS 
;

minus
locals [ MinusContextExt extendedContext ]
:  MINUS 
;

starstar
locals [ StarstarContextExt extendedContext ]
:  STARSTAR 
;

modulo
locals [ ModuloContextExt extendedContext ]
:  MODULO 
;

equals
locals [ EqualsContextExt extendedContext ]
:  EQUALS 
;

not_equals
locals [ Not_equalsContextExt extendedContext ]
:  NOT_EQUALS 
;

lt
locals [ LtContextExt extendedContext ]
:  LT 
;

le
locals [ LeContextExt extendedContext ]
:  LE 
;

gt
locals [ GtContextExt extendedContext ]
:  GT 
;

ge
locals [ GeContextExt extendedContext ]
:  GE 
;

modportstr
locals [ ModportstrContextExt extendedContext ]
:  MODPORTSTR 
;

assertstr
locals [ AssertstrContextExt extendedContext ]
:  ASSERTSTR 
;

propertystr
locals [ PropertystrContextExt extendedContext ]
:  PROPERTYSTR 
;

assumestr
locals [ AssumestrContextExt extendedContext ]
:  ASSUMESTR 
;

coverstr
locals [ CoverstrContextExt extendedContext ]
:  COVERSTR 
;

expectstr
locals [ ExpectstrContextExt extendedContext ]
:  EXPECTSTR 
;

sequencestr
locals [ SequencestrContextExt extendedContext ]
:  SEQUENCESTR 
;

restrictstr
locals [ RestrictstrContextExt extendedContext ]
:  RESTRICTSTR 
;

endpropertystr
locals [ EndpropertystrContextExt extendedContext ]
:  ENDPROPERTYSTR 
;

casestr
locals [ CasestrContextExt extendedContext ]
:  CASESTR 
;

endcasestr
locals [ EndcasestrContextExt extendedContext ]
:  ENDCASESTR 
;

notstr
locals [ NotstrContextExt extendedContext ]
:  NOTSTR 
;

orstr
locals [ OrstrContextExt extendedContext ]
:  ORSTR 
;

andstr
locals [ AndstrContextExt extendedContext ]
:  ANDSTR 
;

orderive
locals [ OrderiveContextExt extendedContext ]
:  ORDERIVE 
;

orimplies
locals [ OrimpliesContextExt extendedContext ]
:  ORIMPLIES 
;

endsequencestr
locals [ EndsequencestrContextExt extendedContext ]
:  ENDSEQUENCESTR 
;

untypedstr
locals [ UntypedstrContextExt extendedContext ]
:  UNTYPEDSTR 
;

intersectstr
locals [ IntersectstrContextExt extendedContext ]
:  INTERSECTSTR 
;

first_matchstr
locals [ First_matchstrContextExt extendedContext ]
:  FIRST_MATCHSTR 
;

throughoutstr
locals [ ThroughoutstrContextExt extendedContext ]
:  THROUGHOUTSTR 
;

withinstr
locals [ WithinstrContextExt extendedContext ]
:  WITHINSTR 
;

double_hash
locals [ Double_hashContextExt extendedContext ]
:  DOUBLE_HASH 
;

diststr
locals [ DiststrContextExt extendedContext ]
:  DISTSTR 
;

letstr
locals [ LetstrContextExt extendedContext ]
:  LETSTR 
;

covergroupstr
locals [ CovergroupstrContextExt extendedContext ]
:  COVERGROUPSTR 
;

endgroupstr
locals [ EndgroupstrContextExt extendedContext ]
:  ENDGROUPSTR 
;

optiondot
locals [ OptiondotContextExt extendedContext ]
:  OPTIONDOT 
;

type_optiondot
locals [ Type_optiondotContextExt extendedContext ]
:  TYPE_OPTIONDOT 
;

withstr
locals [ WithstrContextExt extendedContext ]
:  WITHSTR 
;

samplestr
locals [ SamplestrContextExt extendedContext ]
:  SAMPLESTR 
;

attheratelparen
locals [ AttheratelparenContextExt extendedContext ]
:  ATTHERATELPAREN 
;

beginstr
locals [ BeginstrContextExt extendedContext ]
:  BEGINSTR 
;

endstr
locals [ EndstrContextExt extendedContext ]
:  ENDSTR 
;

coverpointstr
locals [ CoverpointstrContextExt extendedContext ]
:  COVERPOINTSTR 
;

wildcardstr
locals [ WildcardstrContextExt extendedContext ]
:  WILDCARDSTR 
;

binsstr
locals [ BinsstrContextExt extendedContext ]
:  BINSSTR 
;

illegal_binsstr
locals [ Illegal_binsstrContextExt extendedContext ]
:  ILLEGAL_BINSSTR 
;

ignore_binsstr
locals [ Ignore_binsstrContextExt extendedContext ]
:  IGNORE_BINSSTR 
;

implies
locals [ ImpliesContextExt extendedContext ]
:  IMPLIES 
;

crossstr
locals [ CrossstrContextExt extendedContext ]
:  CROSSSTR 
;

not
locals [ NotContextExt extendedContext ]
:  NOT 
;

log_and
locals [ Log_andContextExt extendedContext ]
:  LOG_AND 
;

log_or
locals [ Log_orContextExt extendedContext ]
:  LOG_OR 
;

binsofstr
locals [ BinsofstrContextExt extendedContext ]
:  BINSOFSTR 
;

pulldownstr
locals [ PulldownstrContextExt extendedContext ]
:  PULLDOWNSTR 
;

pullupstr
locals [ PullupstrContextExt extendedContext ]
:  PULLUPSTR 
;

cmosstr
locals [ CmosstrContextExt extendedContext ]
:  CMOSSTR 
;

rcmosstr
locals [ RcmosstrContextExt extendedContext ]
:  RCMOSSTR 
;

bufif0str
locals [ Bufif0strContextExt extendedContext ]
:  BUFIF0STR 
;

bufif1str
locals [ Bufif1strContextExt extendedContext ]
:  BUFIF1STR 
;

notif0str
locals [ Notif0strContextExt extendedContext ]
:  NOTIF0STR 
;

notif1str
locals [ Notif1strContextExt extendedContext ]
:  NOTIF1STR 
;

nmosstr
locals [ NmosstrContextExt extendedContext ]
:  NMOSSTR 
;

pmos
locals [ PmosContextExt extendedContext ]
:  PMOS 
;

rnmosstr
locals [ RnmosstrContextExt extendedContext ]
:  RNMOSSTR 
;

rpmosstr
locals [ RpmosstrContextExt extendedContext ]
:  RPMOSSTR 
;

nandstr
locals [ NandstrContextExt extendedContext ]
:  NANDSTR 
;

norstr
locals [ NorstrContextExt extendedContext ]
:  NORSTR 
;

xorstrstr
locals [ XorstrstrContextExt extendedContext ]
:  XORSTRSTR 
;

xnorstr
locals [ XnorstrContextExt extendedContext ]
:  XNORSTR 
;

bufstr
locals [ BufstrContextExt extendedContext ]
:  BUFSTR 
;

tranif0str
locals [ Tranif0strContextExt extendedContext ]
:  TRANIF0STR 
;

tranif1str
locals [ Tranif1strContextExt extendedContext ]
:  TRANIF1STR 
;

rtranif1str
locals [ Rtranif1strContextExt extendedContext ]
:  RTRANIF1STR 
;

rtranif0str
locals [ Rtranif0strContextExt extendedContext ]
:  RTRANIF0STR 
;

transtr
locals [ TranstrContextExt extendedContext ]
:  TRANSTR 
;

rtranstr
locals [ RtranstrContextExt extendedContext ]
:  RTRANSTR 
;

generatestr
locals [ GeneratestrContextExt extendedContext ]
:  GENERATESTR 
;

endgeneratestr
locals [ EndgeneratestrContextExt extendedContext ]
:  ENDGENERATESTR 
;

forstr
locals [ ForstrContextExt extendedContext ]
:  FORSTR 
;

primitivestr
locals [ PrimitivestrContextExt extendedContext ]
:  PRIMITIVESTR 
;

endprimitivestr
locals [ EndprimitivestrContextExt extendedContext ]
:  ENDPRIMITIVESTR 
;

tablestr
locals [ TablestrContextExt extendedContext ]
:  TABLESTR 
;

endtablestr
locals [ EndtablestrContextExt extendedContext ]
:  ENDTABLESTR 
;

initialstr
locals [ InitialstrContextExt extendedContext ]
:  INITIALSTR 
;

binary_number
locals [ Binary_numberContextExt extendedContext ]
:  Binary_number 
;

questinmark
locals [ QuestinmarkContextExt extendedContext ]
:  QUESTINMARK 
;

id
locals [ IdContextExt extendedContext ]
:  ID 
;

assignstrstr
locals [ AssignstrstrContextExt extendedContext ]
:  ASSIGNSTRSTR 
;

aliasstr
locals [ AliasstrContextExt extendedContext ]
:  ALIASSTR 
;

always_combstr
locals [ Always_combstrContextExt extendedContext ]
:  ALWAYS_COMBSTR 
;

always_latchstr
locals [ Always_latchstrContextExt extendedContext ]
:  ALWAYS_LATCHSTR 
;

always_ffstr
locals [ Always_ffstrContextExt extendedContext ]
:  ALWAYS_FFSTR 
;

finalstr
locals [ FinalstrContextExt extendedContext ]
:  FINALSTR 
;

plusequals
locals [ PlusequalsContextExt extendedContext ]
:  PLUSEQUALS 
;

minusequals
locals [ MinusequalsContextExt extendedContext ]
:  MINUSEQUALS 
;

startequals
locals [ StartequalsContextExt extendedContext ]
:  STARTEQUALS 
;

slashequals
locals [ SlashequalsContextExt extendedContext ]
:  SLASHEQUALS 
;

percentileequal
locals [ PercentileequalContextExt extendedContext ]
:  PERCENTILEEQUAL 
;

andequals
locals [ AndequalsContextExt extendedContext ]
:  ANDEQUALS 
;

orequal
locals [ OrequalContextExt extendedContext ]
:  OREQUAL 
;

xorequal
locals [ XorequalContextExt extendedContext ]
:  XOREQUAL 
;

lshift_assign
locals [ Lshift_assignContextExt extendedContext ]
:  LSHIFT_ASSIGN 
;

rshift_assign
locals [ Rshift_assignContextExt extendedContext ]
:  RSHIFT_ASSIGN 
;

unsigned_lshift_assign
locals [ Unsigned_lshift_assignContextExt extendedContext ]
:  UNSIGNED_LSHIFT_ASSIGN 
;

unsigned_rshift_assign
locals [ Unsigned_rshift_assignContextExt extendedContext ]
:  UNSIGNED_RSHIFT_ASSIGN 
;

deassignstr
locals [ DeassignstrContextExt extendedContext ]
:  DEASSIGNSTR 
;

forcestr
locals [ ForcestrContextExt extendedContext ]
:  FORCESTR 
;

releasestr
locals [ ReleasestrContextExt extendedContext ]
:  RELEASESTR 
;

forkstr
locals [ ForkstrContextExt extendedContext ]
:  FORKSTR 
;

joinstr
locals [ JoinstrContextExt extendedContext ]
:  JOINSTR 
;

join_anystr
locals [ Join_anystrContextExt extendedContext ]
:  JOIN_ANYSTR 
;

join_namestr
locals [ Join_namestrContextExt extendedContext ]
:  JOIN_NAMESTR 
;

repeatstr
locals [ RepeatstrContextExt extendedContext ]
:  REPEATSTR 
;

attherate
locals [ AttherateContextExt extendedContext ]
:  ATTHERATE 
;

attheratestar
locals [ AttheratestarContextExt extendedContext ]
:  ATTHERATESTAR 
;

lparenstarrparen
locals [ LparenstarrparenContextExt extendedContext ]
:  LPARENSTARRPAREN 
;

returnstr
locals [ ReturnstrContextExt extendedContext ]
:  RETURNSTR 
;

breakstr
locals [ BreakstrContextExt extendedContext ]
:  BREAKSTR 
;

continuestr
locals [ ContinuestrContextExt extendedContext ]
:  CONTINUESTR 
;

waitstr
locals [ WaitstrContextExt extendedContext ]
:  WAITSTR 
;

wait_orderstr
locals [ Wait_orderstrContextExt extendedContext ]
:  WAIT_ORDERSTR 
;

derivegt
locals [ DerivegtContextExt extendedContext ]
:  DERIVEGT 
;

uniquestr
locals [ UniquestrContextExt extendedContext ]
:  UNIQUESTR 
;

unique0str
locals [ Unique0strContextExt extendedContext ]
:  UNIQUE0STR 
;

prioritystr
locals [ PrioritystrContextExt extendedContext ]
:  PRIORITYSTR 
;

matchesstr
locals [ MatchesstrContextExt extendedContext ]
:  MATCHESSTR 
;

insidestr
locals [ InsidestrContextExt extendedContext ]
:  INSIDESTR 
;

casezstr
locals [ CasezstrContextExt extendedContext ]
:  CASEZSTR 
;

casexstr
locals [ CasexstrContextExt extendedContext ]
:  CASEXSTR 
;

andandand
locals [ AndandandContextExt extendedContext ]
:  ANDANDAND 
;

randcasestr
locals [ RandcasestrContextExt extendedContext ]
:  RANDCASESTR 
;

escapelcurl
locals [ EscapelcurlContextExt extendedContext ]
:  ESCAPELCURL 
;

foreverstr
locals [ ForeverstrContextExt extendedContext ]
:  FOREVERSTR 
;

whilestr
locals [ WhilestrContextExt extendedContext ]
:  WHILESTR 
;

dostr
locals [ DostrContextExt extendedContext ]
:  DOSTR 
;

escapequote
locals [ EscapequoteContextExt extendedContext ]
:  ESCAPEQUOTE 
;

hash_zero
locals [ Hash_zeroContextExt extendedContext ]
:  HASH_ZERO 
;

endclockingstr
locals [ EndclockingstrContextExt extendedContext ]
:  ENDCLOCKINGSTR 
;

globalstr
locals [ GlobalstrContextExt extendedContext ]
:  GLOBALSTR 
;

randsequencestr
locals [ RandsequencestrContextExt extendedContext ]
:  RANDSEQUENCESTR 
;

or
locals [ OrContextExt extendedContext ]
:  OR 
;

specifystr
locals [ SpecifystrContextExt extendedContext ]
:  SPECIFYSTR 
;

endspecifystr
locals [ EndspecifystrContextExt extendedContext ]
:  ENDSPECIFYSTR 
;

pulsestyle_oneventstr
locals [ Pulsestyle_oneventstrContextExt extendedContext ]
:  PULSESTYLE_ONEVENTSTR 
;

pulsestyle_ondetectstr
locals [ Pulsestyle_ondetectstrContextExt extendedContext ]
:  PULSESTYLE_ONDETECTSTR 
;

showcancelledstr
locals [ ShowcancelledstrContextExt extendedContext ]
:  SHOWCANCELLEDSTR 
;

noshowcancelledstr
locals [ NoshowcancelledstrContextExt extendedContext ]
:  NOSHOWCANCELLEDSTR 
;

stargt
locals [ StargtContextExt extendedContext ]
:  STARGT 
;

posedgestr
locals [ PosedgestrContextExt extendedContext ]
:  POSEDGESTR 
;

negedgestr
locals [ NegedgestrContextExt extendedContext ]
:  NEGEDGESTR 
;

edgestr
locals [ EdgestrContextExt extendedContext ]
:  EDGESTR 
;

ifnonestr
locals [ IfnonestrContextExt extendedContext ]
:  IFNONESTR 
;

dollarsetupstr
locals [ DollarsetupstrContextExt extendedContext ]
:  DOLLARSETUPSTR 
;

dollarholdstr
locals [ DollarholdstrContextExt extendedContext ]
:  DOLLARHOLDSTR 
;

dollarsetupholdstr
locals [ DollarsetupholdstrContextExt extendedContext ]
:  DOLLARSETUPHOLDSTR 
;

dollarrecoverystr
locals [ DollarrecoverystrContextExt extendedContext ]
:  DOLLARRECOVERYSTR 
;

dollarremovalstr
locals [ DollarremovalstrContextExt extendedContext ]
:  DOLLARREMOVALSTR 
;

dollarrecremstr
locals [ DollarrecremstrContextExt extendedContext ]
:  DOLLARRECREMSTR 
;

dollarskewstr
locals [ DollarskewstrContextExt extendedContext ]
:  DOLLARSKEWSTR 
;

dollartimeskewstr
locals [ DollartimeskewstrContextExt extendedContext ]
:  DOLLARTIMESKEWSTR 
;

dollarfullskewstr
locals [ DollarfullskewstrContextExt extendedContext ]
:  DOLLARFULLSKEWSTR 
;

dollarperiodstr
locals [ DollarperiodstrContextExt extendedContext ]
:  DOLLARPERIODSTR 
;

dollaewidthstr
locals [ DollaewidthstrContextExt extendedContext ]
:  DOLLAEWIDTHSTR 
;

dollarnochangestr
locals [ DollarnochangestrContextExt extendedContext ]
:  DOLLARNOCHANGESTR 
;

z_or_x
locals [ Z_or_xContextExt extendedContext ]
:  Z_or_X 
;

compliment
locals [ ComplimentContextExt extendedContext ]
:  COMPLIMENT 
;

case_equality
locals [ Case_equalityContextExt extendedContext ]
:  CASE_EQUALITY 
;

case_inequality
locals [ Case_inequalityContextExt extendedContext ]
:  CASE_INEQUALITY 
;

rshift
locals [ RshiftContextExt extendedContext ]
:  RSHIFT 
;

lshift
locals [ LshiftContextExt extendedContext ]
:  LSHIFT 
;

pluscolon
locals [ PluscolonContextExt extendedContext ]
:  PLUSCOLON 
;

minuscolon
locals [ MinuscolonContextExt extendedContext ]
:  MINUSCOLON 
;

stdcoloncolon
locals [ StdcoloncolonContextExt extendedContext ]
:  STDCOLONCOLON 
;

randomizestr
locals [ RandomizestrContextExt extendedContext ]
:  RANDOMIZESTR 
;

nullstr
locals [ NullstrContextExt extendedContext ]
:  NULLSTR 
;

alshift
locals [ AlshiftContextExt extendedContext ]
:  ALSHIFT 
;

arshift
locals [ ArshiftContextExt extendedContext ]
:  ARSHIFT 
;

case_q
locals [ Case_qContextExt extendedContext ]
:  CASE_Q 
;

not_case_q
locals [ Not_case_qContextExt extendedContext ]
:  NOT_CASE_Q 
;

and
locals [ AndContextExt extendedContext ]
:  AND 
;

xor
locals [ XorContextExt extendedContext ]
:  XOR 
;

xnor
locals [ XnorContextExt extendedContext ]
:  XNOR 
;

xorn
locals [ XornContextExt extendedContext ]
:  XORN 
;

thisstr
locals [ ThisstrContextExt extendedContext ]
:  THISSTR 
;

localcoloncolon
locals [ LocalcoloncolonContextExt extendedContext ]
:  LOCALCOLONCOLON 
;

time_unit
locals [ Time_unitContextExt extendedContext ]
:  TIME_UNIT 
;

nand
locals [ NandContextExt extendedContext ]
:  NAND 
;

nor
locals [ NorContextExt extendedContext ]
:  NOR 
;

dderive
locals [ DderiveContextExt extendedContext ]
:  DDERIVE 
;

scalar_constant0
locals [ Scalar_constant0ContextExt extendedContext ]
:  SCALAR_CONSTANT0 
;

scalar_constant1
locals [ Scalar_constant1ContextExt extendedContext ]
:  SCALAR_CONSTANT1 
;

string
locals [ StringContextExt extendedContext ]
:  STRING 
;

lparenstar
locals [ LparenstarContextExt extendedContext ]
:  LPARENSTAR 
;

starrparen
locals [ StarrparenContextExt extendedContext ]
:  STARRPAREN 
;

esc_identifier
locals [ Esc_identifierContextExt extendedContext ]
:  ESCAPED_IDENTIFIER 
;

dollarrootstr
locals [ DollarrootstrContextExt extendedContext ]
:  DOLLARROOTSTR 
;

dollarunitstr
locals [ DollarunitstrContextExt extendedContext ]
:  DOLLARUNITSTR 
;

tf_id
locals [ Tf_idContextExt extendedContext ]
:  TF_ID 
;

octal_number
locals [ Octal_numberContextExt extendedContext ]
:  Octal_number 
;

hex_number
locals [ Hex_numberContextExt extendedContext ]
:  Hex_number 
;


pragma_def 
locals [Pragma_defContextExt extendedContext ]
: PRAGMA_SPECIFIER PRAGMA_ID pragma_text NEW_LINE;

pragma_text 
locals [Pragma_textContextExt extendedContext ]
: (PRAGMA_ID | MODE_TEXT ) *;

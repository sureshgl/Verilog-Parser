################################################################################
# Automatically-generated file. Do not edit!
################################################################################

#-include ../makefile.init

RM := rm -rf

# All of the sources participating in the build are defined here
-include ./subdir.mk


ifneq ($(MAKECMDGOALS),clean)
ifneq ($(strip $(C++_DEPS)),)
-include $(C++_DEPS)
endif
ifneq ($(strip $(C_DEPS)),)
-include $(C_DEPS)
endif
ifneq ($(strip $(CC_DEPS)),)
-include $(CC_DEPS)
endif
ifneq ($(strip $(CPP_DEPS)),)
-include $(CPP_DEPS)
endif
ifneq ($(strip $(CXX_DEPS)),)
-include $(CXX_DEPS)
endif
ifneq ($(strip $(C_UPPER_DEPS)),)
-include $(C_UPPER_DEPS)
endif
endif

-include ../makefile.defs


SUBDIRS = ../../../../zt/des/cref/common
OTHER_OBJS = ../../../../zt/des/cref/common/Utils.o

# Add inputs and outputs from these tool invocations to the build variables 

# All Target
all: build
cuckoo: $(OBJS) $(USER_OBJS) 
	@echo 'Building file: zt_des_cuckoo_1sor1u_main.cpp'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"zt_des_cuckoo_1sor1u_main.d" -MT"zt_des_cuckoo_1sor1u_main.d" -o zt_des_cuckoo_1sor1u_main.o zt_des_cuckoo_1sor1u_main.cpp
	@echo 'Finished building: zt_des_cuckoo_1sor1u_main.cpp'
	@echo ' '

subdirs: $(SUBDIRS)
	for dir in $(SUBDIRS); do (cd $$dir; make $1 || exit 1) || exit 1; done

build: subdirs $(OBJS) $(USER_OBJS) cuckoo
	@echo 'Building target: $@'
	@echo 'Invoking: MacOS X C++ Linker'
	g++  -o "cuckoo" zt_des_cuckoo_1sor1u_main.o $(OBJS) $(USER_OBJS) $(OTHER_OBJS) $(LIBS)
#	g++  -o "dleft" zt_des_dleft_1sor1u_main.o $(OBJS) $(USER_OBJS) $(LIBS)
	@echo 'Finished building target: $@'
	@echo ' '
	

# Tool invocations

# Other Targets
clean:
	for dir in $(SUBDIRS); do (cd $$dir; make clean $1 || exit 1) || exit 1; done
	-$(RM) $(C++_DEPS)$(OBJS)$(C_DEPS)$(CC_DEPS)$(CPP_DEPS)$(EXECUTABLES)$(CXX_DEPS)$(C_UPPER_DEPS) cuckoo  zt_des_cuckoo_1sor1u.d  zt_des_cuckoo_1sor1u.o zt_des_cuckoo_1sor1u_main.d zt_des_cuckoo_1sor1u_main.o zt_stl_shift.o test.o
	-@echo ' '

.PHONY: all clean dependents
.SECONDARY:

-include ../makefile.targets

################################################################################
# Automatically-generated file. Do not edit!
################################################################################

RM := rm -rf

# All of the sources participating in the build are defined here
-include subdir.mk


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

SUBDIRS = ./../common

# Add inputs and outputs from these tool invocations to the build variables 

# All Target
all: build

subdirs: $(SUBDIRS)
	for dir in $(SUBDIRS); do (cd $$dir; make $1 || exit 1) || exit 1; done

build: subdirs $(OBJS) $(USER_OBJS)
#build: subdirs $(USER_OBJS)
	@echo ' '
	

# Tool invocations

# Other Targets
clean:
	for dir in $(SUBDIRS); do (cd $$dir; make clean $1 || exit 1) || exit 1; done
	-$(RM) $(C++_DEPS)$(OBJS)$(C_DEPS)$(CC_DEPS)$(CPP_DEPS)$(EXECUTABLES)$(CXX_DEPS)$(C_UPPER_DEPS)
	-@echo ' '

.PHONY: all clean dependents
.SECONDARY:

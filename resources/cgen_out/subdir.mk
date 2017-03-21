################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
INCUDES = ../des/cref/common

CPP_SRCS += \
./zt_des_cuckoo_1sor1u.cpp \
./zt_stl_shift.cpp \
./test.cpp

OBJS += \
./zt_des_cuckoo_1sor1u.o \
./zt_stl_shift.o \
./test.o


CPP_DEPS += \
./zt_des_cuckoo_1sor1u.d \
./zt_stl_shift.d \
./test.d

# Each subdirectory must supply rules for building sources it contributes
%.o: ../%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '



################################################################################
# Automatically-generated file. Do not edit!
################################################################################

OTHER_OBJS := ../stl/zt_des_1r1wt_1rw_atom_ff_class.o \
        ../stl/zt_stl_atom_5r2w_class.o \
        ../stl/zt_stl_flat_atom_2r2w_class.o \
        ../stl/zt_stl_mem_psd_mrnw_class.o \
        ../stl/zt_stl_rsh_class.o \
        ../stl/zt_des_2r1wt_2ror1w_atom_ff_class.o \
        ../stl/zt_stl_atom_bw_1r1w_class.o \
        ../stl/zt_stl_fwrd_class.o \
        ../stl/zt_stl_ping_atom_1r1w_class.o \
        ../stl/zt_stl_shift_class.o \
        ../stl/zt_stl_atom_1r1w_class.o \
        ../stl/zt_stl_atom_bw_1r2w_class.o \
        ../stl/zt_stl_lsh_class.o \
        ../stl/zt_stl_ping_atom_1r2w_class.o \
        ../stl/zt_stl_shift_fwrd_class.o \
        ../stl/zt_stl_atom_2r1w_class.o \
        ../stl/zt_stl_bw_fwrd_class.o \
        ../stl/zt_stl_mem_1rw_class.o \
        ../stl/zt_stl_pot_addr_class.o \
        ../stl/zt_stl_wrpri_class.o \
	../common/Utils.o


# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += $(wildcard *.cpp) 

OBJS +=  $(CPP_SRCS:.cpp=.o)


CPP_DEPS += $(CPP_SRCS:.cpp=.d)


# Each subdirectory must supply rules for building sources it contributes
%.o: %.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<" $(OTHER_OBJS)
	@echo 'Finished building: $<'
	@echo ' '



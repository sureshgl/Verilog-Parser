OTHER_OBJS := ./../common/Utils.o

CPP_SRCS +=  ./zt_des_1r1wt_1rw_atom_ff_class.cpp \
	./zt_stl_mem_1r1w_class.cpp \
	./zt_stl_atom_5r2w_class.cpp \
	./zt_stl_flat_atom_2r2w_class.cpp \
	./zt_stl_mem_psd_mrnw_class.cpp \
	./zt_stl_rsh_class.cpp \
	./zt_des_2r1wt_2ror1w_atom_ff_class.cpp \
	./zt_stl_atom_bw_1r1w_class.cpp \
	./zt_stl_fwrd_class.cpp \
	./zt_stl_ping_atom_1r1w_class.cpp \
	./zt_stl_shift_class.cpp \
	./zt_stl_atom_1r1w_class.cpp \
	./zt_stl_atom_bw_1r2w_class.cpp \
	./zt_stl_lsh_class.cpp \
	./zt_stl_ping_atom_1r2w_class.cpp \
	./zt_stl_shift_fwrd_class.cpp \
	./zt_stl_atom_2r1w_class.cpp \
	./zt_stl_bw_fwrd_class.cpp \
	./zt_stl_mem_1rw_class.cpp \
	./zt_stl_pot_addr_class.cpp \
	./zt_stl_wrpri_class.cpp 

OBJS +=  ./zt_des_1r1wt_1rw_atom_ff_class.o \
	./zt_stl_mem_1r1w_class.o \
	./zt_stl_atom_5r2w_class.o \
	./zt_stl_flat_atom_2r2w_class.o \
	./zt_stl_mem_psd_mrnw_class.o \
	./zt_stl_rsh_class.o \
	./zt_des_2r1wt_2ror1w_atom_ff_class.o \
	./zt_stl_atom_bw_1r1w_class.o \
	./zt_stl_fwrd_class.o \
	./zt_stl_ping_atom_1r1w_class.o \
	./zt_stl_shift_class.o \
	./zt_stl_atom_1r1w_class.o \
	./zt_stl_atom_bw_1r2w_class.o \
	./zt_stl_lsh_class.o \
	./zt_stl_ping_atom_1r2w_class.o \
	./zt_stl_shift_fwrd_class.o \
	./zt_stl_atom_2r1w_class.o \
	./zt_stl_bw_fwrd_class.o \
	./zt_stl_mem_1rw_class.o \
	./zt_stl_pot_addr_class.o \
	./zt_stl_wrpri_class.o 

CPP_DEPS +=  ./zt_des_1r1wt_1rw_atom_ff_class.d \
	./zt_stl_mem_1r1w_class.d \
	./zt_stl_atom_5r2w_class.d \
	./zt_stl_flat_atom_2r2w_class.d \
	./zt_stl_mem_psd_mrnw_class.d \
	./zt_stl_rsh_class.d \
	./zt_des_2r1wt_2ror1w_atom_ff_class.d \
	./zt_stl_atom_bw_1r1w_class.d \
	./zt_stl_fwrd_class.d \
	./zt_stl_ping_atom_1r1w_class.d \
	./zt_stl_shift_class.d \
	./zt_stl_atom_1r1w_class.d \
	./zt_stl_atom_bw_1r2w_class.d \
	./zt_stl_lsh_class.d \
	./zt_stl_ping_atom_1r2w_class.d \
	./zt_stl_shift_fwrd_class.d \
	./zt_stl_atom_2r1w_class.d \
	./zt_stl_bw_fwrd_class.d \
	./zt_stl_mem_1rw_class.d \
	./zt_stl_pot_addr_class.d \
	./zt_stl_wrpri_class.d 

%.o: %.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<" $(OTHER_OBJS)
	@echo 'Finished building: $<'
	@echo ' '

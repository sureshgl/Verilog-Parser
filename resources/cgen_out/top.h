/*
 * top.h
 *
 *  Created on: 20-Sep-2015
 *      Author: krpalle
 */

#ifndef TOP_H_
#define TOP_H_

#include "zt_des_cuckoo_1sor1u.h"

class top_cuckoo{
public:
	top_cuckoo(){}
	~top_cuckoo(){}
	void del(Wire up_din_1,Wire up_key_1,Wire* up_bp_1,zt_des_cuckoo_1sor1u_class cuckoo){
		Wire t1_dinA(0);
		Wire t1_readB(0);
		Wire clk(1,1);
		Wire rst(0);
		Wire sr_vld_0(1);
		Wire up_del_1(1, 1);
		Wire search_0(1, 0);
		Wire sr_key_0(2, 0);
		Wire sr_dout_0(2, 0);
		Wire update_1(1, 1);
		Wire sr_hit_0(1);
		Wire t1_writeA(0);
		Wire t1_addrB(0);
		Wire t1_addrA(0);
		Wire ready(1);
		Wire t1_doutB(1);

		cuckoo.zt_des_cuckoo_1sor1u(clk,
				rst,
				&ready,
				search_0,
				sr_key_0,
				&sr_dout_0,
				&sr_vld_0,
				&sr_hit_0,
				update_1,
				up_key_1,
				up_din_1,
				up_del_1,
				up_bp_1,
				&t1_writeA,
				&t1_addrA,
				&t1_dinA,
				&t1_readB,
				&t1_addrB,
				t1_doutB);

	}

	void search(Wire sr_key_0,Wire* sr_vld_0,Wire* sr_dout_0,Wire* sr_hit_0,zt_des_cuckoo_1sor1u_class cuckoo){
		Wire search_0(1,1);
		Wire t1_dinA(0);
		Wire t1_readB(0);
		Wire clk(1,1);
		Wire rst(0);
		Wire up_bp_1(1);
		Wire up_del_1(1, 0);
		Wire update_1(1, 0);
		Wire up_key_1(2, 0);
		Wire up_din_1(1, 1);
		Wire t1_writeA(0);
		Wire t1_addrB(0);
		Wire t1_addrA(0);
		Wire ready(1);
		Wire t1_doutB(1);

		cuckoo.zt_des_cuckoo_1sor1u(clk,
				rst,
				&ready,
				search_0,
				sr_key_0,
				sr_dout_0,
				sr_vld_0,
				sr_hit_0,
				update_1,
				up_key_1,
				up_din_1,
				up_del_1,
				&up_bp_1,
				&t1_writeA,
				&t1_addrA,
				&t1_dinA,
				&t1_readB,
				&t1_addrB,
				t1_doutB);




	}

	void update(Wire up_din_1,Wire up_key_1,Wire* up_bp_1,zt_des_cuckoo_1sor1u_class cuckoo){

		Wire t1_dinA(1,0);

		Wire t1_readB(1,0);
		Wire clk(1,1);
		Wire rst(1,0);
		Wire sr_vld_0(1);
		Wire up_del_1(1, 0);

		Wire search_0(1, 0);
		Wire sr_key_0(2, 0);
		Wire update_1(1, 1);

		Wire sr_dout_0(1);
		Wire sr_hit_0(1);
		Wire t1_writeA(1,0);
		Wire t1_addrB(1,0);
		Wire t1_addrA(1,0);
		Wire ready(1);
		Wire t1_doutB(1);

		cuckoo.zt_des_cuckoo_1sor1u(clk,
				rst,
				&ready,
				search_0,
				sr_key_0,
				&sr_dout_0,
				&sr_vld_0,
				&sr_hit_0,
				update_1,
				up_key_1,
				up_din_1,
				up_del_1,
				up_bp_1,
				&t1_writeA,
				&t1_addrA,
				&t1_dinA,
				&t1_readB,
				&t1_addrB,
				t1_doutB);


	}
};



#endif /* TOP_H_ */

#include "test.h"
#include "top.h"

void test::testPush(){
	zt_des_cuckoo_1sor1u_class obj(2,4,2,4,4,0,2,7,2,1,0,0);
	top_cuckoo o_top;
	Wire up_key_1(4, 0);
	Wire up_din_1(2, 3);
	Wire* up_bp_1 = new Wire(1);
	o_top.update(up_din_1,up_key_1,up_bp_1,obj);
	cout << endl;
	cout << "Pushed " << up_din_1 << " with key " << up_key_1 << endl;
	Wire sr_key_0(4,0);
	Wire* sr_vld_0 = new Wire(1);
	Wire* sr_dout_0 = new Wire(2);
	Wire* sr_hit_0 = new Wire(1);
	cout << endl << "Searching for data with key " << up_key_1 << endl;
	o_top.search(sr_key_0,sr_vld_0,sr_dout_0,sr_hit_0,obj);
	cout << "sr_dout_0 " << *sr_dout_0 << endl;
	cout << "sr_hit_0 " << *sr_hit_0 << endl;
	cout << "sr_vld_0 " << *sr_vld_0 << endl;
}

void test::testDelete(){
	zt_des_cuckoo_1sor1u_class obj(2,4,2,4,4,0,2,7,2,1,0,0);
	top_cuckoo o_top;
	Wire up_key_1(4, 1);
	Wire up_din_1(2, 2);
	Wire* up_bp_1 = new Wire(1);
	o_top.update(up_din_1,up_key_1,up_bp_1,obj);
	cout << endl;
	cout << "Pushed " << up_din_1 << " with key " << up_key_1 << endl;
	Wire sr_key_0(4,1);
	Wire* sr_vld_0 = new Wire(1);
	Wire* sr_dout_0 = new Wire(2);
	Wire* sr_hit_0 = new Wire(1);
	cout << endl << "Searching for data with key " << up_key_1 << endl;
	o_top.search(sr_key_0,sr_vld_0,sr_dout_0,sr_hit_0,obj);
	cout << "sr_dout_0 " << *sr_dout_0 << endl;
	cout << "sr_hit_0 " << *sr_hit_0 << endl;
	cout << "sr_vld_0 " << *sr_vld_0 << endl;

	cout << endl <<"Deleting at key " << up_key_1 << endl;
	o_top.del(up_din_1,up_key_1,up_bp_1,obj);
	cout << endl << "Searching for data with key " << up_key_1 << endl;
	o_top.search(sr_key_0,sr_vld_0,sr_dout_0,sr_hit_0,obj);
	cout << "sr_dout_0 " << *sr_dout_0 << endl;
	cout << "sr_hit_0 " << *sr_hit_0 << endl;
	cout << "sr_vld_0 " << *sr_vld_0 << endl;

}

void test::testDisplacement(){
	zt_des_cuckoo_1sor1u_class obj(2,4,2,4,4,0,2,7,2,1,0,0);
	top_cuckoo o_top;
	Wire up_key_1(4);
	Wire up_din_1(2);
	Wire* up_bp_1 = new Wire(1);
	for(int i=0;i<10;i++){
		up_din_1 = 2;
		up_key_1 = i;
		o_top.update(up_din_1,up_key_1,up_bp_1,obj);

		cout << endl<<"fifo   - [" << obj.fifo[0] << " "<< obj.fifo[1] << " "<< obj.fifo[2] << " "<< obj.fifo[3] <<"]"<< endl;
		cout << "bank 1 - [" << obj.atom[0][0] << " "<< obj.atom[0][1] << " "<< obj.atom[0][2] << " "<< obj.atom[0][3] <<"]"<< endl;
		cout << "bank 2 - [" << obj.atom[1][0] << " "<< obj.atom[1][1] << " "<< obj.atom[1][2] << " "<< obj.atom[1][3] <<"]"<< endl <<  endl;
	}
}

void test::testBp(){
	zt_des_cuckoo_1sor1u_class obj(2,4,2,4,4,0,2,7,2,1,0,0);
	top_cuckoo o_top;
	Wire up_key_1(4);
	Wire up_din_1(2);
	Wire* up_bp_1 = new Wire(1);
	for(int i=0;i<14;i++){
		if(*up_bp_1 == 1){
			cout << "Back pressure hit at update number " << i << endl << endl;
			break;
		}
		up_din_1 = 2;
		up_key_1 = i;
		o_top.update(up_din_1,up_key_1,up_bp_1,obj);
		cout << "Pushing with key " << up_key_1 << endl;

	}
}

void test::run(){
	cout << "WELCOME TO CUCKOO.  " << endl << endl;
	cout << endl<<"First Test : Basic update and Search. Press Enter to Run the test." << endl;
	cin.ignore();
	testPush();
	cout << endl<< "Second Test : Delete Operation. Press Enter to Run the test." << endl;
	cin.ignore();
	testDelete();
	cout << endl<< "Third Test : To observe displacement. Press Enter to Run the test." << endl;
	cin.ignore();
	testDisplacement();
	cout << endl<< "Third Test : To observe back pressure. Press Enter to Run the test." << endl;
	cin.ignore();
	testBp();
}

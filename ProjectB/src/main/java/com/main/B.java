package com.main;

import com.pack.RequestC;
import com.pack.ResponseC;
import com.suri.RequestB;
import com.suri.ResponseB;

public class B {
	public ResponseB m1(RequestB breq) {
		System.out.println("Enter into B");
		RequestC creq=new RequestC();
		creq.setId(breq.getId());	
		creq.setName(breq.getName());
		creq.setType(breq.getType());
		 C c=new C();
		 
		 ResponseC respc=c.m3(creq);
		 
		 ResponseB respb=new ResponseB();
		 
		 respb.setStatus(respc.getStatus());
		 respb.setDesc(respc.getDesc());
		 System.out.println("Exit from B");
		return respb;
		
	}
}

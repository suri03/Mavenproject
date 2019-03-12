package com.main;
import com.pack.RequestA;
import com.pack.ResponseA;
import com.suri.RequestB;
import com.suri.ResponseB;
public class A {
	public ResponseA m1(RequestA areq) {
		System.out.println("Entered into A");
		RequestB breq=new RequestB();
		breq.setId(areq.getId());	
		breq.setName(areq.getName());
		breq.setType(areq.getType());
		//
		B b=new B();
		
		ResponseB bresp=b.m1(breq);
		//
		ResponseA respa=new ResponseA();
		respa.setStatus(bresp.getStatus());
		respa.setDesc(bresp.getDesc());
		System.out.println("Exit from A");
		return respa;
		
	}
	
}


package com.main;
import com.pack.RequestC;
import com.pack.ResponseC;

public class C {
	public ResponseC m3(RequestC creq) {
		System.out.println("Entered into C");
		ResponseC respc=new ResponseC();
		respc.setStatus("Active");
		respc.setDesc("Delivered");
		System.out.println("Exit from C");
		return respc;
	}
}

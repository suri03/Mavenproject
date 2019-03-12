package com.pack;

import com.main.A;

public class ClientA {
public static void main(String ar[])
{
	A a=new A();
	RequestA areq=new RequestA();
	areq.setName("Mobile");
	areq.setId("1120");
	areq.setType("Android");
	a.m1(areq);
	ResponseA aresp=a.m1(areq);
	System.out.println("aresp is:"+aresp.getStatus());
	System.out.println("aresp is:"+aresp.getDesc());
}
}

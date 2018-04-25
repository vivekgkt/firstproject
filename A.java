package com.jilit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

	@Autowired
	private B b;
	
	
	public A() {
		System.out.println("A bean is created.");
	}


	public String toString()
	{
		return "It is A Bean, It has:\n"+b;
	}
}

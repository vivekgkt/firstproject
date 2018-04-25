package com.jilit.beans;

import org.springframework.stereotype.Component;

@Component
public class B {

	public B() {
		System.out.println("B bean is created.");
	}

	public String toString()
	{
		return "It is B bean.";
	}
}

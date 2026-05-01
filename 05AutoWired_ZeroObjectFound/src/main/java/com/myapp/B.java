package com.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
	
	@Autowired(required = true)
	private A a;

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}
	
}

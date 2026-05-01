package com.myapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class A {
	@Value("18")
	private int number;

	@Override
	public String toString() {
		return "A [number=" + number + "]";
	}
	
}

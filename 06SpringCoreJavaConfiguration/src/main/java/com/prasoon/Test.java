package com.prasoon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfigurationClass.class);
		
		Object o1 = ac.getBean("repo");
		System.out.println(o1);
	}

}

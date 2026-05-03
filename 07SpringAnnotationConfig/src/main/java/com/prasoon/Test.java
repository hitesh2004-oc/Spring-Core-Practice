package com.prasoon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
			AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
			//scan method -- >take input atleast base package var-arg(idk 1.5)
			//multiple package you can take with comma separately
			//find all classes from given package and its sub-package
			//it will scan all the classes from this package and I have to tell referesh
			//when i call referesh method it
			//it will update the Container
			
			//it will update the Container
			ac.scan("com.prasoon");
			ac.refresh();//referesh Spring Container
			//Everything Setup from the Begining
			//getBean methods returns Object type

			// HandlerInfo ob =(HandlerInfo)ac.getBean("hob",HandlerInfo.class);
			//Object o1 = ac.getBean("hob");

			Object o1 = ac.getBean("handlerInfo");

			//print Object
			// System.out.print1n(ob);
			System.out.println(o1);
	}

}

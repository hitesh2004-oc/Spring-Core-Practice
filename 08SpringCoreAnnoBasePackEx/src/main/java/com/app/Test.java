package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =new
				AnnotationConfigApplicationContext(MyAppConfig.class);

				// ac.scan("com.app");
				// ac.refresh();
				Object obj1 = ac.getBean("cob");
				Object obj = ac.getBean("eobj");
				Object ob3 = ac.getBean("vr");
				System.out.println(ob3);
				//In Real time We create a separate class with any name
				// Comment ac.scan("com.app"); and ac.refresh() just extra class we have to create
				//their we have to write @ComponentScan
				//I am printing both objects at a time Not an issue

	}

}

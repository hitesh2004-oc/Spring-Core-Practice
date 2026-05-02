package com.prasoon;

import org.springframework.context.annotation.Bean;

public class MyConfigurationClass {
	// 1 Method = 1 Object
	
		@Bean
		public Repository repo() {
			Repository r1 = new Repository();
			
			r1.setPathToStore(12);
			r1.setR("Hello");
			
			return r1;
		}

}

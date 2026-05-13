package com.app;

import org.springframework.context.annotation.ComponentScan;

//Directly you can write a single package name
//or basepackages=
//in the curly bracket multiple package name
//Whenever the class name you write that you have to pass as a input here

@ComponentScan(basePackages ={"com.app", "my.one"} )
public class MyAppConfig {

}

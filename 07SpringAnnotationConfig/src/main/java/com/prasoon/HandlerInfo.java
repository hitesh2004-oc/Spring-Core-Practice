package com.prasoon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("hob")
@Component
public class HandlerInfo {
	@Value("data")
	private String resolverCode;
	@Value("temp")
	private String pathToStore;
	public HandlerInfo() {
		super();
	}
	//to see the data
	@Override
	public String toString() {
		return "HandlerInfo [resolverCode=" + resolverCode + ", pathToStore=" + pathToStore + "]";
	}
	

}

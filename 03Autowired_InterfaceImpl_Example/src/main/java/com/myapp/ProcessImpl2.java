package com.myapp;

import org.springframework.stereotype.Component;

@Component("processImpl2")
public class ProcessImpl2 implements Process {

    @Override
    public void p() {
        System.out.println("process impl 2");
    }
}
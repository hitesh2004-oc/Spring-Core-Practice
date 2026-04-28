package com.myapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ProcessImpl1 implements Process {

    @Override
    public void p() {
        System.out.println("process impl 1");
    }
}
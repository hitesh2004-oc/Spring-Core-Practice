package com.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProcessObject {

    @Autowired
    @Qualifier("processImpl2")
    private Process p;

    public void show() {
        p.p();
        System.out.println("object created !");
    }
}
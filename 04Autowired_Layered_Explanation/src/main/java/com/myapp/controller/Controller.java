package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.myapp.service.EmpService;

@Component("c1")
public class Controller {

    @Autowired
    private EmpService service;

    public String addEmployee() {
        return service.addEmployee();
    }

    public String getEmployeeById() {
        return service.getEmployeeById();
    }

    public String updateEmployee() {
        return service.updateEmployee();
    }

    public String deleteEmployee() {
        return service.deleteEmployee();
    }
}
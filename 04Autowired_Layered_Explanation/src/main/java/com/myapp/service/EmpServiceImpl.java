package com.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.myapp.dao.EmpDao;

@Component
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao dao;

    @Override
    public String addEmployee() {
        return dao.addEmployee();
    }

    @Override
    public String getEmployeeById() {
        return dao.getEmployeeById();
    }

    @Override
    public String updateEmployee() {
        return dao.updateEmployee();
    }

    @Override
    public String deleteEmployee() {
        return dao.deleteEmployee();
    }
}
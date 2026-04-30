package com.myapp.dao;

import org.springframework.stereotype.Component;

@Component
public class EmpDaoImpl implements EmpDao {

    @Override
    public String addEmployee() {
        return "employee added successfully";
    }

    @Override
    public String getEmployeeById() {
        return "employee found";
    }

    @Override
    public String updateEmployee() {
        return "employee updated successfully";
    }

    @Override
    public String deleteEmployee() {
        return "employee deleted successfully";
    }
}
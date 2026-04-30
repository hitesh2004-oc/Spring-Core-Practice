package com.myapp.test;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myapp.config.MyConfig;
import com.myapp.controller.Controller;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ac =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Controller controller =
                (Controller) ac.getBean("c1");

        Scanner sc = new Scanner(System.in);
        while(true) {
        	System.out.println("--------Employee Management--------");
        	System.out.println("1. Add Employee");
        	System.out.println("2. Search Employee");
        	System.out.println("3. Update Employee");
        	System.out.println("4. Delete Employee");
        	System.out.println("--------------------------");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(controller.addEmployee());
                break;

            case 2:
                System.out.println(controller.getEmployeeById());
                break;

            case 3:
                System.out.println(controller.updateEmployee());
                break;

            case 4:
                System.out.println(controller.deleteEmployee());
                break;

            default:
                System.out.println("Invalid choice");
          }
        }
    }
}
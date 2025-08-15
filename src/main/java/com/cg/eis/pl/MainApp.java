//package com.cg.eis.pl;
//
//import java.util.Scanner;
//import com.cg.eis.bean.Employee_1;
//import com.cg.eis.service.EmployeeService_1;
//import com.cg.eis.service.EmployeeServiceImpl_1;
//
//public class MainApp {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        
//        System.out.print("Enter ID: ");
//        int id = sc.nextInt();
//        sc.nextLine();
//
//        System.out.print("Enter Name: ");
//        String name = sc.nextLine();
//
//        System.out.print("Enter Salary: ");
//        double salary = sc.nextDouble();
//        sc.nextLine();
//
//        System.out.print("Enter Designation (Manager/Programmer/System Associate/Clerk): ");
//        String designation = sc.nextLine();
//
//        Employee_1 emp = new Employee_1(id, name, salary, designation);
//
//        
//        EmployeeService_1 service = new EmployeeServiceImpl_1();
//        service.findInsuranceScheme(emp);
//
//        
//        emp.displayDetails();
//
//        sc.close();
//    }
//}

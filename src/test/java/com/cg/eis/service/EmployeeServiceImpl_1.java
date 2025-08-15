//package com.cg.eis.service;
//
//import com.cg.eis.bean.Employee_1;
//
//public class EmployeeServiceImpl_1 implements EmployeeService_1 {
//
//    @Override
//    public void findInsuranceScheme(Employee_1 emp) {
//        double salary = emp.getSalary();
//        String designation = emp.getDesignation();
//
//        String scheme;
//
//        if (salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
//            scheme = "Scheme A";
//        } else if (salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Programmer")) {
//            scheme = "Scheme B";
//        } else if (salary > 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate")) {
//            scheme = "Scheme C";
//        } else if (salary < 5000 && designation.equalsIgnoreCase("Clerk")) {
//            scheme = "No Scheme";
//        } else {
//            scheme = "Not Applicable";
//        }
//
//        emp.setInsuranceScheme(scheme);
//    }
//}

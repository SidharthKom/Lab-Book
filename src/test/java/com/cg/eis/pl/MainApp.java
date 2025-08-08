package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            
            if (salary < 3000) {
                throw new EmployeeException("Salary must be at least ₹3000.");
            }

            System.out.print("Enter Designation (Manager/Programmer/System Associate/Clerk): ");
            String designation = sc.nextLine();

            Employee emp = new Employee(id, name, salary, designation);

            EmployeeService service = new EmployeeServiceImpl();
            service.findInsuranceScheme(emp);

            emp.displayDetails();
        } catch (EmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

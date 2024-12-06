package com.monprojet;

import java.util.List;
import java.util.ArrayList;

public class Employee extends Person {
    private String numberEmp;
    private String hiringDate;

    public Employee(String id, String name, String address, String contact, String numberEmp, String hiringDate) {
        super(id, name, address, contact);
        this.numberEmp = numberEmp;
        this.hiringDate = hiringDate;
    }

    public String getRole() {
        return "Employee";
    }

    public String getNumberEmp() {
        return numberEmp;
    }

    public void setNumberEmp(String numberEmp) {
        this.numberEmp = numberEmp;
    }

    public String getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(String hiringDate) {
        this.hiringDate = hiringDate;
    }

    final private static List<Employee> employeeList = new ArrayList<>();

    public static void createEmployee(String id, String name, String address, String contact, String numberEmp, String hiringDate) {
        Employee employee = new Employee(id, name, address, contact, numberEmp, hiringDate);
        employeeList.add(employee);
        System.out.println("Employee created successfully!");
    }

    public static void readEmployee(String id) {
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                System.out.println(employee.getInfos());
                System.out.println("Employee Number: " + employee.getNumberEmp());
                System.out.println("Hiring Date: " + employee.getHiringDate());
                System.out.println("Role: " + employee.getRole());
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public static void updateEmployee(String id, String name, String address, String contact, String numberEmp, String hiringDate) {
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                employee.setName(name);
                employee.setAddress(address);
                employee.setContact(contact);
                employee.setNumberEmp(numberEmp);
                employee.setHiringDate(hiringDate);
                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public static void deleteEmployee(String id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                employeeList.remove(i);
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }
}

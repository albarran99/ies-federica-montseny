package org.iesfm.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCompany {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Company company = getCompany();
    }

    private static Employee getEmplyee() {
        System.out.println("Intorduce el nombre de el empleado");
        String name = scan.next();
        System.out.println("Introduce el apellido de el empleado");
        String surname = scan.next();
        System.out.println("Introduce el puesto de el empleado");
        String role = scan.next();
        System.out.println("Introduce el codigo postal de el empleado");
        int cp = getPositiveNumber();
        System.out.println("Introduce el nif de el empleado");
        String nif = scan.next();
        return new Employee(nif, name, surname, role, cp);
    }

    private static Employee[] getEmployees() {
        System.out.println("Introduce el numero de empleados de la lista");
        int number = getPositiveNumber();
        Employee[] employees = new Employee[number];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = getEmplyee();
        }
        return employees;
    }

    private static Department getDepartment() {
        System.out.println("Introduce el nombre de el departamento");
        String name = scan.next();
        Employee[] employee = getEmployees();
        return new Department(name, employee);
    }

    private static Department[] getDepartments() {
        System.out.println("Introduce el numero de departamentos");
        int number = getPositiveNumber();
        Department[] departments = new Department[number];
        for (int i = 0; i < departments.length; i++) {
            departments[i] = getDepartment();
        }
        return departments;
    }

    private static Company getCompany() {
        System.out.println("Introduce el nombre de la compañia");
        String name = scan.nextLine();
        System.out.println("Introduce el cif de la compañia");
        String cif = scan.nextLine();
        Department[] departments = getDepartments();
        Employee[] employees = getEmployees();
        return new Company(name, cif, departments, employees);
    }

    private static int getNumber() {
        Integer num = null;
        while (num == null) {
            try {
                num = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error, lo que ha introducido no es un numero vuelve a introducir un NUMERO......");
                scan.nextLine();
            }
        }
        return num;
    }

    private static int getPositiveNumber() {
        int cantidad = getNumber();
        while (cantidad < 1) {
            System.out.println("la cantidad debe ser mayor que 0");
            cantidad = getNumber();
        }

        return cantidad;
    }
}

package org.iesfm.company;

import java.util.Arrays;
import java.util.Objects;

public class Company implements ICompany {
    private String name;
    private String cif;
    private Department[] departments;
    private Employee[] employees;

    public Company(String name, String cif, Department[] departments, Employee[] employees) {
        this.name = name;
        this.cif = cif;
        this.departments = departments;
        this.employees = employees;
    }

    @Override
    public void showDepartmentNames() {
        for (Department department : departments) {
            System.out.println("El nombre de el departamento es " + department.getName());
        }
    }

    @Override
    public Employee[] getEmployeesByDepartment(String departmentName) {
        Employee[] result = null;
        Department department = findDepartment(departmentName);
        if (department != null) {
            result = department.getEmployees();

        } else {
            System.out.println("No encotrado el departamento");

        }
        return result;
    }

    @Override
    public void showEmployees(String departmentName) {
        Department department = findDepartment(departmentName);
        if (department != null) {
            department.showEmployees();
        } else {
            System.out.println("no se encontro departamento");
        }
    }

    @Override
    public void showAllEmployees() {
        for (Department department : departments){
            department.showEmployees();
        }
    }

    private Department findDepartment(String departmentName) {
        Department result = null;
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                result = department;
            } else {
                System.out.println("No se encontro el departamento");
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(cif, company.cif) && Arrays.equals(departments, company.departments) && Arrays.equals(employees, company.employees);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, cif);
        result = 31 * result + Arrays.hashCode(departments);
        result = 31 * result + Arrays.hashCode(employees);
        return result;
    }
}

package org.iesfm.company;

import java.util.Arrays;
import java.util.Objects;

public class Department {
    private String name;
    private Employee[] employees;

    public Department(String name, Employee[] employee) {
        this.name = name;
        this.employees = employee;
    }

    public void showEmployees() {
        for (Employee employee : employees){
            employee.info();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Department that = (Department) o;
        return Objects.equals(name, that.name) && Arrays.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(employees);
        return result;
    }
}

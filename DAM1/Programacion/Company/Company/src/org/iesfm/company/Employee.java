package org.iesfm.company;

import java.util.Objects;

public class Employee {
    private String nif;
    private String name;
    private String surname;
    private String role;
    private int cp;

    public Employee(String nif, String name, String surname, String role, int cp) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.cp = cp;
    }


    public void info() {
        System.out.println("El empleado tiene de nombre " + name + " con apellido "+ surname + " con NIF" + nif + " y con el puesto de " + role);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return cp == employee.cp && Objects.equals(nif, employee.nif) && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, role, cp);
    }
}

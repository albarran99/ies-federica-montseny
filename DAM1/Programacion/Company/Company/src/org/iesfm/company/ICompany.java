package org.iesfm.company;

public interface ICompany {

    void showDepartmentNames();

    Employee[] getEmployeesByDepartment( String departmentName);

    void showEmployees(String departmentName);

    void showAllEmployees();

}

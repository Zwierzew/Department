package org.example;
/*
Klasa "Department" powinna mieć następujące właściwości i metody:

Właściwości:
id (numer identyfikacyjny działu)
name (nazwa działu)
employees (ilość pracowników należących do działu)

Metody:
Konstruktor Department(id, name) - inicjalizuje właściwości id i name działu.
addEmployee(employee) - dodaje pracownika do działu.
getEmployees() - zwraca ilość pracowników należących do działu.
 */
public class Department {
    private String id;
    private String departmentName;
    private int employees;

    public Department(String departmentId, String name){
        this.id = departmentId;
        this.departmentName = name;
    }
    public void addEmployee(Employee newEmployee){
        this.employees += 1;
        newEmployee.setDepartment(this);
    }
    public int getEmployees(){
        return this.employees;
    }
    public String getDepartmentName(){
        return this.departmentName;
    }
    public String getId(){
        return this.id;
    }
}

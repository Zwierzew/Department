package org.example;
/*
Klasa "Employee" powinna mieć następujące właściwości i metody:

Właściwości:
id (numer identyfikacyjny pracownika)
name (imię i nazwisko pracownika)
department (obiekt "Department", wskazujący na dział, w którym pracownik jest zatrudniony)

Metody:
Konstruktor Employee(id, name) - inicjalizuje właściwości id i name pracownika.
getDepartment() - zwraca dział w którym pracownik jest zatrudniony.
setDepartment(department) - ustawia dział w którym pracownik jest zatrudniony.
 */
public class Employee {
    private int id;
    private String name;
    private Department department;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Department getDepartment(){
        return this.department;
    }
    public void setDepartment(Department employeeDepartment){
        this.department = employeeDepartment;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}

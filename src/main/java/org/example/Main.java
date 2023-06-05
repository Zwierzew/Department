package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create employees
        Employee person1 = new Employee(123, "Filip Korzeń");
        Employee person2 = new Employee(456, "Anna Nowak");
        Employee person3 = new Employee(789, "Piotr Jacek");
        Employee person4 = new Employee(987, "Joanna Zima");
        Employee person5 = new Employee(654, "Bartek Oleksy");
        Employee person6 = new Employee(321, "Jakub Dolny");
        Employee person7 = new Employee(111, "Dorota Szychta");

        List<Employee> headcountList = List.of(person1, person2, person3, person4, person5, person6, person7);

        // create departments
        Department finance = new Department("FIN", "Finance");
        List<Employee> financeEmployees = new ArrayList<Employee>();
        finance.addEmployee(person1);
        finance.addEmployee(person2);
        finance.addEmployee(person3);

        Department technology = new Department("TECH", "Technology");
        List<Employee> technologyEmployees = new ArrayList<Employee>();
        technology.addEmployee(person4);
        technology.addEmployee(person5);

        Department compliance = new Department("COM", "Compliance");
        List<Employee> complianceEmployees = new ArrayList<Employee>();
        compliance.addEmployee(person6);
        compliance.addEmployee(person7);

        printDepartmentInformation(finance, financeEmployees);
        printDepartmentInformation(technology, technologyEmployees);
        printDepartmentInformation(compliance, complianceEmployees);
        printTotalInformation(headcountList);
        System.out.println(person2.getName() + " " + person2.getDepartment().getDepartmentName());

    }
    private static void printDepartmentInformation(Department department, List<Employee> employees){
        System.out.printf("%s [%s], headcount %d:",
                        department.getDepartmentName(),
                        department.getId(),
                        department.getEmployees())
                .println();
        for(Employee person : employees){
            System.out.printf("%s [ID %d];", person.getName(), person.getId()).println();
            // dlaczego nie printuje informacji o pracownikach?
        }
        System.out.println();
    }
    private static void printTotalInformation(List<Employee> employees){
        System.out.printf("Total headcount %d:", employees.size()).println();
        for(Employee person : employees){
            System.out.printf("%s [ID %d] department;",
                            person.getName(),
                            person.getId(),
                            person.getDepartment().getDepartmentName()) //nie printuje nazwy departamentu?
                            .println();
        }
    }
}

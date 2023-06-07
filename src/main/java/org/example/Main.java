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
<<<<<<< HEAD
        List<Employee> financeEmployees = List.of(person1, person2, person3);
        finance.addEmployee(person1);
        finance.addEmployee(person2);
        finance.addEmployee(person3);
=======
        List<Employee> financeEmployees = new ArrayList<Employee>();
        financeEmployees.add(person1);
        financeEmployees.add(person2);
        financeEmployees.add(person3);
>>>>>>> 8c719b7 (add changes from feature branch onto base branch)

        Department technology = new Department("TECH", "Technology");
        List<Employee> technologyEmployees = List.of(person4, person5);
        technology.addEmployee(person4);
        technology.addEmployee(person5);

        Department compliance = new Department("COM", "Compliance");
        List<Employee> complianceEmployees = List.of(person6, person7);
        compliance.addEmployee(person6);
        compliance.addEmployee(person7);

        printDepartmentInformation(finance, financeEmployees);
        printDepartmentInformation(technology, technologyEmployees);
        printDepartmentInformation(compliance, complianceEmployees);
        printTotalInformation(headcountList);
    }
    private static void printDepartmentInformation(Department department, List<Employee> employees){
        System.out.printf("%s [%s], headcount %d:",
                        department.getDepartmentName(),
                        department.getId(),
                        department.getEmployees())
                .println();
        for(Employee person : employees){
            System.out.printf("\t%s [ID %d];", person.getName(), person.getId()).println();
            // dlaczego nie printuje informacji o pracownikach?
        }
        System.out.println();
    }
    private static void printTotalInformation(List<Employee> employees){
        System.out.printf("Total headcount %d:", employees.size()).println();
        for(Employee person : employees){
            System.out.printf("\t%s [ID %d] - department: %s;",
                            person.getName(),
                            person.getId(),
                            person.getDepartment().getDepartmentName()) //nie printuje nazwy departamentu?
                            .println();
        }
    }
}

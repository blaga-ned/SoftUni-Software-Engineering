package DefiningClasses.DefiningClassesExercise.CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        List<Department> listDepartment = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String employeeDepartment = data[3];

            Employee employee = null;
            switch (data.length) {
                case 4:
                    employee = new Employee(name, salary, position, employeeDepartment);
                    break;
                case 5:
                    if (data[4].contains("@")) {
                        String employeeEmail = data[4];
                        employee = new Employee(name, salary, position, employeeDepartment, employeeEmail);
                    }else{
                        int age = Integer.parseInt(data[4]);
                        employee = new Employee(name, salary, position, employeeDepartment, age);
                    }
                    break;
                case 6:
                    String employeeEmail = data[4];
                    int age = Integer.parseInt(data[5]);
                    employee = new Employee(name, salary, position, employeeDepartment, employeeEmail, age);
                    break;
            }
            boolean departmentExist = listDepartment.stream().anyMatch(department -> department.getName().equals(department));
            if (!departmentExist){
                Department department = new Department(employeeDepartment);
                listDepartment.add(department);
            }
            Department currentDepartment = listDepartment
                    .stream()
                    .filter(dep -> dep.getName().equals(employeeDepartment))
                    .findFirst()
                            .get();
            currentDepartment.getEmployees().add(employee);
        }
        Department highestPaidDepartment = listDepartment
                .stream()
                .max(Comparator.comparingDouble(Department::calculateAverageSalary))
                .get();

        System.out.printf("Highest Average Salary: %s%n", highestPaidDepartment.getName());
        highestPaidDepartment.getEmployees()
                .stream()
                .sorted((first, second)-> Double.compare(second.getSalary(), first.getSalary()))
                .forEach(System.out::println);

    }
}
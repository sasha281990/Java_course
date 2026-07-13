package src.Task15;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Иван", "Иванов", 25, 1200);
        Employee e2 = new Employee(2, "Петр", "Петров", 30, 1500);
        Employee e3 = new Employee(3, "Сергей", "Сергеев", 28, 1400);
        Employee e4 = new Employee(4, "Андрей", "Андреев", 35, 1600);
        Employee e5 = new Employee(5, "Олег", "Олегов", 22, 1100);
        Employee e6 = new Employee(6, "Николай", "Николаев", 27, 1300);
        Employee e7 = new Employee(7, "Дмитрий", "Дмитриев", 40, 1700);
        Employee e8 = new Employee(8, "Алексей", "Алексеев", 32, 1550);

        Map<Employee, String> employees = new HashMap<>();
        employees.put(e1, "Плотник");
        employees.put(e2, "Плотник");
        employees.put(e3, "Программист");
        employees.put(e4, "Водитель");
        employees.put(e5, "Плотник");
        employees.put(e6, "Программист");
        employees.put(e7, "Водитель");
        employees.put(e8, "Плотник");

        System.out.println("До повышения:");
        printEmployees(employees);

        raiseSalaryForProfession(employees, "Плотник", 200);

        System.out.println("\nПосле повышения:");
        printEmployees(employees);

        Map<String, Collection<Employee>> grouped = groupByProfession(employees);

        System.out.println("\nГруппировка по профессиям:");
        for (Map.Entry<String, Collection<Employee>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Employee employee : entry.getValue()) {
                System.out.println("  " + employee);
            }
        }
    }

    private static void raiseSalaryForProfession(Map<Employee, String> employees, String profession, int amountOfIncrease) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            if (entry.getValue().equals(profession)) {
                Employee employee = entry.getKey();
                employee.setSalary(employee.getSalary() + amountOfIncrease);
            }
        }
    }

    private static Map<String, Collection<Employee>> groupByProfession(Map<Employee, String> employees) {
        Map<String, Collection<Employee>> result = new HashMap<>();

        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            String profession = entry.getValue();
            Employee employee = entry.getKey();

            result.computeIfAbsent(profession, k -> new ArrayList<>()).add(employee);
        }

        return result;
    }

    private static void printEmployees(Map<Employee, String> employees) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + ", profession=" + entry.getValue());
        }
    }
}
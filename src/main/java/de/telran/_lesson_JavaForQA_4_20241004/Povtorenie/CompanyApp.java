package de.telran._lesson_JavaForQA_4_20241004.Povtorenie;

import module1.lecture1.module1.lecture2.lecture2_3.Employee;

import java.util.ArrayList;

public class CompanyApp {

    // public static void main(String[] args) {
// Создать класс c информацией о сотруднике (имя: строка, должность:строка,
// год начала работы: целое)

// Создать класс c информацией о компании (название: строка, список сотрудников

// В классе компании сделать два метода - добавить сотрудника (add)
// и удалить сотрудника (remove)
//
//        public static class Employee {
//
//        }
//
//        public static class Company {
//
//        }
//
//        public static void main(String[] args) {
    //  Company c1 = new Company ("Happy Train");
    //  Company c2 = new Company ("Bubbles");

//        c1.add(new Employee("John", "Dev", 2000));
//        c1.add(new Employee("Bob", "QA", 2015));
//        c1.add(new Employee("Julia", "Dev", 2002));
//        c1.add(new Employee("Liz", "HR", 2007));

    public static void printEmployees(ArrayList<Employee> listEmployee) {
        for (Employee e : listEmployee) {
            System.out.println(e.name + "(" + e.position + ") : " + e.year);
        }
    }

    public static class Employee {
        String name;
        String position;
        int year;
        double salary;

        public Employee(String name, String position, int year, double salary) {
            this.name = name;
            this.position = position;
            this.year = year;
            this.salary = salary;//
        }
       // Добавить к классу Employee поле salary с геттером и сеттером,
        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }


    public static class Company {
        String name;
        ArrayList<Employee> employees = new ArrayList<>();

        public Company(String name) {
            this.name = name;
        }

        public void add(Employee e) {
            employees.add(e);
        }

        public Employee remove(String name) {
            for (int i = 0; i < employees.size(); i++) {
                Employee e = employees.get(i);
                if (name.equals(e.name)) {
                    employees.remove(i);
                    return e;
                }
            }
            return null;
        }

        public void printEmployees() {
            for (Employee e : employees) {
                System.out.println(e.name + "(" + e.position + ") : " + e.year);
            }
        }

        public void printEmployees(String title) {
            System.out.println(title);
            printEmployees();
        }

        public ArrayList<Employee> findByPosition(String position) {
            ArrayList<Employee> result = new ArrayList<>();
            for (Employee e : employees) {
                if (e.position.equals(position)) {
                    result.add(e);
                }
            }
            return result;
        }

        public ArrayList<Employee> findHiredAfter(int year) {
            ArrayList<Employee> result = new ArrayList<>();
            for (Employee e : employees) {
                if (e.year > year) {
                    result.add(e);
                }
            }
            return result;
        }
        // , а в класс Company - метод salaryTotal.
        // Метод salaryTotal должен возвращать суммарнуую зарплату всех сотрудников.
        public double salaryTotal() {
            double total =0;
            for (Employee e: employees){
                total +=e.getSalary();
            }
            return total;
        }
        //Написать для класса Company метод salaryAbove, в который передаётся Employee
        // и он возвращает список сотрудников (ArrayList), у которых зарплаты выше,
        // чем у указанного сотрудника.
        public ArrayList<Employee> salaryAbove(Employee employee) {
            ArrayList<Employee> result = new ArrayList<>();
            for (Employee e : employees) {
                if (e.getSalary() > employee.getSalary()) {
                    result.add(e);
                }
            }
            return result;
        }
    }


    public static void main(String[] args) {
        Company c1 = new Company("Happy Train");
        Company c2 = new Company("Bubbles");

        c1.add(new Employee("John", "Dev", 2000, 3000.30));
        c1.add(new Employee("Bob", "QA", 2015, 2000.20));
        c1.add(new Employee("Julia", "Dev", 2002, 4000.40));
        c1.add(new Employee("Liz", "HR", 2007, 1800.18));

        c1.printEmployees("выводит список сотрудников на экран");

        // увольняем "Julia"
        c1.remove("Julia");
        c1.printEmployees("выводит список сотрудников на экран без Julia");

        // берем на работу Rita
        c1.add(new Employee("Rita", "CTO", 2024, 2500.50));
        c1.printEmployees("выводит список сотрудников на экран  с Rita");

//        Company[] companies = new Company[]{};

        ArrayList<Employee> devs = c1.findByPosition("Dev");
        printEmployees(devs);
        ArrayList<Employee> after2005 = c1.findHiredAfter(2005);
        printEmployees(after2005);

        // Выводим общую зарплату всех сотрудников компании
        System.out.println("Суммарная зарплата сотрудников: " + c1.salaryTotal());


        Employee targetEmployee = new Employee("Rita", "CTO", 2024, 2500.50);
        ArrayList<Employee> employeesAbove = c1.salaryAbove(targetEmployee);
        System.out.println("Сотрудники с зарплатой выше, чем у " + targetEmployee.name + ":");
        printEmployees(employeesAbove);
    }
}





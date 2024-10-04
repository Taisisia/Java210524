package de.telran._lesson_JavaForQA_4_20241004.Povtorenie;

import java.util.ArrayList;

public class Company {
    public String name;
    ArrayList<Employee> employee = new ArrayList<>();

    public Company(String name, ArrayList<Employee> employee) {
        this.name = name;
    }

    public void add(Employee e) {
        employee.add(e);
    }

    public Employee remove(String name) {
        for (int i = 0; i < employee.size(); i++) {
            Employee e = employee.get(i);
            if (name.equals(e.name)){
                employee.remove(i);
                return e;
            }
        }
        return null;
    }
}

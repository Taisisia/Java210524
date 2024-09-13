package de.telran._lesson_JavaFurQA_1HW;

public class Person implements Printable {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void printableValue() {
        System.out.println( name + ": " + age);
    }
}

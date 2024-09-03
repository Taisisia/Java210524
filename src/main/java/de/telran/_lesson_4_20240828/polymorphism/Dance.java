package de.telran._lesson_4_20240828.polymorphism;

public class Dance {
    String name;
    int age;

    public Dance(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance() {
        System.out.println(name + "Просто танцует");
    }
}

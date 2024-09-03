package de.telran._lesson_4_20240828.polymorphism;

public class BreakDance extends Dance {
    public BreakDance(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.println(name + " танцует Break");
    }
}

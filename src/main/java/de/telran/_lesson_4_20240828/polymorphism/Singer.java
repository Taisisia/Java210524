package de.telran._lesson_4_20240828.polymorphism;

public abstract class Singer {
    public String name;

    public Singer(String name) {
        this.name = name;
    }
    public abstract void sing();
}

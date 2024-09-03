package de.telran._lesson_4_20240828.polymorphism;

public class HipHopDance extends Dance{
    public HipHopDance(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {//переопределяем метод Dance
        System.out.println(name+ " круто танцует HipHop");
    }
}

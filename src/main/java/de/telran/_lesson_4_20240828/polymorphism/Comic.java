package de.telran._lesson_4_20240828.polymorphism;

public class Comic implements Playable{
    public Singer name;

    public Comic(Singer name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " играет на нервах");

    }

    @Override
    public void speak() {
        System.out.println(name + " рассказівает шутки");

    }
}

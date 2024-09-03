package de.telran._lesson_4_20240828.polymorphism;

public  class PopSinger extends Singer {
    public PopSinger(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println(name + " поёт поп песни");
    }
}

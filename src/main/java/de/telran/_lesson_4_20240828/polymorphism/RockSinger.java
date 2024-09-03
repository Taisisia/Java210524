package de.telran._lesson_4_20240828.polymorphism;

public class RockSinger extends Singer{
    public RockSinger(String name) {
        super(name);
    }
    public void sing(){
        System.out.println( name + " поет рок песни");
    };
}

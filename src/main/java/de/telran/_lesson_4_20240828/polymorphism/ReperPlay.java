package de.telran._lesson_4_20240828.polymorphism;

public class ReperPlay implements Playable{
    public String name;

    public ReperPlay(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " играет на гитаре");
    }

    @Override
    public void speak() {
        System.out.println(name + " говорит РЄП");

    }
    public void dance (){
        System.out.println(name + " умеет танцевать под рєп");
    }
}

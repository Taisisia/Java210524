package de.telran._lesson_2_20240821;

public class PegasusDublCoda {// Дублирование
    String name;
    String color;
    int weight;
    int countWings;

    public PegasusDublCoda(String name, String color, int weight, int countWings) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.countWings = countWings;
    }

    public void run  (){
        System.out.println("Бежит лошадь " + name + " цвет " + color);
    }

    public void transports (){

    }
    public void flu () {
        System.out.println("Летит " + name + " цвет " + color + " с грузом весом " + weight);

    }

}

package de.telran._lesson_2_20240821;

public class PegasusExtNasledovanie extends Horse { // наследование
    int countWings;

    public PegasusExtNasledovanie(String name, String color, int weight, int countWings) {
        super(name, color, weight);
        this.countWings = countWings;
    }

    public void flu () {
        System.out.println("Летит " + name + " цвет " + color + " с грузом весом " + weight);

    }

}

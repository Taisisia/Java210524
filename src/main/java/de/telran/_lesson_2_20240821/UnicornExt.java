package de.telran._lesson_2_20240821;

public class UnicornExt extends Horse {
    int countHorn;

    public UnicornExt(String name, String color, int weight, int countHorn) {
        super(name, color, weight);
        this.countHorn = countHorn;
    }

    public void butt () {
        System.out.println(name+ " при защите бодается " + countHorn + " рогом");
    }

}

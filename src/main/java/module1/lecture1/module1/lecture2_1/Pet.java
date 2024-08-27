package module1.lecture1.module1.lecture2_1;

public class Pet {
    // 1. У нас в доме живут домашние животные. Попробуйте в этой задаче создать класс Pet
    //и записать ему в наследники Cat и Dog.
    //Определите, какие характеристики и поведение ваших питомцев
    //общие, а какие проявляются только у конкретного типа.

    public String name;
    public int age;
    public String color;
    public boolean health;
    public int children;

    public Pet() {
    }

    public Pet(String name, int age, String color, boolean health,int children) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.health = health;
        this.children = children;
    }
    public void feed () {
        System.out.println(name + " кормят");
    }
    public void plays () {
        System.out.println( name + " играет.");
    }

}

package module1.lecture1.module1.lecture2.lecture2_2;

public class Animal {
    //2. Создать классы и схему наследования для задачи учета животных в зоопарке:
    //Как минимум должен быть общий класс Animal с характеристиками и поведением,
    // характерными для всех животных.
    //А дальше уже Ваше творчество, в котором вы должны разбить животных на группы и подгруппы.

    public String species;
    public String classAnimals;
    public int age;


    public Animal() {
    }

    public Animal(String species, String classAnimals, int age) {
        this.species = species;
        this.classAnimals = classAnimals;
        this.age = age;
    }

    public void aquatic() {
        System.out.println(species + " может плавать.");
    }

    public void fly() {
        System.out.println(species + " может летать.");
    }

    public void feeding() {
        System.out.println(species + " кушает ");
    }

}

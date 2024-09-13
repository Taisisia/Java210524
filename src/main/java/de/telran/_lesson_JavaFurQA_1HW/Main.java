package de.telran._lesson_JavaFurQA_1HW;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John Matthew", 2000);
        Person person2 = new Person("Bill Hew", 1984);
        Person person3 = new Person("Stiv Wen", 1999);

        Сompany company1 = new Сompany("Hewlett Packard", "Boston");
        Сompany company2 = new Сompany("Apple", "California");
        Сompany company3 = new Сompany("Samsung", "California");


        Сompany company[] = new Сompany[]{
                company1,
                company2,
                company3
        };
        Person person[] = new Person[]{
                person1,
                person2,
                person3
        };

        for (int i = 0; i < person.length; i++) {
            person[i].printableValue();

        }
        for (int i = 0; i < company.length; i++) {
            company[i].printableValue();

        }
    }
}

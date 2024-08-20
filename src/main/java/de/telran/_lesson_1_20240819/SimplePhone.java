package de.telran._lesson_1_20240819;

public class SimplePhone {
    public static void main(String[] args) {
        Phone phone1;
        phone1 = new Phone();
        phone1.name = "LG Model";
        phone1.model = "Mod1";
        phone1.company = "LG";
        phone1.year = 2018;
        phone1.call();
        phone1.receive();

        Phone phone2 = new Phone();
        phone2.name = "Samsung ModS";
        phone2.model = "ModS";
        phone2.company = "Samsung";
        phone2.year = 2022;
        phone2.call();
        phone2.receive();

        Phone phone3 = new Phone("Nolia 3310");
        phone3.call();
        phone3.receive();
        System.out.println(phone3.name);

        Phone phone4 = new Phone("LG Mod5", "Model 5", "LG", 2015);
        phone4.call();
        phone4.receive();
    }
}




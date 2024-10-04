package de.telran._lesson_JavaForQA_1HW;

public class Сompany implements Printable{
    public String nameCompany;
    public String city;

    public Сompany(String nameCompany, String city) {
        this.nameCompany = nameCompany;
        this.city = city;
    }

    @Override
    public void printableValue() {
        System.out.println(nameCompany + ". " + city);

    }
}

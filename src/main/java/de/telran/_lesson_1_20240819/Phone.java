package de.telran._lesson_1_20240819;

public class Phone {
    // характеристики
   public String name;
   public String model;
    public String company;
    public int year;
    // поведение
   public void call (){
        System.out.println( "Вызываю абонимента - " + name);
    }
   public void receive () {
        System.out.println("Принимаю звонок - " + name);
    }

    public Phone() {
    }

    public Phone(String name) {
        this.name = name;
    }

    public Phone(String name, String model, String company, int year) {
        this.name = name;
        this.model = model;
        this.company = company;
        this.year = year;
    }

    public void setCompany(String company) {
       if (company == null || company == "")
           System.out.println("Не корректные значения");
        this.company = company;
    }

    public String getCompany() {
       // проверка доступности данной характеристики, например по секьюрити
       if (company == null || company == " " && company != "Секретное")
        return company;
       return null;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

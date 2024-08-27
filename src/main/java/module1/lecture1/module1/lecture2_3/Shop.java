package module1.lecture1.module1.lecture2_3;

public class Shop extends Employee{
    private String city;
    private String workHours;
    private int category;
    public Shop(String name, String surname, int age, String education, String jobTitle, String city, String workHours, int category) {
        super(name, surname, age, education, jobTitle);
        this.city = city;
        this.workHours = workHours;
        this.category = category;
    }
    public void sellsGoods(){
        System.out.println( surname + " " +name + " может продавать товар");
    }
    public void worksAtTheCheckout (){
        System.out.println( surname + " " + name + " может работать на кассе");
    }
   public void worksAsADirector (){
        System.out.println( surname + " "+ name + " может работать директором");
    }
}

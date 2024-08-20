package HomeWork.module1.lecture1.module1.lecture1._1;

public class SimplePerson {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person();
        person1.age = 25;
        person1.fullName = "Alex";
        person1.move();
        person1.talk();

        Person person2;
        person2 = new Person("Sem", 33);
        person2.move();
        person2.talk();


    }
}

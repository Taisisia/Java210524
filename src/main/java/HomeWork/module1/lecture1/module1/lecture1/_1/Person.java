package HomeWork.module1.lecture1.module1.lecture1._1;

public class Person {
    public String fullName;
    public int age;

    public void move() {
        System.out.println(fullName + " говорит ");
    }

    public void talk() {
        System.out.println(fullName + " идёт");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}



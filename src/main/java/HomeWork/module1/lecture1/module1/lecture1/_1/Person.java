package HomeWork.module1.lecture1.module1.lecture1._1;

public class Person {
    //Класс module1.lecture1.module1.lecture1.Person
//Создать класс module1.lecture1.module1.lecture1.Person, который содержит:
//переменные fullName, age;
//методы move() и talk(), в которых просто вывести на консоль сообщение
// -"Такой-то  module1.lecture1.module1.lecture1.Person говорит".
//Добавьте два конструктора  - module1.lecture1.module1.lecture1.Person()
// и module1.lecture1.module1.lecture1.Person(fullName, age).
//Создайте два объекта этого класса. Один объект инициализируется конструктором
// module1.lecture1.module1.lecture1.Person(), другой - module1.lecture1.module1.lecture1.Person(fullName, age)
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

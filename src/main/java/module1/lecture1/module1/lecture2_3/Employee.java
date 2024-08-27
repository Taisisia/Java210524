package module1.lecture1.module1.lecture2_3;

public class Employee {
//    3*. Вы работаете на предприятии, где работает большое количество сотрудников.
//Создате классы и схему наследования для организационной структуры предприятия:
//Базовый класс - Employee с перечнем характеристик и поведением, которые пристутсвуют у любого сотрудника.
//А далее все зависит от подразделений где они работают и их функциональных обязанностей.

    public String name;

    public String surname;

    public int age;

    public String education;

    public String jobTitle;

    public Employee(String name, String surname, int age, String education, String jobTitle) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.education = education;
        this.jobTitle = jobTitle;
    }

    public void worksInShifts() {
        System.out.println(surname + " " + name + " работает посменно");
    }

    public void worksFullTime() {
        System.out.println(surname + " " + name + " работает полный рабочий день");
    }
}

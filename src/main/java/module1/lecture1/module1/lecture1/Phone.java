package module1.lecture1.module1.lecture1;

public class Phone {
    //  Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//Вызвать эти методы для каждого из объектов.

    public int number;
    public String model;

    public int weight;


    public String name;


    public Phone() {
    }

    public Phone(int number) {
        this.number = number;
        System.out.println("Звонит номер " + number);
    }

    public Phone(String model) {
        this.model = model;
        System.out.println("Модель телефона " + model);
    }


    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

        System.out.println("У этого телефона номер " + number + ", модель " + model + ", вес " + weight+".");
    }

    public void receiveCall() {
        System.out.println("Звонит " + name);
    }

    public int getNumber() {
        return number;
    }
}

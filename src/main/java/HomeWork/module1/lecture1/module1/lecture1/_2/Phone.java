package HomeWork.module1.lecture1.module1.lecture1._2;

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

    public void receiveCall() {
        System.out.println("Звонит " + number);
    }

    public int getNumber() {
        return number;
    }
}

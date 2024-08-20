package HomeWork.module1.lecture1.module1.lecture1._2;

public class SimplePhone {
    //     //  Класс Phone.
////Создайте класс Phone, который содержит переменные number, model и weight.
////Создайте три экземпляра этого класса.
////Выведите на консоль значения их переменных.
////Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
////Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
////Вызвать эти методы для каждого из объектов.
    public static void main(String[] args) {
        Phone phone1;
        phone1 = new Phone();
        phone1.number = 123456;
        phone1.model = "Samsung";
        phone1.weight = 125;
        phone1.receiveCall();

        Phone phone2;
        phone2 = new Phone();
        phone2.number = 654321;
        phone2.model = "LG";
        phone2.weight = 100;
        phone2.receiveCall();

        Phone phone3;
        phone3 = new Phone();
        phone3.number = 100973;
        phone3.weight = 185;
        phone3.receiveCall();


    }
}

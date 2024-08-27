package module1.lecture1.module1.lecture1;

public class SimplePhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.name = "Sascha";
        phone1.number = 12345678;
        phone1.model = "Samsung";
        phone1.weight = 154;
        phone1.receiveCall();
        phone1.getNumber();

        Phone phone2 = new Phone(23456789);
        phone2.name = "Alex";
        phone2.model = "LG";
        phone2.weight = 134;
        phone2.receiveCall();
        phone2.getNumber();

        Phone phone3 = new Phone("Nokia");
        phone3.name = "Bob";
        phone3.number = 34567891;
        phone3.weight = 141;
        phone3.receiveCall();
        phone3.getNumber();

        Phone phone4 = new Phone(45678912, "LG", 100 );
        phone4.name = "Joy";
        phone4.receiveCall();
        phone4.getNumber();

    }
}

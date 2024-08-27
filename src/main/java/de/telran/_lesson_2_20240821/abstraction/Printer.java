package de.telran._lesson_2_20240821.abstraction;

public abstract class Printer {
    String name;
    String model;
    int year;

    public Printer() {
        System.out.println("---- Работает конструктор Printer::Printer()");
    }

    void repair() {
        System.out.println("Нужно вызвать специалиста по ремонту по номер тел.11111");
    }

    void service() {
        System.out.println("Нужно вызвать сервис-мастера по номеру телефона 22222");
    }

    // заправлять
    abstract void refill();

    // печатать
    abstract void print();
}


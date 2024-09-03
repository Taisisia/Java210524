package module1.lecture1.module1.lecture4;

public class Ship implements Service, Repair, Swim, TransportationPassengers {
    public String name;

    public Ship(String name) {
        this.name = name;
    }

    @Override
    public void repair() {
        System.out.println(name + " может быть отремонтирован");
    }

    @Override
    public void service() {
        System.out.println(name + " проходит сервисное обслуживание");
    }

    @Override
    public void swim() {
        System.out.println(name + " может плыть");
    }

    @Override
    public void TransportationPassengers() {
        System.out.println(name + " может перевозить пасажиров по воде");
    }
}

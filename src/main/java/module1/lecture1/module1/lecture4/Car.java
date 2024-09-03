package module1.lecture1.module1.lecture4;

public class Car implements Service, Repair, TransportationPassengers, MovementRoad {
    public String name;

    public Car(String name) {
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
    public void TransportationPassengers() {
        System.out.println(name + " перевозит пассажиров");
    }

    @Override
    public void movementRoad() {
        System.out.println(name + " перевозит личный багаж");
    }
}

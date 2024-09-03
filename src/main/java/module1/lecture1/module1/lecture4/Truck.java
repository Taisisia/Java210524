package module1.lecture1.module1.lecture4;

public class Truck implements Service, Repair, TransportationСargoes, MovementRoad{
    public String name;

    public Truck(String name) {
        this.name = name;
    }

    @Override
    public void repair() {

    }

    @Override
    public void service() {
        System.out.println(name + " проходит сервисное обслуживание");
    }

    @Override
    public void TransportationСargoes() {
        System.out.println(name + " проходит сервисное обслуживание");
    }

    @Override
    public void movementRoad() {
        System.out.println(name + " перевозит большие грузы");
    }
}

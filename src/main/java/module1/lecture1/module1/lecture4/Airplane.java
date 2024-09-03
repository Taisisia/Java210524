package module1.lecture1.module1.lecture4;

public class Airplane implements Service, Repair, Fly{
    public String name;

    public Airplane(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " может летать");
    }

    @Override
    public void repair() {
        System.out.println(name + " может быть отремонтирован");
    }

    @Override
    public void service() {
        System.out.println(name + " проходит сервисное обслуживание");
    }
}

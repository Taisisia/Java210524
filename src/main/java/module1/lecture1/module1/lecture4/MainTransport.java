package module1.lecture1.module1.lecture4;

public class MainTransport {
    public static void main(String[] args) {

//    : Есть следующие набор действий:
//   а) ремонтопригодность
//      - метод service() - сервисное обслуживание;
//      - метод repair() - ремонтировать
//   б) полезное использование
//      - transportationСargoes() - перевозка грузов
//      - transportationPassengers() - перевозка грузов
//   в) вид передвижения
//      - fly() - способность летать
//      - swim() - способность плавать
//      - movementRoad() - способность перевозить грузы по дорогам
//   Создайте классы Автобуса, Грузового автомобиля, Легкового автомобиля, Корабля и Самолета,
//которые смогут инкапсулируют вышеуказанные поведения.
//    Подумайте, какие интерфейсы можно создать, чтобы классы включали весь нужный набор поведения
//для каждого класса.

        Airplane airplane = new Airplane("Самолет Adel");
        airplane.fly();
        airplane.repair();
        airplane.service();
        System.out.println();

        Bus bus = new Bus("Автобус Богдан");
        bus.TransportationPassengers();
        bus.movementRoad();
        bus.repair();
        bus.service();
        System.out.println();

        Car car = new Car("Автомобиль Acura");
        car.TransportationPassengers();
        car.movementRoad();
        car.repair();
        car.service();
        System.out.println();

        Ship ship = new Ship("Корабль Титаник");
        ship.swim();
        ship.TransportationPassengers();
        ship.repair();
        ship.service();
        System.out.println();

        Truck truck = new Truck("Грузовой автомобиль Пирожок");
        truck.TransportationСargoes();
        truck.movementRoad();
        truck.repair();
        truck.service();
        System.out.println();

    }
}


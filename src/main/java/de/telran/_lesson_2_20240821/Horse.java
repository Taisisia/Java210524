package de.telran._lesson_2_20240821;

public class Horse {
    public String name;
    protected String color; // доступен потомкам
    int weight; // будет доступен если они находятся в этом пакете
    private int coutToonths;//не наследуется потомками, доступно только внутри класса

    // когда вы создаете хотябы один конструктор, конструктор по умолчанию исчезает
    public Horse() { // конструктор по умолчанию default. все хар-ки будут интициалзированы по умолчанию
    }

    public Horse(String name, String color, int weight) { // инициализирующий конструктор в котором вносятся характеристики которые присутствуют в классе
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public Horse(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void run() {
        System.out.println("Бежит лошадь " + name + " цвет " + color + " зубы " + coutToonths);

    }

    public void transports() {
        System.out.println("Лошадь " + name + " везет груз " + weight);

    }

    private void addTooth (){
        System.out.println( name + " имел " + coutToonths + " зубов");
        int count;
//        coutToonths += count;

    }


}

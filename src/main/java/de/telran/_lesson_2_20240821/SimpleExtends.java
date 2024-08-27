package de.telran._lesson_2_20240821;

public class SimpleExtends {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.name = "Гриша";
        horse1.color = "black";
        horse1.weight = 100;

        horse1.run();
        horse1.transports();

        Horse horse2 = new Horse("Vasia", "wheit", 50);

        horse2.run();
        horse2.transports();


        Horse horse3 = new Horse("Petia", "grey");

        horse3.run();
        horse3.transports();
        System.out.println();


        PegasusDublCoda pegasus1 = new PegasusDublCoda("Soma", "blauk", 20, 2);
        pegasus1.run();
        pegasus1.flu();
        System.out.println();

        PegasusExtNasledovanie pegasusExt = new PegasusExtNasledovanie("PinkiPaip", "pink", 10, 2);
        pegasusExt.run();
        pegasusExt.transports();
        pegasusExt.flu();
        System.out.println();

        UnicornExt unicornExt = new UnicornExt("But", "black", 100, 1);
        unicornExt.run();
        unicornExt.transports();
        unicornExt.butt();
        System.out.println();

        UnicornReisIerarhicheskoeNasledovanie unicornReisIerarhicheskoeNasledovanie = new UnicornReisIerarhicheskoeNasledovanie("Mysia", "lila", 80, 2, 3);
        unicornReisIerarhicheskoeNasledovanie.run();
        unicornReisIerarhicheskoeNasledovanie.transports();
        unicornReisIerarhicheskoeNasledovanie.butt();
        unicornReisIerarhicheskoeNasledovanie.transportPassendger();
        System.out.println();


    }

}

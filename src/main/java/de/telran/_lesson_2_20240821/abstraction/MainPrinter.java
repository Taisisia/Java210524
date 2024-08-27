package de.telran._lesson_2_20240821.abstraction;

public class MainPrinter {
    public static void main(String[] args) {
        LaserPrinter laserPrinter = new LaserPrinter("HP", "LJ100",2005, 1000);
        laserPrinter.repair();
        laserPrinter.service();
        laserPrinter.refill();
        laserPrinter.print();

        System.out.println();

        JetPrinter jetPrinter = new JetPrinter("Epson", "Jet200", 2010);
        jetPrinter.repair();
        jetPrinter.service();
        jetPrinter.refill();
        jetPrinter.print();

//        Printer printer = new Printer();

    }
}

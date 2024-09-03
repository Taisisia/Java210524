package de.telran._lesson_2_20240821;

public class UniPegasus extends PegasusExtNasledovanie {
    UnicornExt unicorn;

    public UniPegasus(String name, String color, int weight, int countWings) {
        super(name, color, weight, countWings);
        unicorn = new UnicornExt (name, color, weight, countWings);
    }

//    System.out.println();
//        // Пример Ассоциации
//        UniPegasus uniPegasus = new UniPegasus("Uni","черный",10, 4, 1);
//        uniPegasus.fly();
//        uniPegasus.unicorn.butt();
//
//    }

}

package de.telran._lesson_4_20240828.polymorphism;

public class MainDznPolym {
    public static void main(String[] args) {
        Dance dance = new Dance("Vasia", 15);
        dance.dance();
        System.out.println();

        HipHopDance hipHopDance = new HipHopDance("Petia", 18);
        hipHopDance.dance();
        System.out.println();

        BreakDance breakDance = new BreakDance("Grisha", 19);
        breakDance.dance();
        System.out.println();

        Dance dance1 = new HipHopDance("Leonid", 20);// динамический полиформизм.
        dance1.dance(); // В класс предка передать метод потомка
        System.out.println();

        Dance dance2 = new BreakDance("Dima", 21);// динамический полиформизм
        dance2.dance();
        System.out.println();

        dance1 = breakDance;

        // hipHopDance = breakDance; - нельзя предку испльзовамть метод другого предка

        Dance [] prog1 = {dance, hipHopDance, breakDance};
        koncert(prog1);

        // Абстрактный класс Singer
        //Singer singer = new Singer("Dascha");// нельзя создать объект абстрактного класса
        System.out.println();

        Singer singer1 = new PopSinger("Mascha"); // можно создать переменную абстрактного класса
        singer1.sing();

        singer1 = new RockSinger ("Sofiia");
        singer1.sing();

//        интерфейс Playable
       // Playable playable = new Playable(); - нельзя создать объект интерфейса

        System.out.println();
//        Сужение функционала до поведения, который представлен в интерфейсе
         Playable playable = new ReperPlay("Miron");
         playable.play();
         playable.speak();

        }




    static void koncert (Dance[] arr){
        System.out.println("  === Наш концерт ===");
        for (Dance dance : arr)
            dance.dance();
    }
}

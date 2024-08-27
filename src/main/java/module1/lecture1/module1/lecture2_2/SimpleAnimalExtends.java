package module1.lecture1.module1.lecture2_2;

public class SimpleAnimalExtends {
    public static void main(String[] args) {
        MammalsBig mammalsBig1 = new MammalsBig("Лев", "Cats", 10);
        mammalsBig1.feeding();
        mammalsBig1.runs();
        mammalsBig1.eatsMeat();
        System.out.println();

        MammalsBig mammalsBig2 = new MammalsBig("Олень", "deer", 3);
        mammalsBig2.feeding();
        mammalsBig2.runs();
        mammalsBig2.feedsOnGrass();
        System.out.println();

        MammalsSmall mammalsSmall1 = new MammalsSmall("Заяц","hare", 1 );
        mammalsSmall1.runs();
        mammalsSmall1.feedsOnGrass();
        System.out.println();

        Birds birds1 = new Birds("Орел", "eagle", 12);
        birds1.feeding();
        birds1.fly();
        System.out.println();

        Birds birds2 = new Birds("Пингвин", "Penguinomorpha", 7);
        birds2.feeding();
        birds2.aquatic();
        System.out.println();


    }

}

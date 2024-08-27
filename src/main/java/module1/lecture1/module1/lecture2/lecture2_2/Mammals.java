package module1.lecture1.module1.lecture2.lecture2_2;

public class Mammals extends Animal {

    public Mammals(String species, String classAnimals, int age) {
        super(species, classAnimals, age);
    }


    public void runs() {
        System.out.println(species + " быстро бегает");

    }
    public void eatsMeat () {
        System.out.println( species + " питается мясом");
    }
    public void feedsOnGrass () {
        System.out.println(species + " питается травой");
    }

}


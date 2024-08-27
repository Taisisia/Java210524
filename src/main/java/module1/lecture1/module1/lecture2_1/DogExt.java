package module1.lecture1.module1.lecture2_1;

public class DogExt extends Pet {
    public DogExt(String name, int age, String color, boolean health, int children) {
        super(name, age, color, health, children);
    }


    public void wagsTail() {
        System.out.println(name + " виляет хвостом.");
    }

    public void walkOnALeash() {
        System.out.println(name + " гуляет на поводке.");
    }
}

package module1.lecture1.module1.lecture2_1;

public class CatExt extends Pet {
    public CatExt(String name, int age, String color, boolean health, int children) {
        super(name, age, color, health, children);
    }

    public void catchesMice (){
        System.out.println(name + " ловит мышей.");
    }

}

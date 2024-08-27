package module1.lecture1.module1.lecture2.lecture2_1;

public class SimplePetExtends {
    public static void main(String[] args) {
        DogExt dogExt1 = new DogExt("Bobik", 2, "black", true, 0);
        dogExt1.feed();
        dogExt1.plays();
        dogExt1.wagsTail();
        dogExt1.walkOnALeash();
        System.out.println();

        DogExt dogExt2 = new DogExt("Lisa", 5, "rot", true, 2);
        dogExt2.feed();
        dogExt2.plays();
        dogExt2.wagsTail();
        dogExt2.walkOnALeash();
        System.out.println();

        CatExt catExt1 = new CatExt("Barsik", 12, "whiet", true, 10);
        catExt1.feed();
        catExt1.plays();
        catExt1.catchesMice();
        System.out.println();

        CatExt catExt2 = new CatExt("Musia", 1, "grey", true, 0)  ;
        catExt2.feed();
        catExt2.plays();
        catExt2.catchesMice();
        System.out.println();
            }
        };


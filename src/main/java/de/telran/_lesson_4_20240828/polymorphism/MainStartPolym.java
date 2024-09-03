package de.telran._lesson_4_20240828.polymorphism;

public class MainStartPolym {
    static int add(int v1, int v2) {
        System.out.println("выполняется add(int v1, int v2)");
        return v1+ v2;
    }
    static double add (double v1, double v2){
        System.out.println("выполняется add(double v1, double v2)");
        return v1 + v2;
    }
    static double add (int v1, double v2){
        System.out.println("выполняется add(int v1, double v2)");
        return v1 + v2;
    }


    public static void main(String[] args) {
//        System.out.println(add(5,8));
//        System.out.println(add(1.0, 3.5));
//        System.out.println(add(1, 3.5));

        System.out.println(add(1L, 3.5));

        System.out.println(add(1L, 3.5F));
    }
}

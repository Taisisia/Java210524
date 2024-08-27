package de.telran._lesson_2_20240821.in;

//    public class PoniNaslednik extends lesson_2_20240821.Horse - полное наименование класса

import de.telran._lesson_2_20240821.Horse;

public class PoniNaslednik extends Horse { //Horse краткое наименование класса (нужно использовать import)
    //    public class PoniNaslednik extends lesson_2_20240821.Horse - полное наименование класса
    int height;// рост

    public void transportChildren() {
        System.out.println(name + " цвет " + super.color + " катает детей");
    }


}

package de.telran._lesson_JavaForQA_2HW;

public class Main {
    // Написать метод, который принимает на вход массив целых чисел
    // и возвращает разницу между суммой элементов, находящихся под чётными индексами
    // и суммой элементов, находящихся под нечётными индексами.
    //
    //Например, для массива [4, 11, 5, -6, 8] результат будет (4 + 5 + 8) - (11 + (-6)) = 12
    //
    //Проверить работу метода для массивов чётного и нечётного размера,
    // а также для массивов размера 1 и пустого массива. Для пустого
    // должен возвращаться результат 0.
    public static void main(String[] args) {

        int[] arr = new int[]{4, 11, 5, -6, 8};
        int[] arrODD = new int[]{4, 11, 5, -6, 8, 3};
        int[] arr1 = new int[]{-4};
        int[] arr0 = new int[]{};

        System.out.println(resultDiff(arr));
        System.out.println(resultDiff(arrODD));
        System.out.println(resultDiff(arr1));
        System.out.println(resultDiff(arr0));
    }

    public static int resultDiff(int[] arr) {
        int sumEven = 0;
        int sumODD = 0;
        int resultDiff = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumODD += arr[i];
            }
            resultDiff = sumEven - sumODD;

        }
        return resultDiff;
    }
}

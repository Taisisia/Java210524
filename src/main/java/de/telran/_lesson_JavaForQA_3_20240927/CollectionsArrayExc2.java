package de.telran._lesson_JavaForQA_3_20240927;

public class CollectionsArrayExc2 {
    // Написать функцию, которая принимает на вход массив целых чисел
    // и возвращает массив в котором  каждые два соседних элемента
    // переставлены друг с другом

    // Пример 1: {2, 7, 17, 56, 9, -5} -> {7, 2, 56, 17, -5, 9}
    // Пример 2: {2, 7, 17, 56, 9} -> {7, 2, 56, 17, 9}
    // Пример 3: {} -> {}
    public static int[] swapPaired(int[] input) {
        int[] result;
        if (input == null || input.length < 2) {
            return input;
        }
        result = new int[input.length];

        for (int i = 0; i < input.length - 1; i += 2) {
            result[i] = input[i + 1];
            result[i + 1] = input[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = new int[]{2, 7, 17, 56, 9, -5};
        int[] arr2 = new int[]{2, 7, 17, 56, 9};
        int[] arr3 = new int[]{};
        int[] arr4 = null;

        int[] result = swapPaired(arr1);
        int[] result2 = swapPaired(arr2);
        int[] result3 = swapPaired(arr3);
        int[] result4 = swapPaired(arr4);

        System.out.println(java.util.Arrays.toString(result));
        System.out.println(java.util.Arrays.toString(result2));
        System.out.println(java.util.Arrays.toString(result3));
        System.out.println(java.util.Arrays.toString(result4));

    }
}

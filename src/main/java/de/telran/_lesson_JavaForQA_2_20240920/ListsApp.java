package de.telran._lesson_JavaForQA_2_20240920;

public class ListsApp {
//
    // Написать функцию которая принимает на вход массив int[] целых чисел и
    // возвращает инвертированный массив
    // Вывести оба массива в консоль в методе main

    // Написать функцию которая принимает на вход два массива int[] целых чисел и
    // возвращает массив содержащий суммы соответствующих парных элементов
    // Если массивы имею разную длину, недостающие элементы считать равными нулю

    public static int[] arrReverse(int[] inArr) {
        int[] outArr = new int[inArr.length]; // create output array

        for (int i = inArr.length - 1; i >= 0; i--) {
            int j = outArr.length - 1 - i;
            outArr[j] = inArr[i];
            System.out.println("inArr[" + i + "]=" + inArr[i]);
            // outArr <- inArr
        }

//        for (int i = inArr.length - 1;j =0;
//            i >= 0;
//         i--., j++) {
//        outArr[j] = inArr[i];}
        return outArr;
    }

    public static void main(String[] args) {
//        int[] testArr = new int[]{1, 2, 7, -8};
//        int[] testResult = arrReverse(testArr);
//        System.out.println("in: " + java.util.Arrays.toString(testArr));
//        System.out.println("res:" + java.util.Arrays.toString(testResult));

        int[] arr1 = new int[]{1, 3, 0, 8};
        int[] arr2 = new int[]{5, 7, 9, 4, 10};
        int[] arr3 = new int[]{5, 7, 9, 4, 10};
        int[] arrRes = arrSum(arr1, arr2, arr3);
        System.out.println("res:" + java.util.Arrays.toString(arrRes));
    }

    public static int[] arrSum(int[] arrFirst, int[] arrSecond, int[]arrThird) {

        int minLength;
        int maxLength;


        if (arrFirst.length > arrSecond.length) {
            minLength = arrSecond.length;
            maxLength = arrFirst.length;
        } else {
            minLength = arrFirst.length;
            maxLength = arrSecond.length;
        }

        int[] arrSum = new int[maxLength];

        for (int i = 0; i < arrSum.length; i++) {

            int v1 = 0;
            int v2 = 0;
            int v3 = 0;

            int maxLength2 = Math.max(arrFirst.length, arrSecond.length);
            int maxLength3 = Math.max(Math.max(arrFirst.length, arrSecond.length), arrThird.length);

            if (i < arrFirst.length) {
                v1 = arrFirst[i];
            }
            if (i < arrSecond.length) {
                v2 = arrSecond[i];
            }

            arrSum[i] = v1 + v2;
        }
        return arrSum;
    }
}





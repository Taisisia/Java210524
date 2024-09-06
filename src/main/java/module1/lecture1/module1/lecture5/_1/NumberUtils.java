package module1.lecture1.module1.lecture5._1;

public class NumberUtils {
    public static int avg(int a, int b) {
        return (a + b) / 2;
    }

    //нахождение среднего значения для целого и дробного числа
    public static double avg(double a, double b) {
        return (a + b) / 2.0;
    }

    // нахождение среднего значения для массива целых чисел
    public static double avg(int a, double b) {
        return (a + b) / 2.0;
    }

    // нахождение среднего значение для массива дробных чисел
    public static double avg(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    // max значение для пары целых чисел
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
}

package com.javarush.test.level03.lesson04.task04;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    public static void main(String[] args)
    {
     int a = 1;
        // Ты забыли использовать скобочки после for
         for (int b=1; b<=10; b++) {
             a = a * b;
             double d = calculateDifference(a, b);
         }
        System.out.println(a);

    }

    private static double calculateDifference(int a, int b) {
        return 0;
    }
}
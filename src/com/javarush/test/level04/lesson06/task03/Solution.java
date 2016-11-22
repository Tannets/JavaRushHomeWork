package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a > b && a > c) {
            if (b > c){
                System.out.printf("%d %d %d", a, b, c);
            } else
                System.out.printf("%d %d %d", a, c, b);
            }
        if (b > a && b > c) {
            if (a > c){
                System.out.printf("%d %d %d", b, a, c);
            } else
                System.out.printf("%d %d %d", b, c, a);
        }
        if (c > a && c > b) {
            if (a > b) {
                System.out.printf("%d %d %d", c, a, b);
            } else
                System.out.printf("%d %d %d", c, b, a);
        }
        //напишите тут ваш код
    }
}

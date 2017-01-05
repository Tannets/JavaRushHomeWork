package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму,
 пока пользователь не введёт слово «сумма».
 Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        String sum = "сумма";

        while (true) {
            int a = Integer.parseInt(reader.readLine());
            i = i + a;
            if (reader.readLine().equals(sum))
                break;
        }
        System.out.println(i);
        //напишите тут ваш код
    }
}

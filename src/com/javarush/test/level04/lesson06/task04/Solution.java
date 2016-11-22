package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String person1 = reader.readLine();
        String person2 = reader.readLine();
        int p1 = person1.length();
        int p2 = person2.length();

        if (person1.equals(person2)) {
            System.out.println("Имена идетичны");
        } else if (p1 == p2) {
            System.out.println("Длины имен равны");
        }
        //напишите тут ваш код

    }
}

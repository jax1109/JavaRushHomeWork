package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String y1 = reader.readLine();
        String m1 = reader.readLine();
        String d1 = reader.readLine();
        int d = Integer.parseInt(d1);
        int m = Integer.parseInt(m1);
        int y = Integer.parseInt(y1);
        System.out.println("Меня зовут "+name);
        System.out.println("Я родился " + d + "." + m + "."+ y);
    }
}

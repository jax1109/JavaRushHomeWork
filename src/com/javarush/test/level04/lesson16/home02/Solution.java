package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();
        int i1 = Integer.parseInt(n1);
        int i2 = Integer.parseInt(n2);
        int i3 = Integer.parseInt(n3);
        if ((i1 > i2)&&(i1<i3)){
        System.out.println(i1);
    }
        else if ((i2 > i1)&&(i2<i3))
        {
            System.out.println(i2);
        }
        else
        {
            System.out.println(i3);
        }
}}

package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int k = 0;
        String text=null;
        boolean exit= false;
        while (!exit)
        {
            if ((text=read.readLine()).equals("сумма") )
                exit = true;
            else
            {
                try
                {
                    k = Integer.parseInt(text);
                }
                catch (NumberFormatException e)
                {
                    k=0;
                }

                //summing!
                sum = sum+k;
            }
        }
        System.out.println(sum);
    }
}
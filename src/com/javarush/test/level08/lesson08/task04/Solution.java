package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone0", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JULY 1 1980"));
        map.put("Stallone2", new Date("December 1 1980"));
        map.put("Stallone3", new Date("August 1 1980"));
        map.put("Stallone4", new Date("January 1 1980"));
        map.put("Stallone5", new Date("January 1 1980"));
        map.put("Stallone6", new Date("January 1 1980"));
        map.put("Stallone7", new Date("January 1 1980"));
        map.put("Stallone8", new Date("January 1 1980"));
        map.put("Stallone9", new Date("January 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)

    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            int month = iterator.next().getValue().getMonth() + 1;
            if (6 <= month && month <= 8)
            {
                iterator.remove();
            }
        }

    }
    public static void main(String[] args)
    {
        HashMap<String, Date> wasBorn = createMap();
        removeAllSummerPeople(wasBorn);
        System.out.println(wasBorn);
    }
}
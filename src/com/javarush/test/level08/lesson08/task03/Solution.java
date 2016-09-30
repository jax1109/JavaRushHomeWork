package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;


/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Петров" , "Евгений");
        map.put("Сидоров" , "Евгений");
        map.put("Шнур" , "Евгений");
        map.put("Петров" , "Сергей");
        map.put("Иванов" , "Иван");
        map.put("Петров" , "Евгений");
        map.put("Петров" , "Евгений");
        map.put("Петров" , "Евгений");
        map.put("Петров" , "Евгений");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код

        for (HashMap.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код

    }
}

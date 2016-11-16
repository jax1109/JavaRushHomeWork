package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {

    public static HashMap<String, String> createMap() {
        HashMap <String, String> map = new HashMap <String, String>();
        for (int i = 0; i < 10; i++) {
            map.put("Ганза"+i,"Руслан"+i);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //копируем ХэшМап
        HashMap<String,String> copy = new HashMap<String, String>(map);
        //прогоняем копию по имени в поисках соответствий в оригинальном ХэшМап
        for (Map.Entry<String, String> pair: copy.entrySet()) {
            //с помощью итератора удаляем позиции из оригинала совпадающие по НЕуникальному имени и НЕсовпадающие по уникальному ключу
            for (Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator(); iter.hasNext(); ) {
                Map.Entry<String, String> temp = iter.next();
                if (pair.getValue().equals(temp.getValue())&&!pair.getKey().equals(temp.getKey())) iter.remove();
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
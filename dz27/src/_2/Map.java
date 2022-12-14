package _2;

import java.util.HashMap;
import java.util.HashSet;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> map;
        map = createMap();
        System.out.println(map);
        System.out.println(getSameFirstNameCount((HashMap<String, String>) map));
        System.out.println(getSameLastNameCount((HashMap<String, String>) map));
    }

    private static HashMap<String, String> createMap() {
        var map = new HashMap<String, String>();
        map.put("Егоркин", "Евгений");
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Петр");
        map.put("Сергеев", "Сергей");
        map.put("Александров", "Егор");
        map.put("Петров", "Андрей");
        map.put("Алексеев", "Алексей");
        map.put("Антонов", "Антон");
        map.put("Егоркин", "Евгений");
        return map;
    }

    private static int getSameLastNameCount(HashMap<String, String> map) {
        var lastNameSet = new HashSet<String>();
        for (var entry : map.entrySet())
            lastNameSet.add(entry.getKey());
        return map.entrySet().size() - lastNameSet.size();
    }

    private static int getSameFirstNameCount(HashMap<String, String> map) {
        var firstNameSet = new HashSet<String>();
        for (var entry : map.entrySet())
            firstNameSet.add(entry.getValue());
        return map.entrySet().size() - firstNameSet.size();
    }
}

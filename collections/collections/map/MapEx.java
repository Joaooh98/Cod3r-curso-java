package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();

        users.put(1, "Roberto");
        users.put(1, "Roberto");
        users.put(2, "Roberto");
        users.put(3, "Roberto");
        users.put(3, "joao");
        users.put(4, "joao");

        System.out.println(users.size());
        System.out.println(users.isEmpty());
        System.out.println(users.keySet());
        System.out.println(users.values());
        System.out.println(users.entrySet());

        System.out.println(users.containsKey(1));

        for (int key : users.keySet()) {
            System.out.println(key);
        }

        for (String key : users.values()) {
            System.out.println(key);
        }

        for (Entry<Integer, String> user : users.entrySet()) {
            System.out.println(user);
        }

    }
}

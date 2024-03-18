package collections;

import java.util.HashSet;

import collections.list.User;

public class Hash {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<User>();

        users.add(new User("Joao"));
        users.add(new User("Ana"));
        users.add(new User("Guilherme"));
        
        boolean result = users.contains(new User("Guilherme"));
        System.out.println(result);
    }
}

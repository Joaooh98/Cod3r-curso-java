package collections.list;

import java.util.ArrayList;

public class Listt {
    public static void main(String[] args) {
        ArrayList<User> listt = new ArrayList<>();
        // List<User> listt = new ArrayList<>();

        User userOne = new User("Joao");
        listt.add(userOne);

        listt.add(new User("Antonio"));
        listt.add(new User("Maria"));
        listt.add(new User("Marcos"));
        listt.add(new User("Mateus"));

        System.out.println(listt.get(3)); // acessa pelo indice (access through the index)
        System.out.println(listt.remove(3)+" removido"); // remove pelo indice e retorna ele como valor (removes by index and returns it as value)
        System.out.println(listt.remove(userOne)+" removido"); // remove pelo objeto e retorna booleano (remove by object and return boolean)

        System.out.println(listt.contains(userOne));

        for (User user : listt) {
            System.out.println(user);
        }
    }
}

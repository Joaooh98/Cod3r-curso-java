package lambdas.foreach;

import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        for (String string : names) {
            System.out.println("Hello, " + string + "!");
        }

        System.out.println("Using lambda expression:");

        names.forEach(name -> System.out.println("Hello, " + name + "!"));

        System.out.println("Using method reference:");
        names.forEach(System.out::println);

        names.forEach(Foreach::print);
    }

    static void print(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

package lambdas.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> evenOrOdd = number -> {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        };

        System.out.println(evenOrOdd.apply(10)); // Even
        System.out.println(evenOrOdd.apply(11)); // Odd
        System.out.println("-------------------------------------------------");
        Function<Integer, String> evenOrOddWithTernary = number -> number % 2 == 0 ? "Even" : "Odd";
        Function<String, String> result = str -> " is the result: " + str;
        Function<String, String> resultExciting = str -> str + " !!! ";

        String resultFinal = evenOrOddWithTernary
                .andThen(result)
                .andThen(resultExciting)
                .apply(10);

        System.out.println(resultFinal); // Even is the result: !!!

    }
}

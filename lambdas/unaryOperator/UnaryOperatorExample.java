package lambdas.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> addTwo = number -> number + 2;
        UnaryOperator<Integer> multiplyByTwo = number -> number * 2;
        UnaryOperator<Integer> squared = number -> number * number;

        int numb = addTwo.andThen(multiplyByTwo).andThen(squared).apply(0);
        System.out.println("Result: " + numb);

        int numbCompose = squared.compose(multiplyByTwo).compose(addTwo).apply(0);

        System.out.println("Result: " + numbCompose);
    }
}

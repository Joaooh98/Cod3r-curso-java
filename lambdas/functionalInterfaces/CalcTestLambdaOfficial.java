package lambdas.functionalInterfaces;

import java.util.function.BinaryOperator;

public class CalcTestLambdaOfficial {
    public static void main(String[] args) {

        BinaryOperator<Double> sum = (x, y) -> x + y;
        BinaryOperator<Double> mult = (x, y) -> x * y;
        System.out.println("Sum: " + sum.apply(5.0, 3.0)); // Output: Sum: 8.0
        System.out.println("Mult: " + mult.apply(5.0, 3.0)); // Output: Mult: 15.0
    }
}

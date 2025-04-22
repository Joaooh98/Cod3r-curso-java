package lambdas.binaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        BinaryOperator<Integer> multiply = (a, b) -> a * b;

        System.out.println("Sum: " + sum.apply(5, 3)); 
        System.out.println("Multiply: " + multiply.apply(5, 3)); 

        BinaryOperator<Double> med = (n1, n2) -> (n1 + n2) / 2;
        System.out.println("Media: " + med.apply(5.0, 3.0)); 
        System.out.println("-------------------------------------------------");

        BiFunction<Double, Double, String> verifyResult = (n1, n2) -> {
            double noteFinal = (n1 + n2) / 2;
            return noteFinal >= 7 ? "Aprovado" : "Reprovado";
        };

        verifyResult = verifyResult.andThen(result -> result + " !!!");
        System.out.println(verifyResult.apply(5.0, 3.0)); 
        System.out.println(verifyResult.apply(8.0, 9.0)); 

        System.out.println("-------------------------------------------------");

        Function<Double, String> concept  = m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(med.andThen(concept).apply(5.0, 3.0)); 
        System.out.println(med.andThen(concept).apply(8.0, 9.0)); 
      }
}

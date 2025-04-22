package lambdas.predicate;

import java.util.function.Predicate;

public class PredicateComposicao {
    public static void main(String[] args) {
        
        Predicate<Integer> isEven = number -> number % 2 == 0;
        
        Predicate<Integer> isGreaterThanFive = number -> number >= 100 && number <= 999;

        System.out.println(isEven.and(isGreaterThanFive).test(100)); // true
        System.out.println(isEven.and(isGreaterThanFive).test(99)); // false
        System.out.println(isEven.and(isGreaterThanFive).negate().test(100)); // false
    }
}

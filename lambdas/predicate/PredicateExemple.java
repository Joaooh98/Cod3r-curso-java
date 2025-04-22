package lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExemple {
    public static void main(String[] args) {
        Predicate<Product> isExpensive = product -> (product.price * (1 - product.descont)) >= 100;

        var product1 = new Product("Laptop", 1200, 0.10);
        var product2 = new Product("Mouse", 20, 0.5);
        var product3 = new Product("Keyboard", 50, 0.2);

        System.out.println("Is " + product1.name + " expensive? " + isExpensive.test(product1));
        System.out.println("Is " + product2.name + " expensive? " + isExpensive.test(product2));
        System.out.println("Is " + product3.name + " expensive? " + isExpensive.test(product3));

        // doc do java: https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
    }
}

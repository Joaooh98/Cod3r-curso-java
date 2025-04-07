package lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExemple {
    public static void main(String[] args) {
        Predicate<product> isExpensive = product -> (product.price * (1 - product.descont)) >= 100;

        var product1 = new product("Laptop", 1200, 0.10);
        var product2 = new product("Mouse", 20, 0.5);
        var product3 = new product("Keyboard", 50, 0.2);

        System.out.println("Is " + product1.name + " expensive? " + isExpensive.test(product1));
        System.out.println("Is " + product2.name + " expensive? " + isExpensive.test(product2));
        System.out.println("Is " + product3.name + " expensive? " + isExpensive.test(product3));
    }
}

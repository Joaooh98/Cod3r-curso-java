package lambdas.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemple {
    public static void main(String[] args) {
        Consumer<Product> printProduct = product -> {
            System.out.println("Product name: " + product.name);
            System.out.println("Product price: " + product.price);
            System.out.println("Product discount: " + product.descont);
        };

        Product product = new Product("DELL", 1500.00, 10.00);
        Product productOne = new Product("APPLE", 1000.00, 10.00);
        Product productTwo = new Product("ASUS", 1120.00, 10.00);
        printProduct.accept(product);

        List<Product> products = List.of(product, productOne, productTwo);
        products.forEach(printProduct);
        System.out.println("-------------------------------------------------");
        products.forEach(System.out::println);
    }
}

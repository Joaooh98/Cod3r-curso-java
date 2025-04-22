package lambdas.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<List<String>> supplier = () -> Arrays.asList("Apple", "Banana", "Orange");

        List<String> fruits = supplier.get();
        System.out.println("Fruits: " + fruits);
    }
}

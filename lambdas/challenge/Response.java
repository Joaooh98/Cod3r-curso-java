package lambdas.challenge;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Response {
    public static void main(String[] args) {

        Function<Product, Double> calculateDiscount = p -> p.price - (p.price * p.descont);

        UnaryOperator<Double> taxMunicipal = price -> price >= 2500 ? price + (price * 0.085) : price;

        UnaryOperator<Double> taxDelivery = price -> price >= 3000 ? price + 100 : price + 50;

        UnaryOperator<Double> round = price -> {
            return Math.round(price * 100.0) / 100.0;
        };

        Function<Double, String> format = price -> {
            DecimalFormat df = new DecimalFormat("R$ #,##0.00");
            return df.format(price);
        };

        var product = new Product("iPad", 3235.89, 0.13); // Exemplo com valor acima de 3000

        String result = calculateDiscount
                .andThen(taxMunicipal)
                .andThen(taxDelivery)
                .andThen(round)
                .andThen(format)
                .apply(product);

        System.out.println(result);
    }
}

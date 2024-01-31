package classes.challenge;

public class ProductTest {
    public static void main(String[] args) {
        var p1 = new Product("iphone", 1000.00);
        var p2 = new Product();

        p2.name = "notebook";
        p2.price = 5000.00;

        Product.discount = 0.50; // Access discount directly from the class.

        System.out.println(p1.name);
        System.out.println(p2.name);

        double priceFinalP1 = p1.priceWithDiscount(); 
        double priceFinalP2 = p2.priceWithDiscount(0.10);
        
        double shoppingCart = (priceFinalP1 + priceFinalP2)/2;

        System.out.printf("media do carrinho = R$%.2f.", shoppingCart);
    }
}

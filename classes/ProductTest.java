package classes;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        var p2 = new Product();

        p1.name = "iphone";
        p1.price = 1000.00;
        p1.discount = 20;

        p2.name = "notebook";
        p2.price = 5000.00;
        p2.discount = 10;

        System.out.println(p1.name);
        System.out.println(p2.name);

        double priceFinalP1 = p1.price * (1-p1.discount); 
        double priceFinalP2 = p2.price * (1-p2.discount);
        
        double shoppingCart = (priceFinalP1 + priceFinalP2)/2;

        System.out.printf("media do carrinho = R$.2f.", shoppingCart);
    }
}

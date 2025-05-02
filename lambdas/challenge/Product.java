package lambdas.challenge;

public class Product {
    
    String name;

    double price;

    double descont;

    public Product(String name, double price, double descont) {
        this.name = name;
        this.price = price;
        this.descont = descont;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", descont=" + descont + "]";
    }

}

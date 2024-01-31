package classes.challenge;

public class Product {
     String name;
     double price;
     static double discount = 0.25;

     public Product() {

     }

     public Product(String name, double price) {
          this.name = name;
          this.price = price;
     }

     double priceWithDiscount(){
          return (price *(1- discount));
     }

     double priceWithDiscount(double discountManager){
          return price * (1 - discount + discountManager);
     }

}

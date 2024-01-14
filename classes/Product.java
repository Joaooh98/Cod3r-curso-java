package classes;

public class Product {
     String name;
     double price;
     double discount;

     public Product() {

     }

     public Product(String name, double price, double discount) {
          this.name = name;
          this.price = price;
          this.discount = discount;
     }

     double priceWithDiscount(){
          return (price *(1- discount));
     }

     double priceWithDiscount(double discountManager){
          return price * (1 - discount + discountManager);
     }

}

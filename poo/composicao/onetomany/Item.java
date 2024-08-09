package poo.composicao.onetomany;
@SuppressWarnings("all")
public class Item {

    public String name;
    public Integer quantity;
    public double price;
    public Purchase purchase;

    public Item(String name, Integer quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantidade) {
        this.quantity = quantidade;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double preco) {
        this.price = preco;
    }

    
}

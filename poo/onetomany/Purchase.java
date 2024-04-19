package poo.onetomany;

import java.util.ArrayList;
import java.util.List;

public class Purchase {

    public String client;
    public List<Item> itens = new ArrayList<>();

    public void addItem(String name, int quantity, double price){
        this.addItem(new Item(name, quantity, price));
    }

    public void addItem(Item item){
        itens.add(item);
        item.purchase = this;
    }

    public double getAmount() {
        double total = 0;

        for (Item item : itens) {
            System.out.println("name: "+item.name);
            System.out.println("price: R$ "+item.price);
            total += item.quantity * item.price;
        }
        System.out.println("valor total: "+total);
        return total;
    }
}

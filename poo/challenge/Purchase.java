package poo.challenge;

import java.util.List;

public class Purchase {
    
    double amout;

    Client client;

    List<Item> items;
    
    double getTheFullAmount(){
        double total = 0;
        for (Item item : items) {
            total += item.qtde * item.product.amount;
        }
        return total;
    }

    void addItem(Product product, int qtde){
        this.items.add(new Item(product, qtde));
    }
}

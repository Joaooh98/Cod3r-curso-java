package poo.onetomany;

import java.util.ArrayList;

public class Purchase {

    public String client;

    public ArrayList<Item> itens = new ArrayList<Item>();

    public double getAmount() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}

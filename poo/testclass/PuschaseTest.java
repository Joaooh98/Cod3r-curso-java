package poo.testclass;

import poo.onetomany.Item;
import poo.onetomany.Purchase;

public class PuschaseTest {
    public static void main(String[] args) {
        var c1 = new Purchase();
    
        c1.client = "joao";
        c1.itens.add(new Item("Caneta", 20, 7.45));
        c1.itens.add(new Item("Borracha", 12, 3.89));
        c1.itens.add(new Item("Caderno", 3, 18.79));

        System.out.println(c1.itens.size());
        System.out.println(c1.getAmount());
    }
}

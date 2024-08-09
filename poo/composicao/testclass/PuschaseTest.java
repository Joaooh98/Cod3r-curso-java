package poo.composicao.testclass;

import poo.composicao.onetomany.Item;
import poo.composicao.onetomany.Purchase;

public class PuschaseTest {
    public static void main(String[] args) {
        var c1 = new Purchase();

        c1.client = "joao";
        c1.itens.add(new Item("Caneta", 20, 7.45));
        c1.itens.add(new Item("Borracha", 12, 3.89));
        c1.itens.add(new Item("Caderno", 3, 18.79));
        c1.addItem("Caneta", 1, 2.99);

        System.out.println(c1.itens.size());
        
        c1.getAmount();
    }
}

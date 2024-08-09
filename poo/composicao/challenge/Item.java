package poo.composicao.challenge;

public class Item {
    
    Integer qtde;

    Product product;

    public Item(Product product, Integer qtde) {
        this.qtde = qtde;
        this.product = product;
    }
}

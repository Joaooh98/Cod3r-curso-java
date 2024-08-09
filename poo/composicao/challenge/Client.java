package poo.composicao.challenge;

import java.util.List;

public class Client {
    
    String name;

    List<Purchase> purchases;

    public Client(String name) {
        this.name = name;
    }

    double getTheFullAmount(){
        double total =0;

        for (Purchase purchase : purchases) {
            total += purchase.getTheFullAmount();
        }
        
        return total;
    }
}

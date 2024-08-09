package poo.composicao.challenge;

public class ClientTest {
    public static void main(String[] args) {
        var client = new Client("Joao");

        var purchase = new Purchase();
        purchase.addItem(new Product("notebook", 1000.00), 1);
        purchase.addItem(new Product("monitor", 160.00), 1);

        var purchaseTwo = new Purchase();
        purchaseTwo.addItem(new Product("mouse", 30.00), 1);
        purchaseTwo.addItem(new Product("teclado", 70.00), 1);
    }
}

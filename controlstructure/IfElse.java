package controlstructure;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("informe um numero: ");

        int num = Integer.parseInt(valor);
        
        if (num % 2 == 0) {
            System.out.println("numero par!");
        } else {
            System.out.println("numero impar!");
        }
    }
}

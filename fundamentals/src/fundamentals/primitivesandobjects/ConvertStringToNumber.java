package fundamentals.primitivesandobjects;

import javax.swing.JOptionPane;

public class ConvertStringToNumber {
    public static void main(String[] args) {
        String valueOne = JOptionPane.showInputDialog("Digite um numero");
        String valueTwo = JOptionPane.showInputDialog("Digite um numero");

        System.out.println(valueOne+valueTwo+"  valor em String");
        double numberOne =Double.parseDouble(valueOne);
        double numberTwo =Double.parseDouble(valueTwo);

        double sum =  numberOne+numberTwo;
        System.out.println(sum);
        System.out.println(sum/2);

    }
}

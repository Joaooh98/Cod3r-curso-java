package fundamentals.primitivesandobjects;

import javax.swing.JOptionPane;

public class ConvertStringToNumber {
    public static void main(String[] args) {
        String valueOne = JOptionPane.showInputDialog("Digite um numero");
        String valueTwo = JOptionPane.showInputDialog("Digite um numero");

        JOptionPane.showMessageDialog(null,valueOne+valueTwo+"  valor em String concat","result String", JOptionPane.INFORMATION_MESSAGE );

        double numberOne =Double.parseDouble(valueOne);
        double numberTwo =Double.parseDouble(valueTwo);

        double sum =  numberOne+numberTwo;

        JOptionPane.showMessageDialog(null, sum, "result sum", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, sum/2, "Split result", JOptionPane.INFORMATION_MESSAGE);


    }
}

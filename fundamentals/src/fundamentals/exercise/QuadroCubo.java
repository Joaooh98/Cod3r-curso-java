package fundamentals.exercise;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class QuadroCubo {
    public static void main(String[] args) {
        String valueOne = JOptionPane.showInputDialog("Digite um valor:  ");

        double numberOne =Double.parseDouble(valueOne);

        double resultSquare = Math.pow(numberOne, 2);
        double resultCube = Math.pow(numberOne, 2);

        DecimalFormat format = new DecimalFormat("#.##");
        String resultSquareFormat = format.format(resultSquare);
        String resultCubeFormat = format.format(resultCube);

        JOptionPane.showMessageDialog(null, resultSquareFormat, "AO QUADRADO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resultCubeFormat, "AO CUDO", JOptionPane.INFORMATION_MESSAGE);
    }
}

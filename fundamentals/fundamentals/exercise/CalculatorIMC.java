package fundamentals.fundamentals.exercise;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CalculatorIMC {
    public static void main(String[] args) {

        String height = JOptionPane.showInputDialog("QUAL A SUA ALTURA: ");
        String Weight = JOptionPane.showInputDialog("QUAL A SEU PESO: ");

        double numberTwo =Double.parseDouble(height);
        double numberThree =Double.parseDouble(Weight);

        double imc = numberThree / (numberTwo * numberTwo);

        DecimalFormat format = new DecimalFormat("#.##");
        String imcFormatado = format.format(imc);

        JOptionPane.showMessageDialog(null, imcFormatado, "IMC", JOptionPane.INFORMATION_MESSAGE);
    }
}

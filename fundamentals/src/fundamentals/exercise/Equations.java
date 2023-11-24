package fundamentals.exercise;

import javax.swing.JOptionPane;

public class Equations {
    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("QUAL A SUA ALTURA: ");
        String b = JOptionPane.showInputDialog("QUAL A SUA ALTURA: ");
        String c = JOptionPane.showInputDialog("QUAL A SUA ALTURA: ");

        double numberOne =Double.parseDouble(a);
        double numberTwo =Double.parseDouble(b);
        double numberThree =Double.parseDouble(c);

        double delta = numberTwo * numberTwo - 4 * numberOne * numberThree;

        JOptionPane.showMessageDialog(null, delta, "IMC", JOptionPane.INFORMATION_MESSAGE);
    }
}

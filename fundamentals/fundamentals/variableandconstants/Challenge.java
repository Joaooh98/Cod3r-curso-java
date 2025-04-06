package fundamentals.fundamentals.variableandconstants;

public class Challenge {
    public static void main(String[] args) {
        // (F - 32) x 5/9 = c
        final double FACTOR = 5/9.0;
        final double ADJUSTMENT = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - ADJUSTMENT) * FACTOR;

        System.out.println(celsius);

        fahrenheit = 100;
        celsius = (fahrenheit - ADJUSTMENT) * FACTOR;

        System.out.println(celsius);
    }
}

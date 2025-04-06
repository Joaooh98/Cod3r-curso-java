package lambdas.chanllenge;

public class CalcTest {
    public static void main(String[] args) {
        ICalc sum = new Sum();
        ICalc mult = new Mult();

        System.out.println("Sum: " + sum.execute(5, 3)); // Output: Sum: 8.0
        System.out.println("Mult: " + mult.execute(5, 3)); // Output: Mult: 15.0
    }
}

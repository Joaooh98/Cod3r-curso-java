package lambdas.chanllenge;

public class CalcTestLambda {
    public static void main(String[] args) {

        ICalc sum = (x,y) -> {
            return x + y;
        };

        ICalc mult = (x,y) -> {
            return x * y;
        };
        System.out.println("Sum: " + sum.execute(5, 3)); // Output: Sum: 8.0
        System.out.println("Mult: " + mult.execute(5, 3)); // Output: Mult: 15.0
    }
}

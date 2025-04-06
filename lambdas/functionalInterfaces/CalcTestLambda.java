package lambdas.functionalInterfaces;


public class CalcTestLambda {
    public static void main(String[] args) {

        ICalc sum = (x,y) -> {
            return x + y;
        };

        ICalc mult = (x,y) -> {
            return x * y;
        };

        ICalc defaultInter = (x,y) -> {
            return x + y;
        };
        
        defaultInter.dafaultMethod(5, 3); // Output: metodo default: 8.0
        ICalc.staticMethod(5, 3); // Output: metodo static: 15.0

        System.out.println("Sum: " + sum.execute(5, 3)); // Output: Sum: 8.0
        System.out.println("Mult: " + mult.execute(5, 3)); // Output: Mult: 15.0
        System.out.println("DefaultInter: " + defaultInter.dafaultMethod(5, 3)); // Output: Sum: metodo default: 8.0
        System.out.println("Static: " + ICalc.staticMethod(5, 3)); // Output: Static: metodo static: 15.0
    }
}

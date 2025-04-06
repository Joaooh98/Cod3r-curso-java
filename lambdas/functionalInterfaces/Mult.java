package lambdas.functionalInterfaces;


public class Mult implements ICalc{

    @Override
    public double execute(double a, double b) {
        return a * b;
    }
    
}

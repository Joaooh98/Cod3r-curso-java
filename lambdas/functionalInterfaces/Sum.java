package lambdas.functionalInterfaces;

public class Sum implements ICalc{

    @Override
    public double execute(double a, double b) {
        return a + b;
    }
    
}

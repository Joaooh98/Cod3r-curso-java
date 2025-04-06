package lambdas.functionalInterfaces;
/**
 * This is a functional interface that represents a calculation operation
 * between two double values.
 * It is not possible to create more than one method except (default, static).
 */
@FunctionalInterface
public interface ICalc {

    double execute(double a, double b);

    default String dafaultMethod(double a, double b) {
        return "metodo default: " + execute(a, b);
    }

    static String staticMethod(double a, double b) {
        return "metodo static: " + a * b;
    }
}

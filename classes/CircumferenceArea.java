package classes;

public class CircumferenceArea {
    double radius;
    static final double PI = 3.1415;

    CircumferenceArea(double initialRadius) {
        radius = initialRadius;
    }

    double area() {
        return PI * Math.pow(radius, 2);
    }

    static double area(double radius) {
        return PI * Math.pow(radius, 2);
    }

}

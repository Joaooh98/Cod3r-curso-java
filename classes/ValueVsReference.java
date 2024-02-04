package classes;

public class ValueVsReference {
    public static void main(String[] args) {
        double a = 2;
        double b = a; 
        System.out.println(a + " = a and b=: " + b);

        a++;
        b--;
        System.out.println(a + " = a and b=: " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1;

        d1.day = 31;
        d2.month = 12;

        d1.showDateFormat();
        d2.showDateFormat();

        returnToDefaultValue(d1);

        d1.showDateFormat();
        d2.showDateFormat();

        int c = 5;

        changePrimitiveTypeValue(c);
        
        System.out.println(c);

    }

    private static void returnToDefaultValue(Data d1) {
        d1.day = 1;
        d1.month = 1;
        d1.year = 19970;
    }

    static void changePrimitiveTypeValue(int c) {
        c++;
    }
}

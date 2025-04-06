package fundamentals.fundamentals.operators;

public class Relational {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a';

        System.out.println(a == b);

        System.out.println(3 > 4);
        System.out.println(3 >= 4);
        System.out.println(3 < 4);
        System.out.println(3 <= 4);
        System.out.println(3 != 4);

        double nota = 9.9;

        boolean goodBehavior = false;
        boolean passedTroughaverage = nota >= 7;
        boolean haveDiscount = goodBehavior && passedTroughaverage;

        System.out.println("possui disconto?" + haveDiscount);
        System.out.println("Do you have a discount?" + haveDiscount);
    }
}

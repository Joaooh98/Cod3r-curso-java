package fundamentals.fundamentals.operators;

public class LogicChallenge {
    public static void main(String[] args) {
        boolean freelancerTuesday = true;
        boolean freelancerThursday = true;

        boolean buyTV50 = freelancerTuesday && freelancerThursday;
        System.out.println("buy TV 50\"?" + buyTV50);
        boolean buyTV32 = freelancerTuesday || freelancerThursday;
        System.out.println("buy TV 32\"?" + buyTV32);
        boolean buyTV32WithOrExclusive = freelancerTuesday ^ freelancerThursday;
        System.out.println("buy TV 32\"?" + buyTV32WithOrExclusive);
        boolean iceCream = freelancerTuesday || freelancerThursday;
        System.out.println("buy Ice cream: " + iceCream);
        System.out.println("Was it healthy?" + !iceCream);
    }
}

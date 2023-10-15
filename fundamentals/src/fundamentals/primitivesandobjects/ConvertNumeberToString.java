package fundamentals.primitivesandobjects;

public class ConvertNumeberToString {
    public static void main(String[] args) {
        Integer numOne = 1000;
        String numOneString = numOne.toString();
        System.out.println(numOneString);
        System.out.println(numOneString.length());

        int numTwo = 1111;
        String numTwoString = Integer.toString(numTwo);
        System.out.println(numTwoString);
        System.out.println(numTwoString.length());
    }
}

package fundamentals.fundamentals.primitivesandobjects;

public class ConvertTypePrimitive {
    public static void main(String[] args) {
        double a = 1; // conversao do tipo implicita
        System.out.println(a);

        float b = (float) 1.1234567898888; // explicita
        System.out.println(b);

        int c= 127;
        byte d = (byte) c; // explicita
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; // explicita
        System.out.println(f);
    }
}

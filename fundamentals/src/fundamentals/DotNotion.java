package fundamentals;

public class DotNotion {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.toUpperCase();
        System.out.println(s);
        s = s.replace("X", "senhora");
        System.out.println(s);
        String x = "Leo".toUpperCase();
        System.out.println(x);
        System.out.println("\n");
        String y = "Joao "
                    .concat(s)
                    .replace("o", "M")
                    .toUpperCase();

        System.out.println(y);

    }
}

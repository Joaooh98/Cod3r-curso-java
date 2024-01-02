package controlstructure;

public class forExempleThree {
    public static void main(String[] args) {
        System.out.println("PRIMEIRO EXEMPLO");
        int i = 0;

        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("fora do for: " + i);

        for (int j = 0; j < 10; j++) {
            for (int ji = 0; ji < 10; ji++) {
                System.out.printf("[%d %d]", j, ji);
            }
            System.out.println();
        }
    }

}

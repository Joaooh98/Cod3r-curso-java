package controlstructure;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a media: ");
        double media = input.nextDouble();

        boolean approved = media >= 7.0;
        boolean recovery = media < 4.5 && media >= 0;
        boolean disapproved = media < 4.5 && media >= 0;

        if (approved) {
            System.out.println(" APROVADO ");
        }
        if (recovery) {
            System.out.println("RECUPERACAO");
        }

        if (disapproved) {
            System.out.println("REPROVADO");
        }

        input.close();
    }
}

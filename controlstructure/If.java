package controlstructure;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a average: ");
        double average = input.nextDouble();

        boolean approved = average >= 7.0;
        boolean recovery = average < 4.5 && average >= 0;
        boolean disapproved = average < 4.5 && average >= 0;

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

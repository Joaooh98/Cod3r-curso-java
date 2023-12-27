package controlstructure;

import java.util.Scanner;

public class ChallengeWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int noteQuantity = 0;
        double note = 0;
        double total = 0;

        while (note != -1) {
            System.out.println("informe  a nota (ou -1 p/sair): ");
            note = input.nextDouble();
            if (note <= 10 && note >= 0) {
                total += note;
                noteQuantity++;
            } else {
                System.out.println("nota invalida");
            }
            double average = total / noteQuantity;

            System.out.println("media ="+average);
        }

        input.close();
    }
}

package controlstructure;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite a nota: ");

            double nota = input.nextDouble();

            boolean invalid = nota > 10 || nota < 0;
            boolean A = nota > 9;
            boolean B = nota > 8;
            boolean C = nota > 7;
            boolean D = nota > 6;

            if (invalid) {
                System.out.println("NOTA INVALIDA! ");
            } else if (A) {
                System.out.println(" nota A");
            } else if (B) {
                System.out.println(" nota B");
            } else if (C) {
                System.out.println(" nota C");
            } else if (D) {
                System.out.println(" nota D");
            } else {
                System.out.println(" nota E");
            }
        }

        System.out.println("FIM");
    }
}

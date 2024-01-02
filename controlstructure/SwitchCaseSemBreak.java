package controlstructure;

import java.util.Scanner;

public class SwitchCaseSemBreak {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("qual a sua idade: ");
            var idade = scanner.nextInt();

            switch (idade) {
                case 3:
                    System.out.print("sabe programar,");
                case 2:
                    System.out.print("sabe falar,");
                case 1:
                    System.out.print("sabe andar e ");
                case 0:
                    System.out.println("sabe respirar");
            }
        }
    }
}

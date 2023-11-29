package controlstructure;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = "";
        do {
            System.out.println("voce precisa falar" + "\n as palavras magicas");
            System.out.println("Deseja sair");
            text = input.nextLine();
        } while (!text.equalsIgnoreCase("sim, por favor"));

        System.out.println("obrigado");

        input.close();
    }
}

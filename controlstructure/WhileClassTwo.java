package controlstructure;

import java.util.Scanner;

public class WhileClassTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value = "";

        while (!value.equalsIgnoreCase("sair")) {
            System.out.println("voce diz: ");
            value = input.nextLine();
        }

        input.close();
    }
}

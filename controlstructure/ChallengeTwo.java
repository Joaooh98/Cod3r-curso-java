package controlstructure;

import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do dia: ");

        String day = input.next();

        if (day.equalsIgnoreCase("domingo")) {
            System.out.println("1");
        } else if (day.equalsIgnoreCase("segunda")) {
            System.out.println("2");

        } else if (day.equalsIgnoreCase("terca")) {
            System.out.println("3");

        } else if (day.equalsIgnoreCase("quarta")) {
            System.out.println("4");

        } else if (day.equalsIgnoreCase("quinta")) {
            System.out.println("5");

        } else if (day.equalsIgnoreCase("sexta")) {

            System.out.println("6");
        } else if (day.equalsIgnoreCase("sabado")) {

            System.out.println("7");
        } else {
            System.out.println("formato incoreto");
        }

        input.close();
    }
}

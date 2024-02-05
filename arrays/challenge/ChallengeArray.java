package arrays.challenge;

import java.util.Scanner;

@SuppressWarnings("all")
public class ChallengeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many notes: ");
        int qtdeNotes = scanner.nextInt();

        double[] notes = new double[qtdeNotes];

        for (int i = 0; i < notes.length; i++) {
            System.out.println("report the note "+(i+1)+": ");
            notes[i] = scanner.nextDouble();
        }

        double total =0;
        for (double note : notes) {
            total += note;
        }

        double average = total/ notes.length;
        System.out.println("the average "+ average +"!");
        scanner.close();
    }
}

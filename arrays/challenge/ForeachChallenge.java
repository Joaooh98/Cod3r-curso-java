package arrays.challenge;

import java.util.Arrays;

public class ForeachChallenge {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];

        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.9;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]); // primeiro elemento
        System.out.println(notasAlunoA[3]); // ultimo elemento
        // System.out.println(notasAlunoA[4]); // erro

        double totalAlunoA = 0;
        for (double d : notasAlunoA) {
            totalAlunoA += d;
        }

        System.out.println(totalAlunoA / notasAlunoA.length);

        final double notaArmazenada = 5.9;
        double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };

        double totalAlunoB = 0;
        for (double d : notasAlunoB) {
            totalAlunoB +=d;
        }
        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}

package arrays;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("all")
public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("quantas alunos: ");
        int qtdeAlunos = 5;

        System.out.println("quantas notas: ");
        int qtdeNotas = 6;
        
        double[][] notas = new double[qtdeAlunos][qtdeNotas];

        double total = 0.0;
        for (int a = 0; a < notas.length; a++) {
            for (int n = 0; n < notas[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notas[a][n] = scanner.nextDouble();
                total += notas[a][n]; 
            }
        }

        double average = total/(qtdeAlunos * qtdeNotas);
        System.out.println("average da turma e :" + average);

        for (double[] ds : notas) {
            System.out.println(Arrays.toString(ds));
        }
        scanner.close();
    }
}

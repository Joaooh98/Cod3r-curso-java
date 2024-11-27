package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimaryFunctionLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Olá, Lambda!");
        new Thread(runnable).start();

        List<String> nomes = Arrays.asList("João", "Maria", "Carlos", "Ana");

        List<String> filtrados = nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(filtrados); // Saída: [Ana]

        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(2);

        numeros.sort((a, b) -> Integer.compare(a, b));

        System.out.println("Lista ordenada: " + numeros);
    }
}

package controlstructure;

public class Continue {
    public static void main(String[] args) {
        
        // mostra somente numeros pares 
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }

        // se o valor for igual a 5 nao e mostrado no console
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}

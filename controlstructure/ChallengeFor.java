package controlstructure;

public class ChallengeFor {
    public static void main(String[] args) {
        String valor = "#";

        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }

        // sem utilizar valor numerico para imprimir no console o mesmo resultado
        
        for (String i = "#"; !i.equals("######"); i+= "#") {
            System.out.println(i);
        }
    }
}

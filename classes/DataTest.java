package classes;

import java.util.Scanner;

public class DataTest {
    public static void main(String[] args) {
        Data data = new Data();
        Scanner scanner = new Scanner(System.in);

        data.ano = scanner.nextLine();
        data.dia = scanner.nextLine();
        data.mes = scanner.nextLine();

        System.out.println(data);
    }
}

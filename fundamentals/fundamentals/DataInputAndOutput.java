package fundamentals.fundamentals;

import java.util.Scanner;

public class DataInputAndOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String registeredUser = "John";
        Integer registeredPassword = 123;

        System.out.println("Digite seu nome: ");
        String name = input.nextLine();
        System.out.println("usuario: ");
        String user = input.nextLine();
        System.out.println("senha: ");
        Integer password = input.nextInt();

        if (user.equals(registeredUser)) {
            if (password.equals(registeredPassword)) {
                System.out.println("usuario : " + name + ", logado com sucesso!");
            }
        }else{System.out.println("usuario e senha incorreto!");}
        input.close();

    }
}

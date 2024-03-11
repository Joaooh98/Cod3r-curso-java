package classes;
@SuppressWarnings("all")
public class Equalls {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Pedro Silva";
        u1.email = "pedro.silva@gmail.com.br";

        User u2 = new User();
        u2.name = "Pedro Silva";
        u2.email = "pedro.silva@gmail.com.br";
    
        // sem implementar o equals no objeto User e retornado falso
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2)); // com equals implementado retorna true
        System.out.println(u2.equals(u1)); // com equals implementado retorna true

        System.out.println(u1.equals(new Data()));

    }
}

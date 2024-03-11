package collections.set;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class MessySet {
    public static void main(String[] args) {
        HashSet messy = new HashSet<>();

        messy.add(1.2); // double -> Double
        messy.add(true);
        messy.add("teste");
        messy.add(1);
        messy.add('x');

        // e realizado a conversão automática de primitivo para classe
        // and performed the automatic conversion from primitive to class

        System.out.println("tamanho e "+ messy.size());
        messy.add("teste");
        messy.add('x');
        System.out.println("tamanho e "+ messy.size()); 
        
        // tamanho sera o mesmo pq o set nao permite repeticao de dados.
        
        System.out.println(messy.remove("teste"));
        System.out.println(messy.remove("Teste"));
        System.out.println(messy.remove("x"));
        
        System.out.println("tamanho e "+ messy.size()); 
        // remove somente os conteudo que foi identico

        System.out.println(messy.contains('x'));
        System.out.println(messy.contains(1));
        System.out.println(messy.contains(true));

        Set nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(messy);

        messy.addAll(nums); // uniao entre conjuntos

        messy.retainAll(nums); //  pega somente o conteudo de nums
        System.out.println(messy);

        messy.clear(); // remove tudo
        System.out.println(messy);
    }
}

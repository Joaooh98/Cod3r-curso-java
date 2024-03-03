package collections;

import java.util.HashSet;

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
    }
}

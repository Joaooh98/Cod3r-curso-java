package poo.encapsulation.homeB;

import poo.encapsulation.homeA.Mayety;

public class Lucas extends Mayety {
    
    Mayety mother = new Mayety();

        // private String secret = "...";  Somente a mayety sabe os seus segredos

    // String iDoItIndoors = "..."; // default ou pacote

    // protected String speakform = "..."; transmitido por heranca

    // public String everyoneKnows;

    void testAcess(){
        // System.out.println(wife.secret); privado
        // System.out.println(iDoItIndoors); fora do pacote 
        System.out.println(speakform); //  permitido acesso somente por heranca
        // System.out.println(mother.speakform); // nao e permitido acesso dessa forma.
        System.out.println(everyoneKnows);
    }
}

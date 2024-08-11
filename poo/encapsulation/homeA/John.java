package poo.encapsulation.homeA;

public class John {
    Mayety wife = new Mayety();

    // private String secret = "...";  Somente a mayety sabe os seus segredos

    // String iDoItIndoors = "..."; // default ou pacote

    // protected String speakform = "...";

    // public String everyoneKnows;

    void testAcess(){
        // System.out.println(wife.secret);
        System.out.println(wife.iDoItIndoors);
        System.out.println(wife.speakform);
        System.out.println(wife.everyoneKnows);
    }
}

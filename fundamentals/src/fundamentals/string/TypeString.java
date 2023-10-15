package fundamentals.string;

public class TypeString {
    public static void main(String[] args) {
        System.out.println("joao carlos de paiva".charAt(2));

        String s = "boa tarde";
        String ss = "boa tarde";
        System.out.println("concatenando : "+s.concat(" Joao"));
        System.out.println("retorna booleano se existe a palavra (boa) no inicio : "+s.startsWith("boa"));
        System.out.println("retorna booleano se existe a palavra (boa) no final : "+s.endsWith("boa"));
        System.out.println("retorna booleano se existe a palavra (boa) no inicio com upperCase : "+s.toUpperCase().startsWith("boa"));
        System.out.println("retorna booleano se existe a palavra (boa) no final com upperCase : "+s.toUpperCase().endsWith("boa"));
        System.out.println("compara se os valores sao iguais e retorna um booleano : "+s.equals(ss));
        System.out.println("compara se os valores sao iguais ignorando se e maiuscula ou minuscula  e retorna um booleano : "+s.equalsIgnoreCase(ss));
        System.out.println("tamanho em index: "+s.length());
        System.out.println("retorna booleano se existe a palavra (boa) na variavel (s)"+s.contains("boa"));


        var name = "John";
        var surname = " Carlos ";
        var salary = 2200;
        var age = 24;

        System.out.println("name :"+name+surname+"\nsalario R$: "+salary+"\nidade: "+age);
        var junction = "name :"+name+surname+"\nsalario R$: "+salary+"\nidade: "+age;
        System.out.println("--------------------------");
        System.out.println(junction);

        System.out.println("---------------------------------");
        System.out.println(junction.indexOf("J"));
        System.out.println(junction.substring(0));
        System.out.println(junction.substring(6, 10));
    }
}
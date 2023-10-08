package primitivetypes;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // numericos 
        byte anosDeEmpresa = 23;
        short numerosDeVoos = 542;
        int diasEmUmAno = 365;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        //tipos numericos reais
        float salario = 2_200;
        double vendasAcumuladas = 2_991_797_103.01;

        //tipos de booleanos
        boolean estaDeFerias = false;

        // tipo caractere
        char status ='A';

        // Dias de empresa
        System.out.println("tempo de experiencia: "+anosDeEmpresa * diasEmUmAno);

        // Numero de viajens
        System.out.println(numerosDeVoos * diasEmUmAno);

        //numeros de viajens 
        System.out.println(numerosDeVoos / 2);

        // valore a receber por ponto realizado 
        System.out.println(pontosAcumulados/ vendasAcumuladas);

        System.out.println("------------------------------------------------------------");
        System.out.println("|ID| "+id+"|SALARIO| "+salario+"|ESTA_DE_FERIAS| "+estaDeFerias+"| STATUS| "+status+"|");
        System.out.println("------------------------------------------------------------");
    
    }
}

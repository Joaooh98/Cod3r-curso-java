package classes;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data() {
        dia = 01;
        mes = 01;
        ano = 1970;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String withFormat(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void showDateFormat(){
        System.out.println(withFormat());
    }

}

package classes;

import java.util.Scanner;
@SuppressWarnings("all")
public class DataTest {
    public static void main(String[] args) {
        Data data = new Data(01,01, 2023);
        Data dateStandard = new Data();

        String withFormat = data.withFormat();
        System.out.println(withFormat);
        System.out.println(data.withFormat());
        data.showDateFormat();

        dateStandard.showDateFormat();
    }
}

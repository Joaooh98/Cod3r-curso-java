package classes;

public class Data {
    int day;
    int month;
    int year;

    Data() {
        // day = 01;
        // month = 01;
        // year = 1970;
        this(1,1,1970);
    }

    Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    String withFormat() {
        return String.format("%d/%d/%d", day, month, year);
    }

    void showDateFormat() {
        System.out.println(withFormat());
    }

}

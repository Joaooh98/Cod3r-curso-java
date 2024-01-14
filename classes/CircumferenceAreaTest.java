package classes;
@SuppressWarnings("all")
public class CircumferenceAreaTest {
    public static void main(String[] args) {
        var a1 = new CircumferenceArea(5.6);
        System.out.println(a1.area());

        var a2 = new CircumferenceArea(10);
        System.out.println(a2.area());

        System.out.println("constant value");
        System.out.println(a1.PI);
        System.out.println(a2.PI);
        
        System.out.println("##############");

        System.out.println(CircumferenceArea.area(100));
        System.out.println(CircumferenceArea.PI);
        System.out.println(Math.PI);

    }
}

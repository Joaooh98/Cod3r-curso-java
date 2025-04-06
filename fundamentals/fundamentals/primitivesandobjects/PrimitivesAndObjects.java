package fundamentals.fundamentals.primitivesandobjects;

@SuppressWarnings("all")
public class PrimitivesAndObjects {
    public static void main(String[] args) {
        Integer numWrapper = 1;
        int numPrimitive = 1;

        System.out.println(numWrapper.TYPE.getPackageName());
        System.out.println("tipo primitivo nao possui metodos : "+numPrimitive);
    }
}

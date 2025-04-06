package fundamentals.fundamentals.primitivesandobjects;

@SuppressWarnings("all")
public class Wrapper {
    public static void main(String[] args) {

        byte byteValue = 100;
        short shortValue = 20000;
        int intValue = 500000;
        long longValue = 1000000000L; // O sufixo 'L' indica que é um tipo long
        float floatValue = 3.14f; // O sufixo 'f' indica que é um tipo float
        double doubleValue = 2.71828;
        char charValue = 'A';
        boolean booleanValue = true;

        Byte byteWrapper = Byte.valueOf((byte) 100);
        Short shortWrapper = Short.valueOf((short) 20000);
        Integer intWrapper = Integer.valueOf(500000);
        Long longWrapper = Long.valueOf(1000000000L);
        Float floatWrapper = Float.valueOf(3.14f);
        Double doubleWrapper = Double.valueOf(2.71828);
        Character charWrapper = Character.valueOf('A');
        Boolean booleanWrapper = Boolean.valueOf(true);

        Byte ibyteWrapper = 100;
        Short ishortWrapper = 20000;
        Integer iintWrapper = 500000;
        Long ilongWrapper = 1000000000L;
        Float ifloatWrapper = 3.14f;
        Double idoubleWrapper = 2.71828;
        Character icharWrapper = 'A';
        Boolean ibooleanWrapper = true;

        byte typebyte = 1;
        Byte typeByte = 1;

        System.out.println("primitive: " + typebyte + " , wrapper :" + typeByte.MAX_VALUE);

        int typeint = 1;
        Integer typeInteger = 1;

        System.out.println("primitive: " + typeint + " , wrapper :" + typeInteger.MAX_VALUE);

        float typefloat = 1.0f;
        Float typeFloat = 1.0F;

        System.out.println("primitive: " + typefloat + " , wrapper :" + typeFloat.MAX_VALUE);

        double typedouble = 1.1;
        Double typeDouble = 1.1;

        System.out.println("primitive: " + typedouble + " , wrapper :" + typeDouble.MAX_VALUE);
    }
}

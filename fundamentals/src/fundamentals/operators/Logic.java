package fundamentals.operators;

import javax.swing.text.StyledEditorKit.BoldAction;

@SuppressWarnings("all")
public class Logic {
    public static void main(String[] args) {
        boolean v = true;
        boolean f = false;
        Boolean condicao = 3 > 4;
        System.out.println("condicao: " + condicao);

        System.out.println("Tabela E AND (&&)");
        System.out.println(v && f);
        System.out.println(f && f);
        System.out.println(v && f);
        System.out.println(v && v);

        System.out.println("Tabela OU OR (||)||");
        System.out.println(v || f);
        System.out.println(v || f);
        System.out.println(v || v);
        System.out.println(f || f);

        System.out.println("Tabela OU exclusivo XOR (^)");
        System.out.println(v ^ f);
        System.out.println(v ^ f);
        System.out.println(v ^ v);
        System.out.println(f ^ f);

        System.out.println("Tabela negacao NOT (!)");
        System.out.println(!v);
        System.out.println(!f);

    }
}

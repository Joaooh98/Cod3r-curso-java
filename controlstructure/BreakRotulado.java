package controlstructure;

@SuppressWarnings("all")
public class BreakRotulado {
    public static void main(String[] args) {
        externo: for (int i = 0; i < 3; i++) {
            interno: for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    break externo; //  executa o break repeitado o primeiro for
                }
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim!");
    }
}

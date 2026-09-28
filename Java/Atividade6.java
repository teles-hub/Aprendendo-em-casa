
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Insira o numero inicial da contagem: ");
        int cont = ent.nextInt();
        for ( int i=cont; i >= 0; i--) {
            System.out.println("Contagem regressiva: "+i);
        }
        System.out.println("Decolagem altorizada");
        ent.close();
    }
}

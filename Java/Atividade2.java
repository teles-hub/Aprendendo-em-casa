
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite a idade do nadador: ");
        int idade = ent.nextInt();
        if (idade < 5) {
            System.out.println("Muito novo para competir ");
        } else if (idade <= 12) {
            System.out.println("Categoria: infantil");
        } else if (idade <= 17) {
            System.out.println("Categoria: Juvenil");
        } else if (idade <= 65) {
            System.out.println("Categoria: Adulto");
        }
        else {
            System.out.println("Idade acima do limite permitido para a competição");
        }

        ent.close();
    }
}

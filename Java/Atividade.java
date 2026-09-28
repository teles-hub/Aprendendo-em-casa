
import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Cliente vai pagar a vista ou parcelado? (V ou P)");
        String pagamento = ent.nextLine();

        if (pagamento.equalsIgnoreCase("V")) {
            System.out.print("Digite o Valor: ");
            double valor1 = ent.nextDouble();

            //printf: %.2f no texto, separação por vírgula, e \n no final faz com que a casas decimais estejam formatadas (o printf funciona similar ao .format no python)
            System.out.printf("O cliente irá pagar: R$ %.2f\n", (valor1 - (valor1 / 10)));

        } else if (pagamento.equalsIgnoreCase("P")) {
            System.out.print("Digite o Valor: ");
            double valor2 = ent.nextDouble();
            System.out.printf("O cliente irá pagar com o peso do juros: R$ %.2f\n", (valor2 + (valor2 * 0.15)));

        } else {
            System.out.println("Forma de pagamento inválida");
        }

        ent.close();
    }
}

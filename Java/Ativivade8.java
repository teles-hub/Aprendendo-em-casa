
import java.util.Scanner;

public class Ativivade8 {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            // o try funciona similar ao .close() do Scanner, Só que ele ja fecha o scanner automaticamente e não no final do codigo.
            // try no scanner é uma boa prática para evitar problemas de memória e recursos não liberados, especialmente em programas maiores ou mais complexos.

            double[] notas = new double[6];
            double soma = 0;

            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite a " + (i + 1) + "º nota: ");
                notas[i] = ent.nextDouble();
                soma += notas[i];
            }
            double media = soma / notas.length;

            int acimaDaMedia = 0;
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] >= media) {
                    acimaDaMedia++;
                }
            }
            System.out.println("A média das notas é: " + media);
            System.out.println("Alunos acima da média: " + acimaDaMedia);
        }

    }
}

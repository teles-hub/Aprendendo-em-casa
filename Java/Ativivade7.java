
import java.util.Scanner;

public class Ativivade7 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] numeros = new int[5];

        // Ele repete a solicitação de entrada para o usuário cinco vezes, armazenando cada número digitado no array "numeros".
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = ent.nextInt();
        }
    
        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        ent.close();
    }
}

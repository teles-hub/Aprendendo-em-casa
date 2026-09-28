
import java.util.Scanner;

public class Aprendendo_if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        float n1 = sc.nextFloat();

        System.out.println("Digite um sinal: ");
        String m = sc.next();
        // o length no java conta a quantidade de caracteres que tem em uma str
        if (m.length() != 1) {
            System.out.println("Sinal inválido");
            sc.close();
            return;
            // o return já corta o codigo na hora, então se o sinal for inválido ele nem ler o restante
        } else {
            System.out.println("Digite um numero: ");
            float n2 = sc.nextFloat();
            //quando se compara string tem que usar o equals, o == só ver numeros no java
            

            if (m.equals("+")) {
                System.out.println("A soma é " + (n1 + n2));
            } else if (m.equals("-")) {
                System.out.println("A subtração é " + (n1 - n2));
            } else if (m.equals("*")) {
                System.out.println("A multiplicação é " + (n1 * n2));

            } else if (m.equals("/")) {
                if (n1 != 0 && n2 != 0) {
                    // usei o && para se caso for 0 em qualquer um dos dois der errado, e o && ler o primeiro se for 0 ele nem lê o segundo
                    System.out.println("A divisão é " + (n1 / n2));
                } else {
                    System.out.println("Você está tentando diminuir um numero por 0");
                    // pode ter um if dentro do outro
                }
            } else {
                System.out.println("Seu modficador está incorreto ");
            }

        }
        sc.close();
    }
}

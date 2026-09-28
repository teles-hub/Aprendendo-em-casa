
import java.util.Scanner;

public class Aprendendo_Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Digite seu nome: ");
        // String nome = sc.nextLine();
        // System.out.println("Seu nome é " + nome);


        // o out sai e o in fica
        // dá pra reutilizar o scanner antes de fechar ele



        System.out.print("Digite um numero: ");
        float n1 = sc.nextFloat();

        System.out.print("Digite um numero: ");
        float n2 = sc.nextFloat();

        System.out.println("A soma dos numeros é: " + (n1 + n2));
        System.out.println("A subtração dos numeros é: " + (n1 - n2));
        System.out.println("A multiplicação dos numeros é: " + (n1 * n2));
        System.out.println("A divisão dos numeros é: " + (n1 / n2));
        sc.close();
    }
}

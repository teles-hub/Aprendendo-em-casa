import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um numero limite: ");
        int limite = ent.nextInt();

        int somaPares = 0; // Caixinha acumuladora

        // O for vai contar de 1 até o limite digitado
        for (int i = 1; i <= limite; i++) {
            
            // O if testa se o número atual do 'i' é PAR
            if (i % 2 == 0) {
                // Se for par, adiciona o valor de 'i' à variável somaPares
                somaPares = somaPares + i; 
                // (Atalho para isso: somaPares += i;)
            }
        }

        // FORA do for, mostramos o resultado final acumulado
        System.out.println("A soma de todos os pares até " + limite + " é: " + somaPares);

        ent.close();
        // Daria para fazer assim, mais teria bugs quando o numero fosse impar
        //    System.out.print("Digite um numero limite: ");
        // int N = ent.nextInt();
        
        // System.out.println("A soma de todos os pares até "+N+" é: "+(N/2*(N/2+1)));

    }
}
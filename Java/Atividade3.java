
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        boolean acesso = false;
        // equando o acesso for diferente de true ele vai continuar a repetição
        while (!acesso) { 

        System.out.println("Digite o login e senha:");
        
        System.out.print("Login: ");
        String L = ent.nextLine();

        System.out.print("Senha: ");
        String S = ent.nextLine();

        if (L.equals("admin") && S.equals( "java123")){
            System.out.println("Acesso liberado");
            acesso = true;
        }
        else if(!L.equals("admin")){
            System.out.println("O usuario não encontrado no sistema");
            // o ! na frente funciona igual o !=
        }
        else if(!S.equals("java123")){
            System.out.println("Senha incorreta ");
        }
       }
        ent.close();
    }
}

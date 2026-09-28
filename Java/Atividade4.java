
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    
    System.out.print("Digite um numero: ");
    int n = ent.nextInt();
    for( int i=0; i<=10 ; i++ ){
        System.out.println( "A tabúada do numero "+n+ " é: "+ (n*i));
    }

    ent.close();
 }
}

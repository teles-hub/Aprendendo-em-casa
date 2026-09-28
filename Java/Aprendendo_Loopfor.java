
import java.util.Scanner;

public class Aprendendo_Loopfor {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        
        for (int i=0; i <15 ; i++) {
            System.out.println("valor de i: "+i);
        }
         for (int i=15; i >=0 ; i--) {
            System.out.println("valor de i: "+i);
        }
        // dá para fazer o for com mais de uma variavel é só colocar virgula entre elas 
        for( int i=0, j=10 ; i < j ; i++, j-- ){
            System.out.println("i= "+i+"j= "+j);
        }
        // dá pra usar ele com partes ausentes (é bem parecido com while)
        int  i = 0;
        for(;i<5;){
            System.err.println("i tem valor de: "+i);
            i++;
        }
        ent.close();
    }
}

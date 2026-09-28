
public class Aprendendo_While {

    public static void main(String[] args) {
        int i = 1; //a variavel i é usada para contador pode se usar count ou cont 
        int max = 10;
        System.out.println("Contando até" + max);

        //enquato (primeiro avalia e expressão depois executa o codigo)
        while (i <= max) {
            System.out.println("Valor de i:" + i);
            i++; // é a mesma coisa que fazer i = i+1; ou i+=1; (isso é um incrementador)
        }

        System.out.println("i depois do while: " + i);

        //faça enquanto (primeiro executa o codigo depois avalia a expressão)
        do {
            i++;
            System.out.println("Valor de i:" + i);
        } while (i < 15);

    }
}

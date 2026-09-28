
public class Aprendizado_Variavel {

    public static void main(String[] args) {
        int idade = 18; // int é numero
        long idade1 = 18L; // long é o int só que tem mais numeros possiveis
        String nome = "teles"; // string é texto ou algo que vc quer que volte oque esteja escrito

        // o double eo float trabalham com notação cientifica
        double valor = 10.09;// o double ocupa o dobro de espaço na memoria
        float valorfeio = 10.10f; // o float aqui diferente do python tem que acabar com f oque eu não gostei

        char o = 111; // é characteres especiais geralmente de outras linguas 
        char i = 105;
        char a = 0X00e1;

        boolean v = true; //é verdadeiro e falso 0 ou 1
        boolean f = false;
        // numeros no java funcionam igual uma roleta se a soma do numero inteiro for maior doque ele suporta ele vai retornar negativo 

        int var1 = 2147483647;
        int var2 = 1;
        int var3 = -2147483648;

        // valores literais
        int dec_val = 26;
        int hex_val = 0x1a;
        int octa_val = 032;
        int bin_val = 0b11010;
        System.out.println(var1 + var2);
        System.out.println(var3 + var2 + var1);
        System.out.println("Nome = " + nome);
        System.out.println("Idade = " + idade);
        System.out.println("Soma Basica " + (o + i)); // tem que ter os parenteses para funcionar a soma, caso não tenha ele considera os dois como string
        System.err.println(" " + o + i + a);
        System.out.println(bin_val);
    }
}

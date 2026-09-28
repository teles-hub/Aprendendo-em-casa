public class Aprendendo_Vetores{
    public static void main(String[] args) {
       
        // Arrays são a estrutura de dados mais simples que existe, eles são usados para armazenar uma coleção de dados do mesmo tipo, são indexados por números inteiros, começando do 0.
        // em resumo é uma lista ordenada de dados
        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;

        double[] temperaturas = new double[366];
        /*double temp [];*/ // isso não é uma boa prática no Java, sempre declare o tipo coloque o array e o nome depois.
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;
        

        System.out.println("Temperatura do dia 1 é: " + temperaturas[0]);

        System.out.println("Qual é o tamanho do array de temperaturas é: "+ temperaturas.length);
        // o comando length é usado aqui para sabermos o tamanho do array, que é 366, pois estamos considerando um ano bissexto, e o array começa do 0, então o último índice é 365.

        System.out.println("Valor da memória do array "+ temperaturas);
        // isso printa o endereço de memória do array.

        System.out.println("Valores do array "+ java.util.Arrays.toString(temperaturas));
        // e ess printa os valores do array.
        for (int cont=0; cont<temperaturas.length; cont++){
            System.out.println("O valor da temperatura do dia "+ (cont+1)+ " é "+ temperaturas[cont]);
        // outra maneira de printar os valores do array é usando o for dessa maneira.
        }

        for (double temp : temperaturas){
            System.out.println(temp);
            // isso é um for melhorado, ele percorre o array e printa os valores, mas não temos acesso ao índice do array, então não podemos saber qual é o dia da temperatura.
        }
    }
}
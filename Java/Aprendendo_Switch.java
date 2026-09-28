
import java.util.Scanner;

public class Aprendendo_Switch {

    public static void main(String[] args) {

        System.err.println("Entre com um dia da semana (1-7)");
        Scanner scan = new Scanner(System.in);
        int diaDaSemana = scan.nextInt();

        if (diaDaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaDaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaDaSemana == 3) {
            System.out.println("Terça");
        } else if (diaDaSemana == 4) {
            System.out.println("Quarta");
        } else if (diaDaSemana == 5) {
            System.out.println("Quinta");
        } else if (diaDaSemana == 6) {
            System.out.println("Sexta");
        } else if (diaDaSemana == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Não é um dia da semana valido");
        }

        // Se não tiver o break ele vai executando até achar um
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Não é um dia da semana valido");

        }
        switch (diaDaSemana) {

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Não é um dia da semana valido");
             }
        }

    }

public class Aprendendo_goto {
    public static void main(String[] args) {
        
        for (int i=0; i<4; i++) {
            rotulo1:{
                rotulo2:{
                    rotulo3:{
                        if (i==1) {
                            break rotulo1;
                        }
                        if (i==2) {
                            break rotulo2;
                        }
                        if (i==3) {
                            break rotulo3;
                        }
                        System.out.println("rotulo3");
                    }
                System.out.println("rotulo2");
                }
            System.out.println("rotulo1");
            }
        System.out.println("valor de i = " + i);
        }
        System.out.println("Saiu do loop. ");

// Isso não é uma boa prática de programação, mas é um otimo exemplo para mostrar como funciona o break com rótulos
// é uma maneira de fazer loop em uma linguagem de baixo nivel, como o Assembly, mas não é recomendado em linguagens de alto nível como Java.
    }
}
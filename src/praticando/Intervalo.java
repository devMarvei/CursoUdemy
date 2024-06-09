package praticando;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTERVALO");

        //Você informe a quantidade de teste tipo: 3 vezes
        System.out.print("Informe a quantidade de TESTE : ");
        int N = scanner.nextInt();

        int dentroInter = 0;
        int foraInter = 0;

        for(int i = 1; i <= N; i++) {

            System.out.print("Informe valor do intervalo : ");
            int X = scanner.nextInt();

            if(X >= 10 && X <= 20) {

                dentroInter = dentroInter + 1;
            }

            else {
                foraInter = foraInter + 1;

            }

        }

        System.out.println(dentroInter + " Número(s) DENTRO");
        System.out.println(foraInter + " Número(s) FORA");


    }

}



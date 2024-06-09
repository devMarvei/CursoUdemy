package praticando;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class estruturaFor {


    public static void main(String[] args) {
        System.out.println(" A D V I N H A Ç Ã O ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numRandom = random.nextInt(10) + 1;

        int MAXTENT = 3;
        int entrada = 0;
        int tentativas = 0;
        int numCerto = 8;

        System.out.println("SEJA BEM-VINDO AO JOGO");

        System.out.print("Tente adivinhar o número : ");

        while (entrada != numRandom && tentativas < 3 ) {
            tentativas++;
            entrada = scanner.nextInt();

            for(int i = 0 ; i != 5; i++) {

                System.out.println(entrada + " x " + i + " = " + (i * entrada));
            }
            if (entrada == numCerto) {

                System.out.println("PARABÉNS, VOCÊ ACERTOU!!!");

            } else if (entrada > numCerto) {

                System.out.println("Numero MAIOR!!!");
            } else {

                System.out.println("Numero MENOR!!!");

            }



        }

        if(entrada != numCerto ) {

            System.out.println("Você excedeu o limite");
            System.out.println("O número correto é : " + numCerto);
        }



    }

}


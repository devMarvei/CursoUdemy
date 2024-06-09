package estruturaRepetitiva;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Telefonia {
    public static void main(String[] args) {

        System.out.println(" ### TELEFONIA #### ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("INFORME A QUANTIDADE DE MINUTOS UTILIZADO : ");

        int minutos = scanner.nextInt();

        double fatura = 50.0;
        double desconto = 0.0;


        if(minutos > 100) {

            fatura = fatura +  ((minutos - 100) * 2);

        }

        //somente if > se for = else if > se não for
        if (minutos >= 200 && minutos < 500) {



            //                    10% da fatura
            desconto = fatura - (fatura * 10 / 100);


        }
        if (minutos >= 500) {

                System.out.println("SEM CRÉDITOS");
            }

        if (minutos < 500) {

            System.out.println("Sua fatura sem desconto é : " + fatura);
            System.out.println("Sua fatura com desconto é : " + desconto + " Voce teve 10% de DESCONTO");
        }

        scanner.close();

    }
}

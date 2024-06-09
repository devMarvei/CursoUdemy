package estruturaRepetitiva;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicios1035 {
    public static void main(String[] args) {
        System.out.println(" ## VALORES INTEIROS ## ");

        Scanner scanner = new Scanner(System.in);

        System.out.println(" INFORME OS VALORES INTEIROS : ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();


        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0 ) {

            System.out.println("VALORES ACEITOS");

        }

        else {

            System.out.println("VALORES INVÁLIDOS");
        }

    }

}

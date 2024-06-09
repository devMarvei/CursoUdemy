package estruturaRepetitiva;

import java.util.Scanner;

public class Multiplos1044 {

    public static void main(String[] args) {

        System.out.println(" ### Multiplos ### ");

        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b ) {
            if (a % b == 0) {

                System.out.println("São Multiplos");
            }

            else {

                System.out.println(" NÃO SÃO MULTIPLOS ");
            }


        }

        if (b > a) {
            if (b % a == 0) {

                System.out.println(" SÃO MULTIPLOS ");

            }

            else {

                System.out.println(" NÃO SÃO MULTIPLOS ");
            }
        }

        else {

            System.out.println(" SÃO MULTIPLOS ");
        }


        scanner.close();


    }
}

package praticando;

import java.util.Scanner;

public class DividindoXforY {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Dividindo X por Y ");

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {

            double x = scanner.nextInt();
            double y = scanner.nextInt();

            if (y != 0) {

                double result = x / y;

                System.out.printf("%.1f%n", result);
            } else {

                System.out.println("DIVISAO IMPOSSÍVEL");
            }


        }


    }

}

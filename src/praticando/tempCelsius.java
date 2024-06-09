package praticando;

import java.util.Scanner;

public class tempCelsius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius : ");

        double C = scanner.nextDouble();
        double F = 9.0  * C / 5 + 32.0;

        System.out.printf("Equivalente em F: %.2f%n", F);

        System.out.print("Deseja repetir (S/N) ? ");

        char resp = scanner.next().charAt(0);

        while (resp != 'n') {

            System.out.println("Digite a temperatura em Celsius : ");

             C = scanner.nextDouble();
             F = 9.0  * C / 5 + 32.0;

            System.out.printf("Equivalente em F: %.2f%n", F);

            System.out.print("Deseja repetir (S/N) ? ");

            resp = scanner.next().charAt(0);


        }

    }
}

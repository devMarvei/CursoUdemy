package praticando;

import java.util.Scanner;

public class tempCelsius2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char resp;


        do {
            System.out.println("Digite a temperatura em Celsius : ");
            double C = scanner.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalemnte a Fahrenheit: %.1f%n", F);
            System.out.println("Deseja REPETIR (S/N ? ");
            resp = scanner.next().charAt(0);


        }

        while( resp != 'n' && resp != 'N');{System.out.println("Programa Encerrado");
        }

        scanner.close();
    }
}

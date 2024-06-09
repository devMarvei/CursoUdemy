package estruturaRepetitiva;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);



        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c =  sc.nextDouble();

        double delta = b * b - 4.0 * a * c;

        if (a == 0 || delta < 0.0 ) {

            System.out.println("Impossível calcular ");
        } else {

            double r1 = ( -b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = ( -b - Math.sqrt(delta)) / (2.0 * a);

            System.out.printf("R1 = %.5f%n",  r1);
            System.out.printf("R2 = %.5f%n ", r2);
        }

        sc.close();


    }
}

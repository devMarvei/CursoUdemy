package praticando;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ParImparfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("INFORME A QUANTIDADE : ");
        int N = scanner.nextInt();

        for(int i =  0 ; i < N; i++) {
            int X = scanner.nextInt();

            if(X % 2 != 0 && X < 0 ) {
                System.out.println("ODD NEGATIVO");

            }

            else if (X % 2 != 0 && X > 0){

                System.out.println("ODD POSITIVE");

            }

            else if (X < 0 && X % 2 == 0 ) {

                System.out.println("EVEN NEGATIVE");
            }

            else if (X > 0 && X % 2 == 0) {

                System.out.println("EVEN POSITIVO");
            }

            else {
                System.out.println("NULL");

            }
        }

    }
}

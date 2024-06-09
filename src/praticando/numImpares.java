package praticando;

import java.util.Scanner;

public class numImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        System.out.println("Numeros ÍMPARES DE 1 ATÉ : " + x + " : ");
        for (int i = 1; i <= x; i++) {

            if(i % 2 != 0 ) {
                System.out.println(i);
            }

        }

        scanner.close();


    }
}

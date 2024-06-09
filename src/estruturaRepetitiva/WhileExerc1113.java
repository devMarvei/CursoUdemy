package estruturaRepetitiva;

import java.util.Scanner;

public class WhileExerc1113 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ### CRESCENTE E DECRESCENTE ### ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while(x != y) {
            if (x < y) {

                System.out.println(" ###  CRESCENTE  ## ");
            }

            else {

                System.out.println(" ### Decrescente ### ");
            }

            x = scanner.nextInt();
            y = scanner.nextInt();

        }


        scanner.close();

    }
}

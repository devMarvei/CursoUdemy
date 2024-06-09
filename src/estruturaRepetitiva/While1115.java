package estruturaRepetitiva;

import java.util.Scanner;

public class While1115 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();


        while (y != 0 && x != 0) {

            if (y > 0 && x > 0) {

                System.out.println(" first quadrant ");
            }
            if (y > 0 && x < 0 ) {

                System.out.println(" seg quadrant");
            }

            if (y < 0 && x < 0) {

                System.out.println(" terc quadrant ");

            }

            if (x > 0 && y < 0) {

                System.out.println(" quart quadrant  ");
            }

            x = scanner.nextInt();
            y = scanner.nextInt();

        }


    }
}

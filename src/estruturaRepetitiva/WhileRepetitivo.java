package estruturaRepetitiva;

import java.util.Scanner;

public class WhileRepetitivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ### While REPETITIVO ## ");

        int x = 0;
        int y = 4;

        while (x < 3) {

            y = y + 2;
            x += 1;

            System.out.println(x + " - " + y);



        }








    }
}

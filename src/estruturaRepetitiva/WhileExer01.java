package estruturaRepetitiva;

import java.util.Scanner;

public class WhileExer01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = 0;

        while (x <= 10) {
                            //n > 2(scanner) + x = 0 + multic. de x * n
            System.out.println(n + " x " + x + " = " + (x * n));
            x = x + 1; // igual : x += 1;


        }


    }
}

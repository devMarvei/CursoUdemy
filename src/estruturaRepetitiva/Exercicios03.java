package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicios03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int z = 10;
        int y = 5;


        if(a > b && a > c) {

            System.out.println("VAR A - MAIOR !!!" + a);
        }
        else if(b > a && b > c) {

            System.out.println("VAR B - MAIOR!!!! " + b);
        }
        else if(c > a && c > b) {

            System.out.println("VAR C - MAIOR!!!!" + c);
        }
         else if(a == b && a == c && b == c) {
             System.out.println("EMPATE!!!");

         }

        if (z == 10 || y == 8) {

            System.out.println("Oiii");
        }

         scanner.close();
    }


}

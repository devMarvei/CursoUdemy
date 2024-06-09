package praticando;

import java.util.Scanner;

public class Multi13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Multiplo de 13 : ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int soma = 0;

        for (int i = x; i <= y; i++) {
            //i é o resto de 13 e diferente de zero ( i = 100 )
            if (i % 13 != 0) {
                soma += i;
            }
        }
        //Colocar sout fora das chaves do if e for.
        //Assim aparece o valor final/sem os loops

        System.out.println(soma);
        scanner.close();
    }
}

package estruturaRepetitiva;

import java.util.Scanner;

public class WhilePratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(" INFORME O VALOR : ");
        int x = scanner.nextInt();
        int soma = 0; //zero é um valor neutro

        // != > significa verdadeiro ou falso ( diferente )
        while (x != 0) {
            soma += x;
            x = scanner.nextInt();

        }

        System.out.println(soma);

        scanner.close();
    }
}

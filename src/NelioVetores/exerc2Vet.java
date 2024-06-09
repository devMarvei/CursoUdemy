package NelioVetores;

import java.util.Scanner;

public class exerc2Vet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double [] vet = new double [N];

        for(int i=0; i < N; i++) {

            vet[i] = sc.nextDouble();

        }

        for(int i = 0; i<N; i++) {
            System.out.print(vet[i] + " ");

        }
        System.out.println();

        double soma = 0;
        for (int i=0; i<N; i++) {
            soma = soma + vet[i];
        }
        System.out.printf("%.2f%n", soma);

        double media = soma / N;

        System.out.printf("%.2f%n", media);



        sc.close();

    }
}

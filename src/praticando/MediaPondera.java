package praticando;

import java.util.Scanner;

public class MediaPondera {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("MEDIA PONDERADA");
        //LER A QUANTIDADE DE REPETIÇÃO
        int N = scanner.nextInt();

        for(int i = 0; i < N; i++ ) {

            double N1 = scanner.nextDouble();
            double N2 = scanner.nextDouble();
            double N3 = scanner.nextDouble();

            double MP = ((N1 * 2) + (N2 * 3) + (N3 * 5)) / (2 + 3 + 5);
            System.out.printf("%.1f%%%n", MP);

        }


    }
}

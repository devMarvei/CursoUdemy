package NelioVetores;

import java.util.Locale;
import java.util.Scanner;

public class exercVet3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Lê a quantidade de pessoas
        int N = sc.nextInt();

// Cria arrays para armazenar os nomes, idades e alturas das pessoas
        String[] nomes = new String[N];
        int[] idades = new int[N];
        double[] alturas = new double[N];

// Lê os dados das pessoas
        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();  // Lê o nome da pessoa
            idades[i] = sc.nextInt();  // Lê a idade da pessoa
            alturas[i] = sc.nextDouble();  // Lê a altura da pessoa
        }

// Calcula a soma das alturas
        double soma = 0;
        for (int i = 0; i < N; i++) {
            soma = soma + alturas[i];  // Adiciona a altura da pessoa à soma total
        }

// Calcula a altura média
        double media = soma / N;
        System.out.printf("Altura média: %.2f%n", media);  // Exibe a altura média

// Conta quantas pessoas têm menos de 16 anos
        int cont = 0;
        for (int i = 0; i < N; i++) {
            if (idades[i] < 16) {
                cont++;  // Incrementa o contador se a pessoa tiver menos de 16 anos
            }
        }

// Calcula a porcentagem de pessoas com menos de 16 anos
        double x = cont * 100.0 / N;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);  // Exibe a porcentagem

// Fecha o scanner
        sc.close();
    }
}

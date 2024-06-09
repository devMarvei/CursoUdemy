package NelioVetores;

import java.util.Scanner;

public class exec1Vet {

    public static void main(String[] args) {
        // Comentado: Configura a localidade padrão para Estados Unidos, afetando formatação de números e datas
        // Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para ler entradas do console
        Scanner sc = new Scanner(System.in);

        // Lê um número inteiro N do console que representa a quantidade de números que serão inseridos
        int N = sc.nextInt();

        // Declara e inicializa um array de inteiros chamado 'vet' com N posições
        int[] vet = new int[N];

        // Loop para ler N números inteiros do console e armazená-los no array 'vet'
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        // Loop para iterar sobre o array 'vet'
        for (int i = 0; i < N; i++) {
            // Verifica se o elemento atual do array é menor que zero
            if (vet[i] > 0) {
                // Imprime o número negativo
                System.out.println(vet[i]);
            }
        }
    }
}

package NelioVetores;

import java.util.Locale;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //DECLARAÇÃO DAS VARIAVEIS
        int posicaoMaior = 0;
        double maiorElemento, elementoAtual;

        //QUANTIDADE DE ARRAYS
        int N = sc.nextInt();
        //CRIANDO ARRAYS
        double [] vetor = new double[N];

        System.out.println("Digite os elementos: ");
        //PERCURSO DOS ARRAYS
        for(int i=0; i<N; i++) {
            elementoAtual = sc.nextDouble(); //ENTRADA DOS VALORES DENTRO DO ARRAYS
            vetor[i] = elementoAtual;// VETOR[i] > 10 20 30 40 50
        }
        maiorElemento = vetor[0]; //maiorElemento > 10 20 30 40 50

        for(int i=0; i<N; i++) { //i=0 > posição dos elementos
            if(vetor[i] > maiorElemento) {
                maiorElemento = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.println("MAIOR ELEMENTO É : " + maiorElemento);
        System.out.println("MAIOR POSIÇÃO É : " + posicaoMaior);

        
        sc.close();
    }
}

package NelioVetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        //Número de entrada para repetição de ARRAYS[]
        int N = sc.nextInt();


        //Declaração: double[] vet // Instanciação: new double[N]
        double [] vet = new double[N];

        for(int i= 0; i < N; i++) {
            //Entrada do valor para dentro das ARRAYS[]
            vet[i] = sc.nextDouble();

        }

        for (int i = 0; i < N; i++) {

            /// Saída dos valores armazenados no array[]
            System.out.printf("%.2f%n", vet[i]);
        }

        //[]: Esses colchetes indicam que estamos criando um array (ou vetor).
        // Um array é uma coleção de vários valores, todos do mesmo tipo
        // (neste caso, números com casas decimais).

        //vet: Este é o nome que estamos dando ao nosso array.
        // Podemos escolher quase qualquer nome que quisermos.

        //new double[N]: Esta parte cria o array e define seu tamanho:
        // N representa o número de elementos que o array pode armazenar.
        // Ou seja, estamos dizendo que queremos um array que possa guardar N números do tipo double.

        //Juntando tudo, essa linha de código está criando um array chamado vet que pode guardar:
        // N números com casas decimais.
        // Por exemplo, se N fosse 5, o array poderia guardar 5 números como 2.5, 3.14, -1.0, etc.


        sc.close();
    }
}

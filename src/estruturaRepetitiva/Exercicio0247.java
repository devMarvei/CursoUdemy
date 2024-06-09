package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio0247 {

    public static void main(String[] args) {

        System.out.println(" ## AULA 47 ##");

        Scanner scanner = new Scanner(System.in);

        System.out.println(" INFORME SUA IDADE : ");
        int idade = scanner.nextInt();

       //Numeros para somar
        int soma = 0;

        //Irá contar a quantidade de idades inseridas
        int cont = 0;

        while(idade >= 0) {
            soma = soma + idade;
            cont = cont + 1;
            idade = scanner.nextInt();
        }

        if (cont > 0) {

            double media = (double) soma / cont;
            System.out.printf("%.2f%n", media);
        }

        else {

            System.out.println("Impossivel calcular");
        }


        scanner.close();


    }
}

package praticando;

import java.util.Scanner;

public class tabuadaT {
    public static void main(String[] args) {
        int soma = 0;
        int resultado = 0;
        Scanner sc = new Scanner(System.in);
        int tabuada = sc.nextInt();
        for(int i = 0 ; i <= 10; i++){

            resultado = i * tabuada;

            System.out.println(i + " x " + tabuada + " = " + resultado);


        }

    }
}

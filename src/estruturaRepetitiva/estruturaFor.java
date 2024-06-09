package estruturaRepetitiva;

import java.util.Scanner;

public class estruturaFor {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print(" repetição : ");
        int n = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i = i++ ) {
            int x = scanner.nextInt();
            soma = soma + x;

        }

        System.out.println(soma);

        scanner.close();*/

        for(int i = 4; i >= 0 ; i --) {
            System.out.println("Valor de i : " + i );

            //int = 4; valor original
            // 4 : valor original será alterado como subtração ( ex: 3 - 2 - 1 - 0)
            //i(4)  >=  0 ; i --
            //i --  : irá subtrair o valor 4(original)


        }

    }
}

// i = 0 > zero; zero < n (scanner - inserido 3) ? sim
//Pula para soma = soma + x( número 2 do scanner int x;
//i++ > adicina uma quantidade + 1  ex:  i + 1)
//i++ > a condição sendo true, o i++ adicona e volta para int x = scanner


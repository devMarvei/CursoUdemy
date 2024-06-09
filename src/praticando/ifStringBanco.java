package praticando;

import java.util.Scanner;

public class ifStringBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ### CONTAS ### ");

        System.out.println(" ITAU - CAIXA ");

        String contas = scanner.next();

        //Se tratando de equals. só funciona com String - ex: ("ITAU"))
        if(contas.equals("ITAU")) {

            System.out.println("ITAU SELECIONADO");
            System.out.print("INFORME O VALOR : ");

            double valor = scanner.nextInt();
            System.out.print("SAQUE ITAU: ");
            int retirar = scanner.nextInt();

            double atual = valor - retirar;

            System.out.println("SAQUE : " + retirar);
            System.out.println("VALOR ATUAL : " + atual);


        } else if (contas.equals("CAIXA")) {
            System.out.println("CAIXA SELECIONADO");

            System.out.print("INFORME O VALOR : ");

            double valor02 = scanner.nextInt();
            System.out.print("SAQUE CAIXA: ");
            int retirar02 = scanner.nextInt();

            double atual02 = valor02 - retirar02;

            System.out.println("SAQUE : " + retirar02);
            System.out.println("VALOR ATUAL : " + atual02);

        }

        else {

            System.out.println("CONTA INEXISTENTE");
        }


    }
}

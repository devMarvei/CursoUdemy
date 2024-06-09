package estruturaRepetitiva;

import java.util.Scanner;

public class Lanche1038 {
    public static void main(String[] args) {

        System.out.println(" ## LANCHES ## ");
        System.out.println("CachorroQuente = R$ 4,50 COD : 1;\n" +
                "        Xsalada = R$ 4,00 COD: 2;\n" +
                "         XBacon = R$ 4,00 COD:  3;\n" +
                "         Torrada = R$ 4,00 COD: 4;\n" +
                "         Refrigerante =  R$ 4,00 COD: 5;");


        double CachorroQuente = 4.50;
        double Xsalada = 4.0;
        double XBacon = 3.50;
        double Torrada = 5.50;
        double Refrigerante = 10.0;
        int quantidade = 0;
        double total = 0.0;


        Scanner scanner = new Scanner(System.in);

        System.out.print("INFORME O PRODUTO : ");
        int item = scanner.nextInt();

        if (item == 1 ) {

            System.out.println(" Cachorro Quente R$ " + CachorroQuente);
            System.out.print(" Informe a quantidade : ");
            quantidade = scanner.nextInt();
            total = quantidade * CachorroQuente;
        }
        else if (item == 2) {

            System.out.println(" XSalada R$ " + Xsalada);
            System.out.print(" Informe a quantidade : ");

            quantidade = scanner.nextInt();
            total = quantidade * Xsalada;
        }

        else if (item == 3) {

            System.out.println(" XBacon R$ " + XBacon);
            System.out.print(" Informe a quantidade : ");

            quantidade = scanner.nextInt();
            total = quantidade * XBacon;
        }


        System.out.println(" Valor a pagar : " + total);

        scanner.close();
    }
}

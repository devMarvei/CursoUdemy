package estruturaRepetitiva;

import java.util.Scanner;

public class EstruturaSC {
    public static void main(String[] args) {
        System.out.println(" ### DIA DA SEMANA ### ");

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Informe o DIA DA SEMANA : ");

        int valor = scanner.nextInt();
        String dia = null;

        switch (valor) {
            case 1:
                dia = "DOMINGO";
                break;
            case 2:
                dia = "SEGUNDA";
                break;

            case 3:
                dia = "TERÇA";
                break;

            case 4:
                dia = "QUARTA";
                break;

            case 5:
                dia = "QUINTA";
                break;

            case 6:
                dia = "SEXTA";
                break;

            case 7:
                dia = "SÁBADO";
                break;

            default:
                dia = "VALOR INVÁLIDO";
                break;


        }


        System.out.println(" Dia da semana : " + dia);

        scanner.close();


    }
}

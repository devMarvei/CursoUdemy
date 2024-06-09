package estruturaRepetitiva;

import java.util.Scanner;

public class WhileSenhaFixa11140203 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int attempts = 0;

        System.out.print(" ## Instituição ## : ");
        int bank = scanner.nextInt();

        while (bank < 1 || bank > 4) {
            System.out.println("Opcao invalida");
            System.out.print(" ## Instituição ## : ");
            bank = scanner.nextInt();
        }
            switch (bank) {
                case 1:
                System.out.println("# Itau #");
                break;
                case 2:
                System.out.println("# Bradesco #");
                break;

                case 3:
                System.out.println("# Santander #");
                break;

                case 4:
                System.out.println("# Caixa Eco. #");
                break;


                default: {

                System.out.println( " opcao invalida ");

                break;
            }


        }


        System.out.print(" ## INFORME A SENHA : ");
        int password = scanner.nextInt();
        while (password != 2002) {

            if(attempts < 2) {

                System.out.println(" invalid password ");
                System.out.print(" tente novamente : ");
                password = scanner.nextInt();
                attempts += 1;
            } else {

                System.out.println(" attempt exceeded, account blocked ");
                System.out.println(" look for your agency ");
                System.exit(0);

            }


        }
        System.out.println(" valid password ");


    }

}
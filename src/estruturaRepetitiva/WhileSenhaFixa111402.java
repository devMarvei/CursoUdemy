package estruturaRepetitiva;

import java.util.Scanner;

public class WhileSenhaFixa111402 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int attempts = 1;
        int maxAttempts = 3;
        int count = maxAttempts; // Inicializa count com o número máximo de tentativas
        int passCorrect = 2002;
        int password;
        int deposit;
        int depositAmount = 0;
        int sum;
        int option;
        int bank;

        System.out.print(" ## Instituição ##  entre 1 e 4: ");
        bank = scanner.nextInt();

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

        while (true) {
            System.out.print(" Type the password: ");
            password = scanner.nextInt();

            if (password == passCorrect) {
                System.out.println("correct password! ");
                System.out.print(" Deposit : ");
                deposit =  scanner.nextInt();
                sum = deposit + depositAmount;
                System.out.println(" deposited :  " + deposit);
                System.out.println(" amount : " + sum);

                System.out.print(" Do you want to do it again  ? \n 1 - Yes \n 2 - withdraw \n 3 - Close \n 4 - Main screen \n cod :  ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.print(" inform the value : ");
                        deposit = scanner.nextInt();
                        sum = deposit + sum;
                        System.out.println(" current value :  " + sum);
                        return;



                    case 2:
                        System.out.print("to withdraw : ");
                        deposit = scanner.nextInt();
                        sum = sum - deposit;
                        System.out.println(" withdrawal amount : " + sum + "\n carried out");
                        System.out.print(" Do you want to close? type it 3 ");
                        option = scanner.nextInt();
                        System.out.println(" You will be taken to the main screen");
                        System.out.println(" Closed, Thank you!!!");
                        return;

                    case 3:
                        System.out.println("amount : " + sum +  " # closed");
                        return;

                    case 4:
                        System.out.println("Tela Principal");
                        break;
                    default:

                        System.out.println("invalid option");
                        break;
                }

            }

            if (password != passCorrect) {
                if (attempts < count) {
                    System.out.println("Senha INCORRETA. VOCÊ SÓ TEM MAIS " + (count - attempts) + " TENTATIVA(S)");
                } else {
                    System.out.println("Você excedeu o número máximo de tentativas. \n O COFRE ESTÁ BLOQUEADO !!! \n Por favor, entre em contato com a CENTRAL DE ATENDIMENTO");
                    break; // Sai do loop se o número máximo de tentativas for atingido
                }
            }

            attempts++; // Move a contagem de tentativas para fora do segundo if
        }




    }
}





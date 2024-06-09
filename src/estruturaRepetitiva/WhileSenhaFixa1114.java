package estruturaRepetitiva;

import java.util.Scanner;

public class WhileSenhaFixa1114 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" enter your password : ");
        int password = scanner.nextInt();
        int attempts = 0;
        boolean x = true;

        while (password != 2002 && x != false) {

            System.out.println(" invalid password ");
            System.out.print(" tente novamente : ");
            password = scanner.nextInt();

            attempts += 1;
            if(attempts >= 2) {

                System.out.println(" attempt exceeded, account blocked ");
                x = false;
            }



        }

        if (password == 2002){

            System.out.println(" correct password ");
        }

    }
}



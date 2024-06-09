package praticando;

import java.util.Scanner;

public class VarejoFacil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preVenda;
        int parcelas;
        char resp = 0;
        double total;
        double bruto = 0;
        int opcao;
        int opcao2;
        int opcao3;
        int opcao4;
        int opcao5;
        int opcao6;
        boolean opcaoValida = false;
        long documento = 0;
        double desconto = 0;
        int acougue = 1;

        while (resp != 'n' && resp != 'N' || resp == 4) {
            System.out.println(" VAREJO FÁCIL ");
            System.out.println(" ||| ENCARTE ||| ");

            System.out.println(" AÇOUGUE\n CEREAIS\n PERFUMARIA\n HORTIFRUTI\n BEBIDAS  ");
            System.out.print("INFORME O PRODUTO LISTADO : ");

            String setores = scanner.next();

            if (setores.equalsIgnoreCase("AÇOUGUE")) {
                do {
                    System.out.println(">> AÇOUGUE SELECIONADO <<");
                    System.out.println("1. CARNES");
                    System.out.println("2. LINGUIÇA");
                    System.out.println("3. FRANGO");
                    System.out.println("4. RETORNAR");

                    opcao2 = scanner.nextInt();
                    if (opcao2 == 1) {
                        System.out.println("CARNES SELECIONADO COM SUCESSO \n");
                        System.out.print("72,99/KG : ");
                        double precoKG = 72.99;

                        double gramas = scanner.nextDouble();
                        System.out.printf("KG %.3f", gramas);
                        preVenda = precoKG * gramas;
                        System.out.printf(" R$ %.2f\n ", preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);
                    } else if (opcao2 == 2) {
                        System.out.println("LINGUIÇAS SELECIONADO COM SUCESSO \n");
                        System.out.print("24,99/KG : ");
                        double precoKG = 24.99;

                        double gramas = scanner.nextDouble();
                        System.out.printf("KG %.3f", gramas);
                        preVenda = precoKG * gramas;
                        System.out.printf(" R$ %.2f\n", preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);
                    } else if (opcao2 == 3) {
                        System.out.println("FRANGOS SELECIONADO COM SUCESSO \n");
                        System.out.print("22,99/KG : ");
                        double precoKG = 22.99;

                        double gramas = scanner.nextDouble();
                        System.out.printf("KG %.3f", gramas);
                        preVenda = precoKG * gramas;
                        System.out.printf(" R$ %.2f\n", preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);
                    } else if (opcao2 == 4) {
                        System.out.println("RETORNANDO.... \n");

                    } else {
                    }

                } while (opcao2 < 1 || opcao2 > 4);

            } else if (setores.equalsIgnoreCase("CEREAIS")) {
                do {
                    System.out.println(">> CEREAIS SELECIONADO <<");
                    System.out.println("1. FEIJÃO");
                    System.out.println("2. ARROZ");
                    System.out.println("3. SUCRILHOS");
                    System.out.println("4. RETORNAR");
                    opcao3 = scanner.nextInt();
                    if (opcao3 == 1) {
                        System.out.println("FEIJÃO SELECIONADO COM SUCESSO\n");
                        System.out.println("INFORME O VALOR : ");
                        double cereais = scanner.nextDouble();
                        System.out.println(cereais);
                        System.out.print("UNIDADES : ");
                        double cereaisUN = scanner.nextDouble();
                        System.out.println(cereaisUN);
                        preVenda = cereais * cereaisUN;
                        System.out.println(preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);

                    } else if (opcao3 == 2) {
                        System.out.println("ARROZ SELECIONADO COM SUCESSO\n");
                        System.out.println("INFORME O VALOR : ");
                        double cereais = scanner.nextDouble();
                        System.out.println(cereais);
                        System.out.print("UNIDADES : ");
                        double cereaisUN = scanner.nextDouble();
                        System.out.println(cereaisUN);
                        preVenda = cereais * cereaisUN;
                        System.out.println(preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);


                    } else if (opcao3 == 3) {
                        System.out.println("SUCRILHOS SELECIONADO COM SUCESSO\n");
                        System.out.println("INFORME O VALOR : ");
                        double cereais = scanner.nextDouble();
                        System.out.println(cereais);
                        System.out.print("UNIDADES : ");
                        double cereaisUN = scanner.nextDouble();
                        System.out.println(cereaisUN);
                        preVenda = cereais * cereaisUN;
                        System.out.println(preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);


                    } else if (opcao3 == 4) {
                        System.out.println("RETORNANDO...");

                    } else {
                        if (opcao3 != 0) {
                            System.out.println("OPCÃO INVÁLIDA");
                        }
                    }

                } while (opcao3 < 1 || opcao3 > 4);


            } else if (setores.equalsIgnoreCase("PERFUMARIA")) {
                do {
                    System.out.println(">> PERFUMARIA SELECIONADO <<");
                    System.out.println("1. DESODORANTE");
                    System.out.println("2. CREME CORPORAL");
                    System.out.println("3. PROTETOR SOLAR");
                    System.out.println("4. RETORNAR");
                    opcao4 = scanner.nextInt();
                    if (opcao4 == 1) {
                        System.out.println("DESODORANTE SELECIONADO");
                        System.out.print("INFORME O VALOR : ");
                        double perfumaria = scanner.nextDouble();
                        System.out.println(perfumaria);
                        System.out.println("UNIDADES");
                        double perfumariaUN = scanner.nextDouble();
                        System.out.println(perfumariaUN);
                        preVenda = perfumaria * perfumariaUN;
                        System.out.println(preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);

                    } else if (opcao4 == 2) {
                        System.out.println("CREME CORPORAL");
                        System.out.print("INFORME O VALOR : ");
                        double cremCorporal = scanner.nextDouble();
                        System.out.println(cremCorporal);
                        System.out.print("UNIDADES : ");
                        double cremeCorporalUN = scanner.nextDouble();
                        preVenda = cremCorporal * cremeCorporalUN;
                        System.out.println(preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);

                    } else if (opcao4 == 3) {
                        System.out.println("PROTETOR SOLAR");
                        System.out.print("INFORME O VALOR : ");
                        double protetorSolar = scanner.nextDouble();
                        System.out.println(protetorSolar);
                        System.out.print("UNIDADES : ");
                        double protetorSolarUN = scanner.nextDouble();
                        preVenda = protetorSolar * protetorSolarUN;
                        System.out.println(preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);

                    } else if (opcao4 == 4) {
                        System.out.println("RETORNANDO...");

                    } else {
                        System.out.println("OPÇÃO INVÁLIDA");
                    }

                } while (opcao4 < 1 || opcao4 > 4);


            } else if (setores.equalsIgnoreCase("HORTIFRUTI")) {

                do {
                    System.out.println(">> HORTIFRUTI SELECIONADO <<");
                    System.out.println("1. BANANA");
                    System.out.println("2. TOMATE");
                    System.out.println("3. UVA");
                    System.out.println("4. RETORNAR");
                    opcao5 = scanner.nextInt();
                    if (opcao5 == 1) {
                        System.out.println("BANANA SELECIONADO");
                        System.out.print("12,98,99/KG : ");
                        double precoKG = 12.98;

                        double gramas = scanner.nextDouble();
                        System.out.printf("KG %.3f", gramas);
                        preVenda = precoKG * gramas;
                        System.out.println(" R$ " + preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);

                    } else if (opcao5 == 2) {
                        System.out.println("TOMATE SELECIONADO");
                        System.out.print("7,25/KG : ");
                        double precoKG = 7.25;

                        double gramas = scanner.nextDouble();
                        System.out.printf("KG %.3f", gramas);
                        preVenda = precoKG * gramas;
                        System.out.println(" R$ " + preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);

                    } else if (opcao5 == 3) {
                        System.out.println("UVA SELECIONADO");
                        System.out.print("9,80/KG : ");
                        double precoKG = 9.80;

                        double gramas = scanner.nextDouble();
                        System.out.printf("KG %.3f", gramas);
                        preVenda = precoKG * gramas;
                        System.out.println(" R$ " + preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);

                    } else if (opcao5 == 4) {
                        System.out.println("RETORNANDO...");
                    } else {
                        System.out.println("OPCAO INVÁLIDA");
                    }

                } while (opcao5 < 1 || opcao5 > 4);

            } else if (setores.equalsIgnoreCase("BEBIDAS")) {
                do {
                    System.out.println(">> BEBIDAS SELECIONADO <<");
                    System.out.println("1. COCA-COLA");
                    System.out.println("2. WHISKY");
                    System.out.println("3. VINHO");
                    System.out.println("4. RETORNAR");

                    opcao6 = scanner.nextInt();
                    if (opcao6 == 1) {
                        System.out.println("COCA-COLA SELECIONADO");
                        System.out.println("INFORME O VALOR : ");
                        double bebidas = scanner.nextDouble();
                        System.out.println(bebidas);
                        System.out.print("UNIDADES : ");
                        double bebidasUN = scanner.nextDouble();
                        System.out.println(bebidasUN);
                        preVenda = bebidas * bebidasUN;
                        System.out.printf("preVenda : %.2f\n", preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);
                    } else if (opcao6 == 2) {
                        System.out.println("WHISKY SELECIONADO");
                        System.out.println("INFORME O VALOR : ");
                        double bebidas = scanner.nextDouble();
                        System.out.println(bebidas);
                        System.out.print("UNIDADES : ");
                        double bebidasUN = scanner.nextDouble();
                        System.out.println(bebidasUN);
                        preVenda = bebidas * bebidasUN;
                        System.out.printf("preVenda : %.2f\n", preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);
                    } else if (opcao6 == 3) {
                        System.out.println("VINHO SELECIONADO");
                        System.out.println("INFORME O VALOR : ");
                        double bebidas = scanner.nextDouble();
                        System.out.println(bebidas);
                        System.out.print("UNIDADES : ");
                        double bebidasUN = scanner.nextDouble();
                        System.out.println(bebidasUN);
                        preVenda = bebidas * bebidasUN;
                        System.out.printf("preVenda : %.2f\n", preVenda);
                        bruto += preVenda;
                        System.out.println("DESEJA COMPRAR MAIS ALGO? S/N");
                        resp = scanner.next().charAt(0);
                    } else if (opcao6 == 4) {
                        System.out.println("RETORNANDO...");
                    } else {
                        System.out.println("OPCÃO INVÁLIDA");
                    }

                }
                while (opcao6 < 1 || opcao6 > 4);
            } else {
                System.out.println("PRODUTO INEXISTENTE");
            }

        }
        System.out.println("DESEJA POR CPF/CNPJ NA NOTA ? \n 1- SIM || 2 - NÃO");
        opcao2 = scanner.nextInt();
        if (opcao2 == 1) {
            System.out.print(" Digite seu CPF/CNPJ : ");
            documento = scanner.nextLong();
            System.out.println("Consultando documento " + documento + " online...");
        }
        do {
            System.out.println("Escolha a forma de pagamento:");
            System.out.println("1. Dinheiro");
            System.out.println("2. Cartão de crédito");
            System.out.println("3. Cartão de débito");
            System.out.println("4. Alimentação");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Você escolheu pagar em dinheiro.");
            } else if (opcao == 2) {
                System.out.println("Você escolheu pagar com cartão de crédito.");
                System.out.print("Informe número de parcelas :  ");
                parcelas = scanner.nextInt();
                if (parcelas <= 1) {
                    bruto = (bruto / parcelas);
                    System.out.println("Valor parcelado em x" + parcelas + " || " + "R$ %.3f%n " + bruto);

                } else {
                    bruto = (bruto - desconto) / parcelas;
                    System.out.println("Parcelado em x" + parcelas + " de R$" + (bruto));
                }
            } else if (opcao == 3) {
                System.out.println("Você escolheu pagar com cartão de débito.");

            } else if (opcao == 4) {
                System.out.println("Você escolheu pagar com Alimentação.");
            } else {
                System.out.println("OPCÃO INEXISTENTE");
            }
        } while (opcao < 1 || opcao > 4);
        try {

            System.out.println("EMITINDO CUPOM FISCAL...");
            for (int i = 1; i <= 1; i++) {
                System.out.print(
                        "▒▒▒▒▓▒▒▓▒▒▒▒\n" +
                                "▒▒▒▒▓▒▒▓▒▒▒▒\n" +
                                "▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                                "▒▓▒▒▒▒▒▒▒▒▓▒\n" +
                                "▒▒▓▓▓▓▓▓▓▓▒▒\n" +
                                "▒▒▒▒▒▒▒▒▒▒▒▒");
                Thread.sleep(20);
            }
            System.out.println("\nDocumento processado.");
        } catch (
                InterruptedException e) {
            System.out.println("Simulação interrompida.");
        }

        System.out.println("VOLTE SEMPRE!!!");

        scanner.close();

    }
}

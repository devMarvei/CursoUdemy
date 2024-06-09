package estruturaRepetitiva;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AlunoExercicio01 {
    public static void main(String[] args) {

        System.out.println("### Avaliação do Aluno ### ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("PRIMEIRA NOTA : ");

        double nota1 = scanner.nextInt();

        System.out.print("SEGUNDA NOTA : ");

        double nota2 = scanner.nextInt();

        double resultado = (nota1 + nota2) / 2;
        System.out.println("NOTA FINAL É : " + resultado);

        if(resultado < 6) {

            System.out.println("REPROVADO!!!");
        } else {

            System.out.println("APROVADO!!!");
        }


    }
}

package estruturaRepetitiva;

public class WhileRepetitivo02 {
    public static void main(String[] args) {
        System.out.println(" ## WHILE 02 ## ");

        int x = 5;
        int y = 0;

        while (x > 2) {

            y = y + x;
            x = x - 1;

            System.out.println(x + " - " + y);

        }
    }
}

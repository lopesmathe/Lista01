import java.util.Scanner;

public class Ex1 {
    public static void rum() {
        System.out.println("me manda um numero, e eu falarei se ele é maior ou menor do que 10");
        Scanner SScaner = new Scanner(System.in);
        int numero = SScaner.nextInt();
        if (numero <= 10) {
            System.out.println("o numero é menor");
        } else
            System.out.println("o numero é maior");
    }
}

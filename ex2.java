import java.util.Scanner;

public class Ex2 {
    public static void run() {
        System.out.println("me manda dois numeros e eu vou te falar a soma deles");
        System.out.println("me de o primeiro numero");
        Scanner SScanner = new Scanner(System.in);
        int num1 = SScanner.nextInt();
        System.out.println("me de o segundo numero");
        Scanner SSScanner = new Scanner(System.in);
        int num2 = SSScanner.nextInt();
        int resu = num1 + num2;
        System.out.printf("a some de %d e de %d é de %d", num1, num2, resu);
    }
}

import java.util.Scanner;

public class Ex3 {
    public static void run() {
        System.out.println("me informe dois valores");
        System.out.println("valor 1");
        Scanner Scanner1 = new Scanner(System.in);
        int A = Scanner1.nextInt();
        System.out.println("valor 2");
        Scanner Scanner2 = new Scanner(System.in);
        int B = Scanner2.nextInt();
        if (A > B) {
            System.out.printf("o valor %d é maior do que o valor %d", A, B);
        } else if (B > A) {
            System.out.printf("o valor %d é maior do que o valor %d", B, A);
        } else
            System.out.printf("ambos os numeros sao iguais");
        Scanner1.close();
    }
}

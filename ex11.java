import java.util.Scanner;

public class Ex11 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        // Ler os três valores inteiros distintos
        System.out.println("Digite o primeiro valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = scanner.nextInt();

        // Ordenar os valores
        int menor, meio, maior;

        // Encontrar o menor valor
        if (valor1 <= valor2 && valor1 <= valor3) {
            menor = valor1;
            if (valor2 <= valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            menor = valor2;
            if (valor1 <= valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 <= valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }

        // Exibir os valores em ordem crescente
        System.out.println("Os valores em ordem crescente são:");
        System.out.println(menor + ", " + meio + ", " + maior);

        scanner.close();
    }
}

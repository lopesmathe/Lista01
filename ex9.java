public class Ex9 {
    public static void run() {
        System.out.println("Me de dois valores e eu irei falar se ele sao iguais ou diferentes");
        Wbiblioteca biblioteca = new Wbiblioteca();
        biblioteca.PegarNumeros();
        int A = biblioteca.VoltarNumero1();
        int B = biblioteca.VoltarNumero2();
        if (A == B) {
            System.out.println("é igual");

        } else
            System.out.println("nao é igual ");
    }
}

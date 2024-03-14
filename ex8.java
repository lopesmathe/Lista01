public class ex8 {
    public static void rum() {
        System.out.println("Me de um valor e eu irei falar se ele é maior ou menor do q 50");
        wbiblioteca biblioteca = new wbiblioteca();
        biblioteca.PegarNumero();
        int num1 = biblioteca.VoltarNumero1();
        if (num1 > 50) {
            System.out.println("é maior do q 50");

        } else
            System.out.println("o seu é menor");
    }
}

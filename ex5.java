public class Ex5 {
    public static void rum() {
        Wbiblioteca biblioteca = new Wbiblioteca();
        biblioteca.PegarNumeros();
        int a = biblioteca.VoltarNumero1();
        int b = biblioteca.VoltarNumero2();
        System.out.printf("os valores q estao alocado nas variaveis a e b sao %d %d", a, b);
        int e = a;
        a = b;
        b = e;
        System.out.printf("\ndps da troca entre ele virou %d %d ", a, b);
    }
}

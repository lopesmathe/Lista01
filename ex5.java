public class ex5 {
    public static void main(String[] args) {
    wbiblioteca biblioteca = new wbiblioteca();
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


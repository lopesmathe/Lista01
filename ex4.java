public class Ex4 {
    public static void run() {
        wbiblioteca biblioteca = new wbiblioteca();
        biblioteca.PegarNumeros();
        int num1 = biblioteca.VoltarNumero1();
        int num2 = biblioteca.VoltarNumero2();
        int resu1 = biblioteca.ContaDeAdição(num1, num2);
        int resu2 = biblioteca.ContaDeSubtração(num1, num2);
        int resu3 = biblioteca.ContaDeMultiplicação(num1, num2);
        int resu4 = biblioteca.ContaDeDivisão(num1, num2);
        System.out.printf("adição = %d  subtrão = %d  multiplicão = %d  divisão = %d", resu1, resu2, resu3, resu4);

    }
}

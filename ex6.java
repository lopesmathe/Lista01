public class Ex6 {
    public static void rum() {
        Wbiblioteca biblioteca = new Wbiblioteca();
        biblioteca.PegarNumeroF();
        float temperatura = biblioteca.VoltarNumero1F();
        float Fahrenheit = (9 * temperatura + 160) / 5.0f;
        System.out.printf("a temperatura é %f", Fahrenheit);
    }
}

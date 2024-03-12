public class ex6 {
    public static void main(String[] args) {
        wbiblioteca biblioteca = new wbiblioteca();
        biblioteca.PegarNumeroF();
        float temperatura = biblioteca.VoltarNumero1F();
        float Fahrenheit = (9 * temperatura + 160) / 5.0f;
        System.out.printf("a temperatura é %f", Fahrenheit);
    }
}

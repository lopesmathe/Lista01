public class ex7 {
    public static void main(String[] args) {
        System.out.println("Me de um valor e eu irei falar se ele é esta no intervalo de 100 a 200");
        wbiblioteca biblioteca = new wbiblioteca();
        biblioteca.PegarNumero();
        int num1 = biblioteca.VoltarNumero1();
        if (num1 >= 100 && num1 <= 200) {
            System.out.println("o seu numero esta ente 100 e 200");
            
        }
        else
        System.out.println("o seu numero nao esta");
    }
}

public class Ex10 {
    public static void run() {
        System.out.println("digite o numero de 1 a 5 e ele sera escrito por extenso");
        wbiblioteca biblioteca = new wbiblioteca();
        biblioteca.PegarNumero();
        int escolha = biblioteca.VoltarNumero1();
        switch (escolha) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;

            default:
                break;
        }
    }
}

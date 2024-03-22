public class Ex12 {
    public static void run() {
        String[] mes = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro",
                "outubro", "novembro", "dezembro" };
        Wbiblioteca b = new Wbiblioteca();
        b.PegarNumero();
        int escolha = b.VoltarNumero1();
        System.out.println("o mes é" + " " + mes[escolha - 1]);
    }
}

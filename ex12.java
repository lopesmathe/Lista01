public class ex12 {
    public static void main(String[] args) {
        String[] mes = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        wbiblioteca b = new wbiblioteca();
        b.PegarNumero();
        int escolha = b.VoltarNumero1();
        System.out.println("o mes é" + " " + mes[escolha - 1]);
    }
}

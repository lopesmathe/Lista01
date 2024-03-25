public class Ex14 {
    public static void rum() {
        System.out.println("Digite o valor do a1");
        Wbiblioteca bi = new Wbiblioteca();

        bi.PegarNumero();
        int a1 = bi.VoltarNumero1();
        System.out.println("Digite o valor do n");

        bi.PegarNumero();
        int n = bi.VoltarNumero1();
        System.out.println("Digite o valor do r");

        bi.PegarNumero();
        int r = bi.VoltarNumero1();
        int resu = a1 + (n - 1) * r;

        System.out.println("o resutado é" + " " + resu);

    }
}

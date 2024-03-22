public class Ex15 {
    public static void run() {
        System.out.println("manda os valores de p1");
        Wbiblioteca bb = new Wbiblioteca();
        bb.PegarNumerosF();
        float x1 = bb.VoltarNumero1F();
        float y1 = bb.VoltarNumero2F();
        System.out.println("manda os valores de p2");
        bb.PegarNumerosF();

        float x2 = bb.VoltarNumero1F();
        float y2 = bb.VoltarNumero2F();
        float resu = (float) (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("o resultado é" + " " + resu);
    }
}

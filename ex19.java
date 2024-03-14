public class ex19 {
    public static void rum() {
        wbiblioteca bb = new wbiblioteca();
        System.out.println("me informe o raio e dps a altura");
        bb.PegarNumerosF();
        float R = bb.VoltarNumero1F();
        float H = bb.VoltarNumero2F();
        float volume = 3.14f * (float) Math.pow(R, 2) * H;
        System.out.println("o volume é " + " " + volume);

    }
}

public class Ex18 {
    public static void run() {
        wbiblioteca bb = new wbiblioteca();
        System.out.println("me informe a nota 1, 2 , 3");
        bb.PegarNumerossF();
        float nota1 = bb.VoltarNumero1F();
        float nota2 = bb.VoltarNumero2F();
        float nota3 = bb.VoltarNumero3F();

        float INnota1 = 1.f / nota1;
        float INnota2 = 1.f / nota2;
        float INnota3 = 1.f / nota3;
        float MediaArmonica = 3.f / (INnota1 + INnota2 + INnota3);
        System.out.println("a media armionica é" + " " + MediaArmonica);
    }
}

public class ex16 {
    public static void rum() {
        System.out.println("mande 3 notas");
        wbiblioteca bb = new wbiblioteca();
        bb.PegarNumerosF();
        float nota1 = bb.VoltarNumero1F();
        float nota2 = bb.VoltarNumero2F();
        bb.PegarNumeroF();
        float nota3 = bb.VoltarNumero1F();
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("a media das nota 1 %.2f, nota 2 %.2f, nota 3 %.2f a media é %.2f", nota1, nota2, nota3,
                media);
    }
}

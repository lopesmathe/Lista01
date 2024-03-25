public class Ex20 {
    public static void run() {
        Wbiblioteca bb = new Wbiblioteca();
        System.out.println("me informe o tempo e a velocidade");
        bb.PegarNumerosF();
        float tempo = bb.VoltarNumero1F();
        float velocidade = bb.VoltarNumero2F();
        float distancia = tempo * velocidade;
        double consumoCarro = 12.0;
        double litrosGastos = distancia / consumoCarro;
        System.out.printf("o total de litros gastos sao %.2f", litrosGastos);
    }
}
//aaaaa
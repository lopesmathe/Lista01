public class ex17 {
    public static void main(String[] args) {
       System.out.println("me de 3 valores e 3 pesos de nota"); 
       wbiblioteca bb = new wbiblioteca();
       System.out.println("me de 1 valor e 1 pesos de nota"); 
       bb.PegarNumerosF();
       float nota1 = bb.VoltarNumero1F();
       float peso1 = bb.VoltarNumero2F();
       System.out.println("me de 2 valor e 2 pesos de nota"); 
       bb.PegarNumerosF();
       float nota2 = bb.VoltarNumero1F();
       float peso2 = bb.VoltarNumero2F();
       System.out.println("me de 3 valor e 3 pesos de nota"); 
       bb.PegarNumerosF();
       float nota3 = bb.VoltarNumero1F();
       float peso3 = bb.VoltarNumero2F();


       float mediaAmplificado = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
       System.out.println("o resultado foi" + " " + mediaAmplificado); 

       
    }
}

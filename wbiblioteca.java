    import java.util.Scanner;
public class wbiblioteca {

    private int num1;
    private int num2;
    private float num1F;
    private float num2F;

    public void PegarNumeros() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o primeiro número:");
            num1 = scanner.nextInt();
            System.out.println("Digite o segundo número:");
            num2 = scanner.nextInt();
            scanner.close();
    }

    public void PegarNumerosF() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1F = scanner.nextFloat();
        System.out.println("Digite o segundo número:");
        num2F = scanner.nextFloat();
        scanner.close();
}

    public void PegarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número:");
        num1 = scanner.nextInt();
        scanner.close();
}

public void PegarNumeroF() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o número:");
    num1F = scanner.nextFloat();
    scanner.close();
}
    public int VoltarNumero1(){
        return num1;
    }

    public int VoltarNumero2(){
        return num2;
    }
    public float VoltarNumero1F(){
        return num1F;
    }

    public float VoltarNumero2F(){
        return num2F;
    }

    public int ContaDeAdição(int a, int b){
        return a + b;
    }
    public int ContaDeSubtração(int a, int b){
        return a - b;
    }
    public int ContaDeMultiplicação(int a, int b){
        return a * b;
    }
    public int ContaDeDivisão(int a, int b){
        return a / b;
    }
}

public class ex13 {
    public static void main(String[] args) {
        int resu = 0;
        wbiblioteca bi = new wbiblioteca();
        bi.PegarNumeros();
        int A = bi.VoltarNumero1();
        int B = bi.VoltarNumero2();
        System.out.println("agr me fale 1 = adiçao, 2 = subtraçao, 3 mutiplicaçao, 4 = divisao");
        bi.PegarNumero();
        int escolha = bi.VoltarNumero1();
        switch (escolha) {
            case 1:
                resu = bi.ContaDeAdição(A, B);
                System.out.println(resu);
                break;

            case 2:
                resu = bi.ContaDeSubtração(A, B);
                System.out.println(resu);
                break;

                case 3:
                resu = bi.ContaDeMultiplicação(A, B);
                System.out.println(resu);
                break;

                case 4:
                resu = bi.ContaDeDivisão(A, B);
                System.out.println(resu);
                break;
        
            default:
                break;
        }
        

        
    }
}
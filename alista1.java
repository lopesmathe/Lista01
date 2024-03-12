    import java.util.Scanner;
public class alista1 {
    public static void main(String[] args) {
        Scanner Escolha = new Scanner(System.in);
        System.out.println("escolha qual ex vc vai querer!!!");
        int escolha = Escolha.nextInt(); 
        switch (escolha) {
            case 1:
                ex1 exx1 = new ex1();     
                ex1();
                break;
            case 2:
                ex2 exx2 = new ex2();
                ex2();
                break;
            case 3:
                ex3 exx3 = new ex3();
                exx3.ex3();
                break;
       //     case 4:
       //         ex4 ex4 = new ex4();
       //         break;
       //     case 5:
       //         ex5 ex5 = new ex5();
       //        break;
       //     default:
       //         break;
        }
    }
}

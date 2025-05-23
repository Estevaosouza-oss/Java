import java.util.Scanner;
public class App {

    public static int adicao (int a,int b){
        return a+b;
    }
    public static int subi (int a, int b){
        return a-b;
    }
    public static int mult (int a, int b){
        return a*b;
    } 
    public static double div (int a, int b){
        if (b == 0){
            System.out.println("Numero dividio por 0");
            return 0;
        }
        return (double) a/b;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Primeiro Numero: ");
        int a = sc.nextInt();
        System.out.print("Digite o Segundo Numero: ");
        int b = sc.nextInt();
            System.out.println("===========================================");
            System.out.println("    Digite qual operação quer realizar!    ");
            System.out.println("===========================================");
            System.out.println("-------------------------------------------");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                int adic = adicao(a, b);
                System.out.println(String.format("A Adição de %d + %d é %d",a,b,adic));
            break;
            case 2:
                int sub = subi(a, b);
                System.out.println(String.format("A Subtração de %d - %d é %d",a,b,sub));
            break;
            case 3:
                int multip = mult(a, b);
                System.out.println(String.format("A Multiplicação de %d X %d é %d",a,b,multip));
            break;
            case 4:
                double divi = div(a, b);
                System.out.println(String.format("A Divisão de %d / %d é %.2f",a,b,divi));
            break;
            case 5:
                System.out.println("Encerrando o programa.");
            break;


        }
        sc.close();
    }
}

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

        int adic = adicao(a, b);
        int menos = subi(a, b);
        int multp = mult(a, b);
        double divi = div(a, b);
        System.out.println(String.format("A Adição de %d + %d é %d",a,b,adic));
        System.out.println(String.format("A Subtração de %d - %d é %d",a,b,menos));
        System.out.println(String.format("A Multiplicação de %d X %d é %d",a,b,multp));
        System.out.println(String.format("A Divisão de %d / %d é %.2f",a,b,divi));


        sc.close();
    }
}

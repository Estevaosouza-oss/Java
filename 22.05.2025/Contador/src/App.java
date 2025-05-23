import java.util.Scanner;
public class App {
    public static void contarAte(int a,int b,int c){
        for(int i = a; i <= b; i += c){
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite que numero quer começar a contagem: ");
        int cont = sc.nextInt();
        System.out.print("Digite até que numero quer contar: ");
        int nf = sc.nextInt();
        System.out.print("Digite em quantos numero quer q conte: ");
        int qntn = sc.nextInt();
        contarAte(cont, nf, qntn);

        sc.close();
    }
}

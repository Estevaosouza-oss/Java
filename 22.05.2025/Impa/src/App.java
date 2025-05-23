import java.util.Scanner;
public class App {
    public static void impapar (int a){
            if (a %2==0){
                System.out.println("Seu Numero é Par!");
            }
            else{
                System.out.println("Seu Numero é Impar");
            }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("        É Par ou Impar       ");
        System.out.println("==============================");
        System.out.println("------------------------------");
        int n;
        do {
        System.out.print("Digite Numero para checagem: ");
        n = sc.nextInt();
        impapar(n);
        }
        while  (n != 0);
        sc.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Numero: ");
        int n = sc.nextInt();
        System.out.println(("O numero escolhido foi "+n));
        int mult = 1;

        while (mult <= 10) {
            int tab = n*mult;
            System.out.println(String.format("%d X %d = %d",n,mult,tab));
            mult = mult + 1;
        }

    sc.close();
    }
}

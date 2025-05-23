import java.util.Scanner;
import java.math.BigInteger;

public class App {

    public static void fatorial(int a) {
        BigInteger fatorial = BigInteger.ONE;

        for (int i = a; i >= 1; i--) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("O fatorial de " + a + " é " + fatorial);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um Numero para fazer o Calcúlo Fatorial:");
        int n = sc.nextInt();
        fatorial(n);
        sc.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int senha;
        do {
        System.out.println("Digite a Senha Numerica: ");
        senha = sc.nextInt();
        if (senha != 1234 ) {
            System.out.println("Senha Incorreta Digite novamente!");
        }
        } 
        while (senha != 1234);

        System.out.println("Senha Correta!");
        sc.close();

    }
}

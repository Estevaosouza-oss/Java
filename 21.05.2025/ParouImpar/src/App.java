import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      Checagem de impar ou par      ");
        System.out.println("====================================");
        System.out.println("------------------------------------");
        System.out.print("Digite um numero para comparação: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println(String.format("O Numero que voce escolheu foi o %d \nELE É PAR!",numero));
        }
        else{
            System.out.println(String.format("O Numero que voce escolheu foi o %d \n ELE É ÍMPAR!",numero));
        }
        System.out.println("================================");


     sc.close();   
    }
}

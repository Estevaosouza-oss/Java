import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            System.out.println("Qual das opções voce prefere? ");
            System.out.println("1 - Cadastrar Usuario ");
            System.out.println("2 - Editar Usuario");
            System.out.println("3 - Sair");
            int e = sc.nextInt();
            sc.nextLine();
        switch (e) {
                case 1:
                System.out.println("Digite o Usuario: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o Email: ");
                    String email = sc.nextLine();
                    break;
                case 2:
                    System.out.println("Qual usuario deseja editar: ");
                    break;
                case 3:
                    break;
            
                default:
                System.out.println("Escolha invalida!");
                    break;
            }
        sc.close();
    }
}

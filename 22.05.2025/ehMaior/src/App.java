import java.util.Scanner;
public class App {
    public static void ehMaior (int a){
        if (a >= 18) {
        System.out.println("Vc é de Maior \nAcesso liberado");
        }
        else{
            System.out.println("Voce é de Menor");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        ehMaior(idade);
    
        
        sc.close();
    }
}

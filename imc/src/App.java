import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua massa (em kg): ");
        double peso = sc.nextDouble();
        System.out.println("Digite a sua altura (em metros): ");
        double alt = sc.nextDouble();
        double IMC = peso / (alt*alt);
        
    if (IMC <= 18.5){
        System.out.println(String.format("O seu IMC é %.2f voce esta abaixo do peso!",IMC));
    }
    else if (IMC >= 18.5 && IMC <= 24.9) {
        System.out.println(String.format("O seu IMC é %.2f voce esta no peso normal!",IMC));
    }
    else if (IMC >= 25 && IMC <= 29.9) {
        System.out.println(String.format("O seu IMC é %.2f Voce esta com sobrepeso cuidado!",IMC));
    }
    else {
        System.out.println(String.format("o seu IMC é %.2f Voce esta com Obesidade!",IMC));
    }

    sc.close();

    }
}

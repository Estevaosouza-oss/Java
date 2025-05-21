public class App {
    public static void main(String[] args) throws Exception {
        int n1 = 5;
        int n2 = 2;
        int soma = n1+n2;
        int sub = n1-n2;
        int mult = n1*n2;
        float div = (float) n1/n2;
        int restd = n1%n2;


        System.out.println("A Soma de "+n1+"+"+n2+ " é igual a : "+soma);
        System.out.println("A Subtração de "+n1+"-"+n2+ " é igual a : "+sub);
        System.out.println("A Multiplicação de "+n1+"X"+n2+ " é igual a : "+mult);
        System.out.println("A Divisão de "+n1+"/"+n2+ " é igual a : "+div);
        System.out.println("A modulo de "+n1+"%"+n2+ " é igual a : "+restd);

    }
}

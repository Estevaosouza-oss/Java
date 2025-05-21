public class App {
    public static void main(String[] args) throws Exception {
        double cs = 26.5;
        double f = (cs*9/5)+32;
        double k = cs + 273.15;

        System.out.println(String.format("A temperatura atual e  Celsius é %.2fº", cs));
        System.out.println(String.format("%.2fº em Fahrenheit é %.2fº",cs, f));
        System.out.println(String.format("%.2fº em Kelvin é %.2fº",cs, k));
    }
}

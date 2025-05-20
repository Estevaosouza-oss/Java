import java.util.ArrayList;
import java.util.Scanner;

class Cliente{
    private String nome;
    private String email;
    private String telefone;

    public Cliente(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;

    }

    public String toString(){
        return "Nome: "+nome+",Email: "+email+", Telefone: "+telefone;
    }
}

public class CadastroClientes{
    private static ArrayList<Cliente> listaCliente = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;
    
        System.out.println("=== Sistema de Cadastro de Clientes ===");
        while (executando) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Buscar cliente por nome");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    Cliente cliente = new Cliente(nome, email, telefone);
                    listaCliente.add(cliente);
                    System.out.println("Cliente adicionado com sucesso");
                    break;

                case 2:
                    System.out.println("\nLista de Clientes: ");
                    if (listaCliente.isEmpty()){
                        System.out.println("Nenhum cliente cadastrado.");
                    }else {
                        for(Cliente c : listaCliente){
                            System.out.println(c);
                        }
                    }
                    break;

                case 3:
                System.out.print("Digite o nome para buscar: ");
                String busca = scanner.nextLine().toLowerCase();
                boolean encontrado = false;
                for (Cliente c : listaCliente){
                    if (c.getNome().toLowerCase().contains(busca)){
                        System.out.println(c);
                        encontrado = true;
                    }
                }
                if(!encontrado) {
                    System.out.println("Nenhum cliente encontrado com esse nome.");
                }
                break;
            case 4:
                System.out.println("Encerrando o programa.");
                executando = false;
                break;

                default:
                System.out.println("Opção invalida.");
            }
        }
        scanner.close();
    }
}
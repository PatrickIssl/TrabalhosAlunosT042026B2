public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static List<Produto> listaProdutos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao = -1;
        do {
            exibirMenu();
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                System.out.println();

                switch (opcao) {
                    case 1:
                        cadastrar();
                        break;
                    case 2:
                        listarTodos();
                        break;
                    case 3:
                        buscarPorId();
                        break;
                    case 4:
                        atualizar();
                        break;
                    case 5:
                        excluir();
                        break;
                    case 0:
                        System.out.println("Sistema encerrado.");
                        break;
                    default:
                        System.out.println("Opção inválida! Escolha um número entre 0 e 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nOpção inválida! Digite apenas números inteiros.");
            }
            System.out.println();
        } while (opcao != 0);
    }
    private static void exibirMenu() {
        System.out.println("========== SISTEMA DE GERENCIAMENTO ==========");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar todos");
        System.out.println("3 - Buscar por ID");
        System.out.println("4 - Atualizar");
        System.out.println("5 - Excluir");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }
    private static void cadastrar() {
        System.out.println("--- Cadastrar Produto ---");
        System.out.print("Digite o ID: ");
        int id;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Erro: O ID deve ser um número inteiro.");
            return;
        }
        if (localizarPorId(id) != null) {
            System.out.println("Erro: Já existe um registro cadastrado com o ID " + id + ".");
            return;
        }
        System.out.print("Digite o Nome: ");
        String nome = scanner.nextLine().trim();
        if (nome.isEmpty()) {
            System.out.println("Erro: O nome não pode ser vazio.");
            return;
        }
        System.out.print("Digite o Preço (ex: 49.90): ");
        double preco;
        try {
            preco = Double.parseDouble(scanner.nextLine().replace(',', '.'));
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor de preço inválido.");
            return;
        }
        Produto novoProduto = new Produto(id, nome, preco);
        listaProdutos.add(novoProduto);
        System.out.println("Produto cadastrado com sucesso!");
    }
    private static void listarTodos() {
        System.out.println("--- Lista de Produtos ---");
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }
        for (Produto p : listaProdutos) {
            imprimirProduto(p);
        }
    }
    private static void buscarPorId() {
        System.out.println("--- Buscar Produto por ID ---");
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }
        System.out.print("Digite o ID a ser buscado: ");
        int id;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Erro: O ID deve ser um número inteiro.");
            return;
        }
        Produto p = localizarPorId(id);
        if (p != null) {
            System.out.println("Registro encontrado:");
            imprimirProduto(p);
        } else {
            System.out.println("ID " + id + " não encontrado.");
        }
    }
    private static void atualizar() {
        System.out.println("--- Atualizar Produto ---");
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }
        System.out.print("Digite o ID do produto que deseja atualizar: ");
        int id;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Erro: O ID deve ser um número inteiro.");
            return;
        }
        Produto p = localizarPorId(id);
        if (p == null) {
            System.out.println("ID " + id + " não encontrado.");
            return;
        }
        System.out.print("Dados atuais: ");
        imprimirProduto(p);
        System.out.print("Digite o novo Nome: ");
        String novoNome = scanner.nextLine().trim();
        if (novoNome.isEmpty()) {
            System.out.println("Erro: O nome não pode ser vazio.");
            return;
        }
    System.out.print("Digite o novo Preço (ex: 59.90): ");
    double novoPreco;
       try {
            novoPreco = Double.parseDouble(scanner.nextLine().replace(',', '.'));
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor de preço inválido.");
            return;
        }
        p.setNome(novoNome);
        p.setPreco(novoPreco);
        System.out.println("Produto atualizado com sucesso!");
    }
    private static void excluir() {
        System.out.println("--- Excluir Produto ---");
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }
        System.out.print("Digite o ID do produto que deseja excluir: ");
        int id;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Erro: O ID deve ser um número inteiro.");
            return;
        }
        Produto p = localizarPorId(id);
        if (p != null) {
            listaProdutos.remove(p);
            System.out.println("Produto com ID " + id + " excluído com sucesso!");
        } else {
            System.out.println("ID " + id + " não encontrado.");
        }
    }
    private static Produto localizarPorId(int id) {
        for (Produto p : listaProdutos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    private static void imprimirProduto(Produto p) {
        System.out.println(String.format("ID: %d | Nome: %s | Preço: R$ %.2f", p.getId(), p.getNome(), p.getPreco()));
    }
}

package Principal;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Cadastrar {
 
    private int id;
    private String titulo;
    private String autor;
 
    public Cadastrar(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
    public int getId() {
        return id;
    }
 
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public String getAutor() {
        return autor;
    }
 
    public void setAutor(String autor) {
        this.autor = autor;
    }
 
    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("-----------------------------");
    }
 
    // ---------- SISTEMA (CRUD) ----------
    static ArrayList<Cadastrar> livros = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int proximoId = 1;
 
    public static void main(String[] args) {
 
        int opcao;
 
        do {
            exibirMenu();
            opcao = lerInteiro();
 
            if (opcao == 1) {
                cadastrar();
            } else if (opcao == 2) {
                listarTodos();
            } else if (opcao == 3) {
                buscarPorId();
            } else if (opcao == 4) {
                atualizar();
            } else if (opcao == 5) {
                excluir();
            } else if (opcao == 0) {
                System.out.println("Encerrando o sistema...");
            } else {
                System.out.println("Opcao invalida!");
            }
 
        } while (opcao != 0);
    }
 
    static void exibirMenu() {
        System.out.println("\n========== SISTEMA DE GERENCIAMENTO ==========\n");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar todos");
        System.out.println("3 - Buscar por ID");
        System.out.println("4 - Atualizar");
        System.out.println("5 - Excluir");
        System.out.println("0 - Sair");
        System.out.print("\nEscolha uma opcao: ");
    }
 
    static void cadastrar() {
        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();
 
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
 
        Cadastrar livro = new Cadastrar(proximoId, titulo, autor);
        livros.add(livro);
        proximoId++;
 
        System.out.println("Livro cadastrado! ID: " + livro.getId());
    }
 
    static void listarTodos() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }
 
        for (Cadastrar livro : livros) {
            livro.exibirInformacoes();
        }
    }
 
    static void buscarPorId() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }
 
        if (livros.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }
 
        System.out.print("Digite o ID: ");
        int id = lerInteiro();
 
        Cadastrar livro = encontrarPorId(id);
 
        if (livro == null) {
            System.out.println("ID nao encontrado.");
        } else {
            livro.exibirInformacoes();
        }
    }
 
    static void atualizar() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }
 
        if (livros.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }
 
        System.out.print("Digite o ID: ");
        int id = lerInteiro();
 
        Cadastrar livro = encontrarPorId(id);
 
        if (livro == null) {
            System.out.println("ID nao encontrado.");
            return;
        }
 
        System.out.print("Novo titulo: ");
        livro.setTitulo(scanner.nextLine());
 
        System.out.print("Novo autor: ");
        livro.setAutor(scanner.nextLine());
 
        System.out.println("Livro atualizado!");
    }
 
    static void excluir() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }
 
        if (livros.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }
 
        System.out.print("Digite o ID: ");
        int id = lerInteiro();
 
        Cadastrar livro = encontrarPorId(id);
 
        if (livro == null) {
            System.out.println("ID nao encontrado.");
            return;
        }
 
        livros.remove(livro);
        System.out.println("Livro excluido!");
    }
 
    static Cadastrar encontrarPorId(int id) {
        for (Cadastrar livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }
 
    static int lerInteiro() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
 
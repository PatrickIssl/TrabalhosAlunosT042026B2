import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Livro> livros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int proximoId = 1;

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println();
            System.out.println("SISTEMA DE GERENCIAMENTO");
            System.out.println();
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar todos");
            System.out.println("3 - Buscar por ID");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Excluir");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
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
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);
    }

    public static Livro procurar(int id) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getId() == id) {
                return livros.get(i);
            }
        }
        return null;
    }

    public static void cadastrar() {
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();

        livros.add(new Livro(proximoId, titulo, autor));
        System.out.println("Livro cadastrado! ID = " + proximoId);
        proximoId++;
    }

    public static void listar() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i));
        }
    }

    public static void buscarPorId() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Livro livro = procurar(id);
        if (livro == null) {
            System.out.println("ID não encontrado.");
        } else {
            System.out.println(livro);
        }
    }

    public static void atualizar() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Livro livro = procurar(id);
        if (livro == null) {
            System.out.println("ID não encontrado.");
            return;
        }

        System.out.print("Novo título: ");
        livro.setTitulo(sc.nextLine());
        System.out.print("Novo autor: ");
        livro.setAutor(sc.nextLine());
        System.out.println("Livro atualizado!");
    }

    public static void excluir() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Livro livro = procurar(id);
        if (livro == null) {
            System.out.println("ID não encontrado.");
        } else {
            livros.remove(livro);
            System.out.println("Livro excluído!");
        }
    }
}
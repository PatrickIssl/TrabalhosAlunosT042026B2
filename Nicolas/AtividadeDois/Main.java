import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Livro> livros = new ArrayList<>();
    private static int proximoId = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("");

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
                    System.out.println("\nFIM");
                    break;
                default:
                    System.out.println("\nOpção inválida");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nSISTEMA DE GERENCIAMENTO\n");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar todos");
        System.out.println("3 - Buscar por ID");
        System.out.println("4 - Atualizar");
        System.out.println("5 - Excluir");
        System.out.println("0 - Sair");
        System.out.print("\nEscolha uma opção: ");
    }

    private static void cadastrar() {
        System.out.println("\nCadastrar livro");

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        int ano = lerInteiro("Ano de publicação: ");

        Livro livro = new Livro(proximoId, titulo, autor, ano);
        livros.add(livro);

        System.out.println("\nLivro cadastrado com sucesso! ID gerado: " + proximoId);
        proximoId++;
    }

    private static void listarTodos() {
        System.out.println("\nLista de livros");

        if (livros.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    private static void buscarPorId() {
        System.out.println("\nBuscar por ID");

        if (livros.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }

        int id = lerInteiro("Digite o ID: ");
        Livro livro = encontrarPorId(id);

        if (livro == null) {
            System.out.println("ID não encontrado.");
        } else {
            System.out.println(livro);
        }
    }

    private static void atualizar() {
        System.out.println("\nAtualizar livro");

        if (livros.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }

        int id = lerInteiro("Digite o ID do livro a atualizar: ");
        Livro livro = encontrarPorId(id);

        if (livro == null) {
            System.out.println("ID não encontrado.");
            return;
        }

        System.out.println("Dados atuais: " + livro);

        System.out.print("Novo título: ");
        livro.setTitulo(scanner.nextLine());

        System.out.print("Novo autor: ");
        livro.setAutor(scanner.nextLine());

        livro.setAno(lerInteiro("Novo ano de publicação: "));

        System.out.println("\nLivro atualizado com sucesso!");
    }

    private static void excluir() {
        System.out.println("\nExcluir livro");

        if (livros.isEmpty()) {
            System.out.println("Nenhum registro cadastrado.");
            return;
        }

        int id = lerInteiro("Digite o ID do livro a excluir: ");
        Livro livro = encontrarPorId(id);

        if (livro == null) {
            System.out.println("ID não encontrado.");
        } else {
            livros.remove(livro);
            System.out.println("Livro excluído com sucesso!");
        }
    }

    private static Livro encontrarPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            if (!mensagem.isEmpty()) {
                System.out.print(mensagem);
            }
            String entrada = scanner.nextLine();
            try {
                return Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                if (mensagem.isEmpty()) {
                    return -1;
                }
                System.out.println("Valor inválido! Digite apenas números.");
            }
        }
    }
}
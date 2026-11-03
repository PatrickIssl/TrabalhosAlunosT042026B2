import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Livro> livros = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    private static int proximoId = 1;

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

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
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Digite um número de 0 a 5.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println();
        System.out.println("========== SISTEMA DE GERENCIAMENTO ==========");
        System.out.println();
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar todos");
        System.out.println("3 - Buscar por ID");
        System.out.println("4 - Atualizar");
        System.out.println("5 - Excluir");
        System.out.println("0 - Sair");
        System.out.println();
    }

    private static void cadastrar() {
        System.out.println("\n--- Cadastrar livro ---");
        String titulo = lerTexto("Título: ");
        String autor = lerTexto("Autor: ");
        int ano = lerInteiro("Ano de publicação: ");

        Livro novo = new Livro(proximoId, titulo, autor, ano);
        livros.add(novo);
        proximoId++;

        System.out.println("Livro cadastrado com sucesso! ID gerado: " + novo.getId());
    }

    private static void listarTodos() {
        System.out.println("\n--- Lista de livros ---");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    private static void buscarPorId() {
        System.out.println("\n--- Buscar livro por ID ---");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        int id = lerInteiro("Digite o ID: ");
        Livro livro = localizarPorId(id);

        if (livro == null) {
            System.out.println("ID não encontrado.");
        } else {
            System.out.println(livro);
        }
    }

    private static void atualizar() {
        System.out.println("\n--- Atualizar livro ---");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        int id = lerInteiro("Digite o ID do livro a atualizar: ");
        Livro livro = localizarPorId(id);

        if (livro == null) {
            System.out.println("ID não encontrado.");
            return;
        }

        System.out.println("Dados atuais: " + livro);
        System.out.println("Digite os novos dados:");
        livro.setTitulo(lerTexto("Novo título: "));
        livro.setAutor(lerTexto("Novo autor: "));
        livro.setAno(lerInteiro("Novo ano: "));

        System.out.println("Livro atualizado com sucesso!");
    }

    private static void excluir() {
        System.out.println("\n--- Excluir livro ---");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        int id = lerInteiro("Digite o ID do livro a excluir: ");
        Livro livro = localizarPorId(id);

        if (livro == null) {
            System.out.println("ID não encontrado.");
            return;
        }

        livros.remove(livro);
        System.out.println("Livro excluído com sucesso!");
    }

    private static Livro localizarPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    private static String lerTexto(String mensagem) {
        String texto;
        do {
            System.out.print(mensagem);
            texto = scanner.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("O campo não pode ficar vazio.");
            }
        } while (texto.isEmpty());
        return texto;
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite apenas números inteiros.");
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // lista que guarda os livros
    static ArrayList<Livro> livros = new ArrayList<Livro>();
    static Scanner sc = new Scanner(System.in);

    // vai aumentando pra cada livro ter um id diferente
    static int id = 1;

    public static void main(String[] args) {

        int opcao = -1;

        // repete o menu ate digitar 0
        while (opcao != 0) {
            System.out.println();
            System.out.println("========== SISTEMA DE GERENCIAMENTO ==========");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar todos");
            System.out.println("3 - Buscar por ID");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Excluir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = lerNumero();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    buscar();
                    break;
                case 4:
                    atualizar();
                    break;
                case 5:
                    excluir();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }

    // le um numero, se digitar letra retorna -1
    static int lerNumero() {
        if (sc.hasNextInt()) {
            int numero = sc.nextInt();
            sc.nextLine();
            return numero;
        } else {
            sc.nextLine();
            return -1;
        }
    }

    static void cadastrar() {
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();

        Livro livro = new Livro(id, titulo, autor);
        livros.add(livro);

        System.out.println("Livro cadastrado! ID: " + id);
        id++;
    }

    static void listar() {
        if (livros.size() == 0) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (int i = 0; i < livros.size(); i++) {
                System.out.println(livros.get(i));
            }
        }
    }

    static void buscar() {
        if (livros.size() == 0) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.print("Digite o ID: ");
            int idBusca = lerNumero();

            boolean achou = false;

            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getId() == idBusca) {
                    System.out.println(livros.get(i));
                    achou = true;
                }
            }

            if (achou == false) {
                System.out.println("ID nao encontrado.");
            }
        }
    }

    static void atualizar() {
        if (livros.size() == 0) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.print("Digite o ID do livro que quer atualizar: ");
            int idBusca = lerNumero();

            boolean achou = false;

            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getId() == idBusca) {
                    System.out.print("Novo titulo: ");
                    String novoTitulo = sc.nextLine();
                    System.out.print("Novo autor: ");
                    String novoAutor = sc.nextLine();

                    livros.get(i).setTitulo(novoTitulo);
                    livros.get(i).setAutor(novoAutor);

                    System.out.println("Livro atualizado!");
                    achou = true;
                }
            }

            if (achou == false) {
                System.out.println("ID nao encontrado.");
            }
        }
    }

    static void excluir() {
        if (livros.size() == 0) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.print("Digite o ID do livro que quer excluir: ");
            int idBusca = lerNumero();

            boolean achou = false;

            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getId() == idBusca) {
                    livros.remove(i);
                    System.out.println("Livro excluido!");
                    achou = true;
                    break;
                }
            }

            if (achou == false) {
                System.out.println("ID nao encontrado.");
            }
        }
    }
}
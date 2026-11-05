import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {
    static Scanner scanner= new Scanner(System.in);
    static ArrayList<Cadastrar> Livros = new ArrayList<>();
    public static void main(String[] args) {
        int verificador;
        do {
            menu();
            verificador = scanner.nextInt();
            scanner.nextLine();
            validacao(verificador);
        } while (verificador != 0);

    }
    public static void menu() {
        System.out.printf("1 - Cadastrar\n");
        System.out.printf("2 - Listar todos\n");
        System.out.printf("3 - Buscar por ID\n");
        System.out.printf("4 - Atualizar\n");
        System.out.printf("5 - Excluir\n");
        System.out.printf("0 - Sair\n");
    }
    public static void validacao(int verificador) {
        switch (verificador) {
            case 1:
                cadastrar();
                break;
            case 2:
                pesquisarLivro();
                break;
            case 3:
                buscarLivro();// deixei assim aqui pq se eu trocar pelo buscarPorId eu quebro o atualizar e excluir
                break;
            case 4:
                atualizar();
                break;
            case 5:
                excluir();
                break;
            case 0:
                System.out.printf("Encerrando...\n");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
    public static void cadastrar(){
        Cadastrar cadastrar = new Cadastrar();
        cadastrar.areaDeCadastro();
        cadastrar.setId(geradorDeId());
        Livros.add(cadastrar);
        System.out.printf("\nLivro cadastrado!\n");
    }
    public static void pesquisarLivro() {
        if (Livros.isEmpty()) {
            System.out.printf("Nenhum livro cadastrado.\n");
        } else {
            System.out.printf("\n");
            for (Cadastrar livro : Livros) {
                System.out.printf("%d - %s - %s (%d)\n",
                        livro.getId(),
                        livro.getNomeLivro(),
                        livro.getNomeAutor(),
                        livro.getDataLancamento());
            }
            System.out.printf("\n");
        }
    }
    public static int geradorDeId() {
        Random random = new Random();
        int id;
        do {
            id = random.nextInt(1000) + 1;
        } while (idExiste(id));
        return id;
    }
    public static boolean idExiste(int id) {
        for(Cadastrar livro : Livros) {
            if(livro.getId() == id) {
                return true;
            }
        }
        return false;
    }
    public static Cadastrar buscarPorId(int id) {
        for (Cadastrar livro : Livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }
    public static void atualizar() {
        System.out.printf("\nDigite o ID do livro: \n");
        int id = scanner.nextInt();
        scanner.nextLine();
        Cadastrar livro = buscarPorId(id);
        if (livro == null){
            System.out.printf("\nLivro não encontrado.\n");
        } else{
            livro.areaDeCadastro();
            System.out.printf("\nLivro atualizado!\n");
        }
    }
    public static void excluir() {
        System.out.printf("\nDigite o ID do livro: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Cadastrar livro = buscarPorId(id);
        if (livro == null) {
            System.out.printf("\nLivro não encontrado.\n");
        } else {
            Livros.remove(livro);
            System.out.printf("\nLivro excluído!\n");
        }
    }
    public static void buscarLivro() {
        System.out.printf("\nDigite o ID do livro: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Cadastrar livro = buscarPorId(id);
        if (livro == null) {
            System.out.printf("\nLivro não encontrado.\n");
        } else {
            System.out.printf("%d - %s - %s (%d)\n",
                    livro.getId(),
                    livro.getNomeLivro(),
                    livro.getNomeAutor(),
                    livro.getDataLancamento());
        }
    }
}

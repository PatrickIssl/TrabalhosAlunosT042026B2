import java.util.Scanner;

class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean emprestado;

    void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("O livro ja esta emprestado.");
        }
    }

    void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("O livro nao esta emprestado.");
        }
    }

    void exibirInformacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPaginas);

        if (emprestado) {
            System.out.println("Situacao: Emprestado");
        } else {
            System.out.println("Situacao: Disponivel");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Livro livro = new Livro();

        System.out.print("Digite o titulo: ");
        livro.titulo = entrada.nextLine();

        System.out.print("Digite o autor: ");
        livro.autor = entrada.nextLine();

        System.out.print("Digite o numero de paginas: ");
        livro.numeroPaginas = entrada.nextInt();

        livro.emprestado = false;

        livro.exibirInformacoes();

        livro.emprestar();
        livro.emprestar();

        livro.exibirInformacoes();

        livro.devolver();

        livro.exibirInformacoes();

        entrada.close();
    }
}

package atividade6;

class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean emprestado = false;

    void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("O livro não está emprestado.");
        }
    }

    void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Emprestado: " +
                (emprestado ? "Sim" : "Não"));
    }
}

public class Atividade6 {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "O Pequeno Príncipe";
        livro.autor = "Antoine de Saint-Exupéry";
        livro.numeroPaginas = 96;

        livro.exibirInformacoes();
        livro.emprestar();
        livro.emprestar();
        livro.devolver();
        livro.exibirInformacoes();
    }
}
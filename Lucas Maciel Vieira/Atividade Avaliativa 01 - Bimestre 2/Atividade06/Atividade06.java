class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean emprestado;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.emprestado = false;
    }

    public void emprestar() {
        if (emprestado) {
            System.out.println("O livro já está emprestado.");
        } else {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("O livro não está emprestado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Emprestado: " + emprestado);
    }
}

public class Atividade06 {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 256);

        livro.exibirInformacoes();

        livro.emprestar();
        livro.emprestar();

        livro.devolver();
        livro.devolver();

        livro.exibirInformacoes();
    }
}

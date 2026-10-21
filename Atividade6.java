class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean emprestado;

    void emprestar() {
        if (emprestado == true) {
            System.out.println("Esse livro já está emprestado.");
        } else {
            emprestado = true;
            System.out.println("Livro emprestado.");
        }
    }

    void devolver() {
        if (emprestado == false) {
            System.out.println("Esse livro não está emprestado.");
        } else {
            emprestado = false;
            System.out.println("Livro devolvido.");
        }
    }

    void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Emprestado: " + emprestado);
    }
}

public class Atividade6 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "O Hobbit";
        livro.autor = "J. R. R. Tolkien";
        livro.numeroPaginas = 310;
        livro.emprestado = false;

        livro.exibirInformacoes();
        livro.devolver();
        livro.emprestar();
        livro.emprestar();
        livro.exibirInformacoes();
        livro.devolver();
        livro.exibirInformacoes();
    }
}

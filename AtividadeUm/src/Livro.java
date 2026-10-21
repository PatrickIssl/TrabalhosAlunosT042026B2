
class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean emprestado = false;

    void emprestar() {
        if (emprestado == false) {
            emprestado = true;
            System.out.println("Livro emprestado!");
        } else {
            System.out.println("O livro já está emprestado!");
        }
    }

    void devolver() {
        if (emprestado == true) {
            emprestado = false;
            System.out.println("Livro devolvido!");
        } else {
            System.out.println("O livro não está emprestado!");
        }
    }

    void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Emprestado: " + emprestado);
    }
}

class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "Dom Casmurro";
        livro.autor = "Machado de Assis";
        livro.numeroPaginas = 256;

        livro.exibirInformacoes();

        livro.emprestar();
        livro.emprestar();

        livro.devolver();
        livro.devolver();

        livro.exibirInformacoes();
    }
}

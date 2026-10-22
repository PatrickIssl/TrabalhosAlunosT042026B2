package livro;
public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean emprestado;

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro \"" + titulo + "\" foi emprestado com sucesso.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está emprestado!");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro \"" + titulo + "\" foi devolvido com sucesso.");
        } else {
            System.out.println("O livro \"" + titulo + "\" não estava emprestado, logo não pode ser devolvido.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Emprestado: " + (emprestado ? "Sim" : "Não"));
    }
}
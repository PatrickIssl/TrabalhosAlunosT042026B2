
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
            System.out.println("não foi possível emprestar: o livro já está emprestado.");
        } else {
            emprestado = true;
            System.out.println("livro emprestado com sucesso!");
        }
    }

    public void devolver() {
        if (!emprestado) {
            System.out.println("não foi possível devolver: o livro não está emprestado.");
        } else {
            emprestado = false;
            System.out.println("livro devolvido com sucesso!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("título: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("número de páginas: " + numeroPaginas);
        if (emprestado) {
            System.out.println("situação: emprestado");
        } else {
            System.out.println("situação: disponível");
        }
    }
}

public class Atividade6 {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 256);

        System.out.println("Informações iniciais");
        livro.exibirInformacoes();

        System.out.println("\nTentando devolver sem estar emprestado");
        livro.devolver();

        System.out.println("\nEmprestando o livro");
        livro.emprestar();

        System.out.println("\nTentando emprestar de novo");
        livro.emprestar();

        System.out.println("\nInformações atuais");
        livro.exibirInformacoes();

        System.out.println("\nDevolvendo o livro");
        livro.devolver();

        System.out.println("\nInformações finais");
        livro.exibirInformacoes();
    }
}

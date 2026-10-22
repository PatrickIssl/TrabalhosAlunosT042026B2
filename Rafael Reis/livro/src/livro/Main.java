package livro;
public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "O Senhor dos Anéis";
        livro.autor = "J.R.R. Tolkien";
        livro.numeroPaginas = 500;
        livro.emprestado = false;

        livro.exibirInformacoes();
        System.out.println("-------------------");
        
        livro.emprestar();
        livro.emprestar();
        
        System.out.println("-------------------");
        livro.devolver();
        livro.devolver();
    }
}
package classelivro;

public class ClasseLivro {
	

	    String titulo;
	    String autor;
	    int numeroPaginas;
	    boolean emprestado;

	    void emprestar() {
	        if (emprestado == false) {
	            emprestado = true;
	            System.out.println("Livro emprestado!");
	        } else {
	            System.out.println("Livro ja esta emprestado!");
	        }
	    }

	    void devolver() {
	        if (emprestado == true) {
	            emprestado = false;
	            System.out.println("Livro devolvido!");
	        } else {
	            System.out.println("Livro nao esta emprestado!");
	        }
	    }

	    void exibirInformacoes() {
	        System.out.println("Titulo: " + titulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Numero de paginas: " + numeroPaginas);
	        System.out.println("Emprestado: " + emprestado);
	    }

	    public static void main(String[] args) {

	        ClasseLivro livro = new ClasseLivro();

	        livro.titulo = "Dom Casmurro";
	        livro.autor = "Machado de Assis";
	        livro.numeroPaginas = 256;
	        livro.emprestado = false;

	        livro.exibirInformacoes();

	        livro.emprestar();
	        livro.emprestar();

	        livro.devolver();
	        livro.devolver();

	        livro.exibirInformacoes();
	    }
	}
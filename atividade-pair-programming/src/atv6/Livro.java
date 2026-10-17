package atv6;

public class Livro {
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private boolean emprestado;
	
	public Livro(String titulo, String autor, int numeroPaginas, boolean emprestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.emprestado = emprestado;
	}
	
	public void emprestar() {
		if (this.emprestado) {
			System.out.println("Já está emprestado");
		} else {
			this.emprestado = true;
		}
	}
	
	public void devolver() {
		if (!this.emprestado) {
			System.out.println("Não está emprestado, não tem como devolver");
		} else {
			this.emprestado = false;
		}
	}
	
	public void exibirInformacoes() {
		System.out.println("Título: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Número de páginas:  " + this.numeroPaginas);
		if (this.emprestado) {
			System.out.println("O livro está emprestado.");
		}
		else {
			System.out.println("O livro não está emprestado.");
		}
		
	}
}

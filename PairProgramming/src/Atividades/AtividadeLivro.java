package Atividades;

public class AtividadeLivro {

	public static class Livro {
		String titulo;
		String autor;
		int numeroPaginas;
		boolean emprestado = false;

		public Livro(String titulo, String autor, int numeroPaginas) {

			this.titulo = titulo;
			this.autor = autor;
			this.numeroPaginas = numeroPaginas;
		}

		public void emprestar() {
			if (emprestado) {
				System.out.println("Erro: Livro ja esta emprestado.");
			} else {
				emprestado = true;
				System.out.println("O livro foi emprestado com sucesso.");
			}
		}

		public void devolver() {
			if (!emprestado) {
				System.out.println("Erro: O livro nao esta emprestado.");
			} else {
				emprestado = false;
				System.out.println("Livro foi devolvido com sucesso.");
			}
		}

		public void exibirInformacoes() {
			System.out.println("Autor: " + autor);
			System.out.println("Titulo: " + titulo);
			System.out.println("Quantidade de paginas: " + numeroPaginas);
			System.out.println("O livro esta emprestado? " + emprestado);
		}
	}

	public static void main(String[] args) {

		Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 296);

		livro.exibirInformacoes();
		livro.emprestar();
		livro.emprestar();
		livro.devolver();
		livro.devolver();

	}

}

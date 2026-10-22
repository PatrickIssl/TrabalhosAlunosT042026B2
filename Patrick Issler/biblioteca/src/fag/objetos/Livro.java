package fag.objetos;

public class Livro {

	private int id;
	private String autor;
	private String titulo;
	private int paginas;
	private boolean emprestado;
	private String editora;
	private int anoPublicacao;

	public Livro() {
		emprestado = false;
	}

	public Livro(int id, String autor, String titulo, int paginas, String editora,
			int anoPublicacao) {
		this.id = id;
		this.autor = autor;
		this.emprestado = false;
		this.titulo = titulo;
		this.paginas = paginas;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

}

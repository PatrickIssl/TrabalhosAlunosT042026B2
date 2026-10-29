package Objetos;

public class Jogo {
 private String genero;
	private String nome;
	private int id;
	
	public Jogo() {
		
	}
	public Jogo(String genero, String nome, int id) {
		super();
		this.genero = genero;
		this.nome = nome;
		this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	


	
}

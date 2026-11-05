package objetos;

public class Aluno {
	private int id;
	private String nome;
	private Double nota;
	
	public Aluno(int id, String nome, Double nota){
		this.id = id;
		this.nome = nome;
		this.nota = nota;
	}
	public int getId(){
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Double getNota() {
		return nota;
	}
	public void setNome(String nome) {
		this.nome = nome;
	} 
	public void setNota(Double nota) {
		this.nota = nota;
	} 
}

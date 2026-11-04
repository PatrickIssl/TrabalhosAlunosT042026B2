package Alunos;

public class Alunos1 {
    private int id;
    private String nome;
    private double nota;

    
    public Alunos1(int id2, String nome2, double nota2) {
	
	}


	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

   
  
    public String toString() {
        return String.format("ID: %d | Nome: %-20s | Nota: %.2f", id, nome, nota);
    }
}
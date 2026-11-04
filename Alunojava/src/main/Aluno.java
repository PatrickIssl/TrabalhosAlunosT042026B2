package main;

public class Aluno {

	    private int id;
	    private String nome;
	    private double nota;

	    public Aluno(int id, String nome, double nota) {
	        this.id = id;
	        this.nome = nome;
	        this.nota = nota;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double getNota() {
	        return nota;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public void setNota(double nota) {
	        this.nota = nota;
	    }

	    public String toString() {
	        return "ID: " + id + " | Nome: " + nome + " | Nota: " + nota;
	    }
	}


package fag.objetos;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private String nome;
	private String cpf;
	private List<Livro> livrosEmprestados;

	public Pessoa() {
		livrosEmprestados = new ArrayList<Livro>();
	}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.livrosEmprestados = new ArrayList<Livro>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Livro> getLivrosEmprestados() {
		return livrosEmprestados;
	}

	public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}

}

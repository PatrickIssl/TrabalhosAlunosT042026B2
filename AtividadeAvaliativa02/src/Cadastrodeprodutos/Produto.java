package Cadastrodeprodutos;

public class Produto {
	
	private int ID;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(int ID, String nome, double preco, int quantidade) {
		this.ID = ID;
		this.nome = nome;
		this.preco = preco;	
		this.quantidade = quantidade;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public double getpreco() {
		return preco;
	}
	public void setpreco(double preco) {
		this.preco = preco;
	}
	public int getquantidade() {
		return quantidade;
	}
	public void setquantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String toString() {
		return String.format("ID: %d | nome: %s | preco: %.2f | quantidade: %d",ID,nome,preco,quantidade);
	}
}

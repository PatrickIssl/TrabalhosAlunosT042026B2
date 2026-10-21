package Atividades;

public class AtividadePessoa {

	public static class Pessoa {
		String nome;
		int idade;

		public Pessoa(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}

		public void MostrarResult() {
			System.out.println("Meu nome: " + this.nome + " e a idade e: " + this.idade);
		}
	}

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Marco", 18);
		p1.MostrarResult();

	}

}

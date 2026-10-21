package Atividades;

public class AtividadeCarro {

	public static class Carro {
		String nome;
		String marca;
		int ano;

		public Carro(String nome, String marca, int ano) {
			this.nome = nome;
			this.marca = marca;
			this.ano = ano;
		}

		public void MostrarResult() {

			System.out
					.println("Nome do carro e: " + this.nome + " e a marca e: " + this.marca + " com o ano de: " + ano);
		}

	}

	public static void main(String[] args) {

		Carro carro1 = new Carro("F-Type", "Jaguar", 2020);

		carro1.MostrarResult();

	}

}

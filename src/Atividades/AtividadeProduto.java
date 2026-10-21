package Atividades;

public class AtividadeProduto {

	public static class Produto {
		double valor;
		String nome;
		int quantidade;

		public Produto(String nome, double valor, int quantidade) {
			this.nome = nome;
			this.valor = valor;
			this.quantidade = quantidade;
		}

		public double Calculartotal() {
			return valor * quantidade;
		}

		public void Resultado() {
			System.out.println("O nome do produto: " + nome);
			System.out.println("O valor unitario do produto: " + valor);
			System.out.println("Quantos dele tem no estoque: " + quantidade);
			System.out.println("Quantos dele tem no estoque: " + Calculartotal());

		}

	}

	public static void main(String[] args) {

		Produto produto = new Produto("Berinjela", 9.99, 3);

		produto.Resultado();
	}

}

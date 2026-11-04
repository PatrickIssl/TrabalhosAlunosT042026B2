package Atividades;

public class AtividadeCadastroPessoa {

	public static class Pessoa {
		String nome;
		int idade;
		String cidade;

		public Pessoa(String nome, int idade, String cidade) {
			this.nome = nome;
			this.idade = idade;
			this.cidade = cidade;
		}

		public void apresentar() {
			System.out.println("Ola, meu nome e " + nome + ", tenho " + idade + " anos e moro em " + cidade + ".");
		}

		public void fazerAniversario() {
			idade++;
			System.out.println(nome + " fez aniversario e agora tem " + idade + " anos.");
		}

		public void exibirDados() {
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Cidade: " + cidade);
		}
	}

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Marco", 17, "Cascavel");
		Pessoa p2 = new Pessoa("Maria", 25, "Curitiba");
		Pessoa p3 = new Pessoa("Joao", 66, "Foz do Iguacu");

		System.out.println("\nDados das tres pessoas");
		p1.exibirDados();
		System.out.println();
		p2.exibirDados();
		System.out.println();
		p3.exibirDados();

		System.out.println("\nAniversario do Marco");
		p1.fazerAniversario();
		System.out.println("\nAniversario do Joao");
		p3.fazerAniversario();

		System.out.println("\nDados atualizados");
		p1.exibirDados();
		System.out.println();
		p2.exibirDados();
		System.out.println();
		p3.exibirDados();
	}
}
package Atividades;

public class AtividadeFuncionario {

	public static class Funcionario {

		String nome;
		String cargo;
		double salario;

		public Funcionario(String nome, String cargo, double salario) {
			this.nome = nome;
			this.cargo = cargo;
			this.salario = salario;
		}

		public void aumentarSalario(double percentual) {

			salario = salario + (salario * percentual / 100);
		}

		public void exibirInformacoes() {

			System.out.println("Nome: " + nome);
			System.out.println("Cargo: " + cargo);
			System.out.printf("Salario: R$ %.2f%n", salario);
		}

	}

	public static void main(String[] args) {

		Funcionario f = new Funcionario("Marco", "Engenheiro de Soft.", 6700);

		f.exibirInformacoes();
		f.aumentarSalario(10);
		f.exibirInformacoes();

	}

}

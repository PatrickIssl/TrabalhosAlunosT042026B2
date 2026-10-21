package Atividades;

public class AtividadeAluno {

	public static class Aluno {
		String nome;
		int idade;
		int nota;

		public Aluno(String nome, int idade, int nota) {
			this.nome = nome;
			this.idade = idade;
			this.nota = nota;
		}

		public void VerificarSituac() {
			System.out.println("O aluno: " + nome + ", De: " + idade + " anos e com a nota: " + nota);

			if (nota > 6) {
				System.out.println("Esta Aprovado");
			} else {
				System.out.println("Precisa fazer recuperacao");
			}
		}

	}

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Felipe", 8, 5);
		aluno1.VerificarSituac();

	}

}

package atv3;

public class AtividadeTres {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Amanda", 18, 9);
		
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Nota: " + aluno.getNota());
		aluno.verificarSituacao();
	}

}

package atv7;

public class AtividadeSete {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Amanda", "TI", 2000);
		funcionario.aumentarSalario(10);
		System.out.println("Salário: " + funcionario.getSalario());
	}

}

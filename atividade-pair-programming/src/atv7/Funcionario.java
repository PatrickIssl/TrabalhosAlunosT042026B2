package atv7;

public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public void aumentarSalario(int percentual) {
		this.salario += salario * percentual / 100;
	}
	
	public double getSalario() {
		return this.salario;
	}

}

package atv5;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saque não pode ser realizado.");
		} else {
			this.saldo -= valor;
		}
	}
	
	public void exibirSaldo() {
		System.out.println("Saldo: " + this.saldo);
	}
}

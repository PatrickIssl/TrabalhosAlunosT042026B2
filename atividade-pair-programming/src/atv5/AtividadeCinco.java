package atv5;

public class AtividadeCinco {
	public static void main(String[] args) {
		ContaBancaria contaBancaria = new ContaBancaria("Amanda", 100);
		contaBancaria.exibirSaldo();
		
		contaBancaria.depositar(50);
		contaBancaria.exibirSaldo();
		
		contaBancaria.sacar(200);
		
		contaBancaria.sacar(20);
		contaBancaria.exibirSaldo();
	}
}

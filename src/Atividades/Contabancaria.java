package Atividades;

public class Contabancaria {

	public static class ContaBancaria {
		double saldo;
		String titular;

		public ContaBancaria(String titular, double saldo) {
			this.titular = titular;
			this.saldo = saldo;
		}

		public void depositar(double valor) {
			if (valor > 0) {
				saldo += valor;
				System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
			} else {
				System.out.println("Não conseguimos efetuar o deposito.");
			}

		}

		public void sacar(double valor) {
			if (valor > 0 && valor <= saldo) {
				saldo -= valor;
				System.out.println("Saque de R$" + valor + " realizado com sucesso.");
			} else {
				System.out.println("Não conseguimos efetuar o saque, verifique o saldo.");
			}

		}

		public void exibirsaldo() {
			System.out.println("Titular: " + titular);
			System.out.println("Saldo atual R$: " + saldo);
		}

	}

	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria("Marco", 1500);

		conta.depositar(500.0);
		conta.sacar(1500);
		conta.sacar(250.0);
		conta.exibirsaldo();
	}

}

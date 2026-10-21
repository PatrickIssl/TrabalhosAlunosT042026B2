package contabancaria;

public class ContaBancaria {
	
	    String titular;
	    double saldo;

	    void depositar(double valor) {
	        saldo = saldo + valor;
	    }

	    void sacar(double valor) {
	        if (valor <= saldo) {
	            saldo = saldo - valor;
	        } else {
	            System.out.println("Saldo insuficiente!");
	        }
	    }

	    void exibirSaldo() {
	        System.out.println("Saldo: " + saldo);
	    }
	

	
	    public static void main(String[] args) {
	        ContaBancaria conta = new ContaBancaria();

	        conta.titular = "Ana";
	        conta.saldo = 0;

	        conta.depositar(500);
	        conta.sacar(200);
	        conta.exibirSaldo();
	    }
	}
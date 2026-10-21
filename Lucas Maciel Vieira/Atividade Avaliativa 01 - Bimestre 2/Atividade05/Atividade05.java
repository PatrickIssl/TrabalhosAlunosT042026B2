class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Depósito de R$ " + valor + " realizado.");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saque de R$ " + valor + " não pode ser realizado. Saldo insuficiente.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}

public class Atividade05 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Carlos");

        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(1000);
        conta.exibirSaldo();
    }
}

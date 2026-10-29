public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Deposito de R$ " + valor + " realizado com sucesso");
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saque de R$ " + valor + " nao pode ser realizado, saldo insuficiente");
        } else {
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso");
        }
    }

    public void exibirSaldo() {
        System.out.println("titular: " + titular);
        System.out.println("saldo: R$ " + saldo);
    }
}
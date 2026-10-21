
public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Deposito realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saque nao pode ser realizado: saldo insuficiente!");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: R$ " + this.saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Caua", 100);

        System.out.println("Saldo inicial: R$ 100");

        System.out.println("\nRealizando deposito de R$ 50...");
        conta.depositar(50);

        System.out.println("\nRealizando saque de R$ 30...");
        conta.sacar(30);

        System.out.println("\nTentando sacar R$ 200...");
        conta.sacar(200);

        System.out.println("\nExibindo saldo final:");
        conta.exibirSaldo();
    }
}

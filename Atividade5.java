class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente, o saque não pode ser realizado.");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}

public class Atividade5 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Roberto";
        conta.saldo = 200;

        conta.depositar(100);
        conta.sacar(50);
        conta.sacar(500);
        conta.exibirSaldo();
    }
}

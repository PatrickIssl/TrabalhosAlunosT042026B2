package atividade5;

class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado.");
    }

    void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }
}

public class Atividade5 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Emanuel";
        conta.saldo = 500.00;

        conta.depositar(200.00);
        conta.sacar(100.00);
        conta.exibirSaldo();
    }
}
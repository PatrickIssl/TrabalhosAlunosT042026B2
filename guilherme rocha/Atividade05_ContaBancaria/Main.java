import java.util.Scanner;

class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saque nao pode ser realizado.");
        }
    }

    void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite o nome do titular: ");
        conta.titular = entrada.nextLine();

        System.out.print("Digite o saldo inicial: ");
        conta.saldo = entrada.nextDouble();

        System.out.print("Valor do deposito: ");
        double deposito = entrada.nextDouble();
        conta.depositar(deposito);

        System.out.print("Valor do saque: ");
        double saque = entrada.nextDouble();
        conta.sacar(saque);

        conta.exibirSaldo();

        entrada.close();
    }
}

import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Conta conta = new Conta("Pablo", 0);
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Entre com o valor do deposito: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);

        System.out.printf("Entre com o valor do saque: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);

        conta.exibir();
    }
}

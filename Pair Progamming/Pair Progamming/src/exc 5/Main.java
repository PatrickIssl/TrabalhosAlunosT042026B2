public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("brunao", 777);

        conta.depositar(200);

        conta.sacar(300);

        conta.sacar(1000);

        conta.exibirSaldo();
    }
}
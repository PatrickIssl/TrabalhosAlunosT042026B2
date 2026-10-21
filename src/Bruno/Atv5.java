class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("saldo insuficiente para o saque!");
        }
    }

    public void exibirSaldo() {
        System.out.println("saldo final de " + titular + ": R$ " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        c.titular = "bruno";
        c.saldo = 100.0;

        c.depositar(50.0);
        c.sacar(30.0);
        c.exibirSaldo();
    }
}

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        if (titular != null && !titular.isBlank()) {
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }


    public void depositar(double deposito) {
        this.saldo += deposito;
    }

    public void sacar(double saque) {
        if (saque <= saldo) {
            this.saldo -= saque;
        } else {
            System.out.printf("Saque maior que saldo.\nNenhum valor foi debitado de sua conta senhor(a) %s",titular);
        }
    }

    public void exibir() {
        System.out.printf("\nSaldo %.2f",saldo);
    }


}

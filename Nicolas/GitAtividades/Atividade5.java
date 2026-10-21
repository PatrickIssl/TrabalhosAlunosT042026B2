class ContaBancaria {
   String titular;
   double saldo;
   void depositar(double valor) {
       saldo = saldo + valor;
   }
   void sacar(double valor) {
       if (valor > 0 && saldo >= valor) {
           saldo = saldo - valor;
           System.out.println("Saque realizado.");
       } else {
           System.out.println("Não foi possível realizar o saque.");
       }
   }
   void exibirSaldo() {
       System.out.println("Titular: " + titular);
       System.out.printf("Saldo: R$ %.2f%n", saldo);
   }
}
public class Atividade5 {
   public static void main(String[] args) {
       ContaBancaria conta = new ContaBancaria();
       conta.titular = "Gustavo";
       conta.saldo = 500.00;
       conta.depositar(200.00);
       conta.sacar(100.00);
       conta.exibirSaldo();
   }
}

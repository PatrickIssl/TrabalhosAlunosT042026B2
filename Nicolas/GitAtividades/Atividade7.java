class Funcionario {
   String nome;
   String cargo;
   double salario;
   void aumentarSalario(double percentual) {
       salario = salario + (salario * percentual / 100);
   }
}
public class Atividade7 {
   public static void main(String[] args) {
       Funcionario funcionario = new Funcionario();
       funcionario.nome = "Gustavo";
       funcionario.cargo = "Auxiliar Administrativo";
       funcionario.salario = 2000.00;
       funcionario.aumentarSalario(10);
       System.out.println("Nome: " + funcionario.nome);
       System.out.println("Cargo: " + funcionario.cargo);
       System.out.printf("Novo salário: R$ %.2f%n",
               funcionario.salario);
   }
}

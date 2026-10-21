public class Funcionario {
    String nome;
    String cargo;
    double salario;

    void aumentarSalario(double percentual) {
        salario = salario + (salario * percentual / 100);
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Cauã";
        funcionario.cargo = "Vendedor";
        funcionario.salario = 2000;

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Salário: R$ " + funcionario.salario);

        funcionario.aumentarSalario(20);

        System.out.println("Percentual de aumento: 20%");
        System.out.println("Novo salário: R$ " + funcionario.salario);
    }
}
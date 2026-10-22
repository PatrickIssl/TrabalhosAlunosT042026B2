package funcionário;
public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.nome = "Roberto";
        func.cargo = "Analista de Sistemas";
        func.salario = 2000.00;

        System.out.println("Salário inicial: R$ " + func.salario);
        func.aumentarSalario(10);
        System.out.println("Novo salário após aumento: R$ " + func.salario);
    }
}
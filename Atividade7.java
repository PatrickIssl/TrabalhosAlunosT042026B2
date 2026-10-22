class Funcionario {
    String nome;
    String cargo;
    double salario;

    void aumentarSalario(double percentual) {
        double aumento = salario * percentual / 100;
        salario = salario + aumento;
    }
}

public class Atividade7 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Fernanda";
        funcionario.cargo = "Vendedora";
        funcionario.salario = 2000;

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Salário: " + funcionario.salario);

        funcionario.aumentarSalario(10);

        System.out.println("Novo salário: " + funcionario.salario);
    }
}

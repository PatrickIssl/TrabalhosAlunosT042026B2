class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        salario = salario + (salario * percentual / 100);
    }

    public double getSalario() {
        return salario;
    }
}

public class Atividade07 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Juliana", "Analista", 2000);

        System.out.println("Salário: R$ " + funcionario.getSalario());
        System.out.println("Aumento: 10%");

        funcionario.aumentarSalario(10);

        System.out.println("Novo salário: R$ " + funcionario.getSalario());
    }
}

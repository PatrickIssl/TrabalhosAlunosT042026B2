package classefuncionario;

public class ClasseFuncionario {
    String nome;
    String cargo;
    double salario;

    public static void main(String[] args) {
        ClasseFuncionario f = new ClasseFuncionario();

        f.nome = "Beltrano";
        f.cargo = "Analista de dados";
        f.salario = 2500.0;

        int percentual = 10;

        f.salario = aumentarSalario(f.salario, percentual);

        System.out.println("Nome: " + f.nome);
        System.out.println("Cargo: " + f.cargo);
        System.out.printf("Novo salário: R$ %.2f", f.salario);
    }

    public static double aumentarSalario(double salario, int percentual) {
        return salario * (1 + (percentual / 100.0));
    }
}
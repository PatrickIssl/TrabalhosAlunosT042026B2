public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        double aumento = salario * percentual / 100;
        salario = salario + aumento;
        System.out.println("Aumento de " + percentual + "% aplicado em " + nome);
    }

    public void exibirDados() {
        System.out.println("nome: " + nome);
        System.out.println("cargo: " + cargo);
        System.out.printf("salario: R$ %.2f%n", salario);
    }
}
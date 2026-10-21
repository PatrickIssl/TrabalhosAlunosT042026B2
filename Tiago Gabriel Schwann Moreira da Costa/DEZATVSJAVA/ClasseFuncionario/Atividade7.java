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
        double aumento = salario * percentual / 100;
        salario = salario + aumento;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
}

public class Atividade7 {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", "Analista", 2000.00);

        System.out.println("funcionario: " + f.getNome());
        System.out.println("cargo: " + f.getCargo());
        System.out.printf("salario atual: R$ %.2f%n", f.getSalario());

        f.aumentarSalario(10);
        System.out.println("\naumento de 10% aplicado!");

        System.out.printf("novo salario: R$ %.2f%n", f.getSalario());
    }
}

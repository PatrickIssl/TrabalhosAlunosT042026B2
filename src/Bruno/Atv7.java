class Funcionario {
    String nome;
    String cargo;
    double salario;

    public void aumentarSalario(double percentual) {
        salario = salario + (salario * percentual / 100);
    }

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.nome = "bruno";
        f.cargo = "desenvolvedor";
        f.salario = 2000.0;

        System.out.println("nome: " + f.nome);
        System.out.println("cargo: " + f.cargo);
        System.out.println("salario antigo: R$ " + f.salario);

        f.aumentarSalario(10); // aplica 10% de aumento

        System.out.println("novo salario: R$ " + f.salario);
    }
}
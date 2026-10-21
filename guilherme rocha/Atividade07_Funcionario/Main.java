import java.util.Scanner;

class Funcionario {
    String nome;
    String cargo;
    double salario;

    void aumentarSalario(double percentual) {
        salario = salario + (salario * percentual / 100);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Digite o nome: ");
        funcionario.nome = entrada.nextLine();

        System.out.print("Digite o cargo: ");
        funcionario.cargo = entrada.nextLine();

        System.out.print("Digite o salario: ");
        funcionario.salario = entrada.nextDouble();

        System.out.print("Digite o percentual de aumento: ");
        double percentual = entrada.nextDouble();

        funcionario.aumentarSalario(percentual);

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.printf("Novo salario: R$ %.2f%n",
                funcionario.salario);

        entrada.close();
    }
}

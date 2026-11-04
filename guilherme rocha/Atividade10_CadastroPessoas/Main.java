import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;
    String cidade;

    void apresentar() {
        System.out.println("Ola! Meu nome e " + nome +
                " e tenho " + idade + " anos.");
    }

    void fazerAniversario() {
        idade = idade + 1;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        System.out.println("Cadastro da primeira pessoa");
        System.out.print("Nome: ");
        pessoa1.nome = entrada.nextLine();
        System.out.print("Idade: ");
        pessoa1.idade = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Cidade: ");
        pessoa1.cidade = entrada.nextLine();

        System.out.println("\nCadastro da segunda pessoa");
        System.out.print("Nome: ");
        pessoa2.nome = entrada.nextLine();
        System.out.print("Idade: ");
        pessoa2.idade = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Cidade: ");
        pessoa2.cidade = entrada.nextLine();

        System.out.println("\nCadastro da terceira pessoa");
        System.out.print("Nome: ");
        pessoa3.nome = entrada.nextLine();
        System.out.print("Idade: ");
        pessoa3.idade = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Cidade: ");
        pessoa3.cidade = entrada.nextLine();

        System.out.println("\n--- Dados das pessoas ---");

        pessoa1.apresentar();
        pessoa1.exibirDados();

        System.out.println();

        pessoa2.apresentar();
        pessoa2.exibirDados();

        System.out.println();

        pessoa3.apresentar();
        pessoa3.exibirDados();

        System.out.println("\nA primeira pessoa fez aniversario!");
        pessoa1.fazerAniversario();

        System.out.println("\n--- Dados atualizados ---");

        pessoa1.exibirDados();
        pessoa2.exibirDados();
        pessoa3.exibirDados();

        entrada.close();
    }
}

package atividade10;

class Pessoa {
    String nome;
    int idade;
    String cidade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome +
                " e moro em " + cidade + ".");
    }

    void fazerAniversario() {
        idade++;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("--------------------");
    }
}

public class Atividade10 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.nome = "Henrique";
        pessoa1.idade = 20;
        pessoa1.cidade = "Cascavel";

        pessoa2.nome = "Emanuel";
        pessoa2.idade = 18;
        pessoa2.cidade = "Cafelandia";

        pessoa3.nome = "Patrick";
        pessoa3.idade = 19;
        pessoa3.cidade = "Londrina";

        System.out.println("CADASTRO DE PESSOAS");

        pessoa1.apresentar();
        pessoa1.exibirDados();

        pessoa2.apresentar();
        pessoa2.exibirDados();

        pessoa3.apresentar();
        pessoa3.exibirDados();

        System.out.println("Após o aniversário:");

        pessoa1.fazerAniversario();

        pessoa1.exibirDados();
        pessoa2.exibirDados();
        pessoa3.exibirDados();
    }
}
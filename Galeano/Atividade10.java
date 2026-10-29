class Pessoa {
    String nome;
    int idade;
    String cidade;

    void apresentar() {
        System.out.println("Olá, eu sou " + nome + ", tenho " + idade + " anos e moro em " + cidade + ".");
    }

    void fazerAniversario() {
        idade = idade + 1;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println();
    }
}

public class Atividade10 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Gabriel";
        pessoa1.idade = 20;
        pessoa1.cidade = "Cascavel";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Camila";
        pessoa2.idade = 22;
        pessoa2.cidade = "Toledo";

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Rafael";
        pessoa3.idade = 19;
        pessoa3.cidade = "Foz do Iguaçu";

        pessoa1.apresentar();
        pessoa2.apresentar();
        pessoa3.apresentar();
        System.out.println();

        pessoa1.exibirDados();
        pessoa2.exibirDados();
        pessoa3.exibirDados();

        pessoa2.fazerAniversario();
        System.out.println("Depois do aniversário da Camila:");
        pessoa1.exibirDados();
        pessoa2.exibirDados();
        pessoa3.exibirDados();
    }
}

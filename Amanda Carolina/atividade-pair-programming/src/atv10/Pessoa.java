package atv10;

public class Pessoa {

    String nome;
    int idade;
    String cidade;

    void apresentar() {
        System.out.println("Ola! Meu nome e " + nome + ".");
    }

    void fazerAniversario() {
        idade = idade + 1;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade + "\n");
    }
}

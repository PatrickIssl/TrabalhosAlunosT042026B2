class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e moro em " + cidade + ".");
    }

    public void fazerAniversario() {
        idade = idade + 1;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Cidade: " + cidade);
    }
}

public class Atividade10 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Fernanda", 22, "Curitiba");
        Pessoa pessoa2 = new Pessoa("Rafael", 30, "Porto Alegre");

        pessoa1.apresentar();
        pessoa2.apresentar();

        pessoa1.exibirDados();
        pessoa2.exibirDados();

        pessoa1.fazerAniversario();

        System.out.println("Depois do aniversário:");
        pessoa1.exibirDados();
        pessoa2.exibirDados();
    }
}

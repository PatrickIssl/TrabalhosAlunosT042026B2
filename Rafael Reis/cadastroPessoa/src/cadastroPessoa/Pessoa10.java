package cadastroPessoa;
public class Pessoa10 {
    String nome;
    int idade;
    String cidade;

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e moro em " + cidade + ".");
    }

    public void fazerAniversario() {
        idade += 1;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Cidade: " + cidade);
    }
}
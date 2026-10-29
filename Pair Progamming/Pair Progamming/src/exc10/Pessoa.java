public class Pessoa {

    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public void apresentar() {
        System.out.println("Oi, meu nome e " + nome + ", tenho " + idade + " anos e moro em " + cidade);
    }
    public void fazerAniversario() {
        idade = idade + 1;
        System.out.println(nome + " fez aniversario e agora tem " + idade + " anos");
    }

    public void exibirDados() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("cidade: " + cidade);
    }
}
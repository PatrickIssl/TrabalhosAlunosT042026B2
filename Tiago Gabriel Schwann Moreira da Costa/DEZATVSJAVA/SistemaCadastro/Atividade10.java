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
        System.out.println("meu nome é " + nome + ", tenho " + idade
                + " anos e moro em " + cidade + ".");
    }

    public void fazerAniversario() {
        idade = idade + 1;
        System.out.println(nome + " fez aniversario");
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
    }
}

public class Atividade10 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 20, "Cascavel");
        Pessoa p2 = new Pessoa("Bruno", 25, "Curitiba");

        Pessoa p3 = new Pessoa("Carla", 30, "Londrina");

        System.out.println("presentações");
        p1.apresentar();
        p2.apresentar();
        p3.apresentar();

        System.out.println("\ndados das pessoas");
        p1.exibirDados();
        System.out.println();
        p2.exibirDados();
        System.out.println();
        p3.exibirDados();

        System.out.println("\naniversário");
        p1.fazerAniversario();

        System.out.println("\nddos depois do aniversário");
        p1.exibirDados();
        System.out.println();
        p2.exibirDados();
        System.out.println();
        p3.exibirDados();
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

public class Atividade01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria", 25);
        pessoa.apresentar();
    }
}


public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Oi, meu nome é " + this.nome
                + " e tenho " + this.idade + " anos.");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Cauã", 18);

        pessoa.apresentar();
    }
}

public class Pessoa {
    String nome;
    int idade;

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "BRuno";
        pessoa1.idade = 20;
        pessoa1.apresentar();
    }
}
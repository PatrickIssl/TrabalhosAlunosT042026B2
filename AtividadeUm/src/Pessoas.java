
public class Pessoas {
    String nome;
    int idade;
    String cidade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome +
                ", tenho " + idade + " anos e moro em " + cidade + ".");
    }

    void fazerAniversario() {
        idade = idade + 1;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Pessoas pessoa1 = new Pessoas();
        Pessoas pessoa2 = new Pessoas();
        Pessoas pessoa3 = new Pessoas();

        pessoa1.nome = "Cauã";
        pessoa1.idade = 18;
        pessoa1.cidade = "Cascavel";

        pessoa2.nome = "Maria";
        pessoa2.idade = 20;
        pessoa2.cidade = "Curitiba";

        pessoa3.nome = "João";
        pessoa3.idade = 25;
        pessoa3.cidade = "São Paulo";

        System.out.println("Apresentação das pessoas:");
        pessoa1.apresentar();
        pessoa2.apresentar();
        pessoa3.apresentar();

        System.out.println("\nDados das pessoas:");
        pessoa1.exibirDados();
        pessoa2.exibirDados();
        pessoa3.exibirDados();

        pessoa1.fazerAniversario();

        System.out.println("Após o aniversário de Cauã:");
        pessoa1.exibirDados();
        pessoa2.exibirDados();
        pessoa3.exibirDados();
    }
}

package cadastroPessoa;
public class Main {
    public static void main(String[] args) {
        Pessoa10 p1 = new Pessoa10();
        p1.nome = "Lucas";
        p1.idade = 20;
        p1.cidade = "São Paulo";

        Pessoa10 p2 = new Pessoa10();
        p2.nome = "Fernanda";
        p2.idade = 30;
        p2.cidade = "Rio de Janeiro";

        Pessoa10 p3 = new Pessoa10();
        p3.nome = "Marcos";
        p3.idade = 22;
        p3.cidade = "Curitiba";

        System.out.println("--- Exibindo dados iniciais das 3 pessoas ---");
        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();

        System.out.println("\nA " + p2.nome + " fez aniversário!");
        p2.fazerAniversario();

        System.out.println("\n--- Exibindo dados após o aniversário ---");
        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
    }
}
class Pessoa {
    String nome;
    int idade;
    String cidade;

    public void apresentar() {
        System.out.println("ola, meu nome e " + nome);
    }

    public void fazerAniversario() {
        idade = idade + 1;
    }

    public void exibirDados() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("cidade: " + cidade);
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "bruno";
        p1.idade = 20;
        p1.cidade = "cascavel";

        Pessoa p2 = new Pessoa();
        p2.nome = "tiago";
        p2.idade = 19;
        p2.cidade = "matelandia";

        System.out.println("--- pessoa 1 ---");
        p1.apresentar();
        p1.exibirDados();

        System.out.println("--- pessoa 2 ---");
        p2.apresentar();
        p2.exibirDados();

        p1.fazerAniversario();

        System.out.println("--- pessoa 1 apos aniversario ---");
        p1.exibirDados();
    }
}
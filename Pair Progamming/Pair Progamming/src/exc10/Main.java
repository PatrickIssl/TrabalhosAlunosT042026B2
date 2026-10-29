public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Luiz", 20, "Cascavel");
        Pessoa pessoa2 = new Pessoa("Bruno", 19, "Curitiba");

        pessoa1.apresentar();
        pessoa1.exibirDados();
        pessoa2.apresentar();
        pessoa2.exibirDados();

        pessoa1.fazerAniversario();

        pessoa1.exibirDados();
        pessoa2.exibirDados();
    }
}
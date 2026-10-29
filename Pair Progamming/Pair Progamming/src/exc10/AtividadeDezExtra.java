public class AtividadeDezExtra {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Luiz", 20, "Cascavel");
        Pessoa pessoa2 = new Pessoa("bruno", 13, "Curitiba");
        Pessoa pessoa3 = new Pessoa("kauan", 67, "Xique Xique");

        pessoa1.exibirDados();
        pessoa2.exibirDados();
        pessoa3.exibirDados();

        pessoa3.fazerAniversario();

        pessoa3.exibirDados();
    }
}
package atv10;

public class AtividadeDezExtra {

    public static void main(String[] args) {

        Pessoa pessoaUm = new Pessoa();
        Pessoa pessoaDois = new Pessoa();
        Pessoa pessoaTres = new Pessoa();

        pessoaUm.nome = "Amanda";
        pessoaUm.idade = 18;
        pessoaUm.cidade = "Cianorte";

        pessoaDois.nome = "Vinícius";
        pessoaDois.idade = 18;
        pessoaDois.cidade = "Cascavel";

        pessoaTres.nome = "Marcelo";
        pessoaTres.idade = 21;
        pessoaTres.cidade = "Santa Maria";

        pessoaUm.apresentar();
        pessoaDois.apresentar();
        pessoaTres.apresentar();

        System.out.println("Dados das pessoas:\n");

        pessoaUm.exibirDados();
        pessoaDois.exibirDados();
        pessoaTres.exibirDados();

        pessoaUm.fazerAniversario();

        System.out.println("Dados depois do aniversario:\n");

        pessoaUm.exibirDados();
        pessoaDois.exibirDados();
        pessoaTres.exibirDados();
    }
}



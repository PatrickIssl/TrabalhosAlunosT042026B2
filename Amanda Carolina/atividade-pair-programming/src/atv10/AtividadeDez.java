package atv10;

public class AtividadeDez {

    public static void main(String[] args) {

        Pessoa pessoaUm = new Pessoa();
        Pessoa pessoaDois = new Pessoa();

        pessoaUm.nome = "Amanda";
        pessoaUm.idade = 18;
        pessoaUm.cidade = "Cianorte";

        pessoaDois.nome = "Vinícius";
        pessoaDois.idade = 18;
        pessoaDois.cidade = "Cascavel";

        pessoaUm.apresentar();
        pessoaDois.apresentar();

        System.out.println("Dados das pessoas:");
        pessoaUm.exibirDados();
        pessoaDois.exibirDados();

        pessoaUm.fazerAniversario();

        System.out.println("Dados depois do aniversario:");
        pessoaUm.exibirDados();
        pessoaDois.exibirDados();
    }
}


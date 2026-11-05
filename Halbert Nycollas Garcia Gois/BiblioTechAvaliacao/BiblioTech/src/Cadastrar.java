import java.util.Scanner;

public class Cadastrar {

    private String nomeLivro;
    private String nomeAutor;
    private int dataLancamento;
    private int id;

    public Cadastrar() {

    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(int dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void areaDeCadastro () {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("####CADASTRO####");

        System.out.printf("\nEntre com o nome do Livro: \n");
        this.setNomeLivro(scanner.nextLine());
        System.out.printf("Entre com o nome do Autor: \n");
        this.setNomeAutor(scanner.nextLine());
        System.out.printf("Entre com a data de Lançamento da Obra: \n");
        this.setDataLancamento(scanner.nextInt());
    }
}

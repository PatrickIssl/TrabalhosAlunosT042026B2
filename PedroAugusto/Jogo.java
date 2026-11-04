public class Jogo {
    // declara a classe Jogo (o "molde" de cada jogo)

    private int id;
    // atributo privado: número de identificação do jogo

    private String nome;
    // atributo privado: nome do jogo

    private String genero;
    // atributo privado: gênero do jogo (ação, RPG...)

    public Jogo(int id, String nome, String genero) {
        // construtor: roda quando faz "new Jogo(...)" e recebe os dados

        this.id = id;
        // this.id é o atributo da classe, id é o valor recebido

        this.nome = nome;
        // guarda o nome recebido no atributo nome

        this.genero = genero;
        // guarda o gênero recebido no atributo genero
    }
    // fim do construtor

    public int getId() {
        // getter: permite LER o id de fora da classe

        return id;
        // devolve o valor do id
    }

    public void setId(int id) {
        // setter: permite ALTERAR o id de fora da classe

        this.id = id;
        // troca o id atual pelo valor recebido
    }

    public String getNome() {
        // getter do nome

        return nome;
        // devolve o nome
    }

    public void setNome(String nome) {
        // setter do nome

        this.nome = nome;
        // troca o nome atual pelo novo
    }

    public String getGenero() {
        // getter do gênero

        return genero;
        // devolve o gênero
    }

    public void setGenero(String genero) {
        // setter do gênero

        this.genero = genero;
        // troca o gênero atual pelo novo
    }
}
// fim da classe Jogo

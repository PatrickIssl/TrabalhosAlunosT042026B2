public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa (String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) { //Pesquisei na net pra fazer essa validação
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public void apresentar () {
        System.out.printf("\nOlá, meu nome é %s e tenho %d anos.\n", nome, idade);
    }

}

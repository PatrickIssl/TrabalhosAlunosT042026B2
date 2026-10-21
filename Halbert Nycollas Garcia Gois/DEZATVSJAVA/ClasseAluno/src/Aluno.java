public class Aluno {
    private String nome;
    private int idade;
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        setNome(nome);
        setIdade(idade);
        setNota(nota);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
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

    public double getNota() {
        return nota;
    }
    public void setNota(double nota){
        if ((nota >= 0) && (nota <=10)) {
            this.nota = nota;
        }
    }

    public void verificarSituacao() {
        System.out.printf("O aluno %s, que tem %d anos de idade, tirou %.1f na escola.%n", nome, idade, nota);
        if (nota >= 6) {
            System.out.printf("Como %s tirou nota igual ou acima de 6, ele está APROVADO.%n", nome);
        } else {
            System.out.printf("Como %s tirou nota abaixo de 6, ele está REPROVADO.%n", nome);
        }
    }
}

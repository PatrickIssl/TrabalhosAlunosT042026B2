public class Aluno {
    
    private String nome;
    private int idade;
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void verificarSituacao() {
        if (nota >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public void exibirDados() {
        System.out.println("nome: " + nome);
        System.out.println("nota: " + nota);
        verificarSituacao();
    }
}
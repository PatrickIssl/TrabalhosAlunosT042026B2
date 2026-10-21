
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
        if (this.nota >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Caua", 18, 8.5);

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Nota: " + aluno.nota);
        System.out.print("Situacao: ");
        aluno.verificarSituacao();
    }
}

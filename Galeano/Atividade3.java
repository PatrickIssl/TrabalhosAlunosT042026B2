class Aluno {
    String nome;
    int idade;
    double nota;

    void verificarSituacao() {
        if (nota >= 6) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}

public class Atividade3 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Mariana";
        aluno.idade = 17;
        aluno.nota = 7;

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Nota: " + aluno.nota);
        aluno.verificarSituacao();
    }
}

package atividade3;

class Aluno {
    String nome;
    int idade;
    double nota;

    String verificarSituacao() {
        if (nota >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}

public class Atividade3 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Henrique";
        aluno.idade = 20;
        aluno.nota = 9.0;

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Nota: " + aluno.nota);
        System.out.println("Situação: " +
                aluno.verificarSituacao());
    }
}
class Aluno {
    private String nome;
    private int idade;
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String verificarSituacao() {
        if (nota >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}

public class Atividade03 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ana", 19, 7.5);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota: " + aluno.getNota());
        System.out.println("Situação: " + aluno.verificarSituacao());
    }
}

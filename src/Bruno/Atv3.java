class Aluno {
    String nome;
    int idade;
    double nota;

    public String verificarSituacao() {
        if (nota >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "bruno";
        a.idade = 20;
        a.nota = 7.5;

        System.out.println("nome: " + a.nome);
        System.out.println("nota: " + a.nota);
        System.out.println("situacao: " + a.verificarSituacao());
    }
}
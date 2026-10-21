class Aluno {
   String nome;
   int idade;
   double nota;
   void verificarSituacao() {
       System.out.println("Nome: " + nome);
       System.out.println("Nota: " + nota);
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
       aluno.nome = "Nicolas";
       aluno.idade = 18;
       aluno.nota = 8.0;
       aluno.verificarSituacao();
   }
}

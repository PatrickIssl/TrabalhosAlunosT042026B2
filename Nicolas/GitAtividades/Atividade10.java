class Pessoa {
   String nome;
   int idade;
   String cidade;
   void apresentar() {
       System.out.println("Olá, meu nome é " + nome
               + " e moro em " + cidade + ".");
   }
   void fazerAniversario() {
       idade++;
   }
   void exibirDados() {
       System.out.println("Nome: " + nome);
       System.out.println("Idade: " + idade);
       System.out.println("Cidade: " + cidade);
       System.out.println();
   }
}
public class Atividade10 {
   public static void main(String[] args) {
       Pessoa pessoa1 = new Pessoa();
       Pessoa pessoa2 = new Pessoa();
       pessoa1.nome = "Gustavo";
       pessoa1.idade = 18;
       pessoa1.cidade = "Cascavel";
       pessoa2.nome = "Nicolas";
       pessoa2.idade = 18;
       pessoa2.cidade = "Cascavel";
       pessoa1.apresentar();
       pessoa2.apresentar();
       System.out.println("\nDados das pessoas:");
       pessoa1.exibirDados();
       pessoa2.exibirDados();
       pessoa1.fazerAniversario();
       System.out.println("Após o aniversário:");
       pessoa1.exibirDados();
       pessoa2.exibirDados();
   }
}

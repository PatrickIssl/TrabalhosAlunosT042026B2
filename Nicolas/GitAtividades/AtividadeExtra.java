class Pessoa {
   String nome;
   int idade;
   String cidade;
   void exibirDados() {
       System.out.println("Nome: " + nome);
       System.out.println("Idade: " + idade);
       System.out.println("Cidade: " + cidade);
       System.out.println();
   }
}
public class AtividadeExtra {
   public static void main(String[] args) {
       Pessoa pessoa1 = new Pessoa();
       Pessoa pessoa2 = new Pessoa();
       Pessoa pessoa3 = new Pessoa();
       pessoa1.nome = "Gustavo";
       pessoa1.idade = 18;
       pessoa1.cidade = "Cascavel";
       pessoa2.nome = "Nicolas";
       pessoa2.idade = 18;
       pessoa2.cidade = "Cascavel";
       pessoa3.nome = "Pedro";
       pessoa3.idade = 20;
       pessoa3.cidade = "Toledo";
       pessoa1.exibirDados();
       pessoa2.exibirDados();
       pessoa3.exibirDados();
   }
}

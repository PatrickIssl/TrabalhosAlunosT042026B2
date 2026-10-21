class Produto {
   String nome;
   double preco;
   int quantidade;
   double calcularTotal() {
       return preco * quantidade;
   }
}
public class Atividade4 {
   public static void main(String[] args) {
       Produto produto = new Produto();
       produto.nome = "Teclado";
       produto.preco = 100.00;
       produto.quantidade = 2;
       System.out.println("Produto: " + produto.nome);
       System.out.println("Valor total: R$ "
               + produto.calcularTotal());
   }
}

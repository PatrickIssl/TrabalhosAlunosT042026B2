
public class Produto {
    String nome;
    double preco;
    int quantidade;

    public double calcularTotal() {
        return preco * quantidade;
    }

    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Teclado";
        produto.preco = 100;
        produto.quantidade = 2;

        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: R$ " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);
        System.out.println("Valor total: R$ " + produto.calcularTotal());
    }
}

class Produto {
    String nome;
    double preco;
    int quantidade;

    double calcularTotal() {
        double total = preco * quantidade;
        return total;
    }
}

public class Atividade4 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Mouse";
        produto.preco = 45.5;
        produto.quantidade = 3;

        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço: " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);
        System.out.println("Valor total: " + produto.calcularTotal());
    }
}

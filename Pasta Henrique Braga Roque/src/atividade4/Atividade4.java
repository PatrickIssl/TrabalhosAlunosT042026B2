package atividade4;

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

        produto.nome = "Caderno";
        produto.preco = 20.00;
        produto.quantidade = 3;

        System.out.println("Produto: " + produto.nome);
        System.out.printf("Total da compra: R$ %.2f%n",
                produto.calcularTotal());
    }
}
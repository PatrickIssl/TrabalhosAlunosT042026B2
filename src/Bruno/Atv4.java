class Produto {
    String nome;
    double preco;
    int quantidade;

    public double calcularTotal() {
        return preco * quantidade;
    }

    public static void main(String[] args) {
        Produto p = new Produto();
        p.nome = "mouse";
        p.preco = 50.0;
        p.quantidade = 3;

        System.out.println("produto: " + p.nome);
        System.out.println("preco: " + p.preco);
        System.out.println("quantidade: " + p.quantidade);
        System.out.println("total da compra: " + p.calcularTotal());
    }
}
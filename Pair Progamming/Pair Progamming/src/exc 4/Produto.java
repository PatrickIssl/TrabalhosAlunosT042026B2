public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return preco * quantidade;
    }

    public void exibirDados() {
        System.out.println("nome: " + nome);
        System.out.println("preco: R$ " + preco);
        System.out.println("quantidade: " + quantidade);
    }
}
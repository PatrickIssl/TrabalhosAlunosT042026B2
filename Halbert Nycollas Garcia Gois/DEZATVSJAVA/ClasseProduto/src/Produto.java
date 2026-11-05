public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public void Produto(String nome, double preco, int quantidade) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if (quantidade >= 1){
            this.quantidade = quantidade;
        }
    }

    public void calcularTotal() {
        double total;
        total = preco * quantidade;
        System.out.printf("O valor total da compra é de: R$ %.2f", total);
    }
}

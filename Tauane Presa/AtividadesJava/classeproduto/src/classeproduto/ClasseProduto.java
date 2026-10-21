package classeproduto;

public class ClasseProduto {

    String nome;
    double preco;
    int quantidade;

    public static void main(String[] args) {

        ClasseProduto p = new ClasseProduto();

        p.nome = "Mouse";
        p.preco = 50.0;
        p.quantidade = 5;

        double resultado = calcularTotal(p.preco, p.quantidade);

        System.out.printf("O valor total da compra de %d %ss e de: R$ %.2f", p.quantidade, p.nome, resultado);
    }

    public static double calcularTotal(double preco, int quantidade) {
        return preco * quantidade;
    }
}
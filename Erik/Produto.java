package atividadepoo;

public class Produto {
	String nome;
	Double preco;
	int quantidade;
	public static void main(String[] args) {
		Produto p = new Produto();
		p.nome = ("Mouse");
		p.preco = (50.0);
		p.quantidade = (5);
		
		double resultado = calcularTotal(p.preco, p.quantidade);
		System.out.printf("O valor total da compra de %d %ss é de: %.2f", p.quantidade, p.nome, resultado);
	}
	public static double calcularTotal(double preco, int quantidade) {
		return preco * quantidade;
	}
}
	
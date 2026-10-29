package atv4;

public class AtividadeQuatro {

	public static void main(String[] args) {
		Produto produto = new Produto("Maçã", 3, 5);
		System.out.println("Produto: "+ produto.getNome());
		System.out.println("Preço: "+ produto.getPreco());
		System.out.println("Quantidade: "+ produto.getQuantidade());
		System.out.println("Total: "+ produto.calcularTotal());
		
	}

}

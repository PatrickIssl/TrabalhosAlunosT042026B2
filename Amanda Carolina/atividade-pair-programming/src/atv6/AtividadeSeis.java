package atv6;

public class AtividadeSeis {

	public static void main(String[] args) {
		Livro livro = new Livro("Dicionário","Aurélio",500,true);
		livro.exibirInformacoes();
		
		livro.devolver();
		livro.devolver();
		livro.exibirInformacoes();
		
		livro.emprestar();
		livro.exibirInformacoes();
		
		livro.emprestar();
	}

}

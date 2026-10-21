public class AtividadeSeis {

    public static void main(String[] args) {
        
    Livro livro = new Livro("dom casmurro", "machado de assis", 50); 
    
    livro.exibirInformacoes();
    livro.devolver();

    livro.emprestar(); 
    
    livro.emprestar(); 

    livro.exibirInformacoes();

    livro.devolver(); 

    livro.exibirInformacoes();

    }
}
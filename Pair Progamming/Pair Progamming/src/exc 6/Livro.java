public class Livro {

   private String titulo;
   private  String autor;
    private int numeroPaginas;
   private boolean emprestado;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.emprestado = false;
    }

    public void emprestar(){
        if (emprestado) {
            System.out.println("O  livro"+titulo+" já está emprestado");
        } else {
            emprestado = true;
            System.out.println("O  livro "+titulo+"  foi emprestado com sucesso");
        }
    }

    public void devolver(){
        if (!emprestado) {
            System.out.println("O  livro "+titulo+" não pode ser devolvido pois não está emprestado");
        } else {
            emprestado = false;
            System.out.println("O  livro "+titulo+" foi devolvido com sucesso");
        }
    }

    public void exibirInformacoes(){

        System.out.println("titulo: "+ titulo);
        System.out.println("autor: " + autor);
        System.out.println("numero de paginas: "+ numeroPaginas);
        if (emprestado) {
             System.out.println("emprestado: Sim ");
        } else{
             System.out.println("emprestado: Não ");
        }
       
    }




}
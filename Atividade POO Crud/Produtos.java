public class Produtos {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    private static  int contarId =1;

    public Produtos(String nome, double preco, int quantidade){
        this.id = contarId;
        contarId++;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getID() { 
        return id; 

    }
    public String getNome() { 
        return nome; 

    }
    public double getPreco() { 
        return preco; 

    }
    public int getQuantidade(){
        return quantidade;
    }

    public int setID() { 
        return this.id; 

    }

    public String setNome(String nome) { 
        return this.nome = nome; 

    }
    public double setPreco(double preco) { 
        return this.preco = preco; 

    }
    public int setQuantidade(int quantidade){
        return this.quantidade = quantidade;
    }

    
}
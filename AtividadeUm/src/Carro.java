
public class Carro {
    private String nome;
    private String marca;
    private int ano;

    public Carro(String nome, String marca, int ano) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }

    public void apresentar() {
        System.out.println("Nome do Carro: " + this.nome + "\nMarca: " + this.marca+ "\nAno: " + this.ano);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Camaro", "Chevrolet", 2012);

        carro.apresentar();
    }
}

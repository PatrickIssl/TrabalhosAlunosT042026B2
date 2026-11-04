package atividade2;

class Carro {
    String marca;
    String modelo;
    int ano;

    void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

public class Atividade2 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "Ferrari:";
        carro.modelo = "Corolla";
        carro.ano = 2024;

        carro.exibirDados();
    }
}
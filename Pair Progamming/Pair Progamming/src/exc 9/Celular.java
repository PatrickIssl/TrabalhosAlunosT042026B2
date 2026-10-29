public class Celular {
    
    private String marca;
    private String modelo;
    private int bateria;

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = 100;
    }

    public void usarCelular() {
        if (bateria == 0) {
            System.out.println("O " + modelo + " esta sem bateria, precisa carregar");
        } else {
            bateria = bateria - 10;
            System.out.println("Usando o " + modelo + "...");
        }
    }

    public void carregar() {
        bateria = 100;
        System.out.println("O " + modelo + " foi carregado");
    }

    public void exibirBateria() {
        System.out.println("Bateria do " + marca + " " + modelo + ": " + bateria + "%");
    }
}
class Celular {
    private String marca;
    private String modelo;
    private int bateria;

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = 100;
    }

    public void usarCelular() {
        bateria = bateria - 10;
        if (bateria < 0) {
            bateria = 0;
        }
    }

    public void carregar() {
        bateria = 100;
    }

    public void exibirBateria() {
        System.out.println(marca + " " + modelo + " - Bateria: " + bateria + "%");
    }
}

public class Atividade09 {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", "Galaxy A55");

        celular.usarCelular();
        celular.usarCelular();
        celular.usarCelular();
        celular.exibirBateria();

        celular.carregar();
        celular.exibirBateria();
    }
}

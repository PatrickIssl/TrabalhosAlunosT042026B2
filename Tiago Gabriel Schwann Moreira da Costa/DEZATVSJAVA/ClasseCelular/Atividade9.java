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
        System.out.println("usando o celular");
    }

    public void carregar() {
        bateria = 100;
        System.out.println("celular carregado");
    }

    public void exibirBateria() {
        System.out.println("bateria do " + marca + " " + modelo + ": " + bateria + "%");
    }
}

public class Atividade9 {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", "Galaxy A25");

        celular.exibirBateria();

        celular.usarCelular();
        celular.usarCelular();
        celular.usarCelular();
        celular.usarCelular();

        celular.exibirBateria();

        celular.carregar();

        celular.exibirBateria();
    }
}

package atividade9;

class Celular {
    String marca;
    String modelo;
    int bateria = 100;

    void usarCelular() {
        bateria -= 10;

        if (bateria < 0) {
            bateria = 0;
        }

        System.out.println("Celular utilizado.");
    }

    void carregar() {
        bateria = 100;
        System.out.println("Celular carregado.");
    }

    void exibirBateria() {
        System.out.println("Bateria: " + bateria + "%");
    }
}

public class Atividade9 {
    public static void main(String[] args) {
        Celular celular = new Celular();

        celular.marca = "Samsung";
        celular.modelo = "Galaxy";

        celular.usarCelular();
        celular.usarCelular();
        celular.usarCelular();

        celular.exibirBateria();

        celular.carregar();
        celular.exibirBateria();
    }
}

public class Celular {
    String marca;
    String modelo;
    int bateria = 100;

    void usarCelular() {
        if (bateria >= 10) {
            bateria = bateria - 10;
        } else {
            bateria = 0;
        }
    }

    void carregar() {
        bateria = 100;
        System.out.println("Celular carregado!");
    }

    void exibirBateria() {
        System.out.println("Bateria: " + bateria + "%");
    }

    public static void main(String[] args) {
        Celular celular = new Celular();

        celular.marca = "Samsung";
        celular.modelo = "Galaxy";

        System.out.println("Marca: " + celular.marca);
        System.out.println("Modelo: " + celular.modelo);

        celular.usarCelular();
        celular.usarCelular();
        celular.usarCelular();

        celular.exibirBateria();

        celular.carregar();

        celular.exibirBateria();
    }
}

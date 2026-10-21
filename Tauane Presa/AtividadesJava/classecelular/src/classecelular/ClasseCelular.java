package classecelular;

public class ClasseCelular {

    String marca;
    String modelo;
    int bateria = 100;	

    public void usarCelular() {
        if (bateria >= 10) {
            bateria = bateria - 10;
        }
    }

    public void carregar() {
        bateria = 100;
    }

    public void exibirBateria() {
        System.out.println("Bateria: " + bateria + "%");
    }

    public static void main(String[] args) {

        ClasseCelular c = new ClasseCelular();

        c.marca = "Samsung";
        c.modelo = "Galaxy S24";

        c.usarCelular();
        c.usarCelular();
        c.usarCelular();

        c.exibirBateria();

        c.carregar();

        c.exibirBateria();
    }
}
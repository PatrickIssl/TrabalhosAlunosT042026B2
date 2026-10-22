package celular;
public class Celular {
    String marca;
    String modelo;
    int bateria = 100;

    public void usarCelular() {
        bateria -= 10;
        if (bateria < 0) {
            bateria = 0;
        }
    }

    public void carregar() {
        bateria = 100;
    }

    public void exibirBateria() {
        System.out.println("Bateria atual: " + bateria + "%");
    }
}
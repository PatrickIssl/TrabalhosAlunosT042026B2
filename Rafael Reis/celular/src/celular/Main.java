package celular;
public class Main {
    public static void main(String[] args) {
        Celular cel = new Celular();
        cel.marca = "Samsung";
        cel.modelo = "Galaxy S22";

        cel.exibirBateria();
        cel.usarCelular();
        cel.usarCelular();
        cel.exibirBateria();

        cel.carregar();
        cel.exibirBateria();
    }
}
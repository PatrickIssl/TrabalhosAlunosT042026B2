import java.util.Scanner;

class Celular {
    String marca;
    String modelo;
    int bateria = 100;

    void usarCelular() {
        bateria = bateria - 10;

        if (bateria < 0) {
            bateria = 0;
        }

        System.out.println("Celular utilizado.");
    }

    void carregar() {
        bateria = 100;
        System.out.println("Celular carregado!");
    }

    void exibirBateria() {
        System.out.println("Bateria: " + bateria + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Celular celular = new Celular();

        System.out.print("Digite a marca: ");
        celular.marca = entrada.nextLine();

        System.out.print("Digite o modelo: ");
        celular.modelo = entrada.nextLine();

        celular.usarCelular();
        celular.usarCelular();
        celular.usarCelular();

        celular.exibirBateria();

        celular.carregar();

        celular.exibirBateria();

        entrada.close();
    }
}

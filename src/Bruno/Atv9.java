class Celular {
    String marca;
    String modelo;
    int bateria = 100;

    public void usarCelular() {
        if (bateria >= 10) {
            bateria = bateria - 10;
        } else {
            bateria = 0;
        }
    }

    public void carregar() {
        bateria = 100;
    }

    public void exibirBateria() {
        System.out.println(bateria + "%");
    }

    public static void main(String[] args) {
        Celular c = new Celular();
        c.marca = "samsung";
        c.modelo = "a54";

        System.out.println("marca: " + c.marca);
        System.out.println("modelo: " + c.modelo);

        System.out.print("bateria antes: ");
        c.exibirBateria();

        c.usarCelular();
        c.usarCelular();

        System.out.print("bateria apos uso: ");
        c.exibirBateria();

        c.carregar();

        System.out.print("bateria apos carregar: ");
        c.exibirBateria();
    }
}
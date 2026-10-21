public class AtividadeNove {

    public static void main(String[] args) {

        Celular celular = new Celular("Samsung", "Galaxy S20 FE");

        celular.usarCelular();
        celular.usarCelular();
        celular.usarCelular();

        celular.exibirBateria();

        celular.carregar();

        celular.exibirBateria();
    }
}
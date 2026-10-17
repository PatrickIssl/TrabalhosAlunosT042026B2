package atv9;

public class AtividadeNove {

	public static void main(String[] args) {
		Celular celular = new Celular("Samsung", "S24");
		
		celular.usarCelular();
		celular.usarCelular();
		celular.usarCelular();
		
		celular.exibirBateria();
		
		celular.carregar();
		
		celular.exibirBateria();
	}

}


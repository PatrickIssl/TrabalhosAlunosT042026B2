package Atividades;

public class AtividadeCelular {

	public static class Celular {
		String marca;
		String modelo;
		int bateria = 100;

		public Celular(String marca, String modelo) {
			this.marca = marca;
			this.modelo = modelo;
		}

		public void usarCelular() {
			if (bateria > 0) {
				bateria -= 10;
			} else {
				System.out.println("Nao tem bateria o suficiente para utiliza-lo");
			}
		}

		public void carregar() {
			bateria = 100;
			System.out.println("Celular Carregado");
		}

		public void exibirBateria() {
			System.out.println("Bateria: " + bateria + "%");
		}

	}

	public static void main(String[] args) {
		Celular c = new Celular("Samsung", "A06");

		c.usarCelular();
		c.usarCelular();
		c.usarCelular();

		c.exibirBateria();

		c.carregar();

		c.exibirBateria();
	}

}

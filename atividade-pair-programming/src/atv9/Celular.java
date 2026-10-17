package atv9;

public class Celular {
	private String marca;
	private String modelo;
	private int bateria;
	
	public Celular(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.bateria = 100;
	}
	
	public void usarCelular() {
		if (this.bateria >= 10) {
			this.bateria -= 10;
		} else {
			this.bateria = 0;
		}
	}
	
	public void carregar() {
		this.bateria = 100;
	}
	
	public void exibirBateria() {
		System.out.println("Bateria: " + this.bateria + "%");
	}
}



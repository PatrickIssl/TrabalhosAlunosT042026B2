package Atividades;

public class AtividadeRetangulo {

	public static class Retangulo {

		double largura;
		double altura;

		public Retangulo(double altura, double largura) {
			this.altura = altura;
			this.largura = largura;
		}

		public double calcularArea() {
			return largura * altura;
		}

		public double calcularPerimetro() {
			return 2 * (largura + altura);
		}

	}

	public static void main(String[] args) {

		Retangulo r = new Retangulo(6, 7);

		System.out.println("Area: " + r.calcularArea());
		System.out.println("Perimetro: " + r.calcularPerimetro());
	}

}

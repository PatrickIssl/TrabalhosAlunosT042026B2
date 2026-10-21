package atv8;

public class AtividadeOito {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(30, 50);
		System.out.println("Altura: " + retangulo.getAltura());
		System.out.println("Largura: " + retangulo.getLargura());
		
		System.out.println("Área: " + retangulo.calcularArea());
		System.out.println("Perimêtro: " + retangulo.calcularPerimetro());
	}
}

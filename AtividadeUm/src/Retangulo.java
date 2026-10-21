public class Retangulo {
    double largura;
    double altura;

    double calcularArea() {
        return largura * altura;
    }

    double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.largura = 5;
        retangulo.altura = 3;

        System.out.println("Largura: " + retangulo.largura);
        System.out.println("Altura: " + retangulo.altura);
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}
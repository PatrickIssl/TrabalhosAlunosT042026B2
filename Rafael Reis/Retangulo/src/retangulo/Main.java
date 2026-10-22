package retangulo;
public class Main {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        ret.largura = 5.0;
        ret.altura = 3.0;

        System.out.println("Área: " + ret.calcularArea());
        System.out.println("Perímetro: " + ret.calcularPerimetro());
    }
}
package retangulo;
public class Retangulo {
    double largura;
    double altura;

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}
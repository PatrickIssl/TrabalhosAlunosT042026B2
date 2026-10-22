class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

public class Atividade8 {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(5, 3);

        System.out.println("largura: 5");
        System.out.println("altura: 3");
        System.out.println("area: " + r.calcularArea());
        System.out.println("perimetro: " + r.calcularPerimetro());
    }
}

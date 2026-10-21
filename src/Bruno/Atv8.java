class Retangulo {
    double largura;
    double altura;

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        r.largura = 5.0;
        r.altura = 3.0;

        System.out.println("largura: " + r.largura);
        System.out.println("altura: " + r.altura);
        System.out.println("area: " + r.calcularArea());
        System.out.println("perimetro: " + r.calcularPerimetro());
    }
}
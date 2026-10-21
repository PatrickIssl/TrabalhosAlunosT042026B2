class Retangulo {
    double largura;
    double altura;

    double calcularArea() {
        return largura * altura;
    }

    double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

public class Atividade8 {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.largura = 6;
        retangulo.altura = 4;

        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}

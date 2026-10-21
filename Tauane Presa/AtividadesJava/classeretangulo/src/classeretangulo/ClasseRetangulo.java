package classeretangulo;

public class ClasseRetangulo {


    double largura;
    double altura;

    double calcularArea() {
        return largura * altura;
    }

    double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public static void main(String[] args) {

        ClasseRetangulo r = new ClasseRetangulo();

        r.largura = 5.0;
        r.altura = 3.0;

        System.out.println("Largura: " + r.largura);
        System.out.println("Altura: " + r.altura);
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro: " + r.calcularPerimetro());
    }
}
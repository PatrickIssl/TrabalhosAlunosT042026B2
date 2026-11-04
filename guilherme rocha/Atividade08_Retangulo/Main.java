import java.util.Scanner;

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

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.print("Digite a largura: ");
        retangulo.largura = entrada.nextDouble();

        System.out.print("Digite a altura: ");
        retangulo.altura = entrada.nextDouble();

        System.out.println("Area: " + retangulo.calcularArea());
        System.out.println("Perimetro: " +
                retangulo.calcularPerimetro());

        entrada.close();
    }
}

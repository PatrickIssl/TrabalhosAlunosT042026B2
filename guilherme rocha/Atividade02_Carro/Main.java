import java.util.Scanner;

class Carro {
    String marca;
    String modelo;
    int ano;

    void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Carro carro = new Carro();

        System.out.print("Digite a marca: ");
        carro.marca = entrada.nextLine();

        System.out.print("Digite o modelo: ");
        carro.modelo = entrada.nextLine();

        System.out.print("Digite o ano: ");
        carro.ano = entrada.nextInt();

        carro.exibirDados();

        entrada.close();
    }
}

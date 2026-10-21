import java.util.Scanner;

class Produto {
    String nome;
    double preco;
    int quantidade;

    double calcularTotal() {
        return preco * quantidade;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.print("Digite o nome do produto: ");
        produto.nome = entrada.nextLine();

        System.out.print("Digite o preco: ");
        produto.preco = entrada.nextDouble();

        System.out.print("Digite a quantidade: ");
        produto.quantidade = entrada.nextInt();

        System.out.printf("Valor total: R$ %.2f%n",
                produto.calcularTotal());

        entrada.close();
    }
}

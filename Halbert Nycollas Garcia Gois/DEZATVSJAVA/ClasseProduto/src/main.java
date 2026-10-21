import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto produto = new Produto();
        String nome;
        double preco;
        int quantidade;

        System.out.printf("\nEntre com o Nome do produto: ");
        nome = scan.nextLine();
        produto.setNome(nome);

        System.out.printf("\nEntre com o Preço do produto: ");
        preco = scan.nextDouble();

        produto.setPreco(preco);

        System.out.printf("\nEntre com a Quantidade do produto: ");
        quantidade = scan.nextInt();
        produto.setQuantidade(quantidade);

        produto.calcularTotal();

        scan.close();

    }
}

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto("Perfume", 22.13, 67);

        produto.exibirDados();

        System.out.println("Valor total da compra: R$ " + produto.calcularTotal());
    }
}
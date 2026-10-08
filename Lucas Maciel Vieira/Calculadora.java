import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double n2 = sc.nextDouble();

        System.out.print("Escolha uma opção de 1 aa 4: ");
        System.out.println("===== MENU =====");
        System.out.println("1 - Somar (+)");
        System.out.println("2 - Subtrair (-)");
        System.out.println("3 - Multiplicar (*)");
        System.out.println("4 - Dividir (/)");
        int opcao = sc.nextInt();

        double resultado = 0;
        boolean valido = true;

        if (opcao == 1) {
            resultado = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + resultado);
        }
        else if (opcao == 2) {
            resultado = n1 - n2;
            System.out.println(n1 + " - " + n2 + " = " + resultado);
        }
        else if (opcao == 3) {
            resultado = n1 * n2;
            System.out.println(n1 + " * " + n2 + " = " + resultado);
        }
        else if (opcao == 4) {
            if (n2 == 0) {
                System.out.println("Erro: não existe número divisível por zero.");
                valido = false;
            } else {
                resultado = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + resultado);
            }
        }
        else {
            System.out.println("Opcao invalida! Escolha entre 1 e 4.");
            valido = false;
        }

        if (valido) {
            System.out.println("Calculo realizado com sucesso.");
        }

        sc.close();
    }
}
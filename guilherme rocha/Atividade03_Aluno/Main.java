import java.util.Scanner;

class Aluno {
    String nome;
    int idade;
    double nota;

    String verificarSituacao() {
        if (nota >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome: ");
        aluno.nome = entrada.nextLine();

        System.out.print("Digite a idade: ");
        aluno.idade = entrada.nextInt();

        System.out.print("Digite a nota: ");
        aluno.nota = entrada.nextDouble();

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Nota: " + aluno.nota);
        System.out.println("Situacao: " + aluno.verificarSituacao());

        entrada.close();
    }
}

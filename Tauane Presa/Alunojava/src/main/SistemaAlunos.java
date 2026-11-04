package main;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAlunos {

	private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int  proximoId = 1;

    public static void main(String[] args) {
        System.out.println("Olá! Bem-vindo ao Sistema de Cadastro de Alunos.");
        System.out.println("Aqui você pode gerenciar os alunos de forma simples e prática.\n");

        int opcao;

        do {
            exibirMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    buscarPorId();
                    break;
                case 4:
                    atualizarAluno();
                    break;
                case 5:
                    excluirAluno();
                    break;
                case 0:
                    System.out.println("\nObrigado por usar o sistema! Até a próxima.");
                    break;
                default:
                    System.out.println("\nOps! Essa opção não existe. Por favor, escolha um número de 0 a 5.");
            }

            if (opcao != 0) {
                System.out.println("\nPressione ENTER para voltar ao menu...");
                scanner.nextLine();
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n SISTEMA DE GERENCIAMENTO");
        System.out.println("1 - Cadastrar um novo aluno");
        System.out.println("2 - Ver todos os alunos");
        System.out.println("3 - Buscar aluno por ID");
        System.out.println("4 - Atualizar dados de um aluno");
        System.out.println("5 - Excluir um aluno");
        System.out.println("0 - Sair do sistema");
        System.out.print("O que você gostaria de fazer? ");
    }

    private static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void cadastrarAluno() {
        System.out.println("\n Vamos cadastrar um novo aluno ");

        System.out.print("Qual o nome do aluno? ");
        String nome = scanner.nextLine().trim();

        if (nome.isEmpty()) {
            System.out.println("O nome não pode ficar em branco. Cadastro cancelado.");
            return;
        }

        System.out.print("E qual a nota dele(a)? ");
        String notaStr = scanner.nextLine().trim().replace(",", ".");

        double nota;
        try {
            nota = Double.parseDouble(notaStr);
        } catch (NumberFormatException e) {
            System.out.println("Essa nota não parece válida. Cadastro cancelado.");
            return;
        }

        Aluno novoAluno = new Aluno(proximoId, nome, nota);
        alunos.add(novoAluno);
        proximoId++;

        System.out.println("\nPronto! O aluno \"" + nome + "\" foi cadastrado com sucesso.");
        System.out.println("O ID gerado para ele(a) foi: " + novoAluno.getId());
    }

    private static void listarAlunos() {
        System.out.println("\n Lista de todos os alunos");

        if (alunos.isEmpty()) {
            System.out.println("Ainda não tem nenhum aluno cadastrado.");
            return;
        }

        System.out.println("Aqui estão os " + alunos.size() + " aluno(s) cadastrado(s):\n");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    private static void buscarPorId() {
        System.out.println("\n Buscar aluno pelo ID ");

        if (alunos.isEmpty()) {
            System.out.println("Ainda não tem nenhum aluno cadastrado.");
            return;
        }

        System.out.print("Digite o ID do aluno que você procura: ");
        int id = lerId();

        if (id == -1) {
            System.out.println("ID inválido. Tente novamente.");
            return;
        }

        Aluno encontrado = encontrarPorId(id);

        if (encontrado != null) {
            System.out.println("\nEncontrei! Aqui estão os dados:");
            System.out.println(encontrado);
        } else {
            System.out.println("\nNão encontrei nenhum aluno com o ID " + id + ".");
        }
    }

    private static void atualizarAluno() {
        System.out.println("\n Atualizar dados de um aluno ");

        if (alunos.isEmpty()) {
            System.out.println("Ainda não tem nenhum aluno cadastrado.");
            return;
        }

        System.out.print("Digite o ID do aluno que deseja atualizar: ");
        int id = lerId();

        if (id == -1) {
            System.out.println("ID inválido. Tente novamente.");
            return;
        }

        Aluno aluno = encontrarPorId(id);

        if (aluno == null) {
            System.out.println("Não encontrei nenhum aluno com o ID " + id + ".");
            return;
        }

        System.out.println("\nAluno encontrado:");
        System.out.println(aluno);
        System.out.println("\nVocê pode alterar o nome e/ou a nota.");
        System.out.println("(Se quiser manter o valor atual, basta apertar ENTER)");

        System.out.print("Novo nome: ");
        String novoNome = scanner.nextLine().trim();
        if (!novoNome.isEmpty()) {
            aluno.setNome(novoNome);
        }

        System.out.print("Nova nota: ");
        String notaStr = scanner.nextLine().trim();

        if (!notaStr.isEmpty()) {
            try {
                double novaNota = Double.parseDouble(notaStr.replace(",", "."));
                aluno.setNota(novaNota);
            } catch (NumberFormatException e) {
                System.out.println("Nota inválida. Mantive a nota antiga.");
            }
        }

        System.out.println("\nTudo certo! Dados atualizados:");
        System.out.println(aluno);
    }

    private static void excluirAluno() {
        System.out.println("\n Excluir um aluno ");

        if (alunos.isEmpty()) {
            System.out.println("Ainda não tem nenhum aluno cadastrado.");
            return;
        }

        System.out.print("Digite o ID do aluno que deseja excluir: ");
        int id = lerId();

        if (id == -1) {
            System.out.println("ID inválido. Tente novamente.");
            return;
        }

        Aluno aluno = encontrarPorId(id);

        if (aluno == null) {
            System.out.println("Não encontrei nenhum aluno com o ID " + id + ".");
            return;
        }

        System.out.println("\nVocê está prestes a excluir este aluno:");
        System.out.println(aluno);
        System.out.print("Tem certeza? (S/N): ");
        String confirmacao = scanner.nextLine().trim().toUpperCase();

        if (confirmacao.equals("S") || confirmacao.equals("SIM")) {
            alunos.remove(aluno);
            System.out.println("Aluno excluído com sucesso.");
        } else {
            System.out.println("Exclusão cancelada. O aluno continua cadastrado.");
        }
    }

     private static int lerId() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static Aluno encontrarPorId(int id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        return null;
    }
}
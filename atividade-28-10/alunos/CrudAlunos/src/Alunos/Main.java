package Alunos;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Alunos1> listaAlunos = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

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
                    System.out.println("\nSistema encerrado com sucesso. Até logo!");
                    break;
                default:
                    System.out.println("\n[ERRO] Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("========== SISTEMA DE GERENCIAMENTO ==========");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar todos");
        System.out.println("3 - Buscar por ID");
        System.out.println("4 - Atualizar");
        System.out.println("5 - Excluir");
        System.out.println("0 - Sair");
        System.out.println("==============================================");
    }

    // 1. CADASTRAR
    private static void cadastrarAluno() {
        System.out.println("\n--- Cadastrar Aluno ---");

        int id;
        while (true) {
            id = lerInteiro("Digite o ID (Matrícula): ");
            if (buscarObjetoPorId(id) != null) {
                System.out.println("[ERRO] Já existe um aluno cadastrado com esse ID! Tente outro.");
            } else if (id <= 0) {
                System.out.println("[ERRO] O ID deve ser um número maior que zero.");
            } else {
                break;
            }
        }

        System.out.print("Digite o Nome do aluno: ");
        String nome = scanner.nextLine().trim();
        while (nome.isEmpty()) {
            System.out.print("[ERRO] O nome não pode ser vazio. Digite o Nome: ");
            nome = scanner.nextLine().trim();
        }

        double nota = lerNota("Digite a Nota do aluno (0.0 a 10.0): ");

        Alunos1 novoAluno = new Alunos1(id, nome, nota);
        listaAlunos.add(novoAluno);

        System.out.println("-> Aluno cadastrado com sucesso!");
    }

  
    private static void listarAlunos() {
        System.out.println("\n--- Lista de Alunos ---");
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum registro cadastrado no sistema.");
            return;
        }

        for (Alunos1 a : listaAlunos) {
            System.out.println(a);
        }
    }

    
    private static void buscarPorId() {
        System.out.println("\n--- Buscar Aluno por ID ---");
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum registro cadastrado no sistema.");
            return;
        }

        int id = lerInteiro("Digite o ID do aluno desejado: ");
        Alunos1 a = buscarObjetoPorId(id);

        if (a != null) {
            System.out.println("Aluno encontrado:");
            System.out.println(a);
        } else {
            System.out.println("[ALERTA] Nenhum aluno encontrado com o ID " + id);
        }
    }

    
    private static void atualizarAluno() {
        System.out.println("\n--- Atualizar Aluno ---");
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum registro cadastrado para atualizar.");
            return;
        }

        int id = lerInteiro("Digite o ID do aluno que deseja atualizar: ");
        Alunos1 a = buscarObjetoPorId(id);

        if (a != null) {
            System.out.println("Dados atuais: " + a);

            System.out.print("Digite o novo Nome: ");
            String novoNome = scanner.nextLine().trim();
            while (novoNome.isEmpty()) {
                System.out.print("[ERRO] O nome não pode ser vazio. Digite o novo Nome: ");
                novoNome = scanner.nextLine().trim();
            }

            double novaNota = lerNota("Digite a nova Nota (0.0 a 10.0): ");

            a.setNome(novoNome);
            a.setNota(novaNota);

            System.out.println("-> Aluno atualizado com sucesso!");
        } else {
            System.out.println("[ALERTA] Nenhum aluno encontrado com o ID " + id);
        }
    }

    private static void excluirAluno() {
        System.out.println("\n--- Excluir Aluno ---");
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum registro cadastrado para excluir.");
            return;
        }

        int id = lerInteiro("Digite o ID do aluno a ser excluído: ");
        Alunos1 a = buscarObjetoPorId(id);

        if (a != null) {
            listaAlunos.remove(a);
            System.out.println("-> Aluno com ID " + id + " foi removido com sucesso!");
        } else {
            System.out.println("[ALERTA] Nenhum aluno encontrado com o ID " + id);
        }
    }

    private static Alunos1 buscarObjetoPorId(int id) {
        for (Alunos1 a : listaAlunos) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("[ERRO] Por favor, digite um número inteiro válido.");
            }
        }
    }

    private static double lerNota(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                double valor = Double.parseDouble(scanner.nextLine().trim().replace(",", "."));
                if (valor < 0.0 || valor > 10.0) {
                    System.out.println("[ERRO] A nota deve estar entre 0.0 e 10.0.");
                    continue;
                }
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("[ERRO] Por favor, digite um valor numérico válido (ex: 8.5).");
            }
        }
    }
}
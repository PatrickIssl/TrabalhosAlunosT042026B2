import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Jogo> jogos = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static int contadorId = 1;

	public static void main(String[] args) {
		int opcao = -1;

		while (opcao != 0) {

			System.out.println("=== Sistema de Gerenciamento ===");
			System.out.println();
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar todos");
			System.out.println("3 - Buscar por ID");
			System.out.println("4 - Atualizar");
			System.out.println("5 - Excluir");
			System.out.println("0 - Sair");
			System.out.println();

			System.out.print("Escolha uma opção: ");

			opcao = sc.nextInt();
			sc.nextLine();

			if (opcao == 1) {
				cadastrar();
			} else if (opcao == 2) {
				listar();
			} else if (opcao == 3) {
				buscar();
			} else if (opcao == 4) {
				atualizar();
			} else if (opcao == 5) {
				excluir();
			} else if (opcao == 0) {
				System.out.println("Saindo...");
			} else {
				System.out.println("Opção inválida!");
			}

			System.out.println();
		}
	}

	public static void cadastrar() {

		System.out.print("Nome do jogo: ");
		String nome = sc.nextLine();

		System.out.print("Gênero: ");
		String genero = sc.nextLine();

		Jogo j = new Jogo(contadorId, nome, genero);

		jogos.add(j);

		contadorId++;

		System.out.println("Jogo cadastrado!");
	}

	public static void listar() {

		if (jogos.size() == 0) {
			System.out.println("Nenhum jogo cadastrado.");
		} else {
			for (Jogo j : jogos) {
				System.out.println("ID: " + j.getId() + " | Nome: " + j.getNome() + " | Gênero: " + j.getGenero());
			}
		}
	}

	public static void buscar() {

		System.out.print("Digite o ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		boolean achou = false;

		for (Jogo j : jogos) {
			if (j.getId() == id) {
				System.out.println("ID: " + j.getId() + " | Nome: " + j.getNome() + " | Gênero: " + j.getGenero());
				achou = true;
			}
		}

		if (achou == false) {
			System.out.println("ID não encontrado.");
		}
	}

	public static void atualizar() {

		System.out.print("Digite o ID do jogo: ");
		int id = sc.nextInt();
		sc.nextLine();

		boolean achou = false;

		for (Jogo j : jogos) {
			if (j.getId() == id) {
				System.out.print("Novo nome: ");
				j.setNome(sc.nextLine());

				System.out.print("Novo gênero: ");
				j.setGenero(sc.nextLine());

				System.out.println("Jogo atualizado!");
				achou = true;
			}
		}

		if (achou == false) {
			System.out.println("ID não encontrado.");
		}
	}

	public static void excluir() {

		System.out.print("Digite o ID do jogo: ");
		int id = sc.nextInt();
		sc.nextLine();

		boolean achou = false;

		for (int i = 0; i < jogos.size(); i++) {
			if (jogos.get(i).getId() == id) {
				jogos.remove(i);
				System.out.println("Jogo excluído!");
				achou = true;
				break;
			}
		}

		if (achou == false) {
			System.out.println("ID não encontrado.");
		}
	}
}

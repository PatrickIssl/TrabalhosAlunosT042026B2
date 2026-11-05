import java.util.ArrayList;
import java.util.Scanner;

import objetos.Produto;

public class Principal {
	static ArrayList<Produto> produtos = new ArrayList<>();
	static Scanner sc = new Scanner (System.in);
	static int proximoId = 1;


	public static void main(String[] args) {
		int opcao;

		do  {
			System.out.println("\n============= SISTEMA DE GERENCIAMENTO =============");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar todos");
			System.out.println("3 - Buscar por ID");
			System.out.println("4 - Atualizar");
			System.out.println("5 - Excluir");
			System.out.println("0 - Sair");
			System.out.println("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				cadastrar();
				break;
			case 2:
				listar();
				break;
			case 3:
				buscarPorId();
				break;
			case 4:
				atualizar();
				break;
			case 5:
				excluir();
				break;
			case 0:
				System.out.println("Sistema encerrado.");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (opcao != 0);
	}

	private static void listar() {
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			return;
		}

		for(Produto produto:produtos) {
			produto.exibir();
			System.out.println("-------------------");
		}

	}

	private static void cadastrar() {
		Produto produto = new Produto();
		produto.setId(proximoId++);

		System.out.println("Nome: ");
		String nome = sc.nextLine();
		produto.setNome(nome);

		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		sc.nextLine();
		produto.setPreco(preco);

		produtos.add(produto);
		System.out.println("Produto adicionado com sucesso!");

	}

	private static Produto buscar(int id) {
		for(Produto produto:produtos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}

	private static void buscarPorId() {
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			return;
		}

		System.out.println("Digite o ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		Produto produto = buscar(id);

		if (produto == null) {
			System.out.println("ID não encontrado!");
		} else {
			produto.exibir();
		}
	}

	private static void atualizar() {
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			return;
		}

		System.out.println("Digite o ID do produto que deseja atualizar: ");
		int id = sc.nextInt();
		sc.nextLine();

		Produto produto = buscar(id);

		if (produto == null) {
			System.out.println("ID não encontrado!");
			return;
		}

		System.out.println("Novo nome: ");
		String nome = sc.nextLine();
		produto.setNome(nome);

		System.out.println("Novo preço: ");
		double preco = sc.nextDouble();
		sc.nextLine();
		produto.setPreco(preco);

		System.out.println("Produto atualizado com sucesso!");
	}

	private static void excluir() {
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			return;
		}

		System.out.println("Digite o ID do produto que deseja excluir: ");
		int id = sc.nextInt();
		sc.nextLine();

		Produto produto = buscar(id);

		if (produto == null) {
			System.out.println("ID não encontrado!");
			return;
		}

		produtos.remove(produto);
		System.out.println("Produto excluído com sucesso!");
	}

}
package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fag.objetos.Livro;
import fag.objetos.Pessoa;

public class Principal {

	static Scanner scan = new Scanner(System.in);
	static List<Pessoa> leitores = new ArrayList<Pessoa>();
	static List<Livro> livros = new ArrayList<Livro>(); 
    static String VERDE = "\u001B[32m";
    static String VERMELHO = "\u001B[31m";
    static String RESET = "\u001B[0m";

	
	public static void main(String[] args) {
		preencherListas();
		mostrarMenu();
	}
	
	private static void preencherListas() {
		leitores.add(new Pessoa("Ana", "111.111.111-11"));
		leitores.add(new Pessoa("Bruno", "222.222.222-22"));
		leitores.add(new Pessoa("Carla", "333.333.333-33"));
		leitores.add(new Pessoa("Diego", "444.444.444-44"));
		leitores.add(new Pessoa("Eva", "555.555.555-55"));
		livros.add(new Livro(1, "Machado de Assis", "Dom Casmurro", 256, "Editora Garnier", 1899));
		livros.add(new Livro(2, "J. K. Rowling", "Harry Potter e a Pedra Filosofal", 264, "Rocco", 1997));
		livros.add(new Livro(3, "George Orwell", "1984", 328, "Companhia das Letras", 1949));
		livros.add(new Livro(4, "J. R. R. Tolkien", "O Senhor dos Anéis", 576, "HarperCollins", 1954));
		livros.add(new Livro(5, "José de Alencar", "O Guarani", 320, "Martin Claret", 1857));
		livros.add(new Livro(6, "Clarice Lispector", "A Hora da Estrela", 88, "Rocco", 1977));
		livros.add(new Livro(7, "Jorge Amado", "Capitães da Areia", 280, "Companhia das Letras", 1937));
		livros.add(new Livro(8, "Antoine de Saint-Exupéry", "O Pequeno Príncipe", 96, "Agir", 1943));
		livros.add(new Livro(9, "Paulo Coelho", "O Alquimista", 208, "Paralela", 1988));
		livros.add(new Livro(10, "Stephen King", "It: A Coisa", 1104, "Suma", 1986));
		livros.add(new Livro(11, "Mary Shelley", "Frankenstein", 280, "Penguin Classics", 1818));
		livros.add(new Livro(12, "Jane Austen", "Orgulho e Preconceito", 424, "Martin Claret", 1813));
		livros.add(new Livro(13, "Gabriel García Márquez", "Cem Anos de Solidão", 448, "Record", 1967));
		livros.add(new Livro(14, "Fiódor Dostoiévski", "Crime e Castigo", 592, "Editora 34", 1866));
		livros.add(new Livro(15, "Victor Hugo", "Os Miseráveis", 1511, "Martin Claret", 1862));
		livros.add(new Livro(16, "Arthur Conan Doyle", "Sherlock Holmes: Um Estudo em Vermelho", 176, "Zahar", 1887));
		livros.add(new Livro(17, "Agatha Christie", "Assassinato no Expresso do Oriente", 240, "HarperCollins", 1934));
		livros.add(new Livro(18, "Monteiro Lobato", "O Sítio do Picapau Amarelo", 192, "Globo", 1920));
		livros.add(new Livro(19, "Graciliano Ramos", "Vidas Secas", 176, "Record", 1938));
		livros.add(new Livro(20, "Cecília Meireles", "Romanceiro da Inconfidência", 240, "Global", 1953));
		livros.add(new Livro(21, "Dan Brown", "O Código Da Vinci", 432, "Arqueiro", 2003));
		livros.add(new Livro(22, "Suzanne Collins", "Jogos Vorazes", 400, "Rocco", 2008));
		livros.add(new Livro(23, "Markus Zusak", "A Menina que Roubava Livros", 480, "Intrínseca", 2005));
		livros.add(new Livro(24, "Rick Riordan", "Percy Jackson e o Ladrão de Raios", 400, "Intrínseca", 2005));
		livros.add(new Livro(25, "George R. R. Martin", "A Guerra dos Tronos", 592, "Suma", 1996));
		livros.add(new Livro(26, "Victor Martins", "Quinze Dias", 280, "Alt", 2017));
		livros.add(new Livro(27, "Carolina Maria de Jesus", "Quarto de Despejo", 200, "Ática", 1960));
		livros.add(new Livro(28, "Aluísio Azevedo", "O Cortiço", 256, "Martin Claret", 1890));
		livros.add(new Livro(29, "Eça de Queirós", "O Primo Basílio", 416, "Martin Claret", 1878));
		livros.add(new Livro(30, "Lima Barreto", "Triste Fim de Policarpo Quaresma", 256, "Companhia das Letras", 1915));
		
	}

	public static void mostrarMenu() {
		int escolha =0;
		do {
			System.out.println("\n-------------- Biblioteca --------------");
			System.out.println("1 - Listar Livros");
			System.out.println("2 - Cadastrar Livro");
			System.out.println("3 - Emprestar Livro");
			System.out.println("4 - Devolver Livro");
			System.out.println("5 - Listar Leitores");
			System.out.println("6 - Cadastrar Leitor");
			System.out.println("0 - Sair");
			escolha = scan.nextInt();
			scan.nextLine();
			validarEscolha(escolha);
		} while (escolha != 0);
	}
	
	public static void validarEscolha(int escolha) {
		switch (escolha) {
		case 1 :{
			listarLivros();
			break;
		}
		case 2 :{
			cadastrarLivro();
			break;
		}
		case 3 :{
			emprestarLivro();
			break;
		}	
		case 4 :{
			devolverLivro();
			break;
		}
		case 5: {
			listarLeitores();
			break;
		}
		case 6: {
			cadastrarLeitor();
			break;
		}
		case 0:{
			System.out.println("Obrigado por utilizar o sistema!");
			break;
		}
		default:
			System.out.println("\n\nSelecione uma opção valida!");
		}
	}
	
	private static void devolverLivro() {
		listarLeitores();
		System.out.println("Informe o leitor desejado: ");
		int leitorEscolhido = scan.nextInt() -1;
		if(leitores.size() < leitorEscolhido) {
			System.out.println("Valor Inválido!");
			return;	
		}
		if(leitores.get(leitorEscolhido).getLivrosEmprestados().size() == 0) {
			System.out.println("O leitor escolhido não tem livros emprestados!");
			return;
		}
		for (int i = 0; i < leitores.get(leitorEscolhido).getLivrosEmprestados().size() ; i++) {
			System.out.printf("\n%d) %s - %s", i+1,leitores.get(leitorEscolhido).getLivrosEmprestados().get(i).getTitulo(), leitores.get(leitorEscolhido).getLivrosEmprestados().get(i).getAutor());
		}
		System.out.println("Informe o livro que deseja devolver: ");
		int livroEscolhido = scan.nextInt() -1;
		if(livroEscolhido > leitores.get(leitorEscolhido).getLivrosEmprestados().size()) {
			System.out.println("Informe um livro valido!");
			return;
		}
		for (Livro livro : livros) {
			if(livro.getId() == leitores.get(leitorEscolhido).getLivrosEmprestados().get(livroEscolhido).getId()) {
				livro.setEmprestado(false);
			}
		}
		leitores.get(leitorEscolhido).getLivrosEmprestados().remove(livroEscolhido);
		
		
		
		
	}

	private static void emprestarLivro() {
		listarLivros();
		System.out.println("Informe o livro que deseja emprestar: ");
		int livroEscolhido = scan.nextInt() -1;
		scan.nextLine();
		if(livros.size() < livroEscolhido) {
			System.out.println("Valor Inválido!");
			return;	
		}
		if(livros.get(livroEscolhido).isEmprestado()) {
			System.out.println("Livro Indisponivel!");
			return;
		}

		listarLeitores();
		System.out.println("Informe o leitor desejado: ");
		int leitorEscolhido = scan.nextInt() -1;
		if(leitores.size() < leitorEscolhido) {
			System.out.println("Valor Inválido!");
			return;	
		}
		if(leitores.get(leitorEscolhido).getLivrosEmprestados().size() >= 2) {
			System.out.println("Limite de livros emprestados atingido!");
			for (Livro livro: leitores.get(leitorEscolhido).getLivrosEmprestados()) {
				System.out.printf("\n %s - %s", livro.getTitulo(), livro.getAutor());
			}
			return;
		}
		livros.get(livroEscolhido).setEmprestado(true);
		leitores.get(leitorEscolhido).getLivrosEmprestados().add(livros.get(livroEscolhido));
		System.out.println("Livro emprestado com sucesso!");
		
	}

	private static void listarLivros() {
		System.out.println("\n-------------- Lista de livros --------------");
		for (int i = 0; i < livros.size(); i++) {
			String disponibilidade = VERDE+"Disponivel"+RESET;
			if(livros.get(i).isEmprestado()) {
				disponibilidade = VERMELHO+"Indisponivel"+RESET;
			}
			System.out.printf("\n %d) %s - %s / %s", i+1, livros.get(i).getTitulo(), livros.get(i).getAutor(), disponibilidade);
		}
		System.out.println();
	}

	private static void cadastrarLivro() {
		Livro livro = new Livro();
		livro.setId(livros.size() + 1);
		System.out.println("Informe o titulo do livro: ");
		livro.setTitulo(scan.nextLine());
		System.out.println("Informe o autor do livro: ");
		livro.setAutor(scan.nextLine());
		System.out.println("Informe a quantidade de paginas: ");
		livro.setPaginas(scan.nextInt());
		scan.nextLine();
		System.out.println("Informe a editora do livro: ");
		livro.setEditora(scan.nextLine());
		System.out.println("Informe o ano de publicação: ");
		livro.setAnoPublicacao(scan.nextInt());
		scan.nextLine();
		livros.add(livro);
	}

	private static void listarLeitores() {
		System.out.println("\n-------------- Lista de leitores --------------");
		for (int i = 0; i < leitores.size(); i++) {
			System.out.printf("\n %d) %s", i+1, leitores.get(i).getNome());
		}
		System.out.println();
	}

	public static void cadastrarLeitor() {
		Pessoa leitor = new Pessoa();
		System.out.println("Informe o nome do leitor: ");
		leitor.setNome(scan.nextLine());
		System.out.println("Informe o seu CPF: ");
		leitor.setCpf(scan.nextLine());
		if(validarLeitor(leitor)) {
			leitores.add(leitor);
			System.out.println("Leitor adicionado com sucesso!");
		}else {
			System.out.println("Leitor ja cadastrado!");
		}
			
	}
	
	public static boolean validarLeitor(Pessoa leitor) {
		for (Pessoa pessoa : leitores) {
			if(pessoa.getCpf().equals(leitor.getCpf())) {
				return false;
			}
		}
		return true;
	}

}

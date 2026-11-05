package principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Objetos.Jogo;

public class Principal {
	
	static Scanner scan = new Scanner(System.in);
	static List<Jogo> gamel = new ArrayList<Jogo>();
	
	public static void main(String[] args) {
		int opcao = 0;
		do {
			System.out.println("SEJA BEM VINDO");
			System.out.println("LUP GAME");
			System.out.println("Selecione a opção desejada: ");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar todos");
			System.out.println("3 - Buscar por ID");
			System.out.println("4 - Atualizar");
			System.out.println("5 - Excluir");
			System.out.println("0 - Sair\n");
			opcao = scan.nextInt();
			scan.nextLine();
			
		if (opcao==1) {
				Cadastrar();
			}  if (opcao==2) {
				ListarTodos();
		}  if (opcao==3) {
				BuscarID();
			}  if (opcao==4) {
				Atualizar();
		}  if (opcao==5) {
				Excluir();
		
		}  if (opcao==0) {
				
				Sair();
	}
			
			
			
		} while (opcao!=0);

	}
	
	public static void Cadastrar(){
		Jogo jogo = new Jogo();
		System.out.println("Insira o nome do jogo: ");
		jogo.setNome(scan.nextLine());
		System.out.println("Insira o genero do jogo: ");
		jogo.setGenero(scan.nextLine());
		jogo.setId(gamel.size()+1);
		gamel.add(jogo);
		
	}
	
	public static void ListarTodos(){
		for (Jogo jogo : gamel) {
			System.out.println("ID: " + jogo.getId());
	        System.out.println("Nome: " + jogo.getNome());
	        System.out.println("Gênero: " + jogo.getGenero());
	        System.out.println("\n\n");
		}
		
	}
	public static void BuscarID(){
		System.out.println("colque o id do jogo: ");	
		int busca = scan.nextInt();
		scan.nextLine();
		boolean encontrado = false;
		for (Jogo jogo : gamel) {
			if (jogo.getId() == busca) {
				System.out.println("Jogo encontrado!");
				System.out.println("ID: " + jogo.getId());
		        System.out.println("Nome: " + jogo.getNome());
		        System.out.println("Gênero: " + jogo.getGenero());
		        System.out.println("\n\n");	
		        encontrado = true;
		        break;
			}
			if (!encontrado) {
				System.out.println("O ID "+busca+" não foi encontrado,");
				return;
			}
		}
	}
	public static void Atualizar(){
		System.out.println("coloque o ID do jogo:");
		int busca = scan.nextInt();
		scan.nextLine();
		Jogo encontrado = null;
		for (Jogo jogo : gamel) {
			if (jogo.getId() == busca) {
				encontrado = jogo;
				break;
			}
		}			
			if (encontrado==null) {
				System.out.println("ID "+busca+" não foi encontrado,");
return;
			} else {
				System.out.println("Jogo encontrado!");
				System.out.println("ID: " +encontrado.getId());
				System.out.println("Nome: "+encontrado.getNome());
				System.out.println("Gênero: "+encontrado.getGenero());
				System.out.println("\n\n");
			}		
				System.out.println("Insira o novo nome do Jogo:");
				encontrado.setNome(scan.nextLine());
				System.out.println("Insira o novo genero do Jogo:");
				encontrado.setGenero(scan.nextLine());
				System.out.println("\nJogo atualizado com sucesso!");
	            System.out.println("\n\n");											
		}
	
	public static void Excluir(){
		System.out.println("Insira o ID do jogo:");
		int busca = scan.nextInt();
		scan.nextLine();
		Jogo excluido = null;
		for (Jogo  jogo : gamel) {
			if (jogo.getId()==busca){
				excluido = jogo;
				break;
			}	
		}
		
		if (excluido==null) {
			System.out.println("ID "+busca+" não encontrado");
			System.out.println("Jogo não foi localizado, tente novamente!\n");
			return;
		}
				System.out.println("Jogo encontrado!");
				System.out.println("ID: " +excluido.getId());
				System.out.println("Nome: "+excluido.getNome());
				System.out.println("Gênero: "+excluido.getGenero());
				System.out.println("\n\n");			
				gamel.remove(excluido);
				System.out.println("jogo excluido!");
					return;
						
	}
	public static void Sair(){
		System.out.println("GET OUT! ");
	}
}

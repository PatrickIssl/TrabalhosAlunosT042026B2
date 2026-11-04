package principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Objetos.Jogo;

public class Principal {
	
	static Scanner scan = new Scanner(System.in);
	static List<Jogo> listaJogos = new ArrayList<Jogo>();
	
	public static void main(String[] args) {
		int op = 0;
		do {
			System.out.println("-----------Bem vindo ao-----------");
			System.out.println("=============STEAM FAG============");
			System.out.println("Selecione a opção desejada: ");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar todos");
			System.out.println("3 - Buscar por ID");
			System.out.println("4 - Atualizar");
			System.out.println("5 - Excluir");
			System.out.println("0 - Sair\n");
			op = scan.nextInt();
			scan.nextLine();
			
			if (op==1) {
				Cadastrar();
			} else if (op==2) {
				ListarTodos();
			} else if (op==3) {
				BuscarID();
			} else if (op==4) {
				Atualizar();
			} else if (op==5) {
				Excluir();
			} else if (op==0) {
				Sair();
			}
			
			
			
		} while (op!=0);

	}
	
	public static void Cadastrar(){
		Jogo jogo = new Jogo();
		System.out.println("Insira o nome do jogo: ");
		jogo.setNome(scan.nextLine());
		System.out.println("Insira o genero do jogo: ");
		jogo.setGenero(scan.nextLine());
		jogo.setId(listaJogos.size()+1);
		listaJogos.add(jogo);
			
		
	}
	
	public static void ListarTodos(){
		for (Jogo jogo : listaJogos) {
			System.out.println("ID: " + jogo.getId());
	        System.out.println("Nome: " + jogo.getNome());
	        System.out.println("Gênero: " + jogo.getGenero());
	        System.out.println("---------------------------");
		}
		
	}
	public static void BuscarID(){
		System.out.println("Insira o ID do jogo: ");	
		int IDB = scan.nextInt();
		scan.nextLine();
		boolean achei = false;
		for (Jogo jogo : listaJogos) {
			if (jogo.getId() == IDB) {
				System.out.println("Jogo encontrado!");
				System.out.println("ID: " + jogo.getId());
		        System.out.println("Nome: " + jogo.getNome());
		        System.out.println("Gênero: " + jogo.getGenero());
		        System.out.println("---------------------------");	
		        achei = true;
		        break;
			}
			if (!achei) {
				System.out.println("O jogo de ID "+IDB+" não foi encontrado, lamentamos");
				System.out.println("Tente novamente\n");
			}
		}
	}
	public static void Atualizar(){
		System.out.println("Insira o ID do jogo:");
		int IDB = scan.nextInt();
		scan.nextLine();
		Jogo achei = null;
		for (Jogo jogo : listaJogos) {
			if (jogo.getId() == IDB) {
				achei = jogo;
				break;
			}
		}
			
			if (achei==null) {
				System.out.println("O jogo de ID "+IDB+" não foi encontrado, lamentamos");
				System.out.println("Tente novamente\n");
				System.out.println("---------------------------");
				return;
			} else {
				System.out.println("Jogo encontrado!");
				System.out.println("ID: " +achei.getId());
				System.out.println("Nome: "+achei.getNome());
				System.out.println("Gênero: "+achei.getGenero());
				System.out.println("---------------------------\n\n");
			}
			System.out.println("Tem certeza que quer atualizar esse titulo?");
			System.out.println("1- Sim");
			System.out.println("2- Não");
			int esc = scan.nextInt();
			scan.nextLine();
			
			
			
			if (esc==1){
				System.out.println("Insira o novo nome do Jogo:");
				achei.setNome(scan.nextLine());
				System.out.println("Insira o novo genero do Jogo:");
				achei.setGenero(scan.nextLine());
				System.out.println("\nJogo atualizado com sucesso!");
	            System.out.println("---------------------------");
			} else { 
				System.out.println("Atualização Interrompida!");
				return;
			}
				
			
							
		}
	
	public static void Excluir(){
		System.out.println("Insira o ID do jogo:");
		int IDB = scan.nextInt();
		scan.nextLine();
		Jogo jogoExc = null;
		for (Jogo  jogo : listaJogos) {
			if (jogo.getId()==IDB){
				jogoExc = jogo;
				break;
			}	
		}
		
		if (jogoExc==null) {
			System.out.println("ID "+IDB+" não encontrado");
			System.out.println("Jogo não foi localizado, tente novamente!\n");
			return;
		}
				System.out.println("Jogo encontrado!");
				System.out.println("ID: " +jogoExc.getId());
				System.out.println("Nome: "+jogoExc.getNome());
				System.out.println("Gênero: "+jogoExc.getGenero());
				System.out.println("---------------------------\n\n");
				
				System.out.println("Realmente deseja excluir?");
				System.out.println("---------------");
				System.out.println("1- Sim");
				System.out.println("2- Não");
				System.out.println("---------------");
				int exc = scan.nextInt();
				scan.nextLine();
				if (exc==1) {
					listaJogos.remove(jogoExc);
				
				} else {
					System.out.println("Exclusão cancelada.");
					return;
				}
			
	}
	
	
	public static void Sair(){
		System.out.println("Obrigado por usar a STEAM FAG ");
		System.out.println("Até mais!");
		

	}
}

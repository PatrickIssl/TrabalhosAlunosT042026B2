package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import objetos.Aluno;

public class Principal {
	static Scanner scan = new Scanner(System.in);
	static List<Aluno> alunos = new ArrayList<Aluno>(); 
	static int proximoId = 1;

	public static void main(String[] args) {
		mostrarMenu();
	}
	
	public static void mostrarMenu() {
		int op = 0;
		do{
			System.out.println("========== SISTEMA DE ALUNOS ==========");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar todos");
			System.out.println("3 - Buscar por ID");
			System.out.println("4 - Atualizar");
			System.out.println("5 - Excluir");
			System.out.println("0 - Sair");
			
			op = scan.nextInt();
			
			if(op==1){
				cadastrarAluno();
			}else if(op==2) {
				listarAlunos();
			}else if(op==3) {
				buscarAluno();
			}else if(op==4) {
				atualizarAluno();
			}else if(op==5) {
				excluirAluno();
			}else if(op==0) {
				System.out.println("Saindo!");

			}else {
				System.out.println("Opção informada incorreta!");
			}
		}while(op!=0);
	}
	
	private static void cadastrarAluno() {
		scan.nextLine();
		System.out.println("Informe o nome do aluno:");
		String nome = scan.nextLine();
		System.out.println("Informe a nota do aluno:");
		Double nota = scan.nextDouble();
		int id = proximoId;
		if((nota<0)||(nota>10)){
			System.out.println("Nota informada inválida! Informe notas entre 0 e 10 (inclusive)");
		}
		else {
			alunos.add(new Aluno(id, nome, nota));
			System.out.println("Aluno cadastrado com sucesso! ID aluno: " + alunos.get(alunos.size() - 1).getId());
			proximoId++;
		}
	}
	private static void listarAlunos() {
		if (alunos.isEmpty()) {
			System.out.println("A lista de alunos está vazia!");
		} else {
			for(Aluno aluno : alunos) {
				System.out.printf("ID: %d | Nome: %s | Nota: %.2f \n", aluno.getId(), aluno.getNome(), aluno.getNota());
			}
		}
	}
	private static void buscarAluno() {
		if (alunos.isEmpty()) {
			System.out.println("A lista de alunos está vazia!");
		} 
		else {
			System.out.println("Informe o ID do aluno: ");
			int idBusca = scan.nextInt();
		    boolean encontrado = false;
			for(Aluno aluno : alunos) {
				if(aluno.getId()==idBusca) {
					System.out.printf("ID: %d | Nome: %s | Nota: %.2f \n\n", aluno.getId(), aluno.getNome(), aluno.getNota());
					encontrado = true;
					break;
				}
			}
			if(encontrado == false) {
				System.out.println("ID não encontrado! \n");
			}
		}
	}
	private static void atualizarAluno() {
		if (alunos.isEmpty()) {
			System.out.println("A lista de alunos está vazia!");
		} 
		else {		
			System.out.println("Informe o ID do aluno a ser atualizado: ");
			int idAtualizar = scan.nextInt();
		    boolean encontrado = false;
			for(Aluno aluno : alunos) {
				if(aluno.getId()==idAtualizar) {
					System.out.printf("Dados atuais referente ao ID %d: Nome: %s | Nota: %.2f \n\n", aluno.getId(), aluno.getNome(), aluno.getNota());
					scan.nextLine();				
					System.out.println("Informe o novo nome do aluno: ");
					String novoNome = scan.nextLine();
					System.out.println("Informe a nova nota do aluno: ");
					Double novaNota = scan.nextDouble();
					if((novaNota<0)||(novaNota>10)){
						System.out.println("Nota informada inválida! Informe notas entre 0 e 10 (inclusive)");
						encontrado = true;
						break;
					}
					else {
						aluno.setNome(novoNome);
						aluno.setNota(novaNota);
						System.out.println("Dados atualizados com sucesso!");
						encontrado = true;
						break;
					}
						
				}
			}
			if(encontrado == false) {
				System.out.println("ID não encontrado! \n");
			}
		}
	}
	private static void excluirAluno() {
		if (alunos.isEmpty()) {
			System.out.println("A lista de alunos está vazia!");
		} 
		else {	
			System.out.println("Informe o ID do aluno a ser excluído: ");
			int idExcluir = scan.nextInt();
		    boolean encontrado = false;
			for(Aluno aluno : alunos) {
				if(aluno.getId()==idExcluir) {
					System.out.printf("Dados atuais referente ao ID %d: Nome: %s | Nota: %.2f \n\n", aluno.getId(), aluno.getNome(), aluno.getNota());
					System.out.println("Tem certeza que realmente deseja excluir esse aluno? Digite 1 para confirmar a exclusão ou qualquer outro número para retornar ao menu: ");
					int escolha = scan.nextInt();
					if(escolha==1) {
						alunos.remove(aluno);
						System.out.println("Aluno excluído com sucesso!");
					}
					else {
						System.out.println("Aluno mantido, retornando ao menu.");
					}
					encontrado = true;
					break;
				}
			}
			if(encontrado == false) {
				System.out.println("ID não encontrado! \n");
			}
		}
	}
}

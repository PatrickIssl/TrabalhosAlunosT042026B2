package Cadastrodeprodutos;

import java.util.Scanner;
import java.util.ArrayList;


public class Sistema {
	
	private static ArrayList<Produto> produtos = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    private static int proximoID = 1;
    
    public static void main(String[] args) {
    	
    	int opcao;
    	do {
    		System.out.println("========== SISTEMA DE GERENCIAMENTO ==========\n");
    	System.out.println("1 - Cadastrar Produto");
    	System.out.println("2 - Listar Todos");
    	System.out.println("3 - Buscar por ID");
    	System.out.println("4 - Atualizar Produto");
    	System.out.println("5 - Excluir Produto");
    	System.out.println("0 - Sair");
    	
    	System.out.println("Escolha a sua opção: ");
    	opcao = scan.nextInt();
    	scan.nextLine();
    	
    	switch(opcao) {
    	
    	case 1:
    		cadastrar();
    		break;
    	case 2:
    		listartodos();
    		break;
    	case 3:
    		buscarid();
    		break;
    	case 4:
    		atualizar();
    		break;
    	case 5:
    		excluir();
    		break;
    	case 0:
    		System.out.println("Fechando o programa.");
    		break;
    	}	
    } while (opcao!=0);
    	
    }

    
    private static void cadastrar() {
    	System.out.println("Digite o nome: ");
    	String nome = scan.nextLine();
    	System.out.println("Digite o preço: ");
    	double preco = scan.nextDouble();
    	System.out.println("Digite a quantidade: ");
    	int quantidade = scan.nextInt();
    	
    	Produto produto = new Produto(proximoID, nome, preco, quantidade);
    	produtos.add(produto);
    	proximoID++;
    	
    }
    
    private static void listartodos() {
    	if(produtos.isEmpty()) {
    		System.out.println("Não há nenhum produto cadastrado");
    		return;
    	}
    	
    	for(Produto p : produtos) {
    		System.out.println(p);
    	}
    }
    
    private static void buscarid() {
    	if(produtos.isEmpty()) {
    		System.out.println("Não há nenhum produto cadastrado");
    		return;
    	}
    	System.out.println("Digite o ID do produto: ");
    	int ID = scan.nextInt();
    	Produto produto = encontrarporID(ID);
    	
    	if(produto==null) {
    		System.out.println("ID não encontrado");
    	} else {
    		System.out.println(produto);
    	}
    	
    }
    
    private static void atualizar() {
    	if(produtos.isEmpty()) {
    		System.out.println("Não há nenhum produto cadastrado");
    		return;
    	}
    	System.out.println("Digite o ID do produto para atualiza-lo: ");
    	int ID = scan.nextInt();
    	scan.nextLine();
    	Produto produto = encontrarporID(ID);
    	
    	 System.out.println("Dados atuais: " + produto);
    	 System.out.println("Digite o novo nome: ");
    	 String nome = scan.nextLine();
    	 produto.setnome(nome);
    	 System.out.println("Digite o novo preco: ");
    	 double preco = scan.nextDouble();
    	 produto.setpreco(preco);
    	 System.out.println("Digite o nova quantidade: ");
    	 int quantidade = scan.nextInt();
    	 produto.setquantidade(quantidade);
    	
    }
    
    private static void excluir() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println("Digite o ID do produto");
        int ID = scan.nextInt();
        Produto produto = encontrarporID(ID);

        if (produto == null) {
            System.out.println("ID não encontrado.");
            return;
        } else { 
        produtos.remove(produto);
        System.out.println("Produto excluído com sucesso!");
        }
    }
    
    private static Produto encontrarporID(int ID) {
    	for(Produto p : produtos) {
    		if (p.getID() == ID) {
    			return p;
    		}
    	}
    	return null;
    }
}

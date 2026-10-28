import java.util.Scanner;

import objetos.Aluno;
import objetos.Carro;
import objetos.Pessoa;

public class Principal {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
			
	}
	
	public static void attUm() {
		Scanner scan = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		System.out.println("Digite seu nome:");
		pessoa.nome = scan.nextLine();
		
		System.out.println("Insira sua idade:");
		pessoa.idade = scan.nextInt();
		
		pessoa.apresentar();
		scan.close();
	}
	
	public static void attDois() {
		
		Carro carro = new Carro();
		
		System.out.println("Informe a Marca do carro:");
		carro.setMarca(scan.nextLine());
		System.out.println("Informe o Modelo do carro:");
		carro.setModelo(scan.nextLine());
		System.out.println("Informe o Ano do carro:");
		carro.setAno(scan.nextInt());

		carro.exibirDados();
		scan.close();
	}
	
	public static void attTres() {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Insira seu nome: ");
		aluno.setNome(scan.nextLine());
		System.out.println("Insira sua idade: ");
		aluno.setIdade(scan.nextInt());
		System.out.println("Insira sua Nota: ");
		aluno.setNota(scan.nextDouble());
		
	aluno.verificarSituacao();	
	scan.close();
	}
	
	
	
}

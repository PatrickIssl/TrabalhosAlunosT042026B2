package aula3;
import java.util.Scanner;

public class ClassePessoa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Informe sua idade: ");
		int idade = scan.nextInt();
		
		System.out.printf("Olá %s, sua idade é %d ", nome, idade);
		
		scan.close(); 
    }
}
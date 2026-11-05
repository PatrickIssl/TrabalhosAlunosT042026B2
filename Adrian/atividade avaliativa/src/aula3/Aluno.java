package aula3;

import java.util.Scanner;

class Aluno {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Informe sua nota: ");
		int nota = scan.nextInt();
		
		System.out.printf("Olá %s, sua nota é %d e você esta ", nome, nota);
		
		 if (nota < 60) {
			 
			 System.out.println("reprovado.");
			 
		 } else {
			 
			 System.out.println("aprovado.");
		 }
		
		scan.close();
    }
}
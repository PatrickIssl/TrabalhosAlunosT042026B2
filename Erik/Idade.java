import java.util.Scanner;

public class Idade {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual é o seu nome? \n");
		String nome = scanner.nextLine();
		scanner.nextLine();
		System.out.print("Informe sua idade: \n");
		int idade = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Seu nome e " + nome + " | Sua idade e " + idade + "\n\n");
		if (idade<18){
			System.out.print(nome + ", voce eh menor de idade!\n");
		}else{
			System.out.print(nome + ", voce eh maior de idade!!!\n");
		}
		scanner.close();
	}
}
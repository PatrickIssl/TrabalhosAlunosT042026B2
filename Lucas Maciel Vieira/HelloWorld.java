import java.util.Scanner; 

public class HelloWorld {
    public static void main(String[] args) {
     
	Scanner sc = new Scanner (System.in);
	System.out.println("Qual é o seu nome? ");
	String nome = sc.nextLine();

	System.out.println("Qual é a sua idade? ");
	int idade = sc.nextInt();


	if (idade >= 18) {	
	System.out.print("Você é maior de idade! ");
	}

	else {
	System.out.print("Você é menor de idade");	
	}

	sc.close(); 
    }
}
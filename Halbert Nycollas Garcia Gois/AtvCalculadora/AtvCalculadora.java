import java.util.Scanner;

public class AtvCalculadora{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("===========================");
	System.out.println("Entre com o primeiro valor: ");
	double n1 = scanner.nextDouble();	

	System.out.println("Entre com o segundo valor: ");
	double n2 = scanner.nextDouble();

	System.out.println("===========================");	
	System.out.println("1 = Mutiplicacao");
	System.out.println("2 = Divisao");
	System.out.println("3 = Adicao");
	System.out.println("4 = Subtracao");
	System.out.println("===========================");

	System.out.println("Escolha o operador matematico de acordo com os numeros referentes acima: ");
	int operadorEscolha = scanner.nextInt();	
	
	if(operadorEscolha == 1){
	    System.out.println("===========================");
	    System.out.println("O valor final e: "+(n1*n2));	
	   
	}else if(operadorEscolha == 2){
		System.out.println("===========================");
		System.out.println("O valor final e: "+(n1/n2));
		
		}else if(operadorEscolha == 3){
			System.out.println("===========================");
			System.out.println("O valor final e: "+(n1+n2));

			}else{
				System.out.println("===========================");
				System.out.println("O valor final e: "+(n1-n2));
			
			}

	}


}
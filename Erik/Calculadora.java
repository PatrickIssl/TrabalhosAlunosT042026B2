import java.util.Scanner;

public class Calculadora {
    	public static void main(String[] args) {
	        System.out.println("Bem vindo a calculadora! \n");
        	System.out.println("Escolha uma das opcoes abaixo para realizar o calculo: \n");
	        System.out.println("|Digite 1 para Subtracao| \n");
        	System.out.println("|Digite 2 para Adicao| \n");
	        System.out.println("|Digite 3 para Multiplicacao| \n");
        	System.out.println("|Digite 4 para Divisao| \n");
	        Scanner scanner = new Scanner(System.in);
        	System.out.println("Informe o numero referente ao calculo desejado: \n");
	        int op = scanner.nextInt();
        	if ((op==1) || (op==2) || (op==3) || (op==4)) {
	        	System.out.println("Informe o primeiro numero a ser calculado: \n");
            		double n1 = scanner.nextDouble();
            		System.out.println("Informe o segundo numero a ser calculado: \n");
           		double n2 = scanner.nextDouble();
            		double  valor = 0;
            		if (op==1){
                		valor = n1 - n2;
                		System.out.println("Resultado do Calculo: " + valor);
            		} 
            		if (op==2) {
                		valor = n1 + n2;            
                		System.out.println("Resultado do Calculo: " + valor);
            		}
            		if (op==3) {  
                		valor = n1 * n2;      
                		System.out.println("Resultado do Calculo: " + valor);
            		}
            		if (op==4) {  
                		if (n2==0){
                    			System.out.println("Nao e possivel dividir por 0!");
                		}else{
                    			valor = n1 / n2;                
                    			System.out.println("Resultado do Calculo: " + valor);
                		}
            		}
        }else{
            System.out.println("Dado informado não pertence a nenhuma das opções listadas!");
        }
	scanner.close();
    }
}


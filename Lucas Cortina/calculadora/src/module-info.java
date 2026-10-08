
public class Calculadora {
	
	public static void main (String[] args) {
	int resultado = somar (9, 7);
	 System.out.println("Soma: " + resultado);

	 int resultado1 = subtrair (8, 4);
	 System.out.println("Subtracao: " + resultado1);
	 	 
	 double resultado2 = multiplicar (8, 2);
	  System.out.println("multiplicacao: " + resultado2);
	  
	  double resultado3 = dividir (8, 2);
	  System.out.println("Divisao: " + resultado3);
	}
	  public static int somar(int a, int b) {
		  return a + b; }
	  public static int subtrair(int c, int d) {
		  return c - d; }
	  public static double multiplicar (double n1, double n2) {
		  return n1 * n2; }
	  public static double dividir(double n3, double n4) {
		  return n3 / n4; }
	  }
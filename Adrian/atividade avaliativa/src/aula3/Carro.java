package aula3;
public class Carro {
	String marca;
	String modelo;
	int ano;
	void exibirDados() {
	    System.out.println(marca);

	    System.out.println(modelo);

	    System.out.println(ano);
	}
	public static void main(String[] args) {
	    Carro c = new Carro();
	    c.marca = "BMW";
	    c.modelo = "x5";
	    c.ano = 2020;
	    c.exibirDados();
	}

	}
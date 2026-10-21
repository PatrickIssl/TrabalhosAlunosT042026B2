package principal;

public class ClassePessoa {

		
		String nome;
	    int idade;

	    public void apresentar() {
	        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
	    }

	    public static void main(String[] args) {

	        ClassePessoa p = new ClassePessoa();

	        p.nome = "Ana";
	        p.idade = 20;

	        p.apresentar();
	    }


	}


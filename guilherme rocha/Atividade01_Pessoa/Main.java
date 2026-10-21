public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Guilherme";
        p.idade = 23;
        p.apresentar();
    }
}

class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome
                + " e tenho " + idade + " anos.");
    }
}

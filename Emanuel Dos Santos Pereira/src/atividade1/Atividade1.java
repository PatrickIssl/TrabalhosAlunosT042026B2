package atividade1;

class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome +
                " e tenho " + idade + " anos.");
    }
}

public class Atividade1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Henrique";
        pessoa.idade = 20;

        pessoa.apresentar();
    }
}
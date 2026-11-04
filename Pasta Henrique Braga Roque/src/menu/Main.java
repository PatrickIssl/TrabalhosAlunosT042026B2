package menu; 

import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;
    String cidade;

    void apresentar() {
        System.out.println("Ola, meu nome e " + nome +
                " e tenho " + idade + " anos.");
    }

    void fazerAniversario() {
        idade++;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if (cidade != null) {
            System.out.println("Cidade: " + cidade);
        }
    }
}

class Carro {
    String marca;
    String modelo;
    int ano;

    void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

class Aluno {
    String nome;
    int idade;
    double nota;

    String verificarSituacao() {
        if (nota >= 6) {
            return "Aprovado";
        }
        return "Reprovado";
    }
}

class Produto {
    String nome;
    double preco;
    int quantidade;

    double calcularTotal() {
        return preco * quantidade;
    }
}

class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Valor invalido.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saque nao pode ser realizado.");
        }
    }

    void exibirSaldo() {
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}

class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean emprestado = false;

    void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("O livro ja esta emprestado.");
        }
    }

    void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("O livro nao esta emprestado.");
        }
    }

    void exibirInformacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPaginas);
        System.out.println("Emprestado: " +
                (emprestado ? "Sim" : "Nao"));
    }
}

class Funcionario {
    String nome;
    String cargo;
    double salario;

    void aumentarSalario(double percentual) {
        if (percentual > 0) {
            salario += salario * percentual / 100;
        } else {
            System.out.println("Percentual invalido.");
        }
    }
}

class Retangulo {
    double largura;
    double altura;

    double calcularArea() {
        return largura * altura;
    }

    double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

class Celular {
    String marca;
    String modelo;
    int bateria = 100;

    void usarCelular() {
        bateria -= 10;

        if (bateria < 0) {
            bateria = 0;
        }

        System.out.println("Celular utilizado.");
    }

    void carregar() {
        bateria = 100;
        System.out.println("Celular carregado!");
    }

    void exibirBateria() {
        System.out.println("Bateria: " + bateria + "%");
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);

    static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }

    static int lerInteiro(String mensagem) {
        while (true) {
            try {
                return Integer.parseInt(lerTexto(mensagem));
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero inteiro valido.");
            }
        }
    }

    static double lerDouble(String mensagem) {
        while (true) {
            try {
                String valor = lerTexto(mensagem).replace(",", ".");
                return Double.parseDouble(valor);
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero valido.");
            }
        }
    }

    static void atividade1() {
        System.out.println("\n--- ATIVIDADE 1: PESSOA ---");

        Pessoa p = new Pessoa();
        p.nome = lerTexto("Nome: ");
        p.idade = lerInteiro("Idade: ");
        p.apresentar();
    }

    static void atividade2() {
        System.out.println("\n--- ATIVIDADE 2: CARRO ---");

        Carro c = new Carro();
        c.marca = lerTexto("Marca: ");
        c.modelo = lerTexto("Modelo: ");
        c.ano = lerInteiro("Ano: ");

        c.exibirDados();
    }

    static void atividade3() {
        System.out.println("\n--- ATIVIDADE 3: ALUNO ---");

        Aluno a = new Aluno();
        a.nome = lerTexto("Nome: ");
        a.idade = lerInteiro("Idade: ");
        a.nota = lerDouble("Nota: ");

        System.out.println("Nome: " + a.nome);
        System.out.println("Nota: " + a.nota);
        System.out.println("Situacao: " + a.verificarSituacao());
    }

    static void atividade4() {
        System.out.println("\n--- ATIVIDADE 4: PRODUTO ---");

        Produto p = new Produto();
        p.nome = lerTexto("Nome do produto: ");
        p.preco = lerDouble("Preco: R$ ");
        p.quantidade = lerInteiro("Quantidade: ");

        System.out.printf("Valor total: R$ %.2f%n", p.calcularTotal());
    }

    static void atividade5() {
        System.out.println("\n--- ATIVIDADE 5: CONTA BANCARIA ---");

        ContaBancaria c = new ContaBancaria();
        c.titular = lerTexto("Titular: ");
        c.saldo = lerDouble("Saldo inicial: R$ ");

        double deposito = lerDouble("Valor do deposito: R$ ");
        c.depositar(deposito);

        double saque = lerDouble("Valor do saque: R$ ");
        c.sacar(saque);

        c.exibirSaldo();
    }

    static void atividade6() {
        System.out.println("\n--- ATIVIDADE 6: LIVRO ---");

        Livro l = new Livro();
        l.titulo = lerTexto("Titulo: ");
        l.autor = lerTexto("Autor: ");
        l.numeroPaginas = lerInteiro("Numero de paginas: ");

        l.exibirInformacoes();

        l.emprestar();
        l.emprestar();
        l.devolver();
        l.devolver();

        l.exibirInformacoes();
    }

    static void atividade7() {
        System.out.println("\n--- ATIVIDADE 7: FUNCIONARIO ---");

        Funcionario f = new Funcionario();
        f.nome = lerTexto("Nome: ");
        f.cargo = lerTexto("Cargo: ");
        f.salario = lerDouble("Salario atual: R$ ");

        double percentual = lerDouble("Percentual de aumento: ");
        f.aumentarSalario(percentual);

        System.out.println("Nome: " + f.nome);
        System.out.println("Cargo: " + f.cargo);
        System.out.printf("Novo salario: R$ %.2f%n", f.salario);
    }

    static void atividade8() {
        System.out.println("\n--- ATIVIDADE 8: RETANGULO ---");

        Retangulo r = new Retangulo();
        r.largura = lerDouble("Largura: ");
        r.altura = lerDouble("Altura: ");

        System.out.printf("Area: %.2f%n", r.calcularArea());
        System.out.printf("Perimetro: %.2f%n", r.calcularPerimetro());
    }

    static void atividade9() {
        System.out.println("\n--- ATIVIDADE 9: CELULAR ---");

        Celular c = new Celular();
        c.marca = lerTexto("Marca: ");
        c.modelo = lerTexto("Modelo: ");

        int vezes = lerInteiro("Quantas vezes deseja usar o celular? ");

        for (int i = 0; i < vezes; i++) {
            c.usarCelular();
        }

        c.exibirBateria();

        String resposta = lerTexto("Deseja carregar? (s/n): ");
        if (resposta.equalsIgnoreCase("s")) {
            c.carregar();
        }

        c.exibirBateria();
    }

    static void atividade10() {
        System.out.println("\n--- ATIVIDADE 10: CADASTRO DE PESSOAS ---");

        Pessoa[] pessoas = new Pessoa[3];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("\nCadastro da pessoa " + (i + 1));

            pessoas[i] = new Pessoa();
            pessoas[i].nome = lerTexto("Nome: ");
            pessoas[i].idade = lerInteiro("Idade: ");
            pessoas[i].cidade = lerTexto("Cidade: ");
        }

        System.out.println("\n--- DADOS CADASTRADOS ---");

        for (Pessoa p : pessoas) {
            p.apresentar();
            p.exibirDados();
            System.out.println("--------------------");
        }

        int numero = lerInteiro(
                "Qual pessoa fara aniversario? (1, 2 ou 3): ");

        if (numero >= 1 && numero <= 3) {
            pessoas[numero - 1].fazerAniversario();

            System.out.println("\n--- DADOS APOS O ANIVERSARIO ---");
            for (Pessoa p : pessoas) {
                p.exibirDados();
                System.out.println("--------------------");
            }
        } else {
            System.out.println("Numero de pessoa invalido.");
        }
    }

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n==============================");
            System.out.println("       ATIVIDADES DE POO");
            System.out.println("==============================");
            System.out.println("1 - Classe Pessoa");
            System.out.println("2 - Classe Carro");
            System.out.println("3 - Classe Aluno");
            System.out.println("4 - Classe Produto");
            System.out.println("5 - Conta Bancaria");
            System.out.println("6 - Classe Livro");
            System.out.println("7 - Classe Funcionario");
            System.out.println("8 - Classe Retangulo");
            System.out.println("9 - Classe Celular");
            System.out.println("10 - Cadastro de Pessoas");
            System.out.println("0 - Sair");

            opcao = lerInteiro("Escolha uma atividade: ");

            switch (opcao) {
                case 1:
                    atividade1();
                    break;
                case 2:
                    atividade2();
                    break;
                case 3:
                    atividade3();
                    break;
                case 4:
                    atividade4();
                    break;
                case 5:
                    atividade5();
                    break;
                case 6:
                    atividade6();
                    break;
                case 7:
                    atividade7();
                    break;
                case 8:
                    atividade8();
                    break;
                case 9:
                    atividade9();
                    break;
                case 10:
                    atividade10();
                    break;
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);

        sc.close();
    }
} 
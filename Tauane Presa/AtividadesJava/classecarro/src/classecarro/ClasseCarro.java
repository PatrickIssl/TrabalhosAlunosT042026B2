package classecarro;

public class ClasseCarro {

String marca;
String modelo;
int ano;

void exibirDados() {
    System.out.println(marca);
    System.out.println(modelo);
    System.out.println(ano);
}


public static void main(String[] args) {
    ClasseCarro c = new ClasseCarro();

    c.marca = "Fiat";
    c.modelo = "Uno";
    c.ano = 2020;

    c.exibirDados();
}
}
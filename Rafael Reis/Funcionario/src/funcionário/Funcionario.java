package funcionário;
public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }
}
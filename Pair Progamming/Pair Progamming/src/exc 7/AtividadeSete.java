public class AtividadeSete {

    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario("Patrick", "Professor", 6700.00);

        funcionario.exibirDados();

        funcionario.aumentarSalario(10);
    
        funcionario.exibirDados();
    }
}
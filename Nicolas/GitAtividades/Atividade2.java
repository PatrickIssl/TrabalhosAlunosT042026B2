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
public class Atividade2 {
   public static void main(String[] args) {
       Carro carro = new Carro();
       carro.marca = "Volkswagen";
       carro.modelo = "Polo";
       carro.ano = 2022;
       carro.exibirDados();
   }
}

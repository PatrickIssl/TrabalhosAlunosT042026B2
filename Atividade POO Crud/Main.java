import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static  Scanner ler = new Scanner(System.in);
    public static ArrayList<Produtos> listaProd = new ArrayList<>();

    public static void Cadastrar(){
        
        System.out.println("Qual o nome do produto?");
        String nome = ler.nextLine();
        System.out.println("Qual o preco do produto?");
        double preco = ler.nextDouble();
        System.out.println("Qual a quantidade desse produto?");
        int qtd = ler.nextInt();
        ler.nextLine();


        Produtos novoProd = new Produtos(nome, preco, qtd);
        listaProd.add(novoProd);

        System.out.println("Cadastrado");
    }

    public static void Listar(){
        System.out.println("=======LISTA=======");
        
        if (listaProd.isEmpty()) {
            System.out.println("Nenhum produto esta cadastrado");
        }

        for (Produtos p : listaProd) {
            System.out.println("=================");
            System.out.println("ID: " + p.getID());
            System.out.println("Produto: "+p.getNome());
            System.out.println("R$: " + p.getPreco());
            System.out.println("Quantidade: " + p.getQuantidade());
            System.out.println("=================");
        }
    }

    public static  void BuscarId(int id){
        boolean encontrado = false;
      for (Produtos p : listaProd) {
        if (id == p.getID()) {
            System.out.println("=================");
            System.out.println("ID: " + p.getID());
            System.out.println("Produto: "+p.getNome());
            System.out.println("R$: " + p.getPreco());
            System.out.println("Quantidade: " + p.getQuantidade());
            System.out.println("=================");
            encontrado = true;
            break;
        }
      }  

      if (encontrado == false) {
        System.out.println("Produto com ID " + id + " nao encontrado.");
      }
    }

    public static void Atualizar(int id){
        Produtos produtoEncontrado = null;
        
        for (Produtos p : listaProd) {
            if (p.getID() == id) {
                produtoEncontrado = p;
                break;
            }
        }

        if (produtoEncontrado == null) {
            System.out.println("Produto com ID " + id + " nao encontrado.");
            return;
        }

        System.out.println("DESEJA:");
        System.out.println(" 1- Alterar todos os dados do prod ");
        System.out.println("2- Alterar um dado especifico do prod");
        int opcao = ler.nextInt();
        ler.nextLine();


        if (opcao == 1) {
            System.out.println("Digite o novo nome:");
            String novoNome = ler.nextLine();
            System.out.println("Digite o novo preco:");
            double novoPreco = ler.nextDouble();
            System.out.println("Digite a nova quantidade:");
            int novaQtd = ler.nextInt();
            ler.nextLine();

            
            produtoEncontrado.setNome(novoNome);
            produtoEncontrado.setPreco(novoPreco);
            produtoEncontrado.setQuantidade(novaQtd);
            System.out.println("Produto totalmente atualizado!");


        } else if (opcao == 2) {
            System.out.println("O que vai alterar:");
            System.out.println("1- Nome, 2- Preco, 3- Quantidade");
            int alterar = ler.nextInt();
            ler.nextLine();

            if (alterar == 1) {
                System.out.println("Qual o novo nome:");
                String novoNome = ler.nextLine();

                produtoEncontrado.setNome(novoNome);
                System.out.println("ATUALIZADO");


            } else if (alterar == 2) {
                System.out.println("Digite o novo preco:");
                double novoPreco = ler.nextDouble();
                ler.nextLine();
                
                
                produtoEncontrado.setPreco(novoPreco);
                System.out.println("Preco atualizado!");


            } else if (alterar == 3) {
                System.out.println("Digite a nova quantidade:");
                int novoQuantidade = ler.nextInt();
                ler.nextLine();
                
                produtoEncontrado.setQuantidade(novoQuantidade);
                System.out.println("Quantidade atualizado!");
            } else {
            System.out.println("Opcao invalida.");
            }
        }
    }

    public static void Excluir(int id){
       Produtos produtoRemover = null;
        
        for (Produtos p : listaProd) {
            if (p.getID() == id) {
                produtoRemover = p;
                break;
            }
        }

        if (produtoRemover != null) {
            
            listaProd.remove(produtoRemover);
            System.out.println("Excluido");
        } else {
            System.out.println("Produto com ID " + id + " nao Remover.");
            return;
        }
        
        
    }

    public static void main(String[] args) {
        
        while (true) {
            int opcao;
            System.out.println("========== SISTEMA DE GERENCIAMENTO ==========");
            System.out.println("1- Cadastrar");
            System.out.println("2- Listar todos");
            System.out.println("3- Buscar por ID");
            System.out.println("4- Atualizar");
            System.out.println("5- Excluir");
            System.out.println("0- Sair");
            System.out.println("===============================================");
            opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao) {
                case 0:
                    System.exit(0);
                    break;
                
                case 1:
                    Cadastrar();
                    break;

                case 2:
                    Listar();
                    break;

                case 3:
                    System.out.println("Qual o ID do produto que stá buscando?");
                    int idBuscar = ler.nextInt();
                    ler.nextLine();
                    BuscarId(idBuscar);
                    
                    break;

                case 4:
                    System.out.println("Qual o ID do produto que deseja alterar?");
                    int idAlterar = ler.nextInt();
                    ler.nextLine();
                    Atualizar(idAlterar);

                    
                break;

                case 5:
                    System.out.println("Qual o ID do produto que deseja excluir?");
                    int idExcluir = ler.nextInt();
                    ler.nextLine();
                    Excluir(idExcluir);
                break;

            
                
            }
            
        }
    }
}
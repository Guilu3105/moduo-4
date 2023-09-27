
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {

      static Produtosdb produtosdb = new Produtosdb();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

       System.out.println("------- PEDIDOS DE VENDAS --------");

      int option;

      do {
             System.out.println("1 Cadastrar produto");
             System.out.println("2 Listar produtos Cadastrados");
             System.out.println("0 Sair");

               Scanner  scanner1 = new Scanner(System.in);

               System.out.print("Qual operaçao voce deseja operar? ");

                   option = scanner .nextInt();

                  process(option);

        } while (option != 0);
    }

      public static void process(int option) throws Exception {
     switch (option) {
       case 1:{
            Scanner scanner = new Scanner(System.in);

             System.out.print("Qual a descricao voce deseja dar? ");
             String descricao = scanner.nextLine();

              System.out.print("Qual ID voce deseja dar ao novo produto: ");
               int id = scanner.nextInt();

               System.out.print("Qual preço voce deseja dar ao novo produto:");
                  double preço = scanner.nextDouble();

                  System.out.print("Data do pedido :");
                    String dataString = scanner.next();

                                  
                   Date dataValidade = new Date();

            Produto novoProduto = new Produto(id, descricao, preço, dataValidade);

              produtosdb.addProduto(novoProduto);

              novoProduto.setId(id);
              novoProduto.setDescricao(descricao);
              novoProduto.setPreço(preço);
              novoProduto.setDataValidade(dataValidade);
              
            break;
       }

          case 2:{
               List<Produto> listaDeprodutos = produtosdb.getProdutosList();

               for (Produto produto : listaDeprodutos){
                
                  System.out.println(" ID " + produto.getId());
                  System.out.println(" Descriçao " + produto.getDescricao());
                  System.out.println(" Preço " + produto.getPreço());
                  System.out.println(" Data do pedido " + produto.getDataValidade());

                  break;

               }
          }



      }
}
}
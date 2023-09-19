
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

       System.out.println("------- PEDIDOS DE VENDAS --------");

      int option;

      do {
             System.out.println("1 Cadastrar produto");
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

                  System.out.print("Data de validade:");
                    String dataString = scanner.next();

                                  
                  Date dataValidade = new SimpleDateFormat("dd/MM/yyyy ")                   .parse(dataString);

            Produto novoProduto = new Produto(id, descricao, preço, dataValidade);

              novoProduto.setId(id);
              novoProduto.setDescricao(descricao);
              novoProduto.setPreço(preço);
              novoProduto.setDataValidade(dataValidade);

             System.out.println("Produto criado com sucesso");
             System.out.println("---- ID:" + novoProduto.getId());
             System.out.println("---- Descricao " + novoProduto.getDescricao());
             System.out.println("---- Preço " + novoProduto.getPreço());
             System.out.println("--- Data de validade " + novoProduto.getDataValidade());
             System.out.println("------------------------------------"); 
       }
      }
}
}
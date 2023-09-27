
import java.util.List;
import java.util.ArrayList;

public class Produtosdb {
    
    private List<Produto> produtosList = new ArrayList<>();

     public List<Produto> getProdutosList() {
         return produtosList;
     }

         public void addProduto(Produto produto) {
          produtosList.add(produto);
         
}
}
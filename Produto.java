import java.util.Date;

public class Produto {
  
    private int id;
    private String descricao;

    private double preço;
    private Date dataValidade;

       public Produto(int id, String descricao, double preço, Date dataValidade){
         this.id = id;
      this.descricao = descricao;
      this.preço = preço;
      this.dataValidade = dataValidade;

        }    
             

    public void setId(int id) {
        this.id = id;
}
  public void setDescricao(String descricao) {
     this.descricao = descricao;
}

            public void setPreço(double preco) {
              this.preço = preço;
            }

           public void setDataValidade(Date DataValidade) {
             this.dataValidade = DataValidade;
           }







      public int getId() {
        return id;
    }

        public String getDescricao() {
            return descricao;
        }

         public double getPreço() {
            return preço;
         }

         public Date getDataValidade() {
            return dataValidade;
         }
}
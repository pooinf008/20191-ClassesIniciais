public class Lancamento{
    private String descricao;
    private double valor;
    private Conta credito;
    private Conta debito;
    
    public Lancamento(String descricao, double valor,
                      Conta credito, Conta debito){
      this.descricao = descricao;
      this.valor = valor;
      this.credito = credito;
      this.debito = debito;
    }    
    
}

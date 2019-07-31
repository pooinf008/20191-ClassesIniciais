public class ContaInvestimento extends ContaCorrente{
  public ContaInvestimento(String id, String nome){
      super(id, nome);
  }      
  
  public void depositar(double valor){
      super.depositar(this.getSaldo() + (1.05 * valor));
  };    
}

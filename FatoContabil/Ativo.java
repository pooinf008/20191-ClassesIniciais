public class Ativo extends Conta{
    
    public void creditar(double valor){
      this.saldo -= valor;
    }    
    
    public void debitar(double valor){
      this.saldo += valor;
    }        
}

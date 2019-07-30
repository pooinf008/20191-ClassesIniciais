public class ContaEspecial extends ContaCorrente{
  private double limite;
  
  public ContaEspecial(String id, String nome, double limite){
      super(id, nome);
      this.setLimite(limite);
  }    
  
  public void setLimite(double limite){
      this.limite = limite;
  }
  
  public double getLimite(){
      return this.limite;
  }  
  
  public void sacar(double valor){
      if(valor <= this.saldo + this.limite)
          this.saldo -= valor;
  }  
  
    public String toString(){
        return super.toString() + "- Limte : R$"
               + this.getLimite();
    }   
  
}

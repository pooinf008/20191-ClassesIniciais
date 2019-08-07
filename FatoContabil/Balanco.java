public class Balanco{
    private Conta[] contas;
    
    public Conta findContaByNome(String nome){
        for(Conta conta : this.contas)
          if(conta.getNome().equals(nome))
            return conta;
        return null;
    }  
    
    public void ajustar(String nomeCredito, String nomeDebito, 
                        double valor){
      this.findContaByNome(nomeCredito).creditar(valor);
      this.findContaByNome(nomeDebito).debitar(valor);      
    }    
    
}

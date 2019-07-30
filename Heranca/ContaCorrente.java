public class ContaCorrente{
    protected String id;
    protected String nome;
    protected double saldo;
    
    public ContaCorrente(String id, String nome){
        this.setId(id);
        this.nome = nome;
    }  
     
    
    private void setId(String id){
        this.id = id;
    }    
    
    public void depositar(double valor){
        this.saldo += valor;
    }    

    public void sacar(double valor){
        if(valor <= this.saldo)
            this.saldo -= valor;
    }    
    
    public double getSaldo(){
        return this.saldo;
    }    
    
    public String toString(){
        return "[" + this.id + "] - " + this.nome + " - R$" 
               + this.getSaldo();
    }    
    
    public boolean equals(Object oConta){
        return false;
    }
    
    
}

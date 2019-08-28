public class Telefone {
    private String contato;
    private String numero;
    
    public Telefone(String contato, String numero){
        this.contato = contato;
        this.numero = numero;        
    } 
    
    public String getNumero(){
        return this.numero;
    }    
    
    public String getContato(){
        return this.contato;
    }    
    
    
    public String toString(){
        return this.contato + " - " + this.numero;
    }  
    
   
    
}

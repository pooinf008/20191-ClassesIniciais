public class Medida{
    private double valor;
    private int qtdeNos;
    
    public Medida(double valor,  int qtdeNos){
        this.valor = valor;
        this.qtdeNos = qtdeNos;
    }    
    
    public double getValor(){
        return this.valor;
    }   
    
    public double getQtde(){
        return this.qtdeNos;
    }   
    
    
    public String toString(){
        return "<" + this.valor + ";" + this.qtdeNos + ">";
    }    
    
}

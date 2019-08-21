public class Medida{
    private double valor;
    private int qtdeNos;
    
    public Medida(double valor,  int qtdeNos){
        this.valor = valor;
        this.qtdeNos = qtdeNos;
    }    
    
    public double getValor(){
        return valor;
    }   
    
    public String toString(){
        return "<" + valor + ";" + qtdeNos + ">";
    }    
    
}

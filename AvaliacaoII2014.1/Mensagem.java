public class Mensagem{

    private String srcId;
    private Medida[] valores = new Medida[0];
    
    public Mensagem(String id){
        this.srcId = id;
    }    
    
    public double getValorMedio(){
        double valor =  0;
        for(Medida m : this.valores)
          valor += m.getValor();
        return valor / this.valores.length;  

    } 
    
    public Medida[] getValores(){
        return this.valores;
    } 
    
    public void adicionar(Medida[] medida){
        Medida[] novo = new Medida[this.valores.length + medida.length];
        int iCont;
        int jCont;
        for(iCont = 0; iCont < this.valores.length; iCont++)
          novo[iCont] =this.valores[iCont];
          
        for(jCont = 0; jCont < medida.length; jCont++, iCont++)
          novo[iCont] = medida[jCont];
        
        this.valores = novo;  
          
    }    
    
    public void adicionar(double valor){
        Medida m = new Medida(valor, 1);
        
        Medida[] novo = new Medida[this.valores.length + 1];
        int iCont;
        for(iCont = 0; iCont < this.valores.length; iCont++)
          novo[iCont] =this.valores[iCont];
        novo[novo.length -1] = m;
        this.valores = novo;
        
          
    }    
    
    
    
    public String toString(){
        String rep = srcId + "{";
        for(Medida m : this.valores)
         rep += m.toString() + "  ";
        return rep + "}"; 
    }    

}

public class Mensagem{

    private String srcId;
    private Medida[] valores = new Medida[0];
    
    public Mensagem(String id){
        this.srcId = id;
    }    
    
    public double getValorMedio(){
        double valor =  0;
        int qtde = 0;
        for(Medida m : this.valores){
          valor += m.getValor() * m.getQtde();
          qtde += m.getQtde();
        }  
        return valor / qtde;  
    } 
    
    public int getQtdeNos(){
        int qtde = 0;
        for(Medida m : this.valores){
          qtde += m.getQtde();
        }  
        return qtde;
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
    
    public void adicionar(double valor, int qtde){
        Medida m = new Medida(valor, qtde);
        
        Medida[] novo = new Medida[this.valores.length + 1];
        int iCont;
        for(iCont = 0; iCont < this.valores.length; iCont++)
          novo[iCont] =this.valores[iCont];
        novo[novo.length -1] = m;
        this.valores = novo;
    }    
    
    public void adicionar(double valor){
        this.adicionar(valor, 1);
    }  
    
    
    public void fundir(){
        double valor = this.getValorMedio();
        int qtde = this.getQtdeNos();
        this.valores = new Medida[1];
        this.valores[0] = new Medida(valor, qtde);
    }    
    
    
    
    public String toString(){
        String rep = srcId + "{";
        for(Medida m : this.valores)
         rep += m.toString() + "  ";
        return rep + "}"; 
    }    

}

public class Dicionario{
    private Verbete[] verbetes;
    
    public Dicionario(){
        this.verbetes = new Verbete[0];
    }    
    
    public Dicionario adicionarVerbete(Verbete verbete){
        Verbete[] aux = new Verbete[this.verbetes.length + 1];
        for(int iCont = 0; iCont < this.verbetes.length; iCont++)
          aux[iCont] = this.verbetes[iCont];
        aux[aux.length -1] = verbete;  
        this.verbetes = aux;
        return this;
    } 
    
    public Verbete[] toVerbete(String[] entradas){
        Verbete[] frase = new Verbete[entradas.length];
        for(int iCont = 0; iCont < entradas.length; iCont++)
          frase[iCont] = this.getVerbete(entradas[iCont]);
        return frase;  
    }    
    
    public Verbete getVerbete(String entrada){
        for(Verbete v : this.verbetes)
          if(v.isEntrada(entrada))
            return v;
        return null;    
    }
    
    public boolean hasProximidadeSemantica(String[] frase1, String[] frase2){
        Verbete[] verbeteFrase1 = this.toVerbete(frase1);
        Verbete[] verbeteFrase2 = this.toVerbete(frase2); 
        return this.hasEquivalencia(verbeteFrase1, verbeteFrase2) &&
               this.hasEquivalencia(verbeteFrase2, verbeteFrase1);
    }    
    
    private boolean hasEquivalencia(Verbete[] origem, Verbete[] ref){
        for(Verbete vOrigem : origem)
          if(vOrigem!= null && vOrigem.isNome())
           if(!this.hasEquivalencia(vOrigem, ref))
             return false;
        return true;     
    }    
    
    private boolean hasEquivalencia(Verbete o, Verbete[] verbetes){
        for(Verbete v : verbetes)
          if(v.equivalente(o))
            return true;
        return false;    
    }    
    
    
}

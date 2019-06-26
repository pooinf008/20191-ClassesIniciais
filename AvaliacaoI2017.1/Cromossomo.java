public class Cromossomo{
    private Gene[] genes; 
    
    public Cromossomo(int tamanho){
        this.genes = new Gene[tamanho];
    };    
    
    public Cromossomo(String valores){
        this.genes = new Gene[valores.length()];
        for(int iCont = 0; iCont < this.tamanho(); iCont++)
          if(valores.charAt(iCont) == '*') 
            this.genes[iCont] = null;
          else          
            this.genes[iCont] = new Gene(valores.charAt(iCont) - '0');
        
    };     
    
    public Gene getGene(int alelo){
        return this.genes[alelo];
    };
    
    public void setGene(int alelo, Gene gene){
        this.genes[alelo] = gene;
    };    
    
    public void setGene(int alelo, int valor){
        this.setGene(alelo, new Gene(valor));
    }; 
    
    public int tamanho(){
        return this.genes.length;
    }    
    
    public Cromossomo clonar(){
        Cromossomo clone = new Cromossomo(this.tamanho());
        for(int iCont = 0; iCont < this.tamanho(); iCont++)
          clone.setGene(iCont, 
                       (this.getGene(iCont) == null) ? 
                        null : 
                        this.getGene(iCont).clonar());
        return clone;
    } 
    
    public double getPctIdentidade(Cromossomo idn){
        int ndxSimilaridade = 0;
        for(int iCont = 0; 
            iCont < this.tamanho() && 
            iCont < idn.tamanho();
            iCont++)
            if((this.getGene(iCont) == null && 
                idn.getGene(iCont) != null) ||
                (this.getGene(iCont) != null && 
                idn.getGene(iCont) == null))
              ndxSimilaridade -= 2;
            else if((this.getGene(iCont) != null) && 
                    (idn.getGene(iCont) != null)){
              if(this.getGene(iCont).equals(idn.getGene(iCont)))
                ndxSimilaridade += 1;   
              else  
                ndxSimilaridade -= 1;   
            }            
        return ((double)ndxSimilaridade) / this.tamanho();  
    }    
}

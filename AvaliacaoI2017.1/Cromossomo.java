public class Cromossomo{
    private Gene[] genes; 
    
    public Cromossomo(int tamanho){
        this.genes = new Gene[tamanho];
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
        for(int iCont = 0; iCont < this.tamanho(); iCont++){
            Gene atual = this.getGene(iCont);
            if(atual == null)
              clone.setGene(iCont, null);
            else
              clone.setGene(iCont, atual.clonar());
        }    
        return clone;
    }    
}

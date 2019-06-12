public class Gene{
    private int valor;
    
    public Gene(int valor){
        this.setValor(valor);
    }  
    
    public Gene(){
        this(1);
    }   
    
    public Gene(Gene gene){
        this(gene.getValor());
    }     
        
    
    public void setValor(int valor){
        if(valor > 0)
            this.valor = valor;
        else    
            this.valor = 1;
    };  
    
    public int getValor(){
        return this.valor;
    }; 
    
    public boolean equals(Gene gene){
        return this.getValor() == gene.getValor();
    };
    
    public Gene clonar(){
        return new Gene(this);
    }; 
    
    public String toString(){
        return "[" + valor + "]";
    }; 
    
    public int getAfinidade(int valorProteina){
        return Math.abs(this.getValor() - valorProteina);
    }    
    
    public int getAfinidade(Gene gene){
        return this.getAfinidade(gene.getValor());
    }    
    
    
}

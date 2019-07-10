public class Verbete{
    
    private String entrada;
    private String descricao;
    private ClasseGramatical classeGramatical;
    private Verbete[] sinonimos;
    
    public Verbete(String entrada, String descricao, ClasseGramatical classeGramatical){
        this.setEntrada(entrada);
        this.setDescricao(descricao);
        this.setClasseGramatical(classeGramatical);
        this.sinonimos = new Verbete[0];
    }
    
    private void setEntrada(String entrada){
        this.entrada = entrada;
    }    
    
    private void setDescricao(String descricao){
        this.descricao = descricao;
    }  
    
    private void setClasseGramatical(ClasseGramatical classeGramatical){
        this.classeGramatical = classeGramatical;
    }
    
    public String getEntrada(){
        return this.entrada;
    }
    
    public ClasseGramatical getClasseGramatical(){
        return this.classeGramatical;
    }    
    
    public void adicionarSinonimo(Verbete verbete){
        Verbete[] aux = new Verbete[this.sinonimos.length + 1];
        for(int iCont = 0; iCont < this.sinonimos.length; iCont++)
          aux[iCont] = this.sinonimos[iCont];
        aux[aux.length -1] = verbete;  
        this.sinonimos = aux;
    } 
    
    public boolean isEntrada(String entrada){
        return this.getEntrada().equalsIgnoreCase(entrada);
    } 
    
    public boolean equals(Verbete verbete){
        return 
           this.getEntrada().equals(verbete.getEntrada()) &&
           this.getClasseGramatical().equals(verbete.getClasseGramatical());
         
    } 
    
    public boolean equivalente(Verbete verbete){
        if(this.equals(verbete)) return true;
        for(Verbete v : this.sinonimos)
          if(v.equals(verbete))
            return true;
        return false;    
    }    
    
}

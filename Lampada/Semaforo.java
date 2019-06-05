public class Semaforo{
    Lampada vermelha = new Lampada();
    Lampada verde = new Lampada();
    ContadorDeVoltas contador = new ContadorDeVoltas();
    Semaforo complementar;
    
    public void abrir(){
        if(this.vermelho())
          this.contador.tick();
        this.verde.acender();
        this.vermelha.apagar();
        if(complementar != null && complementar.verde())
          complementar.fechar();
    }    
    
    public void fechar(){
        this.vermelha.acender();
        this.verde.apagar();
        if(complementar != null && complementar.vermelho())
          complementar.abrir();
    }    
    
    public boolean vermelho(){
        return this.vermelha.isAcesa();
    }    
    
    public boolean verde(){
        return this.verde.isAcesa();
    } 
    
    public void zerar(){
        this.contador.reset();
    } 
    
    public int getQtdeAbertura(){
        return this.contador.getQtdeVoltas();
    }
    
    public void setComplementar(Semaforo complementar){
        if(this.complementar != null) return;
        this.complementar = complementar;
        complementar.setComplementar(this);
    }    
    
}    
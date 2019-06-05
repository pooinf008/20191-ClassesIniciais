public class Semaforo{
    Lampada vermelha = new Lampada();
    Lampada verde = new Lampada();
    ContadorDeVoltas contador = new ContadorDeVoltas();
    
    public void abrir(){
        if(vermelho())
          contador.tick();
        verde.acender();
        vermelha.apagar();
    }    
    
    public void fechar(){
        vermelha.acender();
        verde.apagar();
    }    
    
    public boolean vermelho(){
        return vermelha.estaAcesa();
    }    
    
    public boolean verde(){
        return verde.estaAcesa();
    } 
    
    public void zerar(){
        contador.reset();
    } 
    
    public int getQtdeAbertura(){
        return contador.buscarQtdeVoltas();
    }    
    
}    
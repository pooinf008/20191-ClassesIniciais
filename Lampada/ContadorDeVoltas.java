public class ContadorDeVoltas{
    private int qtdeVoltas;
    
    public void reset(){
        this.qtdeVoltas = 0;
    }    
    
    public void tick(){
        this.tick(1);
    }   
    
    public void tick(int qtdeVoltas){
        this.qtdeVoltas = this.qtdeVoltas + qtdeVoltas;
    }    
    

    public int getQtdeVoltas(){
        return this.qtdeVoltas;
    }   
    
   
    
    
}    

public class ContadorDeVoltas{
    private int qtdeVoltas;
    
    public void reset(){
        qtdeVoltas = 0;
    }    
    
    public void tick(){
        qtdeVoltas++;
    }    

    public int buscarQtdeVoltas(){
        return qtdeVoltas;
    }    
    
    
}    
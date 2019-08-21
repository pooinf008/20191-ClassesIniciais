public class AreaSensoreada{
    private UnidadeSensora[] unidades;
    private EstacaoColeta estacaoBase;
    
    
    public double getValorMedio(){
        return this.estacaoBase.getValorMedio();
    }   
    
    public void setEstacaoBase(EstacaoColeta ec){
        this.estacaoBase = ec;
    }    
    
}

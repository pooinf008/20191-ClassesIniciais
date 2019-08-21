public class AreaSensoreada{
    private UnidadeSensora[] unidades;
    private EstacaoColeta estacaoBase;
    
    public AreaSensoreada(EstacaoColeta ec){
        this.unidades = new UnidadeSensora[1];
        this.unidades[0] = ec;
        this.setEstacaoBase(ec);
    }    
    
    public AreaSensoreada addUS(UnidadeSensora us){
        UnidadeSensora[] novo = new UnidadeSensora[this.unidades.length + 1];
        int iCont;
        for(iCont = 0; iCont < this.unidades.length; iCont++)
          novo[iCont] =this.unidades[iCont]; 
        novo[novo.length - 1] = us;
        this.unidades = novo;
        return this;
    }    
    
    public double getValorMedio(){
        return this.estacaoBase.getValorMedio();
    }   
    
    private void setEstacaoBase(EstacaoColeta ec){
        this.estacaoBase = ec;
    }    
    
}

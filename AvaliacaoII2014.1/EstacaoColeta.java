public class EstacaoColeta extends UnidadeSensora{
    private double[] historicoValores;
    
    
    public EstacaoColeta(String id, double latitude,
                          double longitude, double altura){
        super(id, latitude, longitude, altura);
        this.historicoValores = new double[0];
    }    
    
    public double getValorMedio(){
        Mensagem mensagem = this.executar();
        return mensagem.getValorMedio();
    }    
    
    public  Mensagem processar(Mensagem minha){
        this.armazenar(minha.getValorMedio());
        return minha;
    }     
    

    public  Mensagem processar(Mensagem minha, Mensagem filha){
        minha.adicionar(filha.getValores());
        return minha;
    }   
    
    public void armazenar(double valor){
        double[] novo = new double[this.historicoValores.length + 1];
        int iCont;
        for(iCont = 0; iCont < this.historicoValores.length; iCont++)
          novo[iCont] =this.historicoValores[iCont]; 
        novo[novo.length - 1] = valor;
        this.historicoValores = novo;
    }    
    
}

public abstract class NoSensor extends UnidadeSensora{

    protected double valor;
    
    public NoSensor(String id, double latitude,
                    double longitude, double altura){
        super(id, latitude, longitude, altura);
        this.setValor();
    }    
    
    public void setValor(double valor){
        this.valor = valor;
    };
    
    public void setValor(){
        this.setValor(Math.random() * 10);
    };
    
    public  Mensagem processar(Mensagem minha, Mensagem filha){
        minha.adicionar(filha.getValores());
        return minha;
    }     
    
}

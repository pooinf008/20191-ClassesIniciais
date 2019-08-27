public class Cluster extends NoSensor{
    
    public Cluster(String id, double latitude,
                          double longitude, double altura){
        super(id, latitude, longitude, altura);
    }     
 
    
    public Mensagem processar(Mensagem minha){
        minha.adicionar(valor);
        minha.fundir();
        return minha;
    }    
    
}

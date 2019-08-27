public class Relay extends NoSensor{
    
    public Relay(String id, double latitude,
                          double longitude, double altura){
        super(id, latitude, longitude, altura);
    } 
    
    public Mensagem processar(Mensagem minha){
        minha.adicionar(valor);
        return minha;
    }    
    
}

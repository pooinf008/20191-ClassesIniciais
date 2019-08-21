public class Relay extends NoSensor{
    
    public Relay(String id){
        super(id);
    } 
    
    public Mensagem processar(Mensagem minha){
        minha.adicionar(valor);
        return minha;
    }    
    
}

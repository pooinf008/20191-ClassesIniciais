public class Relay extends NoSensor{
    
    public Relay(String id){
        super(id);
    } 
    
    public  Mensagem concatenar(Mensagem minha, Mensagem filha){
        minha.adicionar(filha.getValores());
        minha.adicionar(this.valor);
        return minha;
    }    
}

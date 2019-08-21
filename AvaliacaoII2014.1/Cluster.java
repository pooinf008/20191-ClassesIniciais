public class Cluster extends NoSensor{
    
    public Cluster(String id){
        super(id);
    }     
 
    
    public Mensagem processar(Mensagem minha){
        minha.adicionar(valor);
        minha.fundir();
        return minha;
    }    
    
}

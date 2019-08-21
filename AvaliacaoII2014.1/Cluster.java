public class Cluster extends NoSensor{
    
    
    public Cluster(String id){
        super(id);
    }     
    
    public  Mensagem concatenar(Mensagem minha, Mensagem filha){
        minha.adicionar(filha.getValores());
        return minha;
    }        
}

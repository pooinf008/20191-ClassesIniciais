public class EstacaoColeta extends UnidadeSensora{
    private double[] historicoValores;
    
    
    public EstacaoColeta(String id){
        super(id);
    }    
    
    public double getValorMedio(){
        Mensagem mensagem = this.processar();
        double valor = mensagem.getValorMedio();
        this.armazenar(valor);
        return valor;
    }    
    

    public  Mensagem concatenar(Mensagem minha, Mensagem filha){
        minha.adicionar(filha.getValores());
        minha.adicionar(0);
        return minha;
    }   
    
    public void armazenar(double valor){
    }    
    
}

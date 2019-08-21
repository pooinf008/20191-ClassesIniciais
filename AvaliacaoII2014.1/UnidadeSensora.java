public abstract class UnidadeSensora{
    private String id;
    private double latitude;
    private double longitude;
    private double altura;
    private UnidadeSensora pai;
    private UnidadeSensora[] filhas;
    
    public UnidadeSensora(String id){
        this.id = id;
        this.filhas = new UnidadeSensora[0];
    }    
    
    public UnidadeSensora addFilha(UnidadeSensora us){
        UnidadeSensora[] novo = new UnidadeSensora[this.filhas.length + 1];
        int iCont;
        for(iCont = 0; iCont < this.filhas.length; iCont++)
          novo[iCont] =this.filhas[iCont]; 
        novo[novo.length - 1] = us;
        this.filhas = novo;
        us.setPai(this);
        return this;
    }    
   
    public void setPai(UnidadeSensora us){
        this.pai = us;
    }    
    
    
    public Mensagem processar(){
        Mensagem mensagem = new Mensagem(this.id);
        for(UnidadeSensora us : this.filhas){
          Mensagem m = us.processar();
          System.out.println(m);
          mensagem = this.concatenar(mensagem, m);
          
        }  
        return mensagem;
    } 
    
    public abstract Mensagem concatenar(Mensagem minha, Mensagem filha);
    
}

public abstract class UnidadeSensora{
    private String id;
    private double latitude;
    private double longitude;
    private double altura;
    private UnidadeSensora pai;
    private UnidadeSensora[] filhas;
    
    public UnidadeSensora(String id, double latitude,
                          double longitude, double altura){
        this.id = id;
        this.filhas = new UnidadeSensora[0];
        this.latitude = latitude;
        this.longitude = longitude;
        this.altura = altura;
    }  
    
    public String getId(){
        return this.id;
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
    
    
    public Mensagem executar(){
        Mensagem mensagem = new Mensagem(this.id);
        for(UnidadeSensora us : this.filhas){
          Mensagem m = us.executar();
          mensagem = this.processar(mensagem, m);
        }  
        mensagem = this.processar(mensagem);
        System.out.println(mensagem);
        return mensagem;
    } 
    
    public abstract Mensagem processar(Mensagem minha, Mensagem filha);
    public abstract Mensagem processar(Mensagem minha);   
    
    public double getDistancia(UnidadeSensora us){
        return Math.sqrt(Math.pow(this.latitude - us.latitude ,2) + 
                         Math.pow(this.longitude - us.longitude,2) +
                         Math.pow(this.altura - us.altura,2));
    }    
    
}

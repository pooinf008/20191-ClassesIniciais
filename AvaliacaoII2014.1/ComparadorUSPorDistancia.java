public class ComparadorUSPorDistancia implements Comparador{
    
    private EstacaoColeta ec;
    
    public ComparadorUSPorDistancia(EstacaoColeta ec){
        this.ec = ec;
    }    
    
    public int compare(Object t1, Object t2){
          if(!(t1 instanceof UnidadeSensora)) return 0;
          if(!(t2 instanceof UnidadeSensora)) return 0;          
          UnidadeSensora us1 = (UnidadeSensora) t1;
          UnidadeSensora us2 = (UnidadeSensora) t2;          
          return (int) (us1.getDistancia(this.ec) - us2.getDistancia(this.ec));
    }      
}
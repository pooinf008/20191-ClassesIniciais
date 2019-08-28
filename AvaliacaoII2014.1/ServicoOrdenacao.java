public class ServicoOrdenacao{
    
    
    public void ordenar(Ordenavel[] ordenaveis){
        for(int i = 0; i < ordenaveis.length - 1; i++)
          for(int j = i+1; j < ordenaveis.length; j++)
            if(ordenaveis[i].compare(ordenaveis[j]) > 0){
               Ordenavel aux = ordenaveis[i];
               ordenaveis[i] = ordenaveis[j];
               ordenaveis[j] = aux;
            } 
    }     
}

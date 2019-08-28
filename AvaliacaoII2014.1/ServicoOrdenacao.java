public class ServicoOrdenacao{
    
    
    public void ordenar(Object[] ordenaveis, Comparador comparador){
        for(int i = 0; i < ordenaveis.length - 1; i++)
          for(int j = i+1; j < ordenaveis.length; j++)
            if(comparador.compare(ordenaveis[i],ordenaveis[j]) > 0){
               Object aux = ordenaveis[i];
               ordenaveis[i] = ordenaveis[j];
               ordenaveis[j] = aux;
            } 
    }     
}

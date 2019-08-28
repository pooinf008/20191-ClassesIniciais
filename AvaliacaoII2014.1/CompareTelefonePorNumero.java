public class CompareTelefonePorNumero implements Comparador{
    public int compare(Object t1, Object t2){
        return ((Telefone)t1).getNumero().compareTo(((Telefone)t2).getNumero());
    }      
}
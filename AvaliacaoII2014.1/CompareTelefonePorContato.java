public class CompareTelefonePorContato implements Comparador{
    public int compare(Object t1, Object t2){
        return ((Telefone)t1).getContato().compareTo(((Telefone)t2).getContato());
    }      
}

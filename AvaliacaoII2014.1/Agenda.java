public class Agenda{
    
    private Telefone[] telefones = new Telefone[5];
    
    public Agenda(){
        this.telefones[0] = new Telefone("AContato", "7188888888");
        this.telefones[1] = new Telefone("ZContato", "7122222222");        
        this.telefones[2] = new Telefone("JContato", "7133333333");
        this.telefones[3] = new Telefone("MContato", "7144444444");        
        this.telefones[4] = new Telefone("UContato", "7155555555");        
    }   
    
    
    public void printByContato(){
        ServicoOrdenacao ordenador = new ServicoOrdenacao();
        ordenador.ordenar(this.telefones, new CompareTelefonePorContato());
        for(Telefone t : this.telefones)
          System.out.println(t);
    }    
    
    public void printByNumero(){
        ServicoOrdenacao ordenador = new ServicoOrdenacao();
        ordenador.ordenar(this.telefones, new CompareTelefonePorNumero());
        for(Telefone t : this.telefones)
          System.out.println(t);
    }    
    

}

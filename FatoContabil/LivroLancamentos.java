public class LivroLancamentos{
    private Lancamento[] lancamentos;
    
    public LivroLancamentos(){
        this.lancamentos = new Lancamento[0];
    }    
    
    public void registrar(Lancamento lancamento){
        Lancamento[] novo = new Lancamento[this.lancamentos.length + 1];
        for(int i = 0; i < this.lancamentos.length; i++)
          novo[i] = this.lancamentos[i];
        novo[novo.length - 1] = lancamento;
        this.lancamentos = novo;
    }    
    
}

public class RegistroContabil{
  private String nomeEmpresa;
  private String cnpjEmpresa;
  private Balanco balanco;
  private LivroLancamentos livro;
  
  public void registrarFato(String descricao, String nomeCredito,
                            String nomeDebito, double valor){
    Conta credito = balanco.findContaByNome(nomeCredito); 
    Conta debito = balanco.findContaByNome(nomeDebito); 
    Lancamento lancamento = new Lancamento(descricao, valor,
            credito, debito);   
    this.livro.registrar(lancamento);
    this.balanco.ajustar(nomeCredito, nomeDebito, valor);
  }    
    
}

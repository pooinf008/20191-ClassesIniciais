public class FactoryConta{
    public ContaCorrente getConta(){
        java.util.Random random = new java.util.Random();
        int tipo = random.nextInt(3);
        if(tipo == 0)
          return new ContaCorrente("001", "ContaCorrente");
        else if(tipo == 1)
          return new ContaEspecial("001", "ContaCorrente", 100);
        else  
          return new ContaInvestimento("001", "ContaCorrente");
    };   
}

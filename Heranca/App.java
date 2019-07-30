public class App{
    public void run(){
        ContaCorrente c = new ContaCorrente("0001", "Conta0001");
        System.out.println(c);
        
        System.out.println("-->\tDepositando R$ 100,00");
        c.depositar(100);
        System.out.println(c);
        
        System.out.println("-->\tSacando R$ 50,00");
        c.sacar(50);
        System.out.println(c);
        
        System.out.println("-->\tSacando R$ 60,00");
        c.sacar(60);
        System.out.println(c);

        
    }  
    
    public void run2(){
        ContaEspecial c = new ContaEspecial("100", "Especial100", 500);

        c.setLimite(500);
        System.out.println(c);
        
        System.out.println("-->\tDepositando R$ 100,00");
        c.depositar(100);
        System.out.println(c);
        
        System.out.println("-->\tSacando R$ 50,00");
        c.sacar(50);
        System.out.println(c);
        
        System.out.println("-->\tSacando R$ 60,00");
        c.sacar(60);
        System.out.println(c);
        
    }      
    
}

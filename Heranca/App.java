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
        FactoryConta fc = new FactoryConta();
        ContaCorrente c = fc.getConta();
        ContaCorrente c2 = fc.getConta();

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
        
        
        System.out.println(c.equals(c2));
        
        System.out.println(c.equals("ABC"));        
        
    }     
    
    public void run3(){
        byte b1 = 10;
        byte b2 = 10;        
        int b3 = b1 + b2;
        
        System.out.println(b3);
        
    }
}

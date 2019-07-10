public class Teste{
    
    public void run(){
        Verbete v = new Verbete("verbete", 
        "conjunto das acepções...", ClasseGramatical.SUBSTANTIVO);
        Verbete v2 = new Verbete("verbete2", 
        "conjunto das acepções2...", ClasseGramatical.ADVERBIO);
        
        System.out.println(v);
        System.out.println("***");
        System.out.println(v2); 
        System.out.println("***");        
        System.out.println("***");        
        
        v.adicionarSinonimo(v2);
        
        System.out.println(v);
        System.out.println("***");
        System.out.println(v2); 
        System.out.println("***");        
        System.out.println("***");        
        
        v2.adicionarSinonimo(v);        
        System.out.println(v);
        System.out.println("***");
        System.out.println(v2); 
        System.out.println("***");        
        System.out.println("***");        
        
        
    }    
}

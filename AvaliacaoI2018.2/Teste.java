public class Teste{
    
    
    private Dicionario dicionario;
    
    public Teste(){
        this.dicionario = new Dicionario();
        this.criarVerbetes();
    }    
    
    
    private void criarVerbetes(){
        Verbete o = new Verbete("o", "o", ClasseGramatical.ARTIGO);
        Verbete verbete = new Verbete("verbete", "verbete", ClasseGramatical.SUBSTANTIVO);
        Verbete eh = new Verbete("é", "verbo ser", ClasseGramatical.VERBO);
        Verbete muito = new Verbete("muito", "muito", ClasseGramatical.ADVERBIO);
        Verbete interessante = new Verbete("interessante", "interessante", ClasseGramatical.ADJETIVO);
        Verbete apontamento = new Verbete("apontamento", "apontamento", ClasseGramatical.SUBSTANTIVO);
        Verbete grifado = new Verbete("grifado", "grifado", ClasseGramatical.ADJETIVO);
        Verbete destacado = new Verbete("destacado", "destacado", ClasseGramatical.ADJETIVO);

        verbete.adicionarSinonimo(apontamento);
        destacado.adicionarSinonimo(grifado);
        
        dicionario.adicionarVerbete(o)
                  .adicionarVerbete(verbete)
                  .adicionarVerbete(eh)
                  .adicionarVerbete(muito)
                  .adicionarVerbete(interessante)
                  .adicionarVerbete(apontamento)
                  .adicionarVerbete(grifado)
                  .adicionarVerbete(destacado);        
        
    }    
    
    
    public void exemploQuestao10(){
        String[] frase1 = {"o", "verbete", "é", "muito", "interessante"};
        String[] frase2 = {"o", "interessante", "apontamento"};  
        String[] frase3 = {"o", "interessante", "apontamento", "grifado"};  
        System.out.println("Proximidade semântica entre:");
        System.out.println("\"O verbete é muito interessante\" e \"O interessante apontamento\".");
        System.out.println(this.dicionario.hasProximidadeSemantica(frase1, frase2));
        System.out.println("\"O verbete é muito interessante\" e \"O interessante apontamento grifado\".");
        System.out.println(this.dicionario.hasProximidadeSemantica(frase1, frase3));
        
    }    
    
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

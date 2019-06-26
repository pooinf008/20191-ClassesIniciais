public class Teste{
    
    public void rodar3(){
        Cromossomo c1 = new Cromossomo("00*056987");
        Cromossomo c2 = new Cromossomo("08*056987002");
        
        System.out.println(c1.getPctIdentidade(c2));
        System.out.println(c2.getPctIdentidade(c1));
        
    }    
    
    
    public void rodar2(){
        String abc = new String("ABC");
        String ABC = "ABC";
        
        System.out.println(abc.toString());
        
    }    
    
    public void rodar(){
        int x = 10;
        int y = 10;
        Gene gene1 = new Gene(10);
        gene1.setValor(10);
        Gene gene2 = gene1;
        gene2.setValor(20);
        Gene gene3 = gene1.clonar();
        Gene gene4 = new Gene();
        Gene gene5 = new Gene(gene4);
        
        System.out.println(gene1);
        System.out.println(gene3);
        System.out.println(gene1.equals(gene3));
        System.out.println(gene1.getValor());
    }    
}

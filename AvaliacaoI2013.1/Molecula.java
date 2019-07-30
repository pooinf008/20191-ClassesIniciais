/*Questão II.i*/
public class Molecula{
    private Atomo[] atomos = new Atomo[0];//Questão II.i
    
    //Questão II.ii
    public Atomo getAtomoMenorNumeroAtomico(){
        if(this.atomos.length == 0) return null;
        Atomo menor = this.atomos[0];
        for(Atomo atual : this.atomos)
          if(atual.getNumeroAtomico() < menor.getNumeroAtomico())
            menor = atual;
        return menor;    
    }   
    
    //Questão II.iii
    public int getQuantidadeAtomos(Atomo atomo){
        int qtde = 0;
        for(Atomo atual : this.atomos)
          if(atual.equals(atomo))
            qtde++;
        return qtde;    
    } 
    
    //Questao II.iv
    public boolean hasAtomo(Atomo atomo){
        return this.getQuantidadeAtomos(atomo) > 0;
    }    
    
    //Questao II.iv
    private boolean hasAllAtomos(Molecula molecula){
        Atomo[] atomosOutro = molecula.atomos;
        for(Atomo atual : atomosOutro)
          if(!this.hasAtomo(atual))
            return false;
        return true;    
    }    
    
    //Questao II.iv
    public boolean sameAtomos(Molecula molecula){
        return this.hasAllAtomos(molecula) &&
               molecula.hasAllAtomos(this); 
    }    
}

/*Questao I.i*/
public class Atomo{
    
    public static final int MAX_CAMADAS = 7; //I.i
    
    private int numeroAtomico; //I.i
    private double numeroMassa; //I.i
    private String nomeElementoQuimico; //I.i
    private int[] qtdeEletrons = new int[Atomo.MAX_CAMADAS]; //I.i 

    /*Questao I.ii*/
    public Atomo(int numeroAtomico, double numeroMassa, String nomeElementoQuimico){
        this.setNumeroAtomico(numeroAtomico);
        this.setNumeroMassa(numeroMassa);
        this.setNomeElementoQuimico(nomeElementoQuimico);
    }    
    
    /*Questao I.ii*/
    public void setNumeroAtomico(int numeroAtomico){
        this.numeroAtomico = numeroAtomico;
    };
    
    /*Questao I.ii*/
    public void setNumeroMassa(double numeroMassa){
        this.numeroMassa = numeroMassa;
    };  
    
    /*Questao I.ii*/
    public void setNomeElementoQuimico(String nomeElementoQuimico){
        this.nomeElementoQuimico = nomeElementoQuimico;
    };  

    /*Questao I.iii*/
    public int getNumeroAtomico(){
        return this.numeroAtomico;
    }  
    
    /*Questao I.iv*/
    public boolean equals(Atomo atomo){
        return this.getNumeroAtomico() == atomo.getNumeroAtomico();
    }  
    
    /*Questao I.v*/
    public int getQtdeEletrons(Camada numeroCamada){
        return this.qtdeEletrons[numeroCamada.getValorCamada()];
    }    
    
};



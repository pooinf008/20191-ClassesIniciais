/*Questao I.v - toda a enum*/
public enum Camada{
    K(0), L(1), M(2), N(3), O(4), P(5), Q(6);
    
     private final int valorCamada;
     
    Camada(int valorCamada) {
        this.valorCamada = valorCamada;
    }
    
    public int getValorCamada(){
        return this.valorCamada;
    }    
    
}

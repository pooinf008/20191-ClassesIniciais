public class Lampada{
   private boolean estado;
   
   public void acender(){
       estado = true;
   }    

   public void apagar(){
       estado = false;
   }    
   
   public boolean estaAcesa(){
       return estado;
   }    
}    
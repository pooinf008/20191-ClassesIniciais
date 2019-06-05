public class Lampada{
   private boolean estado;
   
   public void acender(){
       this.estado = true;
   }    

   public void apagar(){
       this.estado = false;
   }    
   
   public boolean isAcesa(){
       return this.estado;
   }    
}    
public class Controlador{
  private AreaSensoreada area;
  
  public Controlador(){
      this.asm();
  }    
  
  
  public double getValorMedio(){
      return this.area.getValorMedio();
  };
  
  
  
  public void asm(){
      
      EstacaoColeta ec = new EstacaoColeta("ec");
      this.area = new AreaSensoreada(ec);
      
      UnidadeSensora r1 = new Cluster("r1");
      UnidadeSensora r2 = new Relay("r2");
      
      UnidadeSensora r11 = new Relay("r11");
      UnidadeSensora r12 = new Relay("r12");
      UnidadeSensora r13 = new Relay("r13");
      UnidadeSensora r122 = new Relay("r122");      
      
      UnidadeSensora r21 = new Relay("r21");            
      UnidadeSensora r211 = new Relay("r211"); 
      
      
      UnidadeSensora r31 = new Relay("r31");
      UnidadeSensora r32 = new Relay("r32");
      UnidadeSensora r3 = new Cluster("r3");
      
    
      r1.addFilha(r11).addFilha(r12.addFilha(r122)).addFilha(r13);      
      r2.addFilha(r21.addFilha(r211));
      r3.addFilha(r31).addFilha(r32);      
      
      
      ec.addFilha(r1).addFilha(r2).addFilha(r3);
      
      this.area.addUS(r1)
               .addUS(r2)
               .addUS(r11)
               .addUS(r12)
               .addUS(r122)               
               .addUS(r13)                              
               .addUS(r21)
               .addUS(r211);
  }    
  
}

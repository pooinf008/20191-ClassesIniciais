public class Controlador{
  private AreaSensoreada area = new AreaSensoreada();
  public double getValorMedio(){
      return this.area.getValorMedio();
  };
  
  
  
  public void asm(){
      
      EstacaoColeta ec = new EstacaoColeta("ec");
      
      Relay r1 = new Relay("r1");
      Relay r2 = new Relay("r2");
      
      Relay r11 = new Relay("r11");
      Relay r12 = new Relay("r12");      
      
      Relay r21 = new Relay("r21");            
      
      Relay r211 = new Relay("r211"); 
    
      r1.addFilha(r11).addFilha(r12);
      r2.addFilha(r21.addFilha(r211));
      
      ec.addFilha(r1).addFilha(r2);
      
      area.setEstacaoBase(ec);
      
  }    
  
}

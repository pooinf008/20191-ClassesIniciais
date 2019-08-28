public class Controlador{
  private AreaSensoreada area;
  
  public Controlador(){
      this.asm();
  }    
  
  
  public double getValorMedio(){
      return this.area.getValorMedio();
  };
  
  
  
  public void asm(){
      
      EstacaoColeta ec = new EstacaoColeta("ec", 0, 0, 0);
      this.area = new AreaSensoreada(ec);
      
      UnidadeSensora r1 = new Cluster("r1", 1, 1, 0);
      UnidadeSensora r2 = new Relay("r2", 5, 1, 0);
      
      UnidadeSensora r11 = new Relay("r11", 2, 1, 0);
      UnidadeSensora r12 = new Relay("r12", 2, 2, 0);
      UnidadeSensora r13 = new Relay("r13", 2, 3, 0);
      UnidadeSensora r122 = new Relay("r122", 2, 4, 0);      
      
      UnidadeSensora r21 = new Relay("r21", 6, 1, 0);            
      UnidadeSensora r211 = new Relay("r211", 7, 1, 0); 
      
      
      UnidadeSensora r31 = new Relay("r31", 10, 2, 0);
      UnidadeSensora r32 = new Relay("r32", 10, 3, 0);
      UnidadeSensora r3 = new Cluster("r3", 10, 1, 0);
      
    
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
  
  public void printByDistancia(){
      this.area.orderByDistancia();
      for(UnidadeSensora uc : this.area.getUnidades())
        System.out.println(uc.getId() + "-" + 
                           uc.getDistancia(area.getEstacaoBase()));
  }  
  
  public void printMedidas(){
      this.area.ordenarMedidas();
      for(double medida : this.area.getMedidas())
        System.out.println(medida);
  }  
  
}

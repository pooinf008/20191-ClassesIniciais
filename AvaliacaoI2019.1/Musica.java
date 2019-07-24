public class Musica{
    private String titulo;
    private String[] artistas;
    private long duracao;
    private String genero;
    private CampoHarmonico campoHarmonico;
    private String gravadora;
    
    public Musica(String titulo, String[] artistas, long duracao,
                  String genero, CampoHarmonico campoHarmonico,
                  String gravadora){
                      
      this.setTitulo(titulo);
      this.setArtistas(artistas);
      this.setDuracao(duracao);
      this.setGenero(genero);
      this.setCampoHarmonico(campoHarmonico);
      this.setGravadora(gravadora);
    }; 
    
    private void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }    
    
    private void setArtistas(String[] artistas){
        this.artistas = artistas;
    }    
    
    private void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getGenero(){
        return this.genero;
    }    
    
    private void setGravadora(String gravadora){
        this.gravadora = gravadora;
    }  
    
    public String getGravadora(){
        return this.gravadora;
    }      
    
    private void setDuracao(long duracao){
        this.duracao = duracao;
    }   
    
    public long getDuracao(){
        return this.duracao;
    }       
    
    private void setCampoHarmonico(CampoHarmonico campoHarmonico){
        this.campoHarmonico = campoHarmonico;
    }  
    
    public CampoHarmonico getCampoHarmonico(){
        return this.campoHarmonico;
    }       
    
    public boolean equals(Musica musica){
        return this.getTitulo().equals(musica.getTitulo()) &&
               this.artistasCoincidentes(musica) &&
               musica.artistasCoincidentes(this);
    }    
    
    public boolean artistasCoincidentes(Musica musica){
        for(String artista : this.artistas)
          if(!musica.hasArtista(artista))
            return false;
        return true;    
    }    
    
    public boolean hasArtista(String nome){
        for(String artista : this.artistas)
          if(artista.equals(nome))
            return true;
        return false;    
    } 
    
    public int getQtdeArtistasCoincidentes(Musica musica){
        int qtde = 0;
        for(String artista : this.artistas)
          if(musica.hasArtista(artista))
            qtde++;
        return qtde;    
    }      
    
    
    public double getProximidade(Musica musica){
        double proximidade = 0;
        proximidade +=  ((this.getCampoHarmonico().equals(musica.getCampoHarmonico())) ? 1 : 0);
        proximidade += ((this.getGravadora().equals(musica.getGravadora())) ? 1 : 0);        
        proximidade += ((this.getGenero().equals(musica.getGenero())) ? 1 : 0);                
        proximidade += (this.getQtdeArtistasCoincidentes(musica) + 
                        musica.getQtdeArtistasCoincidentes(this)) /
                        (this.artistas.length + musica.artistas.length);
        return proximidade;
    }    
    
    public double getProximidade(Playlist list){
        double proximidade = 0;
        for(Musica m : list.getMusicas())
          if(this.getProximidade(m) > proximidade)
            proximidade = this.getProximidade(m);
        return proximidade;
    }    
    
    
}

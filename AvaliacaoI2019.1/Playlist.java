public class Playlist{
 
    private String nome;
    private Musica[] musicas;

    public Playlist(String nome){
        this.nome = nome;
        this.musicas = new Musica[0];
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }   
    
    public void addMusica(Musica musica){
        Musica[] novo = new Musica[this.musicas.length + 1];
        for(int i = 0; i < this.musicas.length; i++)
          novo[i] = this.musicas[i];
        novo[novo.length - 1] = musica;
        this.musicas = novo;
    }  
    
    public boolean pertence(Musica musica){
        for(Musica m : this.musicas)
          if(m.equals(musica))
            return true;
        return false;    
    }    
    
    public Musica[] getMusicas(){
        return this.musicas;
    }    

}

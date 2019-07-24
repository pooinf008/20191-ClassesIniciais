public class BaseMusicas{
    
    private Musica[] musicas;

    public BaseMusicas(){
        this.musicas = new Musica[0];
    }
    
    public void addMusica(Musica musica){
        Musica[] novo = new Musica[this.musicas.length + 1];
        for(int i = 0; i < this.musicas.length; i++)
          novo[i] = this.musicas[i];
        novo[novo.length - 1] = musica;
        this.musicas = novo;
    } 
    
    public Playlist getFlow(Playlist original, String nome, long duracao){
        Playlist nova = new Playlist(nome);
        long tempoNova = 0;
        int indice = 0;
        for(int i = 0; i < this.musicas.length - 1; i++)
          for(int j = i + 1; j < this.musicas.length; j++)
              if(this.musicas[i].getProximidade(original) < 
                 this.musicas[j].getProximidade(original)){
                    Musica aux =  this.musicas[i];
                    this.musicas[i] = this.musicas[j];
                    this.musicas[j] = aux;
              }       
        while(tempoNova <= duracao){
            if(!original.pertence(this.musicas[indice])){
                tempoNova += this.musicas[indice].getDuracao();
                nova.addMusica(this.musicas[indice]);
            };    
            indice++;
        }    
        return nova;
    }    
        
}

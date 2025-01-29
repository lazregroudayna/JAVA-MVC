package revision;



public class personne {
   private  int id ;
     private String nom ;
     private String genre ;
    public personne(String nom, String genre) {
        this.nom = nom;
        this.genre = genre;
    }
    public personne(int id, String nom, String genre) {
        this.id = id;
        this.nom = nom;
        this.genre = genre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
}
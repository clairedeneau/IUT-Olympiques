import java.util.ArrayList;
import java.util.List;

public class JeuxOlympiques{
    
    private String dateDeDebut;
    private String dateDeFin;
    private List<Pays> listePays;

    public JeuxOlympiques(String debut, String fin){
        this.dateDeDebut = debut;
        this.dateDeFin = fin;
        this.listePays = new ArrayList<>();
    }

    public JeuxOlympiques(String debut, String fin, List<Pays> lesPays){
        this.dateDeDebut = debut;
        this.dateDeFin = fin;
        this.listePays = lesPays;
    }

    public String getDateDeDebut() {
        return dateDeDebut;
    }

    public void setDateDeDebut(String dateDeDebut) {
        this.dateDeDebut = dateDeDebut;
    }

    public String getDateDeFin() {
        return dateDeFin;
    }

    public void setDateDeFin(String dateDeFin) {
        this.dateDeFin = dateDeFin;
    }

    public List<Pays> getListePays() {
        return listePays;
    }

    public void setListePays(List<Pays> listePays) {
        this.listePays = listePays;
    }

    public void ajoutePays(Pays unPays){
        this.listePays.add(unPays);
    }

    public void ajoutePays(int nbOr, int nbArgent, int nbBronze, String nom, List<Athlete> lesAthletes){
        this.listePays.add(new Pays(nbOr, nbArgent, nbBronze, nom, lesAthletes));
    }
   
    public void ajoutePays(String nom){
        this.listePays.add(new Pays(nom));
    }

    public void retierPays(Pays pays){
        this.listePays.remove(pays);
    }


    
}   
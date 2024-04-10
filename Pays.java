import java.util.ArrayList;
import java.util.List;

public class Pays {
    
    private int nbMedailleOr;
    private int nbMedailleArgent;
    private int nbMedailleBronze;
    private String nom;
    private List<Athlete> listeAthletes;
    
    public Pays(int nbMedailleOr, int nbMedailleArgent, int nbMedailleBronze, String nom, List<Athlete> listeAthletes) {
        this.nbMedailleOr = nbMedailleOr;
        this.nbMedailleArgent = nbMedailleArgent;
        this.nbMedailleBronze = nbMedailleBronze;
        this.nom = nom;
        this.listeAthletes = listeAthletes;
    }

    public Pays(String nom) {
        this.nom = nom;
        this.listeAthletes = new ArrayList<>();
        this.nbMedailleOr = 0;
        this.nbMedailleArgent = 0;
        this.nbMedailleBronze = 0;
    }

    public int getNbMedailleOr() {
        return nbMedailleOr;
    }

    public void setNbMedailleOr(int nbMedailleOr) {
        this.nbMedailleOr = nbMedailleOr;
    }

    public int getNbMedailleArgent() {
        return nbMedailleArgent;
    }

    public void setNbMedailleArgent(int nbMedailleArgent) {
        this.nbMedailleArgent = nbMedailleArgent;
    }

    public int getNbMedailleBronze() {
        return nbMedailleBronze;
    }

    public void setNbMedailleBronze(int nbMedailleBronze) {
        this.nbMedailleBronze = nbMedailleBronze;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Athlete> getListeAthletes() {
        return listeAthletes;
    }

    public void setListeAthletes(List<Athlete> listeAthletes) {
        this.listeAthletes = listeAthletes;
    }

    


}

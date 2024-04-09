import java.util.ArrayList;
import java.util.List;

public class Athlete{
    private int force;
    private int agilite;
    private int endurance;
    private String sexe;
    private String prenom;
    private String nom;
    private int nbVictoire;
    private Pays pays;
    private List<Epreuve> listesEpreuves;

    public Athlete(int force,int agilite, int endurance, String sexe, String nom, String prenom, int nbVictoire){
        this.force = force;
        this.agilite = agilite;
        this.endurance = endurance;
        this.sexe = sexe;
        this.nom = nom;
        this.prenom = prenom; 
        this.nbVictoire = nbVictoire;
        this.listesEpreuves = new ArrayList<>();

    }
}

